public class Caminhonete extends Veiculo {

    private int valorHora = 18;

    public Caminhonete(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }

    public int getValorHora() {
        return valorHora;
    }
}
