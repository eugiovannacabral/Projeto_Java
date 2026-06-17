package br.inatel.cineinatel.model.pagamento;

public abstract class Pagamento {
    protected double valor;//para armazenar o valor a ser pago

    public Pagamento(double valor){
        this.valor = valor;
    }
    public abstract boolean realizarPagamento();// se true => pagamento aprovado
                                                // se false => pagamento recusado
    public double getValor(){
        return valor;
    }

}