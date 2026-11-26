public class Moto extends Veiculo {

    private int valorHora = 7;

    public Moto(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }

    public int getValorHora() {
        return valorHora;
    }
}

