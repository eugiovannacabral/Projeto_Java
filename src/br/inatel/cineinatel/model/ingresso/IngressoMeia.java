package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public class IngressoMeia extends Ingresso {

    public IngressoMeia(Sessao sessao, int linha, int coluna){
        super(sessao, linha, coluna);
    }

    @Override
    public double calcularPreco(){
        return precoBase * 0.5;
    }