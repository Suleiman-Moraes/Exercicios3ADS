package pesquisalinearbinaria.exercicio02;

import pesquisalinearbinaria.exercicio01.Exercicio01;

public class Exercicio02 {

    public static int[] shellSort(int[] vetor) {
        int i, j, h = 1, value;
        do {
            h = 3 * h + 1;
        } while (h < vetor.length);
        do {
            h = h / 3;
            for (i = h; i < vetor.length; i++) {
                value = vetor[i];
                j = i - h;
                while (j >= 0 && value < vetor[j]) {
                    vetor[j + h] = vetor[j];
                    j = j - h;
                }
                vetor[j + h] = value;
            }
        } while (h > 1);

        return vetor;
    }

    public static void main(String[] args) {
        int vet[] = Exercicio01.prencherVetorRepitindo(1000000, 100000);
        vet = shellSort(vet);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            if(i%15 == 0) System.out.println("");
        }
    }
}
