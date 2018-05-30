package teste;

import entidade.EAssociado;
import entidade.EPedido;
import entidade.EProduto;
import java.util.Date;
import negocio.NPedido;
import negocio.NProduto;

public class TProduto {
    public static void main(String[] args) {
        System.out.println("Teste produto");
        EProduto tipo = new EProduto(0, "teste", 50);
        EProduto tipo2 = new EProduto(1, "alterar", 99);
        
        NProduto ser = new NProduto();
        
        try {
            ser.salvar(tipo);
            ser.salvar(tipo2);
            ser.deletar(tipo.getId());
            System.out.println(ser.consultar(1).getId());
            ser.listar().forEach(x -> System.out.println(x.getId()));
            System.out.println("Sucesso.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
