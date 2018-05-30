package exercicios.exercicio09.dados;

import java.util.Scanner;
import util.ListaSimples;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ListaSimples lista = new ListaSimples();
        for (int i = 0; i < 10; i++) {
            Aluno aux = new Aluno(leia.nextInt());
            lista.insereOrdenado(aux);
            lista.mostraLista();
        }
    }
}
