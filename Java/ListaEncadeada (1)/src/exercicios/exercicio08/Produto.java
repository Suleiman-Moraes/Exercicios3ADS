package exercicios.exercicio08;
public class Produto implements Comparable<Produto>{
    private int codigo;
    private String descricao;
    private float preco;

    public Produto() {}
    public Produto(int codigo) {this.codigo = codigo;}
    public Produto(int codigo, String descricao, float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public float getPreco() {
        return preco;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void materializa(String texto){
        String tudo[] = texto.split(";");
        
        codigo = Integer.parseInt(tudo[0]);
        descricao = tudo[1];
        preco = Float.parseFloat(tudo[2]);
    }

    @Override
    public int compareTo(Produto o) {
        if(this.codigo < o.getCodigo()) return -1;
        if(this.codigo > o.getCodigo()) return 1;
        return 0;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo == " + codigo + ", descricao == " + descricao + ", preco == " + preco + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codigo;
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
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
}
