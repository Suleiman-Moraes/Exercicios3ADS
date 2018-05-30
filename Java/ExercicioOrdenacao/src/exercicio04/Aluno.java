package exercicio04;
public class Aluno {
    private String matricula;
    private String nome;
    private String tipoDoIngresso;
    private String turno;
    private String matrizCurricular;

    public Aluno() {}

    public Aluno(String matricula, String nome, String tipoDoIngresso, String turno, String matrizCurricular) {
        this.matricula = matricula;
        this.nome = nome;
        this.tipoDoIngresso = tipoDoIngresso;
        this.turno = turno;
        this.matrizCurricular = matrizCurricular;
    }
    
    public Aluno(Aluno objeto) {
        this.matricula = objeto.matricula;
        this.nome = objeto.nome;
        this.tipoDoIngresso = objeto.tipoDoIngresso;
        this.turno = objeto.turno;
        this.matrizCurricular = objeto.matrizCurricular;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDoIngresso() {
        return tipoDoIngresso;
    }

    public String getTurno() {
        return turno;
    }

    public String getMatrizCurricular() {
        return matrizCurricular;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoDoIngresso(String tipoDoIngresso) {
        this.tipoDoIngresso = tipoDoIngresso;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setMatrizCurricular(String matrizCurricular) {
        this.matrizCurricular = matrizCurricular;
    }
    
    public void setAluno(Aluno objeto) {
        this.matricula = objeto.matricula;
        this.nome = objeto.nome;
        this.tipoDoIngresso = objeto.tipoDoIngresso;
        this.turno = objeto.turno;
        this.matrizCurricular = objeto.matrizCurricular;
    }
    
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");

        matricula = vetorString[0];
        nome = vetorString[1];
        tipoDoIngresso = vetorString[2];
        turno = vetorString[3];
        matrizCurricular = vetorString[4];
    }

    public String desmaterializar() {
        String tudo = toString();
        return tudo;
    }

    @Override
    public String toString() {
        return "" + matricula + ";" + nome + ";" + tipoDoIngresso + ";" + turno + ";" + matrizCurricular;
    }
}
