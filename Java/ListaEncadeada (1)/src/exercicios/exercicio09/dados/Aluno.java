package exercicios.exercicio09.dados;
public class Aluno implements Comparable<Aluno>{
    private int matricula;
    private String nome;
    private float media;

    public Aluno() {}
    public Aluno(int matricula) {this.matricula = matricula;}
    public Aluno(int matricula, String nome, float media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }
    public Aluno(Aluno aluno) {
        this.matricula = aluno.matricula;
        this.nome = aluno.nome;
        this.media = aluno.media;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getMedia() {
        return media;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public int compareTo(Aluno o) {
        if(this.matricula < o.getMatricula()) return -1;
        if(this.matricula > o.getMatricula()) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", media=" + media + '}';
    }
}
