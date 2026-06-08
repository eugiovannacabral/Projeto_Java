package Pessoa;

public class funcionario extends pessoa {
    private String cargo;

    public funcionario(String nome, String cpf, String cargo) {
        super(nome, cpf);
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
    }
}