package ordenacaovetor.exercicio01;

import ordenacaovetor.util.Ordenacao;

public class Exercicio01G {
    static int[] insersao = {8, 9 ,7, 9, 3, 2, 3, 8, 4, 6};
    static int[] selecao = {8, 9 ,7, 9, 3, 2, 3, 8, 4, 6};
    static int[] bolha = {8, 9 ,7, 9, 3, 2, 3, 8, 4, 6};
    public static void main(String[] args) {
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.bolha(bolha)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.insersao(insersao)));
        System.out.println(Ordenacao.imprimirRetorno(Ordenacao.selecao(selecao)));
    }
}
