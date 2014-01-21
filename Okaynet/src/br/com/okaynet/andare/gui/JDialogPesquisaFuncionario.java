/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.TransactionManager;
import br.com.okaynet.andare.daos.DaoFuncionario;
import br.com.okaynet.andare.daos.DaoOrdemServico;
import br.com.okaynet.andare.model.Funcionario;
import br.com.okaynet.andare.model.OrdemServico;
import br.com.okaynet.andare.model.Usuarios;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick
 */
public class JDialogPesquisaFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisaCliente
     */
    private DefaultTableModel model;
    private String styleModelFuncionarios[] = new String[]{"Nome", "RG", "CPF"};
    private List<Funcionario> funcionarios;

    public JDialogPesquisaFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popularTabela();
        Usuarios autenticado = (Usuarios) Data.hash.get("usuario");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldRg = new javax.swing.JTextField();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jButton8 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Funcionarios");
        setMinimumSize(new java.awt.Dimension(637, 430));
        setPreferredSize(new java.awt.Dimension(637, 430));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "RG", "CPF"
            }
        ));
        jScrollPane1.setViewportView(jTableCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 590, 270));

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Nome:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("RG:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("CPF:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jTextFieldRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRgKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, -1));

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCpfKeyReleased(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 130, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 30, 30));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(569, 310));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(396, 31));
        jMenuBar1.setRequestFocusEnabled(false);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/108.png"))); // NOI18N
        jMenu1.setText("Editar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/004.png"))); // NOI18N
        jMenu3.setText("Apagar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/010.png"))); // NOI18N
        jMenu6.setText("Voltar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/024.png"))); // NOI18N
        jMenu7.setText("Limpar Pesquisa");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        if (jMenu3.isEnabled()) {
            if (jTableCliente.getSelectedRow() != -1) {
                if (Util.mostraMensagemEmTela("Deseja realmente excluir?")) {

                    deletar();

                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
            }
        }

    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if (jMenu1.isEnabled()) {
            if (jTableCliente.getSelectedRow() != -1) {
                Data.hash.put("funcionario", funcionarios.get(jTableCliente.getSelectedRow()));
                Util.abrirDialogCentralizado(new JDialogCadastroFuncionarioPopUp(null, true));
                popularTabela();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
            }
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setText(null);
        jTextFieldRg.setText(null);
        obterPorCpf();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextFieldNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyReleased
        // TODO add your handling code here:

        jTextFieldRg.setText(null);
        jFormattedTextFieldCpf.setText(null);
        obterPorNome();
    }//GEN-LAST:event_jTextFieldNomeKeyReleased

    private void jTextFieldRgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRgKeyReleased
        // TODO add your handling code here:
        jTextFieldNome.setText(null);
        jFormattedTextFieldCpf.setText(null);
        obterPorRg();
    }//GEN-LAST:event_jTextFieldRgKeyReleased

    private void jFormattedTextFieldCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCpfKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCpfKeyReleased

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        popularTabela();
        jFormattedTextFieldCpf.setText(null);
        jTextFieldNome.setText(null);
        jTextFieldRg.setText(null);
    }//GEN-LAST:event_jMenu7MouseClicked

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
            java.util.logging.Logger.getLogger(JDialogPesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPesquisaFuncionario dialog = new JDialogPesquisaFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton8;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRg;
    // End of variables declaration//GEN-END:variables

    private void deletar() {

        TransactionManager.beginTransaction();
        List<OrdemServico> obterFuncionariosID = new DaoOrdemServico().obterFuncionariosID(funcionarios.get(jTableCliente.getSelectedRow()).getId());
        if (obterFuncionariosID.isEmpty()) {
            new DaoFuncionario().remover(funcionarios.get(jTableCliente.getSelectedRow()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Este funcionario possui OS vinculadas a ele.");
        }
        TransactionManager.commit();
        popularTabela();

    }

    private void popularTabela() {
        TransactionManager.beginTransaction();
        funcionarios = new DaoFuncionario().listar("", "nome");
        TransactionManager.commit();

        prencherPessoasTabela();
    }

    private void prencherPessoasTabela() {
        if (funcionarios != null && !funcionarios.isEmpty()) {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(styleModelFuncionarios);
            for (Funcionario funcionario : funcionarios) {
                model.addRow(new Object[]{funcionario.getNome(), funcionario.getRg(), funcionario.getCpf()});
            }
            jTableCliente.setModel(model);
        } else {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(styleModelFuncionarios);
            jTableCliente.setModel(model);
        }
    }

    private void obterPorNome() {
        TransactionManager.beginTransaction();
        funcionarios = new DaoFuncionario().obterNome(jTextFieldNome.getText());
        TransactionManager.commit();
        prencherPessoasTabela();
    }

    private void obterPorRg() {
        TransactionManager.beginTransaction();
        funcionarios = new DaoFuncionario().obterRg(jTextFieldRg.getText());
        TransactionManager.commit();
        prencherPessoasTabela();
    }

    private void obterPorCpf() {
        TransactionManager.beginTransaction();
        funcionarios = new DaoFuncionario().obterCpf(jFormattedTextFieldCpf.getText());
        TransactionManager.commit();
        prencherPessoasTabela();
    }
}
