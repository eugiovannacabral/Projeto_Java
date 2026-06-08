package Sessao;

public class sessao {
    private filme filme;
    private sala sala;
    private String horario;

    public sessao(filme filme, sala sala, String horario) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
    }

    public void exibirSessao() {
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Horário: " + horario);
    }
}