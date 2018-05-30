package pesquisalinearbinaria.exercicio07;
public class Exercicio07 {
    public static boolean ordemCrescente(int[] vet){
        int i = 0;
        while (i < vet.length - 1 && vet[i] <= vet[i+1]){
           i ++; 
        }
        if(i == vet.length - 1) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        int vet[] = new int[20];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
        }
        int veto[] = new int[20];
        for (int i = 0; i < vet.length - 1; i++) {
            veto[i] = i;
        }
        veto[19] = 2;
        System.out.println(ordemCrescente(vet));
        System.out.println(ordemCrescente(veto));
    }
    
}
