package br.inatel.cineinatel.model.sala;
// NÃO TEM OQUE MECHER
public class SalaVIP extends Sala {
    public SalaVIP(int nSala) {
        super(nSala);
    }

    public double getAdicionalVIP() {
        return 10.0;  //valor adicional pela compra da sala VIP
    }

    public boolean isPoltronaReclinavel() {
        return true;
    }

    public boolean isCobertorDisponivel() {
        return true;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println("\n===== SALA VIP =====");
        super.mostrarAssentos();
    }
}