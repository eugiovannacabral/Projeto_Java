package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public abstract class Ingresso {
    protected Sessao sessao;
    protected double valorBase;

    public Ingresso(Sessao sessao, double valorBase) {
        this.sessao = sessao;
        this.valorBase = valorBase;
    }

    public abstract double calcularValor();
}
