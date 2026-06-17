package br.inatel.cineinatel.model.pessoa;

import br.inatel.cineinatel.model.compra.Compra;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    private int codigoCliente;
    private ArrayList<Compra> compras;

    public Cliente(String nome, String cpf, int codigoCliente) {

        super(nome, cpf);
        this.codigoCliente = codigoCliente;
        compras = new ArrayList<>();
    }

    @Override
    public void exibirInformacoes() {

        System.out.println("===== CLIENTE =====");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Código: " + codigoCliente);
    }

    public void adicionarCompra(Compra compra){
        compras.add(compra);
    }

    public void visualizarCompras(){

        System.out.println("\n===== COMPRAS DO CLIENTE =====");

        for(int i = 0; i < compras.size(); i++){

            System.out.println("Compra " + (i + 1));

            compras.get(i).exibirResumo();
            System.out.println();
        }
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}