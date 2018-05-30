package teste;

import entidade.EAssociado;
import entidade.ETipoAssociado;
import negocio.NAssociado;

public class TAssociado {
    public static void main(String[] args) {
        System.out.println("Teste associado");
        ETipoAssociado tipo3 = new ETipoAssociado();
        EAssociado tipo = new EAssociado(0, "Teste", "Real Conquista", "62 9 9826-4577", tipo3);
        EAssociado tipo2 = new EAssociado(3, "Teste2", "Real Conquista2", "62 9 9826-4577", tipo3);
                
        tipo3.setDescricao("Tipo xxxxxxxxxxx inclusão");
        tipo3.setValorMensalidade(100.0);
        tipo3.setCodigo(8);
        
        NAssociado ser = new NAssociado();
        
        try {
            ser.salvar(tipo);
            ser.salvar(tipo2);
            ser.deletar(6);
            System.out.println(ser.consultar(1).getCodigo());
            ser.listarSet().forEach(x -> System.out.println(x.getCodigo()));
            System.out.println("Associado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
