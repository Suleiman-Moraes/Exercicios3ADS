package exercicios.exercicio11;

import java.util.Random;
import util.ListaSimples;

public class Exercicio11 {
    public static void main(String[] args) {
        ListaSimples lista1 = new ListaSimples();
        ListaSimples lista2 = new ListaSimples();
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            lista1.insereNoInicio(gerador.nextInt(11));
            lista2.insereNoInicio(gerador.nextInt(11));
        }
        System.out.println("Lista 1");
        lista1.mostraLista();
        System.out.println("\n\nLista 2");
        lista2.mostraLista();
        
        lista1.adcionarLista(lista2);
        System.out.println("\n\nLista 1 e 2");
        lista1.mostraLista();
        
        lista1.ordenarLista();
        System.out.println("\n\nLista 1 e 2 Ordenada");
        lista1.mostraLista();
    }
}
