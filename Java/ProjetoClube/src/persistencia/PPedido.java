package persistencia;

import entidade.EPedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.Conexao;

public class PPedido {
    public void inserir(EPedido pedido) throws SQLException{
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try{

            String sql = "INSERT INTO pedido (valor_total, data_hora_pedido, associado_fk) VALUES (?,?,?);";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, pedido.getValorTotal());
            ps.setDate(2, new Date(System.currentTimeMillis()));
            ps.setInt(3, pedido.getAssociado().getCodigo());
            
            ps.execute();

            String sql2 = "SELECT CURRVAL('pedido_identificador_seq');";
            Statement sta = con.createStatement();
            ResultSet rs = sta.executeQuery(sql2);
            while(rs.next()){
                pedido.setIdentificador(rs.getInt(1));
            }
            
            PItemPedido pp = new PItemPedido();
            pedido.getLista().forEach(x -> {
                try {
                    x.getPedido().setIdentificador(pedido.getIdentificador());
                    pp.inserir(x, con);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            });
            
            con.commit();
        }catch(Exception e){
            con.rollback();
        }
    }
    
    public void deletar(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        
        try {
            String sql = "DELETE FROM pedido WHERE identificador=?;";
        
            new PItemPedido().deletar(id, con);
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            
            con.commit();
        } catch (SQLException e) {
            con.rollback();
        }
    }
    
    public void alterar(EPedido pedido) throws SQLException{
        Connection con = Conexao.getConexao();
        con.setAutoCommit(false);
        try {
            String sql = "UPDATE pedido SET valor_total=?, data_hora_pedido =?, "
                + "associado_fk=? WHERE identificador=?;";
        
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, pedido.getValorTotal());
            ps.setDate(2, new Date(System.currentTimeMillis()));
            ps.setInt(3, pedido.getAssociado().getCodigo());
            ps.setInt(4, pedido.getIdentificador());
            
            PItemPedido pp = new PItemPedido();
            pp.deletar(pedido.getIdentificador(), con);
            
            pedido.getLista().forEach(x -> {
                try {
                    x.getPedido().setIdentificador(pedido.getIdentificador());
                    pp.inserir(x, con);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            });
            
            ps.executeUpdate();
            
            con.commit();
        } catch (Exception e) {
            con.rollback();
        }
    }
    
    public EPedido visualizarUm(int id) throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM pedido WHERE identificador=?;";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            return new EPedido(rs.getInt("identificador"), (float) rs.getDouble("valor_total"), 
                    new java.util.Date(rs.getDate("data_hora_pedido").getTime()), 
                    new PAssociado().visualizarUm(rs.getInt("associado_fk")),
                    new PItemPedido().buscarPedidoPassandoEPedido(rs.getInt("identificador")));
        }
        return null;
    }
    
    public List<EPedido> visualizarAll() throws SQLException{
        Connection con = Conexao.getConexao();
        
        String sql = "SELECT * FROM pedido;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<EPedido> lista = new ArrayList<>();
        while(rs.next()){
            lista.add(new EPedido(rs.getInt("identificador"), (float) rs.getDouble("valor_total"), 
                    new java.util.Date(rs.getDate("data_hora_pedido").getTime()), 
                    new PAssociado().visualizarUm(rs.getInt("associado_fk")),
                    new PItemPedido().buscarPedidoPassandoEPedido(rs.getInt("identificador"))));
        }
        return lista;
    }
}
