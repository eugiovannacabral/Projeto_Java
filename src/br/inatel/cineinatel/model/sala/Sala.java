package br.inatel.cineinatel.model.sala;

public class Sala {
    private int nSala;
    private boolean[][] assentos;

    public Sala(int nSala){
        this.nSala = nSala; // numero da sala
        assentos = new boolean[15][15];// definindo o tamanho da sala
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

}
