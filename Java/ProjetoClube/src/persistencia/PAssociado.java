package persistencia;

import entidade.EAssociado;
import entidade.ETipoAssociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PAssociado {
    
    PTipoAssociado tipoAssociado = new PTipoAssociado();
    
    public void inserir(EAssociado associado) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO associado (nome, endereco, telefone, codigotipoassociado) VALUES (?,?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, associado.getNome());
        ps.setString(2, associado.getEndereco());
        ps.setString(3, associado.getTelefone());
        ps.setInt(4, associado.getTipoAssociado().getCodigo());
        ps.execute();
    }
    
    public void deletar(int codigo) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "DELETE FROM associado WHERE codigo=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codigo);
        ps.execute();
    }
    public void alterar(EAssociado associado) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "UPDATE associado SET nome=?, endereco=?, telefone=?, codigotipoassociado=? WHERE codigo=?";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, associado.getNome());
        ps.setString(2, associado.getEndereco());
        ps.setString(3, associado.getTelefone());
        ps.setInt(4, associado.getTipoAssociado().getCodigo());
        ps.setInt(5, associado.getCodigo());
        ps.executeUpdate();
    }
    
    public EAssociado visualizarUm(int codigo) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM associado WHERE codigo=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            return new EAssociado(rs.getInt(1), rs.getString(2), rs.getString(3), 
                    rs.getString(4), tipoAssociado.visualizarUm(rs.getInt(5)));            
        }
        
        return null;
    }
    
    public List<EAssociado> visualizarAll() throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM associado";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<EAssociado> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new EAssociado(rs.getInt(1), rs.getString(2), rs.getString(3), 
                    rs.getString(4), tipoAssociado.visualizarUm(rs.getInt(5))));
        }
        return lista;
    }
    
    public Set<EAssociado> visualizarAllSet() throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM associado";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Set<EAssociado> lista = new TreeSet<>();
        while (rs.next()) {
            lista.add(new EAssociado(rs.getInt(1), rs.getString(2), rs.getString(3), 
                    rs.getString(4), tipoAssociado.visualizarUm(rs.getInt(5))));
        }
        return lista;
    }
}
