package br.inatel.cineinatel.model.filme;

public class Filme3D extends Filme {
    public Filme3D(String titulo, int duracao, String classificacao) {
        super(titulo, duracao, classificacao);
    }

    @Override
    public double calcularValorAdicional() {
        return 8.00;
    }
}