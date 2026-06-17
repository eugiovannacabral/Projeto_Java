package br.inatel.cineinatel.model.filme;

public class Filme2D extends Filme {

    public Filme2D(String titulo, int duracao, String classificacao,String genero, int anoLancamento) {
        super(titulo, duracao, classificacao,genero ,anoLancamento );
    }

    @Override
    public String getTipoExibicao(){
        return "2D";
    }
}
