package pesquisalinearbinaria.exercicio04;
public class MetodoDeBusca {
    public int buscarSequencial(int[] vet, int num){
        int i = 0;
        boolean localizador = false;
        while(i < vet.length && localizador == false){
            if(vet[i] == num) localizador = true;
            else i++;
        }
        return i;
    }
    public int buscarBinaria(int[] vet, int num){
        boolean localizador = false;
        int inicio = 0;
        int fim = vet.length - 1;
        int meio = (inicio + fim) / 2;
        int cont = 0;
        while(inicio <= fim && localizador == false){
            if(vet[meio] == num) localizador = true;
            else{
                if(num < vet[meio]) fim = meio - 1;
                else inicio = meio + 1;
                meio = (inicio + fim) / 2;
                cont ++;
            }
        }
        return cont;
    }
    
    public static void main(String[] args) {
        MetodoDeBusca busca = new MetodoDeBusca();
        int vet[] = new int[50000];
        int veto[] = new int[511];
        System.out.println(busca.buscarBinaria(vet, 56));
        System.out.println(busca.buscarSequencial(vet, 45));
    }
}
