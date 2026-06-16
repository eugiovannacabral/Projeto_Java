package br.inatel.cineinatel.model.sala;

public class Sala {
    private int nSala;
    private int linha;
    private int coluna;
    private boolean[][] assentos = new boolean[20][20];

    public Sala(int nSala){
        this.nSala = nSala; // numero da sala
    }

    public boolean comprarAssento(int linha, int coluna){
        if(linha < 0 || linha >= assentos.length || coluna < 0 || coluna >= assentos[0].length){// validação para caso o usuario digite uma posição invalida
            System.out.println("Posição inválida!");
            return false;
        }
        if(!assentos[linha][coluna]){
            // false = livre e true = ocupado
            assentos[linha][coluna] = true;
            System.out.println("Assento comprado com sucesso!");
            return true;
        }
        System.out.println("Esse assento já está ocupado!");
        return false;
    }

    public void mostrarAssentos(){
        System.out.println("\n===== SALAS =====");
        System.out.println("Assentos disponiveis.");
        for(int i = 0; i < assentos.length; i++){
            for(int j = 0; j < assentos[i].length; j++){
                if(assentos[i][j])
                    System.out.print("X ");
                else
                    System.out.print("O ");
            }
            System.out.println();
        }
    }
    public int getnSala(){
        return nSala;
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
