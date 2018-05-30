package negocio;

import entidade.EAssociado;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import persistencia.PAssociado;

public class NAssociado {
    
    public void salvar(EAssociado obj) throws SQLException{
        if(obj.getCodigo() != 0) new PAssociado().alterar(obj);
        else new PAssociado().inserir(obj);
    }
    
    public void deletar(int codigo) throws SQLException{
        new PAssociado().deletar(codigo);
    }
    
    public EAssociado consultar(int codigo) throws SQLException{
        return new PAssociado().visualizarUm(codigo);
    }
    
    public List<EAssociado> listar() throws SQLException{
        return new PAssociado().visualizarAll();
    }
    
    public Set<EAssociado> listarSet() throws SQLException{
        return new PAssociado().visualizarAllSet();
    }
}
