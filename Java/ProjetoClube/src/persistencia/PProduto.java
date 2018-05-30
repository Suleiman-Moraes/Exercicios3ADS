package persistencia;

import entidade.EProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conexao;

public class PProduto {
    public void inserir(EProduto produto) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "INSERT INTO produto (nome, valor_venda) VALUES (?,?);";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, produto.getNome());
        ps.setDouble(2, produto.getValorVenda());
        ps.execute();
        
        String sql2 = "SELECT CURRVAL('produto_id_seq');";
        Statement sta = con.createStatement();
        ResultSet rs = sta.executeQuery(sql2);
        while(rs.next()){
            produto.setId(rs.getInt(1));
        }
    }
    
    public void deletar(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "DELETE FROM produto WHERE id=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
    }
    
    public void alterar(EProduto produto) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "UPDATE produto SET nome=?, valor_venda=? WHERE id=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, produto.getNome());
        ps.setDouble(2, produto.getValorVenda());
        ps.setInt(3, produto.getId());
        ps.executeUpdate();
    }
    
    public EProduto visualizarUm(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM produto WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            return new EProduto(rs.getInt("id"), rs.getString("nome"), (float) rs.getDouble("valor_venda"));
        }
        return null;
    }
    
    public List<EProduto> visualizarAll() throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM produto;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<EProduto> lista = new ArrayList<>();
        while(rs.next()){
            lista.add(new EProduto(rs.getInt("id"), rs.getString("nome"), (float) rs.getDouble("valor_venda")));
        }
        return lista;
    }
}
