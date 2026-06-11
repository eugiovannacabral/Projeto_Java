package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoMeia extends Ingresso {
    public IngressoMeia(Sessao sessao, double valorBase) {
        super(sessao, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase / 2;
    }
}