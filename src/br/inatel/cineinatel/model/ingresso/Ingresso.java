package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sessao.Sessao;

public abstract class Ingresso {
    private Sessao sessao;
    private int linha;
    private int coluna;
    protected  double precoBase = 30;
    private boolean desejaCobertor;
    private boolean desejaReclinarPoltrona;

    public Ingresso(Sessao sessao, int linha, int coluna){
        this.sessao = sessao;
        this.linha = linha;
        this.coluna = coluna;

        boolean reservado = sessao.getSala().comprarAssento(linha,coluna);

        if(reservado){
            System.out.println("Ingresso comprado com sucesso!");
        }
    }

    public abstract double calcularPreco();

    public double calcularPrecoFinal() {
        return 0;
    }
}