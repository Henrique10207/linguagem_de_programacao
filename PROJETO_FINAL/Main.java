import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    private static final DateTimeFormatter FORMATO_HORARIO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento(10);
        int opcao;

        do {
            System.out.println("\n===== ESTACIONAMENTO =====");
            System.out.println("1 - Registrar entrada");
            System.out.println("2 - Registrar saída");
            System.out.println("3 - Listar entradas atuais");
            System.out.println("4 - Listar veículos que saíram");
            System.out.println("5 - Consultar histórico pela placa");
            System.out.println("6 - Mostrar histórico completo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerOpcao(teclado);

            switch (opcao) {
                case 1:
                    registrarEntrada(teclado, estacionamento);
                    break;

                case 2:
                    registrarSaida(teclado, estacionamento);
                    break;

                case 3:
                    listarEntradas(estacionamento);
                    break;

                case 4:
                    listarSaidas(estacionamento);
                    break;

                case 5:
                    consultarHistorico(teclado, estacionamento);
                    break;

                case 6:
                    mostrarHistorico(estacionamento);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        teclado.close();
    }

    private static int lerOpcao(Scanner teclado) {
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException excecao) {
            return -1;
        }
    }

    private static String formatarHorario(LocalDateTime horario) {
        if (horario == null) {
            return "Ainda estacionado";
        }

        return horario.format(FORMATO_HORARIO);
    }

    private static void registrarEntrada(Scanner teclado, Estacionamento estacionamento) {
        System.out.println("\nTipo do veículo:");
        System.out.println("1 - Moto");
        System.out.println("2 - Carro");
        System.out.println("3 - Caminhonete");
        System.out.print("Escolha: ");

        int tipo = lerOpcao(teclado);

        System.out.print("Marca: ");
        String marca = teclado.nextLine();

        System.out.print("Modelo: ");
        String modelo = teclado.nextLine();

        System.out.print("Placa: ");
        String placa = teclado.nextLine();

        Veiculo veiculo;

        switch (tipo) {
            case 1:
                veiculo = new Moto(marca, modelo, placa);
                break;

            case 2:
                veiculo = new Carro(marca, modelo, placa);
                break;

            case 3:
                veiculo = new Caminhonete(marca, modelo, placa);
                break;

            default:
                System.out.println("Tipo inválido.");
                return;
        }

        Registro registro = estacionamento.registrarEntrada(veiculo);

        if (registro == null) {
            System.out.println("Não há vagas disponíveis.");
        } else {
            System.out.println("Entrada registrada na vaga "
                    + registro.getVaga().getNumero());
            System.out.println("Entrada: "
                    + formatarHorario(registro.getHoraEntrada()));
        }
    }

    private static void registrarSaida(Scanner teclado, Estacionamento estacionamento) {
        System.out.print("Digite a placa do veículo: ");
        String placa = teclado.nextLine();

        Registro registro = estacionamento.buscarPorPlaca(placa);

        if (registro == null) {
            System.out.println("Não existe veículo ativo com essa placa.");
            return;
        }

        registro.finalizar();

        System.out.println("Saída registrada.");
        System.out.println("Vaga " + registro.getVaga().getNumero()
                + "   Saída: " + formatarHorario(registro.getHoraSaida()));
        System.out.println("Valor pago: R$ " + registro.getValorPago());
    }

    private static void listarEntradas(Estacionamento estacionamento) {
        List<Registro> registros = estacionamento.listarEntradas();

        if (registros.isEmpty()) {
            System.out.println("Não há veículos estacionados.");
            return;
        }

        System.out.println("\n--- ENTRADAS ATUAIS ---");

        for (Registro registro : registros) {
            Veiculo veiculo = registro.getVeiculo();

            System.out.println("Vaga " + registro.getVaga().getNumero()
                    + " | " + veiculo.getModelo()
                    + " | " + veiculo.getPlaca()
                    + " | Entrada: "
                    + formatarHorario(registro.getHoraEntrada()));
        }
    }

    private static void listarSaidas(Estacionamento estacionamento) {
        List<Registro> saidas = estacionamento.listarSaidas();

        if (saidas.isEmpty()) {
            System.out.println("Nenhum veículo saiu ainda.");
            return;
        }

        System.out.println("\n--- VEÍCULOS QUE SAÍRAM ---");

        for (Registro registro : saidas) {
            Veiculo veiculo = registro.getVeiculo();

            System.out.println("Vaga " + registro.getVaga().getNumero()
                    + "   " + veiculo.getModelo()
                    + " | " + veiculo.getPlaca()
                    + " | Saída: "
                    + formatarHorario(registro.getHoraSaida())
                    + " | Valor: R$ " + registro.getValorPago());
        }
    }

    private static void consultarHistorico(Scanner teclado, Estacionamento estacionamento) {
        System.out.print("Digite a placa: ");
        String placa = teclado.nextLine();

        List<Registro> registros = estacionamento.buscarHistorico(placa);

        if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado para essa placa.");
            return;
        }

        System.out.println("\n--- HISTÓRICO DA PLACA " + placa + " ---");

        for (Registro registro : registros) {
            System.out.println("Entrada: "
                    + formatarHorario(registro.getHoraEntrada())
                    + "   |   Vaga " + registro.getVaga().getNumero()
                    + "   |   Saída: "
                    + formatarHorario(registro.getHoraSaida())
                    + " | Valor: R$ " + registro.getValorPago());
        }
    }

    private static void mostrarHistorico(Estacionamento estacionamento) {
        List<Registro> registros = estacionamento.listarHistorico();

        if (registros.isEmpty()) {
            System.out.println("O histórico está vazio.");
            return;
        }

        System.out.println("\n--- HISTÓRICO COMPLETO ---");

        for (Registro registro : registros) {
            String situacao = registro.estaAtivo() ? "Ativo" : "Finalizado";

            System.out.println(registro.getVeiculo().getPlaca()
                    + " | Vaga " + registro.getVaga().getNumero()
                    + " | " + situacao
                    + " | Entrada: "
                    + formatarHorario(registro.getHoraEntrada())
                    + " | Saída: "
                    + formatarHorario(registro.getHoraSaida()));
        }
    }
}