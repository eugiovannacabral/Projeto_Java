package src.br.inatel.cineinatel.model;

public abstract class Pessoa {//classe abstrata porque não vou instanciar ela, vou criar classes a partir dessa
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

public Pessoa(String nome, String cpf, String email, String telefone) {//construtor
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.telefone = telefone;
}
//criei os getters e setters, não necessariamente iremos usar todos, podemos ir apagando com o desenvolvimento do codigo
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
