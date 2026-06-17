package br.inatel.cineinatel.model.ingresso;
import br.inatel.cineinatel.model.sala.SalaVIP;
import br.inatel.cineinatel.model.sessao.Sessao;
// AQUI ESTA FECHADO !!
public abstract class Ingresso {
    protected static final double PRECO_INTEIRA = 30;
    private Sessao sessao;
    private int linha;
    private int coluna;
    private boolean desejaCobertor;
    private boolean desejaReclinarPoltrona;

    public Ingresso(Sessao sessao, int linha, int coluna){
        this.sessao = sessao;
        this.linha = linha;
        this.coluna = coluna;
    }

    public abstract double calcularPreco();

    public double calcularPrecoFinal() {
        double preco = calcularPreco();// calculamos o preço base do ingresso

        if (sessao.getSala() instanceof SalaVIP) {// esse if que define se é uma sala normal ou VIP
    // fazemos a verificação se é ela é uma salaVIP
            SalaVIP salaVIP = (SalaVIP) sessao.getSala();// aqui usamos o cast para podermos acessar alguns metodos especificos da SalaVIP
            preco += salaVIP.getAdicionalVIP();
        }

        return preco;
    }

    public void exibirIngresso(){
        System.out.println("Filme: " + sessao.getFilme().getTitulo());
        System.out.println("Horário: " + sessao.getHorario());
        System.out.println("Tipo: " + getTipoIngresso());
        System.out.println("Sala: " + sessao.getSala().getnSala());
        System.out.println("Fileira: " + linha);
        System.out.println("Assento: " + coluna);
        System.out.println("Valor: R$ " + calcularPrecoFinal());
    }
    public abstract String getTipoIngresso();
    public boolean isDesejaCobertor(){
        return desejaCobertor;
    }

    public void setDesejaCobertor(boolean desejaCobertor){
        this.desejaCobertor = desejaCobertor;
    }

    public boolean isDesejaReclinarPoltrona() {
        return desejaReclinarPoltrona;
    }

    public void setDesejaReclinarPoltrona(boolean desejaReclinarPoltrona) {
        this.desejaReclinarPoltrona = desejaReclinarPoltrona;
    }

    public Sessao getSessao(){
        return sessao;
    }
    public int getLinha(){
        return linha;
    }
    public int getColuna(){
        return coluna;
    }
}