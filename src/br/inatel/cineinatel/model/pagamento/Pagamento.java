package br.inatel.cineinatel.model.pagamento;
// ja esta ok
public abstract class Pagamento {
    private double valor;//para armazenar o valor a ser pago

    public Pagamento(double valor){
        this.valor = valor;
    }

    public abstract boolean realizarPagamento();// se true => pagamento aprovado
                                                // se false => pagamento recusado
    public double getValor(){
        return valor;
    }

}