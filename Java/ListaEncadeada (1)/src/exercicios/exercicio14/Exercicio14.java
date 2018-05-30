package exercicios.exercicio14;

import util.Pilha;

public class Exercicio14 {
    public static void main(String[] args) {
        Pilha aaa = new Pilha();
        for (int i = 0; i < 10; i++) {
            aaa.empilhar(new Pessoa("Teste == " + i));
        }
        System.out.println("Lista");
        aaa.mostrarLista();
        
        System.out.println("\n\nDesempilhar");
        System.out.println(aaa.desempilhar());
        
        System.out.println("\n\nLista");
        aaa.mostrarLista();
        
        System.out.println("\n\nConsultar");
        System.out.println(aaa.consultarTopo());
        
        System.out.println("\n\nLista");
        aaa.mostrarLista();
    }
}
