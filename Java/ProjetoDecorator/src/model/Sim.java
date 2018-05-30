package model; 
public abstract class Sim {
    protected String profissao = "";
    protected String nome;

    public abstract String getNomeComposto();
    
    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }
    
}
