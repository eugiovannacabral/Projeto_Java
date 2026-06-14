package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(Sessao sessao) {
        super(sessao);
    }

    @Override
    public double calcularPreco() {
        return 15.0;
    }
}