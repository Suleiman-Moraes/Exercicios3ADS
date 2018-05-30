package ordenacaovetor.exercicio01;

public class Exercicio1_3 {
	static int[] vet = {5, 7, 2, 8, 1, 6};
	static int[] vet2 = {5, 7, 2, 8, 1, 6};
	static int[] vet3 = {5, 7, 2, 8, 1, 6};
	static int inser = 0, boia = 0, selec = 0;
	public static void main(String[] args) {
		insersao(vet);
		bolha(vet2);
		selecao(vet3);
		System.out.println("Inser��o == "+inser+"\nBolha == "+boia+"\nSele��o == "+selec);
	}
	private static void insersao(int vetor[]) {
		int j;
	    int key;
	    int i;
	   
	    for (j = 1; j < vetor.length; j++){
	      key = vetor[j];
	      
	      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--){
	         vetor[i + 1] = vetor[i];
	         inser ++;
	       }
	        vetor[i + 1] = key;
	    }
	}
	private static void bolha(int veto[]) {
		int i, j, aux;
		boolean troca = false;
		for (i = veto.length - 1; i > 0; i--) {
			troca = false;
			
			for (j = 0; j < i; j++) {
				
				if (veto[j] > veto[j + 1]) {
					aux = veto[j];
					veto[j] = veto[j + 1];
					veto[j + 1] = aux;
					troca = true;
					boia++;
				}
			}
			if (!troca)
				return;
		}
	}
	private static void selecao(int[] veto) {
		for (int fixo = 0; fixo < veto.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < veto.length; i++) {
				if (veto[i] < veto[menor]) {
					menor = i;
					selec++;
				}
			}
			if (menor != fixo) {
				selec++;
				int t = veto[fixo];
				veto[fixo] = veto[menor];
				veto[menor] = t;
			}
		}
	}
}