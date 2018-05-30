package negocio;

import entidade.EProduto;
import java.sql.SQLException;
import java.util.List;
import persistencia.PProduto;

public class NProduto {
    
    public void salvar(EProduto obj) throws SQLException{
        if(obj.getId() != 0) new PProduto().alterar(obj);
        else new PProduto().inserir(obj);
    }
    
    public void deletar(int codigo) throws SQLException{
        new PProduto().deletar(codigo);
    }
    
    public EProduto consultar(int codigo) throws SQLException{
        return new PProduto().visualizarUm(codigo);
    }
    
    public List<EProduto> listar() throws SQLException{
        return new PProduto().visualizarAll();
    }
}
