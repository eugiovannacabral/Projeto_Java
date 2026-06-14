package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoInteira extends Ingresso {
    public IngressoInteira(Sessao sessao) {
        super(sessao);
    }

    @Override
    public double calcularPreco() {
        return 30.0;
    }
}