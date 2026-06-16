package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoInteira extends Ingresso {

    public IngressoInteira(Sessao sessao, int linha, int coluna){
        super(sessao, linha, coluna);
    }

    @Override
    public double calcularPreco(){
        return precoBase;
    }
}