import java.time.Duration;
import java.time.LocalDateTime;

public class Registro {

    private Veiculo veiculo;
    private Vaga vaga;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private double valorPago;

    public Registro(Veiculo veiculo, Vaga vaga) {
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.horaEntrada = LocalDateTime.now();
        this.horaSaida = null;
        this.valorPago = 0;
    }

    public void finalizar() {
        if (horaSaida != null) {
            return;
        }

        horaSaida = LocalDateTime.now();

        long horas = Duration.between(horaEntrada, horaSaida).toHours();
        if (horas < 1) {
            horas = 1;
        }

        int valorHora;

        if (veiculo instanceof Moto) {
            valorHora = ((Moto) veiculo).getValorHora();
        } else if (veiculo instanceof Caminhonete) {
            valorHora = ((Caminhonete) veiculo).getValorHora();
        } else {
            valorHora = ((Carro) veiculo).getValorHora();
        }

        valorPago = horas * valorHora;
        vaga.liberar();
    }

    public boolean estaAtivo() {
        return horaSaida == null;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public double getValorPago() {
        return valorPago;
    }
}
