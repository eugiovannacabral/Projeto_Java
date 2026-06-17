package br.inatel.cineinatel.model.pagamento;
//CLASSE JA OK!! -- EDITE A PARTIR DO QUE JA TEM, NÃO MODIFIQUE TUDO
public class Pix extends Pagamento {
    private String chavePix;//para receber a chave PIX da pessoa
    public Pix(double valor,String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public boolean realizarPagamento() {
        System.out.println("\n==== PIX ====");
        System.out.println("Chave: " + chavePix);
        System.out.println("Valor: R$ " + valor);

        System.out.println("Pagamento aprovado!");

        return true;
    }
}