package persistencia;

import entidade.ETipoAssociado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PTipoAssociado {
    public void inserir(ETipoAssociado eTipoAssociado) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "INSERT INTO tipoassociado (descricao, valormensalidade) VALUES (?,?)";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, eTipoAssociado.getDescricao());
        ps.setDouble(2, eTipoAssociado.getValorMensalidade());
        ps.execute();
        
        String sql2 = "SELECT currval('tipoassociado_codigo_seq');";
        Statement sta = con.createStatement();
        ResultSet rs = sta.executeQuery(sql2);
        while(rs.next()){
            eTipoAssociado.setCodigo(rs.getInt(1));
        }
    }
    
    public void deletar(int codigo) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "DELETE FROM tipoassociado WHERE codigo=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codigo);
        ps.execute();
    }
    public void alterar(ETipoAssociado eTipoAssociado) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "UPDATE tipoassociado SET descricao=?, valormensalidade=? WHERE codigo=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, eTipoAssociado.getDescricao());
        ps.setDouble(2, eTipoAssociado.getValorMensalidade());
        ps.setInt(3, eTipoAssociado.getCodigo());
        ps.executeUpdate();
    }
    
    public ETipoAssociado visualizarUm(int codigo) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM tipoassociado WHERE codigo=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            return new ETipoAssociado(rs.getInt(1), rs.getString(2), rs.getDouble(3));
        }
        return null;
    }
    
    public List<ETipoAssociado> visualizarAll() throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM tipoassociado ORDER BY descricao;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<ETipoAssociado> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new ETipoAssociado(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
        }
        return lista;
    }
    
    public Set<ETipoAssociado> visualizarAllSet() throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM tipoassociado;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Set<ETipoAssociado> lista = new TreeSet<>();
        while (rs.next()) {
            lista.add(new ETipoAssociado(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
        }
        return lista;
    }
}
