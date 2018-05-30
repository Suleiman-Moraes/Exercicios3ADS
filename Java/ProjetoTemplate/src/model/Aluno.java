package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private int matricula;
    private String nome;
    private String escola;
    private String titulacao;
    private String tipoDoContrato;
    private Date dataDeAdmicao; 

    public Aluno() {}

    public Aluno(int matricula, String nome, String tipoDoIngresso, String turno, String matrizCurricular, Date dataDeAdmicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = tipoDoIngresso;
        this.titulacao = turno;
        this.tipoDoContrato = matrizCurricular;
        this.dataDeAdmicao = dataDeAdmicao;
    }
    
    public Aluno(Aluno objeto) {
        this.matricula = objeto.matricula;
        this.nome = objeto.nome;
        this.escola = objeto.escola;
        this.titulacao = objeto.titulacao;
        this.tipoDoContrato = objeto.tipoDoContrato;
        this.dataDeAdmicao = objeto.dataDeAdmicao;
    }

    public void setAluno(int matricula, String nome, String tipoDoIngresso, String turno, String matrizCurricular, Date dataDeAdmicao) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = tipoDoIngresso;
        this.titulacao = turno;
        this.tipoDoContrato = matrizCurricular;
        this.dataDeAdmicao = dataDeAdmicao;
    }
    
    public void setAluno(Aluno objeto) {
        this.matricula = objeto.matricula;
        this.nome = objeto.nome;
        this.escola = objeto.escola;
        this.titulacao = objeto.titulacao;
        this.tipoDoContrato = objeto.tipoDoContrato;
        this.dataDeAdmicao = objeto.dataDeAdmicao;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEscola() {
        return escola;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String getTipoDoContrato() {
        return tipoDoContrato;
    }

    public Date getDataDeAdmicao() {
        return dataDeAdmicao;
    }
    public String getDataDeAdmicaoString() {
        return new SimpleDateFormat("dd/MM/yyyy").format(dataDeAdmicao);
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setTipoDoContrato(String tipoDoContrato) {
        this.tipoDoContrato = tipoDoContrato;
    }

    public void setDataDeAdmicao(Date dataDeAdmicao) {
        this.dataDeAdmicao = dataDeAdmicao;
    }
    
    public void setDataDeAdmicao(String dataDeAdmicao) throws Exception {
        this.dataDeAdmicao = new SimpleDateFormat("dd/MM/yyyy").parse(dataDeAdmicao);
    }
        
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");

        matricula = Integer.parseInt(vetorString[0]);
        nome = vetorString[1];
        escola = vetorString[2];
        titulacao = vetorString[3];
        tipoDoContrato = vetorString[4];
        dataDeAdmicao = new SimpleDateFormat("dd/MM/yyyy").parse(vetorString[5]);
    }

    public String desmaterializar() {
        String tudo = toString();
        return tudo;
    }

    @Override
    public String toString() {
        return "" + matricula + ";" + nome + ";" + escola + ";" + titulacao + ";" + tipoDoContrato + ";" + 
                new SimpleDateFormat("dd/MM/yyyy").format(dataDeAdmicao);
    }
        
}
