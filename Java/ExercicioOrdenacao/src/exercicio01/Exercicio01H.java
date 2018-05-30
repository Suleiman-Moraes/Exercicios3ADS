package exercicio01;

import util.Ordenacao;

public class Exercicio01H {
    static int[] insersao = {89, 79, 32, 38, 46, 26, 43, 38, 32, 79};
    static int[] selecao = {89, 79, 32, 38, 46, 26, 43, 38, 32, 79};
    static int[] bolha = {89, 79, 32, 38, 46, 26, 43, 38, 32, 79};
    public static void main(String[] args) {
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.bolha(bolha)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.insersao(insersao)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.selecao(selecao)));
    }
}
