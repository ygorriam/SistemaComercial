/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloTelefone;

public class ControleTelefone {

    ConectaBanco conectaBanco = new ConectaBanco();
    ModeloTelefone modeloTel = new ModeloTelefone();

    public void inserir(ModeloTelefone obj) { //3:37
        conectaBanco.conexao();

        try {

            PreparedStatement pst = conectaBanco.conn.prepareStatement("INSERT INTO telefone (numero_tel) VALUES(?)");
            pst.setString(1, obj.getTel());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não INSERIDO com sucesso pela Camada Controle" + ex);
        }
        conectaBanco.desconecta();
    }

    public void alterar(ModeloTelefone obj) { // 3:55
        conectaBanco.conexao();
        PreparedStatement pst;
        try {
            pst = conectaBanco.conn.prepareStatement("UPDATE telefone  SET numero_tel=? WHERE id_telefone=?");
            pst.setString(1, obj.getTel());
            pst.setInt(2, obj.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não alterado com sucesso!" + ex);
        }
        conectaBanco.desconecta();
    }

    public void excluir(ModeloTelefone obj) {
        conectaBanco.conexao();
        PreparedStatement pst;
        try {
            pst = conectaBanco.conn.prepareStatement("DELETE FROM telefone WHERE id_telefone=?");
            pst.setInt(1, obj.getCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso pela Camada Controle");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não Excluído com sucesso pela Camada Controle" + ex);
        }
        conectaBanco.desconecta();
    }

    public ModeloTelefone primeiro() {
        conectaBanco.conexao();
        conectaBanco.executaSQL("SELECT * FROM telefone");
        try {
            conectaBanco.rs.first();
            modeloTel.setCod(conectaBanco.rs.getInt("id_telefone"));
            modeloTel.setTel(conectaBanco.rs.getString("numero_tel"));

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Erro na inserção. \n ERRO:"+ex);
        }
        conectaBanco.desconecta();
        return modeloTel;
    }

    public ModeloTelefone ultimo() {
        conectaBanco.conexao();
        conectaBanco.executaSQL("SELECT * FROM telefone");
        try {
            conectaBanco.rs.last();
            modeloTel.setCod(conectaBanco.rs.getInt("id_telefone"));
            modeloTel.setTel(conectaBanco.rs.getString("numero_tel"));

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro na inserção. \n ERRO:"+ex);
        }
        conectaBanco.desconecta();
        return modeloTel;
    }

    public ModeloTelefone proximo() {
        conectaBanco.conexao();
        //conectaBanco.executaSQL("SELECT * FROM telefone");
        try {
            conectaBanco.rs.next();
            modeloTel.setCod(conectaBanco.rs.getInt("id_telefone"));
            modeloTel.setTel(conectaBanco.rs.getString("numero_tel"));
            

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro na inserção. \n ERRO:"+ex);
        }
        conectaBanco.desconecta();
        return modeloTel;
    }

    public ModeloTelefone anterior() {
        conectaBanco.conexao();
        //conectaBanco.executaSQL("SELECT * FROM telefone");
        try {
            conectaBanco.rs.previous();
            modeloTel.setCod(conectaBanco.rs.getInt("id_telefone"));
            modeloTel.setTel(conectaBanco.rs.getString("numero_tel"));
            

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro na inserção. \n ERRO:"+ex);
        }
        //conectaBanco.desconecta();
        return modeloTel;
    }
}