package exercicios.exercicio07;
public class Paciente implements Comparable<Paciente>{
    private String cpf;
    private String nome;
    private String fone;
    private String telefone;
    private String email;

    public Paciente() {}
    public Paciente(String cpf) {this.cpf = cpf;}
    public Paciente(String cpf, String nome, String fone, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
        this.telefone = telefone;
        this.email = email;
    }
    public Paciente(Paciente objeto) {
        this.cpf = objeto.cpf;
        this.nome = objeto.nome;
        this.fone = objeto.fone;
        this.telefone = objeto.telefone;
        this.email = objeto.email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Paciente o) {
        return cpf.compareToIgnoreCase(o.cpf);
    }

    @Override
    public String toString() {
        return "Paciente{" + "cpf=" + cpf + '}';
    }
    
}
