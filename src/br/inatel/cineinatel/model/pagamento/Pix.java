package br.inatel.cineinatel.model.pagamento;
public class Pix extends Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento PIX realizado.");
        System.out.println("Valor: R$ " + valor);
    }
}