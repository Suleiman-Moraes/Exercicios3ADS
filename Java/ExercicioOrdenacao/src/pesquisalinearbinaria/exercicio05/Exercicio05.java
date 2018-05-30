package pesquisalinearbinaria.exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pesquisalinearbinaria.exercicio04.MetodoDeBusca;

public class Exercicio05 {
    public static void main(String[] args) {
        MetodoDeBusca met = new MetodoDeBusca();
        Scanner leia = new Scanner(System.in);
        List<Produto> vet = new ArrayList<>();
        int cont = 0;
        int c;
        do { 
            Produto aux = new Produto();
            System.out.println("codigo");
            aux.setCodigo(leia.nextInt());
            System.out.println("Descrição");
            leia.nextLine();
            aux.setDescricao(leia.nextLine());
            System.out.println("Valor");
            aux.setPreco(leia.nextFloat());
            
            vet.add(aux);
            cont ++;
            
            System.out.println("Continuar? [1]sim [2]nao");
            c = leia.nextInt();
        } while (cont < 100 && c == 1);
        
        int f = 0;
        boolean localizador = false;
        while(f < vet.size() && localizador == false){
            if(vet.get(f).getCodigo() == -1) localizador = true;
            else f++;
        }
        System.out.println("Linear " + f);
        
        List<Produto> veto = new ArrayList<>();
        for (int i = 0; i < vet.size() - 1; i++) {
            if(vet.get(i).getCodigo() != vet.get(i+1).getCodigo()){
                veto.add(vet.get(i));
            }
        }
        
        int i, j, h = 1; 
        Produto value;
        do {
            h = 3 * h + 1;
        } while (h < veto.size());
        do {
            h = h / 3;
            for (i = h; i < veto.size(); i++) {
                value = veto.get(i);
                j = i - h;
                while(j >= 0 && value.getCodigo() < veto.get(j).getCodigo()){
                    veto.set(j + h, veto.get(j));
                    j = j - h;
                }
                veto.set(j + h, value);
            }
        } while (h > 1);
        
        int inicio = 0;
        int fim = vet.size() - 1;
        int meio = (inicio + fim) / 2;
        cont = 0;
        while(inicio <= fim && localizador == false){
            if(vet.get(meio).getCodigo() == -1) localizador = true;
            else{
                if(-1 < vet.get(meio).getCodigo()) fim = meio - 1;
                else inicio = meio + 1;
                meio = (inicio + fim) / 2;
                cont ++;
            }
        }
        
        System.out.println("Binaria " + cont);
    }
}
