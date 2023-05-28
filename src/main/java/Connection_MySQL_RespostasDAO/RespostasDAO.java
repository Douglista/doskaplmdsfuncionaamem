package Connection_MySQL_RespostasDAO;

import Connection_MySQL.ConnectionFactory;
import Connection_Respostas.Respostas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RespostasDAO {
    public void cadastrar(Respostas p) throws Exception{
    Connection conn = ConnectionFactory.getConnection();  
    PreparedStatement ps = null;
    String sql = "insert into Respostas (Ra, Nome, Pontuação) values (? ,?, ?)";
    try{
        ps = conn.prepareStatement(sql);
        ps.setInt(1, p.getRa());
        ps.setString(2, p.getNome());
        ps.setInt(3, p.getPontuacao());
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Respostas foram inseridas com sucesso");

    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao salvar respostas" + e.toString());
    }    
    }
    
    public void atualizar(Respostas p) throws Exception{
        String sql = "upadate Respostas set Nome=?,Pontução=? where Ra=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setInt(1, p.getRa());
        ps.setString(2, p.getNome());
        ps.setInt(3, p.getPontuacao());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Respostas atualizads com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao atualizar Respostas" + e.toString());
    }
    }    
    
    public void remover(Respostas p) throws Exception{
        String sql = "delete from Respostas where ra=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setInt(1, p.getRa());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Dados foram removidos com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao remover os dados" + e.toString());
    }
    }    
    
    public String listar () throws Exception {
        String sql = "select * from Respostas";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
        StringBuilder sb = new StringBuilder("");
        
        while(rs.next()){
            int ra = rs.getInt("Ra");
            String nome = rs.getString("Nome");
            int pontuacao = rs.getInt("Pontuação");
            sb.append(
                 String.format(
                            "Ra:%d, Nome:%s, Pontuacao:%d",
                          ra, nome, pontuacao
                    )
                ).append("\n");
        }
            return sb.toString();
        }       
    } 
}
