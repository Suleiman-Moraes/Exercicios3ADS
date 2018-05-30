package pesquisalinearbinaria.exercicio01;

import java.util.Random;

public class Exercicio01 {
    public static int[] prencherVetorRepitindo(int ate, int length) {
        int[] vetor = new int[length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador(ate);
        }
        return vetor;
    } 
    public static int gerador(int ate) {
        Random gerador = new Random();
        return gerador.nextInt(ate);
    }
    
    public static void main(String[] args) {
        int vet[] = prencherVetorRepitindo(1000000, 100000);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            if(i%15 == 0) System.out.println("");
        }
    }
}
