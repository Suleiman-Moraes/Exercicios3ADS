package exercicios.exercicio05;

import java.util.Random;
import util.ListaCircular;

public class Exercicio05 {
    public static void main(String[] args) {
        ListaCircular lista1 = new ListaCircular();
        Random gerador = new Random();
        for (int i = -5; i < 10; i++) {
            lista1.insereOrdenadoS(gerador.nextInt(20) - 10);
        }
//        for (int i = 10; i > 0; i--) {
//            lista1.insereOrdenado(i);
////            lista1.insereNoFim(i);
//        }
//        lista1.insereOrdenado(10);
        System.out.println("Lista 1");
        lista1.mostraLista();
        
    }
}
