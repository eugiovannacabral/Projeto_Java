package br.inatel.cineinatel.model.pagamento;

public class CartaoCredito extends Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em cartão realizado.");
        System.out.println("Valor: R$ " + valor);
    }
}