package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;
// FECHADO
public class IngressoMeia extends Ingresso {

    public IngressoMeia(Sessao sessao, int linha, int coluna) {
        super(sessao, linha, coluna);
    }

    @Override
    public double calcularPreco() {
        return PRECO_INTEIRA * 0.5;
    }

    @Override
    public String getTipoIngresso() {
        return "Meia";
    }
}