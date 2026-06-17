package br.inatel.cineinatel.model.pagamento;
// SE QUISERREM PODEM ADICIONAR MAIS FORMAS DE VALIDAÇÃO, POR SE O USUARIO NÃO TIVER LIMITE PARA PASSAR A COMPRA
public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String titular;
    public CartaoCredito(double valor,String numeroCartao,String titular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    @Override
    public boolean realizarPagamento() {
        System.out.println("\n===== CARTÃO =====");
        System.out.println("Titular: " + titular);
        System.out.println("Valor: R$ " + valor);

        System.out.println("Pagamento aprovado!");
        return true;
    }
}