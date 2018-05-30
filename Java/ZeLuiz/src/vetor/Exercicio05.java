package vetor;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		int vet[] = new int[3];
		int maior = Integer.MIN_VALUE;
		int maior2 = Integer.MIN_VALUE;
		Scanner leia = new Scanner(System.in);
		System.out.println(maior);
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o "+(i+1)+"º Valor: ");
			vet[i] = leia.nextInt();
			if(vet[i] > maior) {
				maior2 = maior;
				maior = vet[i];
			}else if(vet[i] > maior2) maior2 = vet[i];
		}
		System.out.println("Maior: "+maior+"\n2º Maior: "+maior2);
	}
}
