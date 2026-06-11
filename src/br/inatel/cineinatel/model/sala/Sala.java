package br.inatel.cineinatel.model.sala;

public class Sala {
    private int numero;
    private int capacidade;

    public Sala(int numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }
}