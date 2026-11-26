public class Carro extends Veiculo {

    private int valorHora = 12;

    public Carro(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }

    public int getValorHora() {
        return valorHora;
    }
}
