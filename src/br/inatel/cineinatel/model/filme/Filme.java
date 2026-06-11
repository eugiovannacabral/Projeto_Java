package br.inatel.cineinatel.model.filme;

public abstract class Filme {
    protected String titulo;
    protected int duracao;
    protected String classificacao;

    public Filme(String titulo, int duracao, String classificacao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public abstract double calcularValorAdicional();

    public String getTitulo() {
        return titulo;
    }
}
