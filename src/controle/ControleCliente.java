/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ModeloCliente;

/**
 *
 * @author ygori
 */
public class ControleCliente {
    ConectaBanco conex = new ConectaBanco();
    ModeloCliente modCli = new ModeloCliente();
    int codBairro, codCidade, codTel;
    String Bairro, Cidade, Telefone;
    
    public void Inserir(ModeloCliente mod) {
        conex.conexao();
        buscaCod(mod.getIdBairro(),mod.getIdCidade(), mod.getTelefone());
        
        try {
            PreparedStatement pst = conex.conn.prepareStatement("insert into clientes (nome_cliente,endereco_cliente,rg_cliente,cpf_cliente " + "id_bairro)values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4,mod.getCpf());
            buscaCod(mod.getIdBairro(), mod.getIdCidade(), mod.getTelefone());
            pst.setInt(5, codBairro);
            pst.execute();
            conex.executaSQL("select * from telefone where numero_tel='"+mod.getTelefone()+"'");
            conex.rs.first();
            codTel=conex.rs.getInt("id_telefone");
            conex.executaSQL("select * from clientes where nome_cliente='"+mod.getNome()+"'");
            conex.rs.first();
            int codCli = conex.rs.getInt("id_cliente");
            pst = conex.conn.prepareStatement("insert into itens_tel(id_cliente,id_tel)values(?,?)");
            buscaCod(mod.getIdBairro(),mod.getIdCidade(),"");
            pst.setInt(1, codCli);
            pst.setInt(2, codTel);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Salvo Com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar!\n ERRO:"+ex);
        }
        conex.desconecta();
        
       }
    
    

    private void buscaCod(String Bairro,String Cidade, String tel) {
        try {
            conex.executaSQL("select * from bairro where nome_bairro='"+ Bairro + "'");
            conex.rs.first();
            codBairro = conex.rs.getInt("id_bairro");
            conex.executaSQL("select * from cidade where nome_cidades='" + Cidade + "'");
            conex.rs.first();
            codCidade = conex.rs.getInt("id_cidade");
            conex.executaSQL("select * from telefone where numero_tel='"+ tel +"'");
            conex.rs.first();
            codTel = conex.rs.getInt("id_telefone");
            
        } catch (SQLException ex) {
            
        }
       
    }
    
    
        
    
    public void alterar(ModeloCliente mod) {
        conex.conexao();
        try {
            // altera tabela itens_cli_tel
            conex.executaSQL("select * from telefone where numero_tel='"+mod.getTelefone()+"'");
            conex.rs.first();
            codTel=conex.rs.getInt("id_telefone");
            PreparedStatement pst = conex.conn.prepareStatement("update itens_cli_tel set id_tel=? where id_cliente=?");
            pst.setInt(1, codTel);
            pst.setInt(2, mod.getId());
            pst.execute();
            // altera a tabela cliente
            pst = conex.conn.prepareStatement("update clientes set nome_cliente=?, endereco_cliente=?, rg_cliente=?, "
                    + "cpf_cliente=?, id_bairro=? where id_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getRg());
            pst.setString(4, mod.getCpf());
            buscaCod(mod.getIdBairro(), mod.getIdCidade(), "");
            pst.setInt(5, codBairro);
            pst.setInt(6, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar!\nErro: " + ex);
        }
        conex.desconecta();
    }



            
       public void excluir(ModeloCliente mod){
        conex.desconecta();
        try {
            PreparedStatement pst = conex.conn.prepareStatement("delete from itens_cli_tel where id_clientes=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
            pst = conex.conn.prepareStatement("delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getId());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro ao excluir!\nErro:"+ ex );
        }
    }
}

        
    
    
            
        
        
    
    
    
    


