package negocio;

import entidade.ETipoAssociado;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import persistencia.PTipoAssociado;

public class NTipoAssociado {
    
    public void salvar(ETipoAssociado tipo) throws SQLException{
        if(tipo.getCodigo() != 0) new PTipoAssociado().alterar(tipo);
        else new PTipoAssociado().inserir(tipo);
    }
    
    public void deletar(int codigo) throws SQLException{
        new PTipoAssociado().deletar(codigo);
    }
    
    public ETipoAssociado consultar(int codigo) throws SQLException{
        return new PTipoAssociado().visualizarUm(codigo);
    }
    
    public List<ETipoAssociado> listar() throws SQLException{
        return new PTipoAssociado().visualizarAll();
    }
    
    public Set<ETipoAssociado> listarSet() throws SQLException{
        return new PTipoAssociado().visualizarAllSet();
    }
}
