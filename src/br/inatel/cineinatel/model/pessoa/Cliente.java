package br.inatel.cineinatel.model.pessoa;
//FECHADA
public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("===== CLIENTE =====");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
    }

}