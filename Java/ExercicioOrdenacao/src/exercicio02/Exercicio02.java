//Implemente um programa que simule o jogo do Bingo. O programa deve gerar
//sucessivamente números aleatórios compreendidos entre 1 e 90 até que o
//usuário digite o caractere $. Para facilitar a verificação da cartela vencedora, o
//programa deve apresentar a lista ordenada de todos os números já sorteados
//após o sorteio de um novo número. Use ordenação por inserção.
package exercicio02;

import java.util.Scanner;
import util.Ordenacao;
import util.URandom;

public class Exercicio02 {

    public static void main(String[] args) {
        Exercicio02 exercicio02 = new Exercicio02();
        exercicio02.executar();
    }

    public void executar() {
        int valor;
        int[] vetor = {valor = gerarValor(1, 90)};
        Scanner leia = new Scanner(System.in);
        char op = ' ';
        System.out.println(imprimir(vetor));
        System.out.println("length == " + vetor.length);
        do {
            System.out.println("Prosseguir ??                 [\"$\"]Sair");
            op = leia.next().charAt(0);
            do {                
                valor = gerarValor(1, 90);
            } while (!verificaIgualdade(vetor, valor));
            int[] aux = recebeValor(vetor, valor);
            vetor = new int[aux.length];
            vetor = ordenacao(aux);
            System.out.println("Pedra == " + valor);
            System.out.println(imprimir(vetor));
//            System.out.println("length == " + vetor.length);
        } while (op != '$' && vetor.length < 90);
        
        System.out.println("Fim");
    }

    public int gerarValor(int de, int ate) {
        return URandom.gerador(de, ate);
    }

    public int[] recebeValor(int[] vetor, int valor) {
        int[] vet = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            vet[i] = vetor[i];
        }
        vet[vet.length - 1] = valor;
        return vet;
    }

    public int[] ordenacao(int vetor[]) {
        return Ordenacao.insersao(vetor).getVetorOrdenado();
    }

    public boolean verificaIgualdade(int[] vetor, int valor) {
        boolean retorno = true;
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                retorno = false;
                break;
            } 
        }
        return retorno;
    }

    public String imprimir(int vetor[]) {
        return Ordenacao.imprimirRetorno(vetor);
    }
}
