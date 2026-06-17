package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;
// FECHADO
public class IngressoInteira extends Ingresso {

    public IngressoInteira(Sessao sessao, int linha, int coluna){
        super(sessao, linha, coluna);
    }

    @Override
    public double calcularPreco() {
        return PRECO_INTEIRA;
    }

    @Override
    public String getTipoIngresso() {
        return "Inteiro";
    }
}