package br.inatel.cineinatel.model.comida;

public class Combo {
    private String nome;
    private double preco;

    public Combo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirCombo() {
        System.out.println(nome + " - R$ " + preco);
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
