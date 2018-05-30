package ordenacaovetor.exercicio05;

import ordenacaovetor.exercicio04.Aluno;
import ordenacaovetor.exercicio04.Metodos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import ordenacaovetor.util.UComparacao;

public class OrdenarPorOcorrencia {//27
    char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','ç'};
    private int[] vetor = new int[256];
    public void associar(char j){
        int y = j;
        vetor[y] ++;
    }
    public static void main(String[] args) {
        OrdenarPorOcorrencia x = new OrdenarPorOcorrencia();
        System.out.println(x.letras.length);
    }

    public int[] getVetor() {
        return vetor;
    }
    String tudo = "";
    public String imprimir(){
        tudo = "";
        List<Caracter> lista = new ArrayList<>();
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] != 0){
//                tudo += "\n" + (char)i + " == " + vetor[i];
                lista.add(new Caracter((char)i, vetor[i], i));
            }
        }
        lista = bolhaMatricula(lista);
        lista.forEach(x -> tudo +="\n" + x.letra +"["+x.repeticao+"]");
        
        return tudo;
    }
    
    public static List bolhaMatricula(List<Caracter> vetor) {
        int i, j;
        Caracter aux = null;
        boolean troca = false;
        for (i = vetor.size() - 1; i > 0; i--) {
            troca = false;

            for (j = 0; j < i; j++) {
                if(!(UComparacao.comparar(vetor.get(j).repeticao, vetor.get(j + 1).repeticao))){
                    aux = new Caracter(vetor.get(j));
                    vetor.get(j).setCaracter(vetor.get(j + 1));
                   vetor.get(j + 1).setCaracter(aux);
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        return vetor;
    }
}
