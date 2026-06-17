package br.inatel.cineinatel.model.filme;
// NÃO MEXER MAIS!!!
public abstract class Filme {
    protected String titulo;
    protected int duracao;
    protected String classificacao;
    protected String genero;
    protected int anoLancamento;

    public Filme(String titulo, int duracao, String classificacao,String genero,int anoLancamento) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public void exibirInformacoes() {
        System.out.println("\n===== FILME =====");
        System.out.println("Filme: " + titulo);
        System.out.println("Tipo: " + getTipoExibicao());
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Classificação: " + classificacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + anoLancamento);
    }
    public abstract String getTipoExibicao();

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public String getClassificacao(){
        return classificacao;
    }

    public String getGenero(){
        return genero;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }

}