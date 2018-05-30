package pesquisalinearbinaria.exercicio05;
public class Produto {
    private int codigo;
    private String descricao;
    private float preco;

    public Produto() {}
    public Produto(int codigo, String descricao, float preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto(Produto objeto) {
        this.codigo = objeto.codigo;
        this.descricao = objeto.descricao;
        this.preco = objeto.preco;
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
}
