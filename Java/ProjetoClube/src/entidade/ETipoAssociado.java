package entidade;

import interfaces.IDesmaterializar;

public class ETipoAssociado implements Comparable<ETipoAssociado>, IDesmaterializar{
    
    private int codigo;
    private String descricao;
    private double valorMensalidade;

    public ETipoAssociado(){}
    public ETipoAssociado(String descricao, int codigo){
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public ETipoAssociado(int codigo, String descricao, double valorMensalidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorMensalidade = valorMensalidade;
    }
    
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public double getValorMensalidade() {return valorMensalidade;}
    public void setValorMensalidade(double valorMensalidade) {this.valorMensalidade = valorMensalidade;}

    @Override
    public String[] desmaterializar()throws Exception{
        String[] vet = new String[3];
        
        vet[0] = codigo + "";
        vet[1] = descricao;
        vet[2] = valorMensalidade + "";
        return vet;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
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
        final ETipoAssociado other = (ETipoAssociado) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(ETipoAssociado o) {
        if(this.codigo == o.getCodigo()) return 0;
        else if(this.codigo < o.getCodigo()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
