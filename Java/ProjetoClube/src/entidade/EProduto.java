package entidade;
public class EProduto {
    private int id;
    private String nome;
    private float valorVenda;

    public EProduto() {}
    public EProduto(int id, String nome, float valorVenda) {
        this.id = id;
        this.nome = nome;
        this.valorVenda = valorVenda;
    }
    public EProduto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public EProduto(EProduto produto) {
        this.id = produto.id;
        this.nome = produto.nome;
        this.valorVenda = produto.valorVenda;
    }
    public EProduto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return nome + " R$" + valorVenda;
    }
}
