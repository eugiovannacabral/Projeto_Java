package Filme;

public class filme3D extends filme {
    public Filme3D(String titulo, int duracao, String classificacao) {
        super(titulo, duracao, classificacao);
    }

    @Override
    public double calcularValorAdicional() {
        return 8.00;
    }
}