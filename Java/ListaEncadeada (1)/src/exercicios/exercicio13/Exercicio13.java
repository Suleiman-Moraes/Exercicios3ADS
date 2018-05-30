package exercicios.exercicio13;

import simples.Pilha;

public class Exercicio13 {
    public static void main(String[] args) {
        Pilha rayovac = converterEmBinario(10);
        System.out.println("\n\n" + rayovac.mostrarLista());
    }
    public static Pilha converterEmBinario(int num){
        Pilha amarela = new Pilha();
        while(num != 0){
            amarela.empilhar(num%2);
            num = num/2;
        }
        return amarela;
    }
}
