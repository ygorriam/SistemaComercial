/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloFornecedor;

/**
 *
 * @author ygori
 */
public class ControleFornecedor {
   
    ConectaBanco conn = new ConectaBanco();
    int codBairro;
    
   
   public void Salvar(ModeloFornecedor mod){
        AchaBairro(mod.getBairro());
       conn.conexao();
        try {
            
            PreparedStatement pst = conn.conn.prepareStatement("insert into fornecedores(nome_fornecedor, endereco, id_bairro, cnpj_fornecedor )values(?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setInt(3, codBairro);
            pst.setString(4, mod.getCNPJ());
            pst.execute();
            JOptionPane.showMessageDialog(null, "dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro na inserçao de dados!\nERRO:"+ex);
        }
        conn.desconecta();
        
    }
    public void  AchaBairro(String bairro){
        conn.conexao();
        
       try {
           conn.executaSQL("select * from bairro where nome_bairro='" + bairro+"'");
           conn.rs.first();
           codBairro = conn.rs.getInt("id_bairro");
           
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do Bairro!\nERRO:"+ex);
       }
       conn.desconecta();
}
    
}
