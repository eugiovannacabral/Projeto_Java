package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoAposentado extends Ingresso {
    public IngressoAposentado(Sessao sessao) {
        super(sessao);
    }

    @Override
    public double calcularPreco() {
        return 20.0;
    }
}