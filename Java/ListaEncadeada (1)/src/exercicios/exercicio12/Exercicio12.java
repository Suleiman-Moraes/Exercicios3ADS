package exercicios.exercicio12;

import java.util.Random;
import util.Pilha;

public class Exercicio12 {
    public static void main(String[] args) {
        Pilha alcalina = new Pilha();
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            int x = gerador.nextInt(11);
            System.out.print(x + " ");
            alcalina.empilhar(x);
        }
        System.out.println("Lista");
        alcalina.mostrarLista();
        
        System.out.println("\n\nOrdenar");
        alcalina.ordenar();
        System.out.println("Lista");
        alcalina.mostrarLista();
    }
}
