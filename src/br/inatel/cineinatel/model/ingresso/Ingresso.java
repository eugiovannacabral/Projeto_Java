package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public abstract class Ingresso {
    protected Sessao sessao;

    public Ingresso(Sessao sessao) {
        this.sessao = sessao;
    }

    public abstract double calcularPreco();
}