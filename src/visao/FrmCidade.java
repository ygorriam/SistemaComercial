
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import controle.ConectaBanco;
import controle.ControleCidade;
import controle.ModeloTabela;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import modelo.ModeloCidade;


public class FrmCidade extends javax.swing.JFrame {

    ConectaBanco connEstado = new ConectaBanco();
    ConectaBanco connCidade= new ConectaBanco();
    ModeloCidade mod = new ModeloCidade();
    ControleCidade control = new ControleCidade();
    
    
    public FrmCidade() {
        initComponents();
        connEstado.conexao();
        connCidade.conexao();
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
        connEstado.executaSQL("select * from estados order by nome_estado");
        jComboBoxEstado.removeAllItems();//remove todos os itens da combobox 
        
        try {
            connEstado.rs.first();
            do{
                jComboBoxEstado.addItem(connEstado.rs.getString("nome_estado"));
            }while (connEstado.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"erro ao prencher combobox estado"+ex);
        }
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jButtuonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jButtonCancelar = new javax.swing.JButton();
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

        jLabelCodigo.setText("Código:");

        jLabelNome.setText("Nome:");

        jLabel2.setText("Estado:");

        jTextFieldCodigo.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jButtuonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add1.png"))); // NOI18N
        jButtuonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtuonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Save.png"))); // NOI18N
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Pencil.png"))); // NOI18N
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
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

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Next-Track.png"))); // NOI18N
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabela);

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtuonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtuonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cadastro de Cidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
        try {
            
        mod.setNome(jTextFieldNome.getText());
        connEstado.executaSQL("select * from estados where nome_estado='" + jComboBoxEstado.getSelectedItem()+"'");
        connEstado.rs.first();  
        //JOptionPane.showMessageDialog(rootPane,connEstado.rs.getInt("id_estado"));
        mod.setCod_estado(connEstado.rs.getInt("id_estado"));
        ControleCidade control = new ControleCidade();
        control.InserirCidade(mod);
        preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
        jTextFieldNome.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jButtuonNovo.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao inserir  registro!\nErro:"+ex);
        }
        
        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
       
        try { 
            mod.setCod(Integer.parseInt(jTextFieldCodigo.getText()));
            mod.setNome(jTextFieldNome.getText());
            connCidade.executaSQL("select * from estados where nome_estado ='"+jComboBoxEstado.getSelectedItem()+"'");
            connCidade.rs.first();
            mod.setCod_estado(connCidade.rs.getInt("id_estado"));
            control.AlteraCidade(mod);
            preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
        jTextFieldNome.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jButtuonNovo.setEnabled(true);
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(rootPane,"Erro ao alterar !\nErro:"+ex);
        }
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtuonNovo.setEnabled(false);
            jTextFieldNome.setEnabled(true);
        try {
            connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.first();
            jTextFieldCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getString("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao setar o primeiro registro!\nErro:"+ex);
        }
        
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
       jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtuonNovo.setEnabled(false);
            jTextFieldNome.setEnabled(true);
        try {
            connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.last();
            jTextFieldCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getString("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao setar o ultimo registro!\nErro:"+ex);
        }
        
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
            jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtuonNovo.setEnabled(false);
            jTextFieldNome.setEnabled(true);
        try {
            //connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.previous();
            jTextFieldCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getString("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao setar o  registro anterior!\nErro:"+ex);
        }
        
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        jButtonAlterar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonCancelar.setEnabled(true);
            jButtuonNovo.setEnabled(false);
            jTextFieldNome.setEnabled(true);
        try {
            //connCidade.executaSQL("select * from cidade order by id_cidade");
            connCidade.rs.next();
            jTextFieldCodigo.setText(String.valueOf(connCidade.rs.getInt("id_cidade")));
            jTextFieldNome.setText(connCidade.rs.getString("nome_cidades"));
            connEstado.executaSQL("select * from estados where id_estado="+connCidade.rs.getString("id_estado"));
            connEstado.rs.first();
            jComboBoxEstado.setSelectedItem(connEstado.rs.getString("nome_estado"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao setar o proximo registro !\nErro:"+ex);
        }

    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        
        try {
            mod.setCod(Integer.parseInt(jTextFieldCodigo.getText()));
            mod.setNome(jTextFieldNome.getText());
            mod.setCod_estado(connCidade.rs.getInt("id_estado"));
            control.ExcluiCidade(mod);
            preencherTabela("select * from cidade inner join estados on cidade.id_estado = estados.id_estado");
            jTextFieldNome.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jButtuonNovo.setEnabled(true);
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane,"Erro ao Excluir !\nErro:"+ex);
        }
        
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtuonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtuonNovoActionPerformed
        jTextFieldNome.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jButtuonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtuonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
          jTextFieldNome.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jButtuonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCidade().setVisible(true);
            }
        });
    }
    
     public void preencherTabela(String SQL){
       ArrayList dados = new ArrayList();
       
       String [] Colunas = new String[]{"id","Cidade","Estado"};
       
       connCidade.executaSQL(SQL);
        try {
            connCidade.rs.first();
            do{
                dados.add(new Object[]{connCidade.rs.getInt("id_cidade"),connCidade.rs.getString("nome_cidades"),connCidade.rs.getString("sigla_estado")});
           
       }while(connCidade.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error ao Preencher o Arraylist!\nERRO:");
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas) {};
        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(125);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(125);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JButton jButtuonNovo;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
