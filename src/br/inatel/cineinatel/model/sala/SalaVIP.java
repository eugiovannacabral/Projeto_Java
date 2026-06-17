package br.inatel.cineinatel.model.sala;

public class SalaVIP extends Sala {
    private boolean poltronaReclinavel;
    private boolean cobertorDisponivel;
    private double adicionalVIP = 10.0;//valor adicional pela compra da sala VIP

    public SalaVIP(int nSala) {
        super(nSala);
        this.poltronaReclinavel = true;
        this.cobertorDisponivel = true;
    }

    public double getAdicionalVIP() {
        return adicionalVIP;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println("\n===== SALA VIP =====");
        super.mostrarAssentos();
    }
    public boolean isPoltronaReclinavel() {
        return poltronaReclinavel;
    }

    public boolean isCobertorDisponivel() {
        return cobertorDisponivel;
    }
}