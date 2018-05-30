package persistencia;

import entidade.EItemPedido;
import entidade.EPedido;
import entidade.EProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.Conexao;

public class PItemPedido {
    
    public void inserir(EItemPedido pedido, Connection con) throws SQLException{
        String sql = "INSERT INTO item_pedido (quantidade, preco_epoca, pedido_fk, produto_fk) "
                + "VALUES (?,?,?,?);";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, pedido.getQuantidade());
        ps.setDouble(2, pedido.getPrecoEpoca());
        ps.setInt(3, pedido.getPedido().getIdentificador());
        ps.setInt(4, pedido.getProduto().getId());
        
        ps.execute();
    }
    
    public void deletar(int pedido, Connection con) throws SQLException{
        String sql = "DELETE FROM item_pedido WHERE pedido_fk=?;";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pedido);
        ps.execute();
    }
    
    public EItemPedido visualizarUm(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM item_pedido WHERE id=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            return new EItemPedido(rs.getInt("id"), (float) rs.getDouble("quantidade"), 
                    (float) rs.getDouble("preco_epoca"), 
                    new PPedido().visualizarUm(rs.getInt("pedido_fk")), 
                    new PProduto().visualizarUm(rs.getInt("produto_fk")));
        }
        return null;
    }
    
    public List<EItemPedido> visualizarAll() throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM item_pedido;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<EItemPedido> lista = new ArrayList<>();
        while(rs.next()){
            lista.add(new EItemPedido(rs.getInt("id"), (float) rs.getDouble("quantidade"), 
                    (float) rs.getDouble("preco_epoca"), 
                    new EPedido(rs.getInt("pedido_fk")), 
                    new EProduto(rs.getInt("produto_fk"))));
        }
        return lista;
    }
    
    public List<EItemPedido> buscarPedidoPassandoEPedido(int cod) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM item_pedido WHERE pedido_fk=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cod);
        ResultSet rs = ps.executeQuery();
        
        List<EItemPedido> lista = new ArrayList<>();
        while(rs.next()){
            lista.add(new EItemPedido(rs.getInt("id"), (float) rs.getDouble("quantidade"), 
                    (float) rs.getDouble("preco_epoca"), 
                    new EPedido(rs.getInt("pedido_fk")), 
                    new EProduto(rs.getInt("produto_fk"))));
        }
        return lista;
    }
    
//    public void alterar(EItemPedido pedido) throws SQLException{
//        Connection con = Conexao.getConexao();
//        
//        String sql = "UPDATE item_pedido SET quantidade=?, preco_epoca=?,"
//                + " pedido_fk=?, produto_fk=? WHERE id=?;";
//        
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setDouble(1, pedido.getQuantidade());
//        ps.setDouble(2, pedido.getPrecoEpoca());
//        ps.setInt(3, pedido.getPedido().getIdentificador());
//        ps.setInt(4, pedido.getProduto().getId());
//        ps.setInt(5, pedido.getId());
//        ps.executeUpdate();
//    }
//    
//    public void deletar(int id) throws SQLException{
//        Connection con = Conexao.getConexao();
//        
//        String sql = "DELETE FROM item_pedido WHERE id=?;";
//        
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setInt(1, id);
//        ps.execute();
//    }
//    
//        public void inserir(EItemPedido pedido) throws SQLException{
//        Connection con = Conexao.getConexao();
//        
//        String sql = "INSERT INTO item_pedido (quantidade, preco_epoca, pedido_fk, produto_fk) "
//                + "VALUES (?,?,?,?);";
//        
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.setDouble(1, pedido.getQuantidade());
//        ps.setDouble(2, pedido.getPrecoEpoca());
//        ps.setInt(3, pedido.getPedido().getIdentificador());
//        ps.setInt(4, pedido.getProduto().getId());
//        ps.execute();
//        
//        String sql2 = "SELECT CURRVAL('item_pedido_id_seq');";
//        Statement sta = con.createStatement();
//        ResultSet rs = sta.executeQuery(sql2);
//        while(rs.next()){
//            pedido.setId(rs.getInt(1));
//        }
//    }
}
