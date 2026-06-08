public class Cliente extends Pessoa {//criando cliente a partir da classe pessoa
    private String tipoCliente; // "COMUM", "ESTUDANTE", "APOSENTADO"

    public Cliente(String nome, String cpf, String email,String telefone, String tipoCliente) {
        super(nome, cpf, email, telefone);//o super mantem o que tem de comum entre as classes
        this.tipoCliente = tipoCliente;
    }

    public boolean temDesconto() {//tipo de pessoa que tem desconto
        return tipoCliente.equals("ESTUDANTE") || tipoCliente.equals("APOSENTADO");
    }

    public String getTipo() {
        return "CLIENTE";
    }

    //getters e setters
    public String getTipoCliente() {
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

}