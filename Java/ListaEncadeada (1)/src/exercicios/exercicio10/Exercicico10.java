package exercicios.exercicio10;

import simples.ListaSimples;

public class Exercicico10 {
    public static void main(String[] args) {
        int[] v = {3,8,1,7,2};
        ListaSimples l = funcao(v);
        l.mostraLista();
    }
    
    public static ListaSimples funcao(int[] vet){
        ListaSimples lista = new ListaSimples();
        for (int i : vet) {
            lista.insereNoFim(i);
        }
        return lista;
    }
 }
