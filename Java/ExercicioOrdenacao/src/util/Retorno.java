package util;
public class Retorno {
    private int numeroDeTrocas;
    private int numeroDeComparacao;
    private int[] vetorOrdenado;

    public Retorno() {}

    public Retorno(int numeroDeTrocas, int numeroDeComparavcao, int[] vetorOrdenado) {
        this.numeroDeTrocas = numeroDeTrocas;
        this.numeroDeComparacao = numeroDeComparavcao;
        this.vetorOrdenado = vetorOrdenado;
    }

    public int getNumeroDeTrocas() {
        return numeroDeTrocas;
    }

    public int getNumeroDeComparacao() {
        return numeroDeComparacao;
    }

    public int[] getVetorOrdenado() {
        return vetorOrdenado;
    }

    public void setNumeroDeTrocas(int numeroDeTrocas) {
        this.numeroDeTrocas = numeroDeTrocas;
    }

    public void setNumeroDeComparacao(int numeroDeComparacao) {
        this.numeroDeComparacao = numeroDeComparacao;
    }

    public void setVetorOrdenado(int[] vetorOrdenado) {
        this.vetorOrdenado = vetorOrdenado;
    }
        
}
