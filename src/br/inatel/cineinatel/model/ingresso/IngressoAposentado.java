package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;
// FECHADO
public class IngressoAposentado extends Ingresso {

    public IngressoAposentado(Sessao sessao, int linha, int coluna){
        super(sessao, linha, coluna);
    }

    @Override
    public double calcularPreco() {
        return PRECO_INTEIRA * 0.7;
    }

    @Override
    public String getTipoIngresso() {
        return "Aposentado";
    }
}