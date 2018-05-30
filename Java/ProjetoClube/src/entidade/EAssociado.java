package entidade;

import interfaces.IDesmaterializar;

public class EAssociado implements Comparable<EAssociado>, IDesmaterializar{
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    
    private ETipoAssociado tipoAssociado;

    public EAssociado() {}
    public EAssociado(ETipoAssociado objeto) {
        this.tipoAssociado = objeto;
    }
    public EAssociado(int codigo, String nome, String endereco, String telefone, ETipoAssociado tipoAssociado) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoAssociado = tipoAssociado;
    }
    public EAssociado(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
   
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public ETipoAssociado getTipoAssociado() {return tipoAssociado;}
    public void setTipoAssociado(ETipoAssociado tipoAssociado) {this.tipoAssociado = tipoAssociado;}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EAssociado other = (EAssociado) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    @Override
    public String[] desmaterializar()throws Exception{
        String[] vet = new String[6];
        
        vet[0] = codigo + "";
        vet[1] = nome;
        vet[2] = endereco;
        vet[3] = telefone;
        
        String[] tipo = tipoAssociado.desmaterializar();
        int cont = 4;
        for (int i = 1; i < tipo.length; i++) {
            vet[cont] = tipo[i];
            cont ++;
        }
        return vet;
    }

    @Override
    public int compareTo(EAssociado o) {
        if(this.codigo == o.getCodigo()) return 0;
        else if(this.codigo < o.getCodigo()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return nome;
    }
}
