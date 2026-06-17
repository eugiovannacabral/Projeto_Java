package br.inatel.cineinatel.model.sala;

public class SalaVIP extends Sala {
    private boolean poltronaReclinavel;


    public SalaVIP(int nSala) {
        super(nSala);
        this.poltronaReclinavel = true;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println("\n===== SALA VIP =====");
        System.out.println("Poltronas reclináveis disponíveis.");
        super.mostrarAssentos();
    }
    public boolean isPoltronaReclinavel() {
        return poltronaReclinavel;
    }
}