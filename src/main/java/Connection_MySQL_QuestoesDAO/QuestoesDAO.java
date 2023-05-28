package Connection_MySQL_QuestoesDAO;

import Connection_MySQL.ConnectionFactory;
import Connection_Questoes.Questoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class QuestoesDAO {
    public void cadastrar(Questoes p) throws Exception{
    Connection conn = ConnectionFactory.getConnection();  
    PreparedStatement ps = null;
    String sql = "insert into Questoes (id, AlternativaA, AlternativaB, AlternativaC, AlternativaD, Perguntas, Respostas) values (?, ?, ?, ?, ?, ?, ?)";

   
    try{
        ps = conn.prepareStatement(sql);
        ps.setString(1, p.getId());
        ps.setString(2, p.getAlternativaA());
        ps.setString(3, p.getAlternativaB());
        ps.setString(4, p.getAlternativaC());
        ps.setString(5,p.getAlternativaD());
        ps.setString(6, p.getPerguntas());
        ps.setString(7,p.getRespostas());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Questão inserida com sucesso");

    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao salvar questão" + e.toString());
    }  
    }

    public void atualizar(Questoes p) throws Exception{
        String sql = "update Questoes set id=?, AlternativaA=?, AlternativaB=?, AlternativaC=?, AlternativaD=?, Perguntas=?, Respostas=? where id=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, p.getId());
        ps.setString(2, p.getAlternativaA());
        ps.setString(3, p.getAlternativaB());
        ps.setString(4, p.getAlternativaC());
        ps.setString(5,p.getAlternativaD());
        ps.setString(6, p.getPerguntas());
        ps.setString(7, p.getRespostas());
        ps.setString(8,p.getIdBusca());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Questões atualizadas com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao atualizar questões" + e.toString());
    }
    }    
    
    public void remover(Questoes p) throws Exception{
        String sql = "delete from Questoes where id=?";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql)) {
        ps.setString(1, p.getId());
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null, "Questão removida com sucesso");
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao remover os questões" + e.toString());
    }
    }    
    
    public String listar () throws Exception {
        String sql = "select * from Questões";
    try(var conn = ConnectionFactory.getConnection();   
            var ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
        StringBuilder sb = new StringBuilder("");
        
        while(rs.next()){
            int id = rs.getInt("id");
            String AlternativaA = rs.getString("Alternativa A");
            String AlternativaB = rs.getString("Alternativa A");
            String AlternativaC = rs.getString("Alternativa A");
            String AlternativaD = rs.getString("Alternativa A");
            String perguntas = rs.getString("Alternativa A");
            String respostas = rs.getString("Alternativa A");
            
            sb.append(
                 String.format(
                            "id:%d, Alternativa A:%s, Alternativa B:%s, Alternativa C:%s, Alternativa D:%s, Perguntas:%s, Respostas:%s",
                          id, AlternativaA, AlternativaB, AlternativaC, AlternativaD, perguntas, respostas
                    )
                ).append("\n");
        }
            return sb.toString();
    }
    }    
    public boolean existe(Questoes q) throws Exception{
        String sql = "SELECT id FROM QUESTOES WHERE id=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
    public boolean verificacao(Questoes q) throws Exception{
        String sql = "SELECT id FROM QUESTOES WHERE id=?";
        try(var conexao = ConnectionFactory.getConnection();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, q.getId());
            try(var rs = ps.executeQuery()){
                return rs.next();
            }
        }       
    }
}

