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

    public void mostrarCombos(){}
}
