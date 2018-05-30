package model;
public class SimHomen extends Sim{
    private int idade;

    public SimHomen() {}
    public SimHomen(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getNomeComposto() {
        return nome;
    }
}
