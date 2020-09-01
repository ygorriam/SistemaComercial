package controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class ConectaBanco {
    
    public Statement stm;//responsável por preparar e realizar pesquisa no banco de dados//
    public ResultSet rs; //responsável por armazenar o resultado de uma pesquisa passada para o STM//
    private String driver = "org.postgresql.Driver"; //responsável por indetificar o serviço do banco de dados//
    private String caminho = "jdbc:postgresql://localhost:5432/sistema";//responsável por setar o local do banco //
    private String usuario = "postgres";
    private String senha = "10074546";
    public Connection conn; //responsável pela conexao com banco de dados//
    
    public void conexao(){//metodo responsavel por realizar a conexao com o banco//
        
        System.setProperty("jdbc.Drivers", driver);
        try {
            conn=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null,"conectado com sucesso!");//
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro de conexão!\n Erro:"+ex.getMessage());
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public void executaSQL(String sql){
        try {
                stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
                
            
        } catch (SQLException ex) {
               // JOptionPane.showMessageDialog(null,"Erro ao excluir! \n Erro>"+ex.getMessage());
            }        
    }
    public void desconecta(){//metodo para fechar a conexao com o banco de dados//
        
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null,"desconetado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao fechar  conexão!\n Erro:"+ex.getMessage());
            
            
        }
        
    }
    
    
    
}
