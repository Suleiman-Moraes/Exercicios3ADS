package vetor;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		int[] vet = new int[5];
		Scanner leia = new Scanner(System.in);
		for (int i = 0; i < vet.length; i++) {
			do {
				System.out.println("Digite o "+(i+1)+"º número entre \"10\" e \"100\": ");
				vet[i] = leia.nextInt();
			} while (vet[i] <= 10 || vet[i] >= 100);
			for (int j = 0; j < i; j++) {
				if(vet[i] == vet[j]) {
					i--;
					j = i + 5;
				}
			}
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
}
