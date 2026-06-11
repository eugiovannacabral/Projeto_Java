package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoAposentado extends Ingresso {
    public IngressoAposentado(Sessao sessao, double valorBase) {
        super(sessao, valorBase);
    }

    @Override
    public double calcularValor() {
        return valorBase * 0.7;
    }
}
