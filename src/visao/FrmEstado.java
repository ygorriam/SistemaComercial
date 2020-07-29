/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import controle.ConectaBanco;
import controle.ModeloTabela;


public class FrmEstado extends javax.swing.JFrame {
    
    ConectaBanco conecta = new ConectaBanco();//instancia da classe conexão 

   
    public FrmEstado() {
        initComponents();
        conecta.conexao();//chamada do metedo de conexão
        preencherTabela("select * from estados order by id_estado");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextSigla = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstado = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estados");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Sigla:");

        jTextCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextCodigo.setEnabled(false);

        jTextNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextNome.setEnabled(false);
        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextSigla.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextSigla.setEnabled(false);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add1.png"))); // NOI18N
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pencil.png"))); // NOI18N
        jButtonAlterar.setToolTipText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableEstado);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/go-previous.png"))); // NOI18N
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/go-next.png"))); // NOI18N
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Previous-Track.png"))); // NOI18N
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Next-Track (2).png"))); // NOI18N
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButtonSair)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonNovo)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonUltimo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonPrimeiro)))
                            .addComponent(jButtonAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonProximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Formulario de Cadastro de Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(633, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into estados (nome_estado,sigla_estado)values(?,?)");//passagem do sql para inserção de dados
            pst.setString(1, jTextNome.getText());//passagem dos parametros
            pst.setString(2, jTextSigla.getText());
            pst.executeUpdate();//executa a inserção
            JOptionPane.showMessageDialog(rootPane,"Salvo com Sucesso!");
            preencherTabela("select * from estados order by id_estado");
                    } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane,"Erro ao Salvar!\n ERRO:"+ex);
        }
        
        jTextCodigo.setText("");
        jTextNome.setText("");
        jTextSigla.setText("");
        
        jTextNome.setEnabled(false);
        jTextSigla.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            //conecta.executaSQL("delete from  estados where sigla_estado='"+jTextSigla.getText()+"'");//chamda metodo da classe conecta banco para realizar a exclusçao

            PreparedStatement pst = conecta.conn.prepareStatement("delete from estados where sigla_estado=?");
            pst.setString(1,jTextSigla.getText());
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Excluido com Sucesso!");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException ex) {
            Logger.getLogger(FrmEstado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane,"Erro ao excluir!\n ERRO:"+ex);
        }
        
        jTextCodigo.setText("");
        jTextNome.setText("");
        jTextSigla.setText("");
        
        jTextNome.setEnabled(false);
        jTextSigla.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       
        jTextCodigo.setText("");
        jTextNome.setText("");
        jTextSigla.setText("");
        
        jTextNome.setEnabled(true);
        jTextSigla.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
            
        try {
            //conecta.executaSQL("delete from  estados where sigla_estado='"+jTextSigla.getText()+"'");//chamda metodo da classe conecta banco para realizar a exclusçao

            PreparedStatement pst = conecta.conn.prepareStatement("update estados set nome_estado= ?, sigla_estado=? where id_estado=?");
            pst.setString(1,jTextNome.getText());
            pst.setString(2,jTextSigla.getText());
            pst.setInt(3,Integer.parseInt(jTextCodigo.getText()));
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Alterado com Sucesso!");
            preencherTabela("select * from estados order by id_estado");
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Erro ao alterar!\n ERRO:"+ex);
        }
        
    
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jTextNome.setEnabled(true);
        jTextSigla.setEnabled(true);
        try {
           conecta.executaSQL("select * from estados");
            conecta.rs.first();
            
            jTextCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextNome.setText(conecta.rs.getString("nome_estado"));
            jTextSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane,"Error ao mostrar dados!");
        }
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jTextNome.setEnabled(true);
        jTextSigla.setEnabled(true);
        try {
           conecta.executaSQL("select * from estados");
            conecta.rs.last();
            jTextCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextNome.setText(conecta.rs.getString("nome_estado"));
            jTextSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error ao mostrar dados!\nERRO:");
        }
        
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jTextNome.setEnabled(true);
        jTextSigla.setEnabled(true);
        try {
            conecta.rs.previous();
            jTextCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextNome.setText(conecta.rs.getString("nome_estado"));
            jTextSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error ao mostrar dados!\nERRO:");
        }
           
        
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jTextNome.setEnabled(true);
        jTextSigla.setEnabled(true);
        try {
            conecta.rs.next();
            jTextCodigo.setText(String.valueOf(conecta.rs.getInt("id_estado")));
            jTextNome.setText(conecta.rs.getString("nome_estado"));
            jTextSigla.setText(conecta.rs.getString("sigla_estado"));
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error ao mostrar dados!\nERRO:");
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

  
   public void preencherTabela(String SQL){
       ArrayList dados = new ArrayList();
       
       String [] Colunas = new String[]{"id","nome","Sigla"};
       
       conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
            do{
                dados.add(new Object[]{conecta.rs.getInt("id_estado"),conecta.rs.getString("nome_estado"),conecta.rs.getString("sigla_estado")});
           
       }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error ao Preencher o Arraylist!\nERRO:");
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas) {};
        jTableEstado.setModel(modelo);
        jTableEstado.getColumnModel().getColumn(0).setPreferredWidth(140);
        jTableEstado.getColumnModel().getColumn(0).setResizable(false);
        jTableEstado.getColumnModel().getColumn(1).setPreferredWidth(280);
        jTableEstado.getColumnModel().getColumn(1).setResizable(false);
        jTableEstado.getColumnModel().getColumn(2).setPreferredWidth(140);
        jTableEstado.getColumnModel().getColumn(2).setResizable(false);
        jTableEstado.getTableHeader().setReorderingAllowed(false);
        jTableEstado.setAutoResizeMode(jTableEstado.AUTO_RESIZE_OFF);
        jTableEstado.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
   }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextSigla;
    // End of variables declaration//GEN-END:variables
}
