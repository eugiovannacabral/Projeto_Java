package br.inatel.cineinatel.model.filme;

public class Filme3D extends Filme {
    public Filme3D(String titulo, int duracao, String classificacao, String genero, int anoLancamento) {
        super(titulo, duracao, classificacao, genero,anoLancamento );
    }

    @Override
    public String getTipoExibicao(){
        return "3D";
    }
}