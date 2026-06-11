package br.inatel.cineinatel.model.pessoa;

public class Cliente extends Pessoa {//criando cliente a partir da classe pessoa
    private int codigoCliente;

    public Cliente(String nome, String cpf, int codigoCliente) {
        super(nome, cpf);
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("===== CLIENTE =====");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Código: " + codigoCliente);
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}