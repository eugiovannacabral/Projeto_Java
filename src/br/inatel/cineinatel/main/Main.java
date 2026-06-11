package br.inatel.cineinatel.main;
import br.inatel.cineinatel.model.pessoa.Cliente;
import br.inatel.cineinatel.model.pessoa.Funcionario;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Layla Victória Sousa Teles","000.222.444-78",21);
        Funcionario funcionario = new Funcionario("Giovanna Cabral Rangel de Mesquita","111.544.666-78","Caixa");
        cliente.exibirInformacoes();
        funcionario.exibirInformacoes();
    }
}
