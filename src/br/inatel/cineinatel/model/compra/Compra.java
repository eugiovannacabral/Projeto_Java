package br.inatel.cineinatel.model.compra;
import br.inatel.cineinatel.model.comida.Combo;
import br.inatel.cineinatel.model.ingresso.Ingresso;
import br.inatel.cineinatel.model.pagamento.Pagamento;
import br.inatel.cineinatel.model.pessoa.Cliente;
import br.inatel.cineinatel.model.sessao.Sessao;
import br.inatel.cineinatel.model.ingresso.IngressoAposentado;
import br.inatel.cineinatel.model.ingresso.IngressoInteira;
import br.inatel.cineinatel.model.ingresso.IngressoMeia;

import java.util.ArrayList;

public class Compra {
    //-------------------------ATRIBUTOS---------------
    private Cliente cliente;
    private Sessao sessao;
    private ArrayList<Ingresso> ingressos;
    private ArrayList<Combo> combos;
    private Pagamento pagamento;

    //------------------- Construtor -----------------------
    public Compra(Cliente cliente, Sessao sessao) {// construtor
        this.cliente = cliente;
        this.sessao = sessao;
        ingressos = new ArrayList<>();
        combos = new ArrayList<>();
    }
//------------------------------ MÉTODOS -----------------------
    public boolean comprarIngresso(String tipoIngresso, int linha, int coluna) {
        boolean reservado = sessao.getSala().reservarAssento(linha, coluna);
        if (!reservado) {
            return false;
        }
        Ingresso ingresso = null;

        if (tipoIngresso.equalsIgnoreCase("inteira")) {// para comparar 2 strings
            ingresso = new IngressoInteira(sessao, linha, coluna);
        } else if (tipoIngresso.equalsIgnoreCase("meia")) {
            ingresso = new IngressoMeia(sessao, linha, coluna);
        } else if (tipoIngresso.equalsIgnoreCase("aposentado")) {
            ingresso = new IngressoAposentado(sessao, linha, coluna);
        } else {
            System.out.println("Tipo de ingresso inválido.");
            return false;
        }

        ingressos.add(ingresso);

        System.out.println("Ingresso adicionado à compra.");
        return true;
    }


    public void comprarCombo(Combo combo){
        combos.add(combo);
        System.out.println("Combo adicionado à compra.");
    }

    public void removerIngresso(Ingresso ingresso) {
        ingressos.remove(ingresso);
        System.out.println("Ingresso removido da compra.");
    }

    public void removerCombo(Combo combo){
        combos.remove(combo);
        System.out.println("Combo removido da compra.");
    }

    public double calcularValorTotal() {
        double total = 0;

        for (int i = 0; i < ingressos.size(); i++) {
            total += ingressos.get(i).calcularPrecoFinal();
        }

        for (int i = 0; i < combos.size(); i++) {
            total += combos.get(i).calcularPreco();
        }

        return total;
    }

    public void definirPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }


    public boolean finalizarCompra() {
        if (pagamento == null) {
            System.out.println("Nenhuma forma de pagamento definida!");
            return false;
        }

        boolean aprovado = pagamento.realizarPagamento();

        if (aprovado) {
            System.out.println("Compra finalizada com sucesso!");
            return true;
        }

        System.out.println("Pagamento recusado. Compra cancelada.");
        return false;
    }

    public void exibirResumo(){}

    public void mostrarIngressos(){
        System.out.println("\n===== INGRESSOS =====");

        if(ingressos.isEmpty()){
            System.out.println("Nenhum ingresso adicionado");
            return;
        }

        for(int i = 0; i < ingressos.size(); i++){
            System.out.println("Ingresso " + (i+1));
            ingressos.get(i).exibirIngresso();
            System.out.println();
        }
    }

    public void mostrarCombos() {
        System.out.println("\n===== COMBOS =====");

        if (combos.isEmpty()) {
            System.out.println("Nenhum combo adicionado.");
            return;
        }

        for (int i = 0; i < combos.size(); i++) {
            System.out.println("Combo " + (i + 1));
            System.out.println("Nome: " + combos.get(i).getNome());
            System.out.println("Preço: R$ " + combos.get(i).calcularPreco());
            System.out.println();
        }
    }
}
