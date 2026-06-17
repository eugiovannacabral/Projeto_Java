package br.inatel.cineinatel.model.pagamento;
// ja esta ok
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
        if(this.numeroCartao == null || numeroCartao.length() < 16){
            System.out.println("Número do cartão inválido!");
            return false;
        }
        System.out.println("\n===== CARTÃO =====");
        System.out.println("Titular: " + titular);
        System.out.println("Valor: R$ " + getValor());

        System.out.println("Pagamento aprovado!");
        return true;
    }
}