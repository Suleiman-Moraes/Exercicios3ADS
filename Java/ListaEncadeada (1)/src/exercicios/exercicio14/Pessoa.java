package exercicios.exercicio14;
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String endereco;
    private String trelefone;

    public Pessoa() {}
    public Pessoa(String nome) {this.nome = nome;}
    public Pessoa(String nome, String endereco, String trelefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.trelefone = trelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTrelefone() {
        return trelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTrelefone(String trelefone) {
        this.trelefone = trelefone;
    }

    @Override
    public int compareTo(Pessoa o) {
        return nome.compareToIgnoreCase(o.nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", trelefone=" + trelefone + '}';
    }
}
