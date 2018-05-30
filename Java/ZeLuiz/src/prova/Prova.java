package prova;

import java.util.Scanner;

public class Prova {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int[] vet1 = receberVetor("Vetor 1\n");
		int[] vet2 = receberVetor("\n\n\nVetor 2\n");
		vet1 = shellSort(vet1);
		vet2 = shellSort(vet2);
		System.out.println("Vetor 2\n");
		for (int i : vet2) {
			System.out.println(i);
		}
		System.out.println("\n\n\nVetor 1\n");
		for (int i : vet1) {
			System.out.println(i);
		}
		int[] un = uniao(vet1, vet2);
		un = shellSort(un);
		System.out.println("\n\n\nUnião\n");
		for (int i : un) {
			System.out.println(i);
		}
	}
	public static int[] receberVetor(String nome) {
		System.out.println(nome);
		int[] vet = new int[1];
		System.out.println("Digite um valor ");
		vet[0] = leia.nextInt();
		int valor;
		do {
			do {
				System.out.println("Digite um valor      [-999999] Sair");
				valor = leia.nextInt();
			} while (comparar(vet, valor));
			if(valor == -999999) break;
			int[] aux = array(vet, valor);
			vet = new int[vet.length + 1];
			vet = aux;
		} while (true);
		return vet;
	}
	public static int[] array(int[] vet, int valor) {
		int[] v = new int[vet.length + 1];
		for (int i = 0; i < vet.length; i++) {
			v[i] = vet[i];
		}
		v[vet.length] = valor;
		return v;
	}
	public static boolean comparar(int[] vet, int valor) {
		for (int i : vet) {
			if(valor == i) {
				System.out.println("Repetido");
				return true;
			}
		}
		return false;
	}
	
	private static int[] shellSort(int[] vetor) {
        int i, j, h = 1, value;
        do {
            h = 3 * h + 1;
        } while (h < vetor.length);
        do {
            h = h / 3;
            for (i = h; i < vetor.length; i++) {
                value = vetor[i];
                j = i - h;
                while (j >= 0 && value < vetor[j]) {
                    vetor[j + h] = vetor[j];
                    j = j - h;
                }
                vetor[j + h] = value;
            }
        } while (h > 1);

        return vetor;
    }
	
	public static int[] uniao(int[] vet1, int[] vet2) {
		for (int i = 0; i < vet2.length; i++) {
			if(!compara(vet1, vet2[i])) {
				int[] aux = array(vet1, vet2[i]);
				vet1 = new int[vet1.length + 1];
				vet1 = aux;
			}
		}
		return vet1;
	}
	public static boolean compara(int[] vet, int valor) {
		for (int i : vet) {
			if(valor == i) return true;
			else if (valor < i) return false;
		}
		return false;
	}
}
