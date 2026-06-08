package Filme;

public class filme2D extends filme {
    public filme2D(String titulo, int duracao, String classificacao) {
        super(titulo, duracao, classificacao);
    }

    @Override
    public double calcularValorAdicional() {
        return 0;
    }
}