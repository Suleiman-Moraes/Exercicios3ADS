package entidade;

import interfaces.IDesmaterializar;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EPedido implements IDesmaterializar{
    //Atributos
    private int identificador;
    private float valorTotal;
    private Date dataHoraPedido;
    private EAssociado associado;
    private List<EItemPedido> lista;
    
    //construtor
    public EPedido() {
        associado = new EAssociado();
        lista = new ArrayList<>();
    }
    public EPedido(int identificador, float valorTotal, Date dataHoraPedido, EAssociado associado, List<EItemPedido> lista) {
        this.identificador = identificador;
        this.valorTotal = valorTotal;
        this.dataHoraPedido = dataHoraPedido;
        this.associado = associado;
        this.lista = lista;
    }
    public EPedido(EPedido objeto) {
        this.identificador = objeto.identificador;
        this.valorTotal = objeto.valorTotal;
        this.dataHoraPedido = objeto.dataHoraPedido;
        this.associado = objeto.associado;
        this.lista = objeto.lista;
    }
    public EPedido(int identificador) {
        this.identificador = identificador;
    }
    
    //Getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    public void setValorTotalAcumulando(float valor) {
        this.valorTotal += valor;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public EAssociado getAssociado() {
        return associado;
    }

    public void setAssociado(EAssociado associado) {
        this.associado = associado;
    }

    public List<EItemPedido> getLista() {
        return lista;
    }

    public void setLista(List<EItemPedido> lista) {
        this.lista = lista;
    }

    @Override
    public String[] desmaterializar() throws Exception {
        String[] vet = new String[6];
        
//        vet[0] = identificador + "";
//        vet[1] = valorTotal + "";
//        vet[2] = endereco;
//        
//        String[] tipo = associado.desmaterializar();
//        int cont = 3;
//        for (int i = 1; i < tipo.length; i++) {
//            vet[cont] = tipo[i];
//            cont ++;
//        }//7
        return vet;
    }
}
