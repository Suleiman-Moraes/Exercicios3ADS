package util;

import java.util.Random;

public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        Random ale = new Random();
        System.out.println("Esse " + 51);
        lista.retirarElemento(51);
        for (int i = 0; i <10; i++) {
            int x = ale.nextInt(50);
            System.out.println(x);
            lista.insereOrdenado(x);
            if(i == 5) {
                System.out.println("Esse " + x);
                lista.retirarElemento(x);
            }
        }
        System.out.println("Esse " + lista.fim.getInfo());
        lista.retirarElemento(lista.fim.getInfo());
        System.out.println("Esse " + lista.inicio.getInfo());
        lista.retirarElemento(lista.inicio.getInfo());
        System.out.println("Esse " + 51);
        lista.retirarElemento(51);
        System.out.println("Elementos da lista");
        lista.mostraLista();
    }
}
