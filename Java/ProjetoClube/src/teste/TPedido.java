package teste;

import entidade.EAssociado;
import entidade.EItemPedido;
import entidade.EPedido;
import entidade.EProduto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import negocio.NPedido;

public class TPedido {
    public static void main(String[] args) {
        System.out.println("Teste pedido");
        Date data = new Date();
        EAssociado ss = new EAssociado();
        ss.setCodigo(1);
        
        EPedido pp = new EPedido();
        pp.setIdentificador(1);
        EProduto pd = new EProduto();
        pd.setId(1);
        EItemPedido tip = new EItemPedido(3, 50, 75, pp, pd);
        List<EItemPedido> lista = new ArrayList<>();
        lista.add(tip);
        
        EPedido tipo = new EPedido(0, 50, data, ss, lista);
        EPedido tipo2 = new EPedido(3, 99, data, ss, lista);
        
        NPedido ser = new NPedido();
        
        try {
            ser.salvar(tipo);
            ser.salvar(tipo2);
            ser.deletar(tipo.getIdentificador());
            System.out.println(ser.consultar(1).getIdentificador());
            ser.listar().forEach(x -> {
                System.out.println(x.getIdentificador());
                x.getLista().forEach(y -> {
                    System.out.println(y.getProduto().getNome());
                    System.out.println(y.getId());
                });
            });
            System.out.println("Associado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
