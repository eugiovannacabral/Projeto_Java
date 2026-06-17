package br.inatel.cineinatel.main;
import br.inatel.cineinatel.model.comida.Combo;
import br.inatel.cineinatel.model.compra.Compra;
import br.inatel.cineinatel.model.filme.Filme;
import br.inatel.cineinatel.model.filme.Filme2D;
import br.inatel.cineinatel.model.filme.Filme3D;
import br.inatel.cineinatel.model.ingresso.Ingresso;
import br.inatel.cineinatel.model.ingresso.IngressoAposentado;
import br.inatel.cineinatel.model.ingresso.IngressoInteira;
import br.inatel.cineinatel.model.ingresso.IngressoMeia;
import br.inatel.cineinatel.model.pagamento.Pagamento;
import br.inatel.cineinatel.model.pagamento.Pix;
import br.inatel.cineinatel.model.pagamento.CartaoCredito;
import br.inatel.cineinatel.model.pessoa.Cliente;
import br.inatel.cineinatel.model.pessoa.Funcionario;
import br.inatel.cineinatel.model.sala.Sala;
import br.inatel.cineinatel.model.sala.SalaVIP;
import br.inatel.cineinatel.model.sessao.Sessao;
import br.inatel.cineinatel.model.compra.Compra;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Layla Victória Sousa Teles","000.021.664-03");
        Filme filme1= new Filme2D("Sherek", 240, "livre", "aventura", 2026);


    }
}
