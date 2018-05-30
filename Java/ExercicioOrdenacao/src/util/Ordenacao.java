package util;

public class Ordenacao<T> {

    private static Retorno retorno;

    public static Retorno insersao(int vetor[]) {
        int j;
        int key;
        int i;
        retorno = new Retorno();
        retorno.setNumeroDeComparacao(0);
        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            retorno.setNumeroDeComparacao(retorno.getNumeroDeComparacao() + 1);
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
                retorno.setNumeroDeComparacao(retorno.getNumeroDeComparacao() + 1);
            }
            vetor[i + 1] = key;
        }
        retorno.setNumeroDeTrocas(retorno.getNumeroDeComparacao());
        retorno.setVetorOrdenado(vetor);
        return retorno;
    }

    public static Retorno bolha(int vetor[]) {
        int i, j, aux;
        boolean troca = false;
        retorno = new Retorno();
        retorno.setNumeroDeComparacao(0);
        retorno.setNumeroDeTrocas(0);
        for (i = vetor.length - 1; i > 0; i--) {
            troca = false;

            for (j = 0; j < i; j++) {
                retorno.setNumeroDeComparacao(retorno.getNumeroDeComparacao() + 1);
                if (vetor[j] > vetor[j + 1]) {
                    retorno.setNumeroDeTrocas(retorno.getNumeroDeTrocas() + 1);
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        retorno.setVetorOrdenado(vetor);
        return retorno;
    }
    
    public static String bolhaString(String texto) {
        int i, j;
        char aux;
        boolean troca = false;
        char vetor[] = new char[texto.length()];
        for (int k = 0; k < texto.length(); k++) {
            vetor[k] = texto.charAt(k);
        }
        for (i = vetor.length - 1; i > 0; i--) {
            troca = false;

            for (j = 0; j < i; j++) {
                if (!(UComparacao.comparar(vetor[j], vetor[j +1]))) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    troca = true;
                }
            }
            if (!troca) {
                break;
            }
        }
        texto = "";
        for (int k = 0; k < vetor.length; k++) {
            texto += vetor[k];
        }
        return texto;
    }

    public static Retorno selecao(int[] vetor) {
        int minimo = 0;
        retorno = new Retorno();
        retorno.setNumeroDeComparacao(0);
        retorno.setNumeroDeTrocas(0);
        for (int i = 0; i <= vetor.length - 2; i++) {
            minimo = i;
            for (int j = i + 1; j <= vetor.length - 1; j++) {
                retorno.setNumeroDeComparacao(retorno.getNumeroDeComparacao() + 1);
                if (vetor[j] < vetor[minimo]) {
                    minimo = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[minimo];
            vetor[minimo] = temp;
            retorno.setNumeroDeTrocas(retorno.getNumeroDeTrocas() + 1);
        }
        retorno.setVetorOrdenado(vetor);
        return retorno;
    }

    public static String imprimirRetorno(Retorno objeto) {
        StringBuffer tudo = new StringBuffer("");
        for (int i = 0; i < objeto.getVetorOrdenado().length; i++) {
            tudo.append(objeto.getVetorOrdenado()[i]);
            tudo.append(" ");
        }
        tudo.append("\nNumero de Comparação == ");
        tudo.append(objeto.getNumeroDeComparacao());
        tudo.append("\nNumero de Trocas == ");
        tudo.append(objeto.getNumeroDeTrocas());
        return tudo.toString();
    }

    public static String imprimirRetorno(int[] vetor) {
        StringBuffer tudo = new StringBuffer("");
        for (int i = 0; i < vetor.length; i++) {
            tudo.append(vetor[i]);
            tudo.append(" ");
        }
        return tudo.toString();
    }

    public static int[] recebeValor(int[] vetor, int valor) {
        int[] vet = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            vet[i] = vetor[i];
        }
        vet[vet.length - 1] = valor;
        return vet;
    }

    public static int[] prencherVetorRepitindo(int de, int ate, int length) {
        int[] vetor = new int[length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = URandom.gerador(de, ate);
        }
        return vetor;
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
}
