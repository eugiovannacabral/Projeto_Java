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
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente("Giovanna", "123.456.789-00", 1);


        Filme filme1 = new Filme2D("Como Treinar Seu Dragao", 120, "Livre", "Ação",2012);
        Filme filme2 = new Filme3D("Minecraft", 105, "10 anos", "Ação", 2010);
        Filme filme3 = new Filme2D("Vingadores Ultimato", 180, "12 anos", "Ação", 2018);


        System.out.println("===== CATÁLOGO DE FILMES =====");

        System.out.println("1 - " + filme1.getTitulo());
        System.out.println("2 - " + filme2.getTitulo());
        System.out.println("3 - " + filme3.getTitulo());

        System.out.print("\nEscolha um filme: ");
        int escolhaFilme = entrada.nextInt();

        Filme filmeEscolhido = null;

        switch (escolhaFilme) {

            case 1:
                filmeEscolhido = filme1;
                break;

            case 2:
                filmeEscolhido = filme2;
                break;

            case 3:
                filmeEscolhido = filme3;
                break;

            default:
                System.out.println("Opcao invalida!");
                return;
        }

        // ===================== SALA E SESSAO =====================

        Sala sala = new Sala(
                1,
                100,
                10,
                10
        );

        Sessao sessao = new Sessao(
                filmeEscolhido,
                sala,
                "20:00"
        );

        // ===================== ASSENTOS =====================

        System.out.println("\n===== MAPA DE ASSENTOS =====");
        sala.mostrarAssentos();

        System.out.print("\nEscolha a linha: ");
        int linha = entrada.nextInt();

        System.out.print("Escolha a coluna: ");
        int coluna = entrada.nextInt();

        // ===================== TIPO DE INGRESSO =====================

        System.out.println("\n===== TIPO DE INGRESSO =====");
        System.out.println("1 - Inteira");
        System.out.println("2 - Meia");
        System.out.println("3 - Aposentado");

        int tipoIngresso = entrada.nextInt();

        Ingresso ingresso = null;

        switch (tipoIngresso) {

            case 1:
                ingresso = new IngressoInteira(
                        sessao,
                        linha,
                        coluna
                );
                break;

            case 2:
                ingresso = new IngressoMeia(
                        sessao,
                        linha,
                        coluna
                );
                break;

            case 3:
                ingresso = new IngressoAposentado(
                        sessao,
                        linha,
                        coluna
                );
                break;

            default:
                System.out.println("Opcao invalida!");
                return;
        }

        // ===================== COMPRA =====================

        Compra compra = new Compra(cliente);

        compra.adicionarIngresso(ingresso);

        // ===================== COMBOS =====================

        Combo combo1 = new Combo(
                "Pipoca Pequena + Refrigerante",
                15
        );

        Combo combo2 = new Combo(
                "Pipoca Media + Refrigerante",
                25
        );

        Combo combo3 = new Combo(
                "Pipoca Grande + Refrigerante",
                35
        );

        System.out.println("\nDeseja adicionar um combo?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");

        int desejaCombo = entrada.nextInt();

        if (desejaCombo == 1) {

            System.out.println("\n===== COMBOS =====");
            System.out.println("1 - Pipoca Pequena + Refrigerante");
            System.out.println("2 - Pipoca Media + Refrigerante");
            System.out.println("3 - Pipoca Grande + Refrigerante");

            int escolhaCombo = entrada.nextInt();

            switch (escolhaCombo) {

                case 1:
                    compra.adicionarCombo(combo1);
                    break;

                case 2:
                    compra.adicionarCombo(combo2);
                    break;

                case 3:
                    compra.adicionarCombo(combo3);
                    break;
            }
        }

        // ===================== PAGAMENTO =====================

        System.out.println("\n===== PAGAMENTO =====");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartao de Credito");

        int formaPagamento = entrada.nextInt();

        if (formaPagamento == 1) {

            compra.definirPagamento(
                    new Pix()
            );

        } else {

            compra.definirPagamento(
                    new CartaoCredito()
            );
        }

        // ===================== HISTORICO =====================

        cliente.adicionarCompra(compra);

        // ===================== RESUMO =====================

        compra.exibirResumo();

        // ===================== PAGAMENTO =====================

        compra.finalizarCompra();

        // ===================== HISTORICO =====================

        cliente.visualizarCompras();

        entrada.close();
    }

}
}
