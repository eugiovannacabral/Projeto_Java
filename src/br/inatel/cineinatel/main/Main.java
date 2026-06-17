package br.inatel.cineinatel.main;

import br.inatel.cineinatel.model.compra.Compra;
import br.inatel.cineinatel.model.filme.*;
import br.inatel.cineinatel.model.pessoa.Cliente;
import br.inatel.cineinatel.model.sala.Sala;
import br.inatel.cineinatel.model.sala.SalaVIP;
import br.inatel.cineinatel.model.sessao.Sessao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // ================= FILMES =================
        Filme filme1 = new Filme2D("Minecraft",101,"10 anos","Aventura",2025);
        Filme filme2 = new Filme3D("A culpa é das estrelas",126,"12 anos","Romance",2022);
        Filme filme3 = new Filme2D("Vingadores Ultimato",181,"12 anos","Ação",2019);
        Filme filme4 = new Filme2D("Interestelar",185,"10 anos","Ficção",2014);

        // ================= SALAS =================
        Sala sala1 = new Sala(1);
        SalaVIP sala2 = new SalaVIP(2);

        // ================= SESSÕES =================
        Sessao sessao1 = new Sessao(filme1,sala1,"18:00");
        Sessao sessao2 = new Sessao(filme2,sala2,"20:00");
        Sessao sessao3 = new Sessao(filme3,sala1,"22:00");
        Sessao sessao4 = new Sessao(filme4,sala2,"19:00");

        // ================= CLIENTE =================
        Cliente cliente = new Cliente("Giovanna","123.456.789-00");
        Cliente cliente1 = new Cliente("Layla","188.799.159-11");
        Cliente cliente2 = new Cliente("Mayara","234.765.561-13");
        Cliente cliente3 = new Cliente("Vinícius","000.000.000-00");

        // ================= COMPRA =================
        Compra compra = new Compra(cliente,sessao1);
        Compra compra1 = new Compra(cliente1,sessao2);
        Compra compra2 = new Compra(cliente2,sessao3);
        Compra compra3 = new Compra(cliente3,sessao4);

        int opcao;

        do {

            System.out.println("=================CINE INATEL===================");
            System.out.println("1 - Catálogo de filmes");
            System.out.println("2 - Sessões disponíveis");
            System.out.println("3 - Comprar ingresso");
            System.out.println("4 - Comprar combo");
            System.out.println("5 - Visualizar carrinho");
            System.out.println("6 - Mapa de assentos");
            System.out.println("7 - Finalizar compra");
            System.out.println("8 - Informações do cliente");
            System.out.println("9 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    filme1.exibirInformacoes();
                    filme2.exibirInformacoes();
                    filme3.exibirInformacoes();
                    filme4.exibirInformacoes();
                    break;

                case 2:
                    sessao1.exibirSessao();
                    sessao2.exibirSessao();
                    sessao3.exibirSessao();
                    sessao4.exibirSessao();
                    break;

                case 3:
                    System.out.println("Sessões:");
                    System.out.println("1 - Minecraft");
                    System.out.println("2 - A culpa é das estrelas");
                    System.out.println("3 - Vingadores");
                    System.out.println("4 - Interestelar");

                    int escolhaSessao = teclado.nextInt();

                    switch (escolhaSessao) {

                        case 1:
                            compra.alterarSessao(sessao1);
                            break;

                        case 2:
                            compra.alterarSessao(sessao2);
                            break;

                        case 3:
                            compra.alterarSessao(sessao3);
                            break;
                        case 4:
                            compra.alterarSessao(sessao4);
                            break;

                        default:
                            System.out.println("Sessão inválida!");
                            continue;
                    }

                    System.out.println("Assentos:");

                    compra.getSessao().getSala().mostrarAssentos();

                    System.out.print("Fileira: ");
                    int linha = teclado.nextInt();
                    System.out.print("Assento: ");
                    int coluna = teclado.nextInt();

                    System.out.println("Tipo de ingresso:");
                    System.out.println("1 - Inteira");
                    System.out.println("2 - Meia");
                    System.out.println("3 - Aposentado");

                    int tipo = teclado.nextInt();

                    switch (tipo) {

                        case 1:
                            compra.comprarIngresso("inteira",linha,coluna);
                            break;

                        case 2:
                            compra.comprarIngresso("meia",linha,coluna);
                            break;

                        case 3:
                            compra.comprarIngresso("aposentado",linha,coluna);
                            break;

                        default:
                            System.out.println("Tipo inválido!");
                    }

                    break;

                case 4:
                    System.out.println("===== COMBOS =====");
                    System.out.println("1 - Individual");
                    System.out.println("2 - Casal");
                    System.out.println("3 - Família");

                    int combo = teclado.nextInt();

                    switch (combo) {

                        case 1:
                            compra.comprarCombo("individual");
                            break;

                        case 2:
                            compra.comprarCombo("casal");
                            break;

                        case 3:
                            compra.comprarCombo("familia");
                            break;

                        default:
                            System.out.println("Combo inválido!");
                    }

                    break;

                case 5:
                    compra.mostrarIngressos();
                    compra.mostrarCombos();

                    System.out.println("Valor Total: R$ " + compra.calcularValorTotal());
                    break;

                case 6:

                    compra.getSessao().getSala().mostrarAssentos();

                    break;

                case 7:

                    if(compra.calcularValorTotal() == 0){
                        System.out.println("Carrinho vazio!");
                        break;
                    }

                    System.out.println("Forma de Pagamento :");
                    System.out.println("1 - PIX");
                    System.out.println("2 - Cartão");

                    int pagamento = teclado.nextInt();
                    teclado.nextLine();

                    if(pagamento == 1){
                        System.out.print("Digite sua chave PIX: ");
                        String chave = teclado.nextLine();

                        compra.pagarPix(chave);

                    }else{
                        System.out.print("Número do cartão: ");
                        String numero = teclado.nextLine();

                        System.out.print("Titular: ");
                        String titular = teclado.nextLine();

                        compra.pagarCartaoCredito(numero,titular);
                    }

                    compra.finalizarCompra();

                    break;

                case 8:

                    cliente.exibirInformacoes();

                    break;

                case 9:

                    System.out.println("\nObrigado por utilizar o Cine Inatel!");
                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while(opcao != 0);

        teclado.close();
    }
}