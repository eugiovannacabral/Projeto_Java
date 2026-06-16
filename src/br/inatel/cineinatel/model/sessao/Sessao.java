package br.inatel.cineinatel.model.sessao;
import br.inatel.cineinatel.model.filme.Filme;
import br.inatel.cineinatel.model.sala.Sala;

public class Sessao {
    private Filme filme;
    private Sala sala;
    private String horario;
    private double precoBase;

    public Sessao(Filme filme, Sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }

    public void exibirSessao() {
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Sala: " + sala.getnSala());
        System.out.println("Horário: " + horario);
    }

    public Filme getFilme() {
        return filme;
    }

    public Sala getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }
}