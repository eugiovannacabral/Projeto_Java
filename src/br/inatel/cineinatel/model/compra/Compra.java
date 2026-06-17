package br.inatel.cineinatel.model.compra;
import br.inatel.cineinatel.model.comida.Combo;
import br.inatel.cineinatel.model.filme.Filme;
import br.inatel.cineinatel.model.ingresso.Ingresso;
import br.inatel.cineinatel.model.pagamento.Pagamento;
import br.inatel.cineinatel.model.pessoa.Cliente;
import br.inatel.cineinatel.model.sala.Sala;
import br.inatel.cineinatel.model.sessao.Sessao;

import java.util.ArrayList;

public class Compra {
    private Filme filme;
    private Sessao sessao;
    private Sala sala;
    private Ingresso ingresso;
    private ArrayList<Combo> combos;
    private Pagamento pagamento;

    public void escolherFilme(Filme filme){
        this.filme = filme;
    }
    public void escolherSessao(Sessao sessao){
        this.sessao = sessao;
    }

    public void adicionarCombo(Combo combo) {
        combos.add(combo);
    }
    public void gerarIngresso(){
        ingresso = new Ingresso(filme,sessao,sala);
    }
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double calcularTotal() {

        double total = 0;

        for (Ingresso ingresso : ingressos) {
            total += ingresso.calcularPreco();
        }

        for (Combo combo : combos) {
            total += combo.getPreco();
        }

        return total;
    }

    public void finalizarCompra() {

        double total = calcularTotal();

        pagamento.realizarPagamento(total);

        System.out.println("Compra finalizada!");
    }

    public void exibirResumo() {

        System.out.println("\n===== NOTA FISCAL =====");

        System.out.println("Cliente: " + cliente.getNome());

        System.out.println("\nIngressos:");

        for (Ingresso ingresso : ingressos) {
            System.out.println("R$ " + ingresso.calcularPreco());
        }

        System.out.println("\nCombos:");

        for (Combo combo : combos) {
            System.out.println(combo.getNome() + " - R$ " + combo.getPreco());
        }

        System.out.println("\nTOTAL: R$ " + calcularTotal());
    }
}
