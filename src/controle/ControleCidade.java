/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloCidade;

/**
 *
 * @author ygori
 */
public class ControleCidade {
        ConectaBanco connCidade = new ConectaBanco();
    
    public void InserirCidade(ModeloCidade mod){
       connCidade.conexao();
            try {
                PreparedStatement pst = connCidade.conn.prepareStatement("insert into cidade(nome_cidades,id_estado)values(?,?)");
                pst.setString(1,mod.getNome());
                pst.setInt(2,mod.getCod_estado());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Dados armazenados com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro na inserção. \n ERRO:"+ex);
            }
        
    }
    
}
