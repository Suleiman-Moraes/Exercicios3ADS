package pesquisalinearbinaria.exercicio03;

import pesquisalinearbinaria.exercicio01.Exercicio01;
import static pesquisalinearbinaria.exercicio02.Exercicio02.shellSort;

public class Exercicio03 {

    public static int[] eliminarRepitidos(int[] vet){
        int j = 0;
        int[] veto = new int[vet.length];
        for (int i = 0; i < vet.length - 1; i++) {
            if(vet[i] != vet[i+1]) {
                veto[j] = vet[i];
                j++;
            }
        }
        return veto;
    }
    
    public static void main(String[] args) {
        int vet[] = Exercicio01.prencherVetorRepitindo(1000000, 100000);
        vet = shellSort(vet);
        int veto[] = eliminarRepitidos(vet);
        int i = 0;
        while(i < veto.length && (veto[i] != 0 || i == 0)){
            System.out.print(veto[i] + " ");
            if(i%15 == 0) System.out.println("");
            i ++;
        }
    }
}
