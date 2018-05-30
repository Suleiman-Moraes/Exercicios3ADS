package exercicio03;

import java.util.Scanner;
import util.Ordenacao;

public class Exercicio03 {
    public static void main(String[] args) {
        try{
            Exercicio03 thiss = new Exercicio03();
            Scanner leia = new Scanner(System.in);
            int[] vetor = new int[1]; 
            System.out.println("Digite um Numero: ");
            vetor[0] = leia.nextInt();
           do{
                System.out.println("Digite um Numero: ");
                int valor = leia.nextInt();
                int[] aux = new int[vetor.length +1];
                aux = Ordenacao.recebeValor(vetor, valor);
                vetor = new int[aux.length];
                vetor = aux;
                vetor = Ordenacao.bolha(vetor).getVetorOrdenado();
                thiss.impressaoPadrao(vetor, "Bolha");
                thiss.impressaoPadrao(Ordenacao.selecao(vetor).getVetorOrdenado(), "Seleção");
                thiss.impressaoPadrao(Ordenacao.insersao(vetor).getVetorOrdenado(), "Insersão");
           }while(vetor.length <= 100);
            System.out.println("Fim!");
        }catch(Exception e){
            System.out.println("Fim!");
        }
    }
    
    public static void impressaoPadrao(int[] vetor, String metodo){
        StringBuffer tudo = new StringBuffer("");
        tudo.append(metodo);
        tudo.append(" Vetor Ordenado == ");
        tudo.append(Ordenacao.imprimirRetorno(vetor));
        tudo.append("\nMediana == ");
        tudo.append(calcularMediana(vetor, verficarImparPar(vetor.length)));
        System.out.println(tudo.toString());
    }
    
    public static float calcularMediana(int[] vetor, boolean parImpar){
        if(vetor.length == 1) return vetor[0];
        else if(parImpar){
           int x = vetor.length/2;
           return (float) ((vetor[x] + vetor[x-1]) / 2.0);
        }
        else return vetor[((vetor.length - 1)/2)];
    }
    
    public static boolean verficarImparPar(int length){return length%2 == 0;}
}
