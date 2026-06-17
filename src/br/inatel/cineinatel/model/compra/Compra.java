package br.inatel.cineinatel.model.compra;
import br.inatel.cineinatel.model.comida.Combo;
import br.inatel.cineinatel.model.ingresso.Ingresso;
import br.inatel.cineinatel.model.pagamento.Pagamento;
import br.inatel.cineinatel.model.pessoa.Cliente;

import java.util.ArrayList;

public class Compra {

    private Cliente cliente;
    private ArrayList<Ingresso> ingressos;
    private ArrayList<Combo> combos;
    private Pagamento pagamento;

    public Compra(Cliente cliente) {// construtor
        this.cliente = cliente;

        ingressos = new ArrayList<>();

        combos = new ArrayList<>();
    }
//------------------------------ MÉTODOS -----------------------
    public void adicionarIngresso(Ingresso ingresso){
        ingressos.add(ingresso);
        System.out.println("Ingresso adicionado à compra.");
    }

    public void adicionarCombo(Combo combo){
        combos.add(combo);
        System.out.println("Combo adicionado à compra.");
    }

    public void removerIngresso(Ingresso ingresso) {
        ingressos.remove(ingresso);
        System.out.println("Ingresso removida da compra.");
    }

    public void removerCombo(Combo combo){
        combos.remove(combo);
        System.out.println("Combo removido da compra.");
    }

    public void definirPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }

    public double calcularValorTotal(){

    }

    public boolean finalizarCompra(){}

    public void exibirResumo(){}

    public void mostrarIngressos(){}

<<<<<<< Updated upstream
    public void mostrarCombos(){}
=======
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
