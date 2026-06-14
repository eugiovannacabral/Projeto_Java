package br.inatel.cineinatel.model.sala;

public class SalaVIP extends Sala {
    private boolean poltronaReclinavel;

    public SalaVIP(int numero, int capacidade) {
        super(numero, capacidade);
        this.poltronaReclinavel = true;
    }

    public boolean isPoltronaReclinavel() {
        return poltronaReclinavel;
    }
}