package exercicios.exercicio07;

import util.ListaSimples;

public class Exercicio07 {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        for (int i = 0; i < 10; i++) {
            Paciente aux = new Paciente(i + "");
            lista.insereNoFim(aux);
        }
        System.out.println("Lista");
        lista.mostraLista();
        System.out.println("\n\nChamar o paciente para ser atendido;");
        System.out.println(lista.retirarPrimeiroElemento());
        System.out.println("\n\nLista");
        lista.mostraLista();
        System.out.println(lista.eVazia());
        System.out.println("\n\nVerificar o próximo paciente a ser atendido;");
        System.out.println(lista.getInicio());
        System.out.println("\n\nInformar quantos pacientes existem na fila de espera.");
        lista.insereNoFim(new Paciente("-8989898989"));
        System.out.println(lista.size());
        System.out.println("\n\nLista");
        lista.mostraLista();
    }
}
