public class Vaga {

    private int numero;
    private boolean ocupada;
    private Veiculo veiculo;

    public Vaga(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.veiculo = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public boolean ocupar(Veiculo veiculo) {
        if (ocupada || veiculo == null) {
            return false;
        }

        this.veiculo = veiculo;
        ocupada = true;
        return true;
    }

    public void liberar() {
        veiculo = null;
        ocupada = false;
    }
}