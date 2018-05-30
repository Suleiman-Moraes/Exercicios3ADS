package exercicio05;
public class Caracter {
    char letra;
    int repeticao;
    int ask;

    public Caracter(char letra, int repeticao, int ask) {
        this.letra = letra;
        this.repeticao = repeticao;
        this.ask = ask;
    }
    public Caracter(Caracter objeto) {
        this.letra = objeto.letra;
        this.repeticao = objeto.repeticao;
        this.ask = objeto.ask;
    }
    
    public void setCaracter(char letra, int repeticao, int ask) {
        this.letra = letra;
        this.repeticao = repeticao;
        this.ask = ask;
    }
    public void setCaracter(Caracter objeto) {
        this.letra = objeto.letra;
        this.repeticao = objeto.repeticao;
        this.ask = objeto.ask;
    }
}
