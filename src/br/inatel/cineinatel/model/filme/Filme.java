package br.inatel.cineinatel.model.filme;

public abstract class Filme {
    protected String titulo;
    protected int duracao;
    protected String classificacao;
    protected String genero;
    protected int anoLancamento;

    public Filme(String titulo, int duracao, String classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public void exibirInformacoes() {
        System.out.println("Filme: " + titulo);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Classificação: " + classificacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }
}