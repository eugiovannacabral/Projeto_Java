package br.inatel.cineinatel.model.pessoa;

public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("===== FUNCIONÁRIO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}