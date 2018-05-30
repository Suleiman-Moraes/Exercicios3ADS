package exercicio01;

import util.Ordenacao;

public class Exercicio01D {
    static int[] insersao = {5, 7, 2, 8, 1, 6};
    static int[] selecao = {5, 7, 2, 8, 1, 6};
    static int[] bolha = {5, 7, 2, 8, 1, 6};
    public static void main(String[] args) {
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.bolha(bolha)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.insersao(insersao)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.selecao(selecao)));
    }
}
