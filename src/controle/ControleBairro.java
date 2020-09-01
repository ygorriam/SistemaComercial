/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloBairro;

/**
 *
 * @author ygori
 */
public class ControleBairro {
        ConectaBanco conex = new ConectaBanco();
        ConectaBanco conexPesq = new ConectaBanco();
        int codCid;
        String cidade;
        
    public void Grava(ModeloBairro mod){
       conex.conexao();
            try {
               conex.executaSQL("select * from cidade where nome_cidades='"+mod.getCidade()+"'");
               conex.rs.first();
               codCid = conex.rs.getInt("id_cidade");
                PreparedStatement pst = conex.conn.prepareStatement("insert into bairro(nome_bairro,id_cidade)values(?,?)");
                pst.setString(1,mod.getNome());
                pst.setInt(2, codCid);
                pst.execute();
                JOptionPane.showMessageDialog(null,"Dados armazenados com sucesso");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro na inserção. \n ERRO:"+ex);
            }
        conex.desconecta();
    }
    public void ExcluiBairro(ModeloBairro mod){
        conex.conexao();
            try {
                PreparedStatement pst = conex.conn.prepareStatement("delete from bairro where id_Bairro=?");
                pst.setInt(1,mod.getCod());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Dados excluidos com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro na exclusão. \n ERRO:"+ex);
            }
            conex.desconecta();
    }
    public void Editar(ModeloBairro mod){
            conex.conexao();
            conexPesq.conexao();
            try {
                conexPesq.executaSQL("select * from cidade where nome_cidades=" + mod.getNome());
                conexPesq.rs.first();
                codCid = conex.rs.getInt("id_cidade");
                
                PreparedStatement pst = conex.conn.prepareStatement("update bairro set nome_bairros=?, id_cidades =? where id_Bairro=?");
                pst.setString(1, mod.getNome());
                pst.setInt(2, codCid);
                pst.setInt(3, mod.getCod());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao alterar. \n ERRO:"+ex);
            }
        conex.desconecta();
            conexPesq.desconecta();
    }
    
    public void Excluir(ModeloBairro mod){
            conex.conexao();
            
            try {
               
                
                PreparedStatement pst = conex.conn.prepareStatement("delete from bairro where id_bairro=?");
                pst.setInt(1, mod.getCod());
                
               pst.execute();
                JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao alterar. \n ERRO:"+ex);
            }
        conex.desconecta();
            
    }
    
    public  ModeloBairro Primeiro () {
        ModeloBairro mod = new ModeloBairro();
        conex.conexao();
        conexPesq.conexao();
        conex.executaSQL("select * from bairro");
        try {
            conex.rs.first();
            conexPesq.executaSQL("select * from cidade where id_cidade="+ conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar dados. \n ERRO:"+ex);
        }
        conex.desconecta();
        conexPesq.desconecta();
        return mod;
}
    
    public ModeloBairro Ult(){
       ModeloBairro mod = new ModeloBairro();
        conex.conexao();
        conexPesq.conexao();
        conex.executaSQL("select * from bairro");
        try {
            conex.rs.last();
            conexPesq.executaSQL("select * from cidade where id_cidade="+ conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar dados. \n ERRO:"+ex);
        }
        conex.desconecta();
        conexPesq.desconecta();
        return mod;
        
    }
    
    public ModeloBairro Ant(){
       ModeloBairro mod = new ModeloBairro();
        conex.conexao();
        conexPesq.conexao();
        //conex.executaSQL("select * from bairro");
        try {
            conex.rs.previous();
            conexPesq.executaSQL("select * from cidade where id_cidade="+ conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar dados. \n ERRO:"+ex);
        }
        //conex.desconecta();
        conexPesq.desconecta();
        return mod;
        
    }
    
    public ModeloBairro Prox(){
       ModeloBairro mod = new ModeloBairro();
        conex.conexao();
        conexPesq.conexao();
        conex.executaSQL("select * from bairro");
        try {
            conex.rs.next();
            conexPesq.executaSQL("select * from cidade where id_cidade="+ conex.rs.getInt("id_cidade"));
            conexPesq.rs.first();
            cidade = conexPesq.rs.getString("nome_cidades");
            mod.setCod(conex.rs.getInt("id_bairro"));
            mod.setNome(conex.rs.getString("nome_bairro"));
            mod.setCidade(cidade);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar dados. \n ERRO:"+ex);
        }
        conex.desconecta();
        conexPesq.desconecta();
        return mod;
        
    }
    
    
    
    
    
}
