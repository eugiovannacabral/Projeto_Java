package br.inatel.cineinatel.model.sala;

public class Sala {
    private int numero;
    private int capacidade;
    private int linha;
    private int coluna;
    private boolean[][] assentos;

    public Sala(int numero, int capacidade, int linha, int coluna) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.linha = linha;
        this.coluna = coluna;

        assentos = new boolean[linha][coluna];
    }


    public boolean reservarAssento(int linha, int coluna){

        if(!assentos[linha][coluna]){
            // false = livre e true = ocupado
            assentos[linha][coluna] = true;
            System.out.println("Assento reservado com sucesso!");

            return true;
        }
        System.out.println("Esse assento já está ocupado!");
        return false;
    }

    public void mostrarAssentos(){

        for(int i = 0; i < assentos.length; i++){
            for(int j = 0; j < assentos[i].length; j++){
                if(assentos[i][j] == true)
                    System.out.print("X ");
                else
                    System.out.print("O ");
            }
            System.out.println();
        }
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }
}
