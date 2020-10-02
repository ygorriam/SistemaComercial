/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ControleTelefone;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import modelo.ModeloTelefone;

/**
 *
 * @author ygori
 */
public class FrmTelefone extends javax.swing.JFrame {
   
        ModeloTelefone mod = new ModeloTelefone();
        ControleTelefone control = new ControleTelefone();
    
        
        public FrmTelefone() {
    initComponents();
            try {
                MaskFormatter form = new MaskFormatter("(##)####-####");//elemento que cria o formato da mascara
                jFormattedTextFieldNum.setFormatterFactory(new DefaultFormatterFactory(form));
            } catch (ParseException ex) {
                Logger.getLogger(FrmTelefone.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
       
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFildCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jFormattedTextFieldNum = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cadastro de Telefone");

        jLabel2.setText("Cod:");

        jLabel3.setText("Número:");

        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonUltimo.setText(">>");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("<");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setText(">");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFildCod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFildCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonUltimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jFormattedTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       mod.setTel(jFormattedTextFieldNum.getText());
       control.inserir(mod);
       jFormattedTextFieldNum.setEnabled(!true);
       jButtonExcluir.setEnabled(!true);
       jButtonSalvar.setEnabled(!true);
       jButtonAnterior.setEnabled(!true);
       jButtonNovo.setEnabled(!false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       mod.setCod(Integer.parseInt(jTextFildCod.getText()));
       mod.setTel(jFormattedTextFieldNum.getText());
       control.alterar(mod);
       jFormattedTextFieldNum.setEnabled(!true);
       jButtonExcluir.setEnabled(!true);
       jButtonSalvar.setEnabled(!true);
       jButtonAnterior.setEnabled(!true);
       jButtonNovo.setEnabled(!false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       mod.setCod(Integer.parseInt(jTextFildCod.getText()));
       mod.setTel(jFormattedTextFieldNum.getText());
       control.excluir(mod);
       jFormattedTextFieldNum.setEnabled(!true);
       jButtonExcluir.setEnabled(!true);
       jButtonSalvar.setEnabled(!true);
       jButtonAnterior.setEnabled(!true);
       jButtonNovo.setEnabled(!false);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFildCod.setText("");
        jFormattedTextFieldNum.setEnabled(true);
        jButtonExcluir.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonAnterior.setEnabled(true);
       jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
      control.primeiro();
       jTextFildCod.setText(String.valueOf(mod.getCod()));
        jFormattedTextFieldNum.setText(mod.getTel());
       jFormattedTextFieldNum.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       
       jButtonAnterior.setEnabled(true);
       jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        
        control.ultimo();
       jTextFildCod.setText(String.valueOf(mod.getCod()));
        jFormattedTextFieldNum.setText(mod.getTel());
       jFormattedTextFieldNum.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       
       jButtonAnterior.setEnabled(true);
       jButtonNovo.setEnabled(false);
        
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        control.anterior();
       jTextFildCod.setText(String.valueOf(mod.getCod()));
        jFormattedTextFieldNum.setText(mod.getTel());
       jFormattedTextFieldNum.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       
       jButtonAnterior.setEnabled(true);
       jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
    control.proximo();
       jTextFildCod.setText(String.valueOf(mod.getCod()));
        jFormattedTextFieldNum.setText(mod.getTel());
       jFormattedTextFieldNum.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       
       jButtonAnterior.setEnabled(true);
       jButtonNovo.setEnabled(false);        
    }//GEN-LAST:event_jButtonProximoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelefone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelefone().setVisible(true);
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
    private javax.swing.JFormattedTextField jFormattedTextFieldNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFildCod;
    // End of variables declaration//GEN-END:variables

  
    }


