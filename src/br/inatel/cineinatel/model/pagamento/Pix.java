package br.inatel.cineinatel.model.pagamento;
//CLASSE JA OK!!
public class Pix extends Pagamento {
    private String chavePix;//para receber a chave PIX da pessoa
    public Pix(double valor,String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public boolean realizarPagamento() {
        if(chavePix == null || chavePix.isEmpty()){
            System.out.println("Chave PIX inválida!");
            return false;
        }
        System.out.println("\n==== PIX ====");
        System.out.println("Chave: " + chavePix);
        System.out.println("Valor: R$ " + getValor());

        System.out.println("Pagamento aprovado!");

        return true;
    }
}