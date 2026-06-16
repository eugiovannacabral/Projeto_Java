package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public abstract class Ingresso {
    protected Sessao sessao;
    protected  double precoBase = 40;
    protected int linha;
    protected int coluna;

    public Ingresso(Sessao sessao, int linha, int coluna){
        this.sessao = sessao;
        this.linha = linha;
        this.coluna = coluna;

        boolean reservado = sessao.getSala().reservarAssento(linha,coluna);

        if(reservado == true){
            System.out.println("Ingresso criado com sucesso!");
        }
    }

    public abstract double calcularPreco();
}