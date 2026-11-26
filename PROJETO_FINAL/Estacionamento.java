import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Vaga> vagas;
    private List<Registro> registros;
    private List<Registro> historico;

    public Estacionamento(int quantidadeVagas) {
        vagas = new ArrayList<>();
        registros = new ArrayList<>();
        historico = new ArrayList<>();

        for (int i = 1; i <= quantidadeVagas; i++) {
            vagas.add(new Vaga(i));
        }
    }

    public Vaga buscarVagaLivre() {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                return vaga;
            }
        }
        return null;
    }

    public Registro registrarEntrada(Veiculo veiculo) {
        Vaga vaga = buscarVagaLivre();

        if (vaga == null || veiculo == null) {
            return null;
        }

        if (!vaga.ocupar(veiculo)) {
            return null;
        }

        Registro registro = new Registro(veiculo, vaga);
        registros.add(registro);
        historico.add(registro);
        return registro;
    }

    public Registro estacionarVeiculo(Veiculo veiculo) {
        return registrarEntrada(veiculo);
    }

    public boolean registrarSaida(String placa) {
        for (Registro registro : registros) {
            if (registro.estaAtivo()
                    && registro.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                registro.finalizar();
                registros.remove(registro);
                return true;
            }
        }
        return false;
    }

    public void liberarVaga(int numero) {
        for (Registro registro : registros) {
            if (registro.estaAtivo()
                    && registro.getVaga().getNumero() == numero) {
                registro.finalizar();
                registros.remove(registro);
                return;
            }
        }
    }

    public Registro buscarPorPlaca(String placa) {
        for (Registro registro : registros) {
            if (registro.estaAtivo()
                    && registro.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                return registro;
            }
        }
        return null;
    }

    public List<Registro> listarEntradas() {
        return registros;
    }

    public List<Registro> listarSaidas() {
        List<Registro> saidas = new ArrayList<>();

        for (Registro registro : historico) {
            if (!registro.estaAtivo()) {
                saidas.add(registro);
            }
        }
        return saidas;
    }

    public List<Registro> listarHistorico() {
        return historico;
    }

    public List<Registro> buscarHistorico(String placa) {
        List<Registro> encontrados = new ArrayList<>();

        for (Registro registro : historico) {
            if (registro.getVeiculo().getPlaca().equalsIgnoreCase(placa)) {
                encontrados.add(registro);
            }
        }
        return encontrados;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public List<Registro> getHistorico() {
        return historico;
    }
}
