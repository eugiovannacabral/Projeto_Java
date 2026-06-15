package br.inatel.cineinatel.model.filme;

public class Filme3D extends Filme {

    private boolean oculos3D;

    public Filme3D(String titulo, int duracao, String classificacao) {
        super(titulo, duracao, classificacao);
        this.oculos3D = true;
    }

    public boolean isOculos3D() {
        return oculos3D;
    }
}