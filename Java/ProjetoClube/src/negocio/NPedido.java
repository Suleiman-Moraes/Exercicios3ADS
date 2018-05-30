package negocio;

import entidade.EPedido;
import java.sql.SQLException;
import java.util.List;
import persistencia.PPedido;

public class NPedido {
    
    public void salvar(EPedido obj) throws SQLException{
        if(obj.getIdentificador() != 0) new PPedido().alterar(obj);
        else new PPedido().inserir(obj);
    }
    
    public void deletar(int codigo) throws SQLException{
        new PPedido().deletar(codigo);
    }
    
    public EPedido consultar(int codigo) throws SQLException{
        return new PPedido().visualizarUm(codigo);
    }
    
    public List<EPedido> listar() throws SQLException{
        return new PPedido().visualizarAll();
    }
}
