package br.inatel.cineinatel.model.comida;
// FECHADO
public abstract class Combo {
    protected String nome;
    protected int quantidadeLanches;
    protected int quantidadeBatatas;
    protected int quantidadeRefrigerantes;
    protected int quantidadeChocolates;

    private static final double PRECO_LANCHE = 15.0;// valores fixos, teremos combos fixos
    private static final double PRECO_BATATA = 8.0;
    private static final double PRECO_REFRIGERANTE = 7.0;
    private static final double PRECO_CHOCOLATE = 4.0;

    public double calcularPreco(){
        return quantidadeLanches * PRECO_LANCHE
            + quantidadeBatatas * PRECO_BATATA
            + quantidadeRefrigerantes * PRECO_REFRIGERANTE
            + quantidadeChocolates * PRECO_CHOCOLATE;
    }

    public String getNome() {
        return nome;
    }

    public void exibirCombo() {
        System.out.println("Combo: " + nome);
        System.out.println("Lanches: " + quantidadeLanches);
        System.out.println("Batatas: " + quantidadeBatatas);
        System.out.println("Refrigerantes: " + quantidadeRefrigerantes);
        System.out.println("Chocolates: " + quantidadeChocolates);
        System.out.println("Preço: R$ " + calcularPreco());
    }
}
