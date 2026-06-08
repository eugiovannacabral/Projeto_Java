package Ingresso;

import Sessao.sessao;

public abstract class ingresso {
    protected Sessao sessao;
    protected double valorBase;

    public Ingresso(Sessao sessao, double valorBase) {
        this.sessao = sessao;
        this.valorBase = valorBase;
    }

    public abstract double calcularValor();
}