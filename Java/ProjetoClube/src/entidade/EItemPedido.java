package entidade;
public class EItemPedido {
    private int id;
    private float quantidade;
    private float precoEpoca;
    private EPedido pedido;
    private EProduto  produto;

    public EItemPedido() {}
    public EItemPedido(int id, float quantidade, float precoEpoca, EPedido pedido, EProduto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoEpoca = precoEpoca;
        this.pedido = pedido;
        this.produto = produto;
    }
    public EItemPedido(EItemPedido objeto) {
        this.id = objeto.id;
        this.quantidade = objeto.quantidade;
        this.precoEpoca = objeto.precoEpoca;
        this.pedido = objeto.pedido;
        this.produto = objeto.produto;
    }

    public int getId() {
        return id;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public float getPrecoEpoca() {
        return precoEpoca;
    }

    public EPedido getPedido() {
        if(pedido == null){
            pedido = new EPedido();
        }
        return pedido;
    }

    public EProduto getProduto() {
        return produto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoEpoca(float precoEpoca) {
        this.precoEpoca = precoEpoca;
    }

    public void setPedido(EPedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(EProduto produto) {
        this.produto = produto;
    }
}
