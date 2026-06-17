package br.inatel.cineinatel.model.pessoa;
//FECHADA
public class Funcionario extends Pessoa {
    private String cargo;
    private String tempo_de_servico;

    public Funcionario(String nome, String cpf, String cargo, String tempo_de_servico) {
        super(nome, cpf);
        this.cargo = cargo;
        this.tempo_de_servico = tempo_de_servico;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\n===== FUNCIONÁRIO =====");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + cargo);
        System.out.println("Tempo de Serviço: " + tempo_de_servico);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}