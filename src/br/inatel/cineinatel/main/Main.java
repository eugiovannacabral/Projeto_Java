package br.inatel.cineinatel.main;
import br.inatel.cineinatel.model.filme.Filme;
import br.inatel.cineinatel.model.filme.Filme3D;
import br.inatel.cineinatel.model.ingresso.Ingresso;
import br.inatel.cineinatel.model.ingresso.IngressoMeia;
import br.inatel.cineinatel.model.pagamento.Pagamento;
import br.inatel.cineinatel.model.pagamento.Pix;
import br.inatel.cineinatel.model.pessoa.Cliente;
import br.inatel.cineinatel.model.pessoa.Funcionario;
import br.inatel.cineinatel.model.sala.Sala;
import br.inatel.cineinatel.model.sala.SalaVIP;
import br.inatel.cineinatel.model.sessao.Sessao;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Layla Victória Sousa Teles","000.222.444-78",21);
        Funcionario funcionario = new Funcionario("Giovanna Cabral Rangel de Mesquita","111.544.666-78","Caixa");
        cliente.exibirInformacoes();
        funcionario.exibirInformacoes();
        Filme filme = new Filme3D("Minecraft", 120, "10 anos");

        Sala sala = new SalaVIP(1, 100);

        Sessao sessao = new Sessao(filme, sala, "20:00");

        Ingresso ingresso = new IngressoMeia(sessao);
        Pagamento pagamento = new Pix();
        pagamento.realizarPagamento(ingresso.calcularPreco());
    }
}
