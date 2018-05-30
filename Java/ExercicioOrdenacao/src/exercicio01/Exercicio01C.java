package exercicio01;

import util.Ordenacao;

public class Exercicio01C {
    static int[] insersao = {11, 9, 7, 5, 3, 1};
    static int[] selecao = {11, 9, 7, 5, 3, 1};
    static int[] bolha = {11, 9, 7, 5, 3, 1};
    public static void main(String[] args) {
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.bolha(bolha)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.insersao(insersao)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.selecao(selecao)));
    }
}
