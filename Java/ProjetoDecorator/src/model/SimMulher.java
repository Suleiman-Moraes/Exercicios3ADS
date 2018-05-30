package model;
public class SimMulher extends Sim{
    private int idade;
    
    public SimMulher(String nome, int idade){
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
