/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.TransactionManager;
import br.com.okaynet.andare.daos.DaoUsuarios;
import br.com.okaynet.andare.model.Usuarios;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class JDialogCadastroUsuarioPopUp extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroClienteFisico
     */
    public JDialogCadastroUsuarioPopUp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencher();
        jPasswordFieldSenha.setVisible(false);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuários");
        setMinimumSize(new java.awt.Dimension(608, 160));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(608, 160));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCod.setEditable(false);
        getContentPane().add(jTextFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 50, -1));
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jPasswordFieldSenha.setEditable(false);
        jPasswordFieldSenha.setEnabled(false);
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 50, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(396, 31));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/004.png"))); // NOI18N
        jMenu2.setText("Apagar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/010.png"))); // NOI18N
        jMenu6.setText("Voltar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/006.png"))); // NOI18N
        jMenu1.setText("Salvar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if (Util.mostraMensagemEmTela("Deseja salvar?")) {
            salvar();
            this.dispose();
        }

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        if (jMenu2.isEnabled()) {
            if (Util.mostraMensagemEmTela("Deseja realmente excluir?")) {
                deletar();
            }
        }
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(JDialogCadastroUsuarioPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroUsuarioPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroUsuarioPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroUsuarioPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastroUsuarioPopUp dialog = new JDialogCadastroUsuarioPopUp(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jTextFieldUsuario.setText(null);
    }

    private void salvar() {
        if (validaCamposEmBranco()) {


            Usuarios usuario = new Usuarios();
            usuario.setUsuario(jTextFieldUsuario.getText());
            usuario.setId(Integer.parseInt(jTextFieldCod.getText()));
            usuario.setSenha(jPasswordFieldSenha.getText());
           

            TransactionManager.beginTransaction();
            try {
                new DaoUsuarios().persistir(usuario);
                TransactionManager.commit();
                limparCampos();
                Data.hash.remove("usuario");
                Data.hash.put("usuario", usuario);
            } catch (RuntimeException ex) {
                TransactionManager.rollback();
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao gravar os dados");
            }



        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo(s) vazio ou tipo incorreto de dado !");
        }
    }

    private boolean validaCamposEmBranco() {
        int flag = 0;
        Color color = new Color(252, 196, 196);

        if (jTextFieldUsuario.getText().isEmpty()) {
            jTextFieldUsuario.setBackground(color);
            flag = 1;
        } else {
            jTextFieldUsuario.setBackground(Color.white);
        }
        if (flag == 1) {
            return false;
        }
        return true;
    }

    private void deletar() {
        TransactionManager.beginTransaction();
        Usuarios usuarioRemover = new DaoUsuarios().obterPorId(Integer.parseInt(jTextFieldCod.getText()));
        new DaoUsuarios().remover(usuarioRemover);
        TransactionManager.commit();
        this.dispose();
    }

    private void preencher() {
        if (Data.hash.get("usuarioEditar") == null) {
            JOptionPane.showMessageDialog(this, "Aconteceu um problema ao obter os dados.");
        } else {
            if (Data.hash.get("usuarioEditar") instanceof Usuarios) {
                Usuarios user = (Usuarios) Data.hash.get("usuarioEditar");
                Data.hash.remove("usuarioEditar");
                if (user == null) {
                    JOptionPane.showMessageDialog(this, "Aconteceu um problema ao obter os dados.");
                } else {

                    jTextFieldCod.setText(String.valueOf(user.getId()));
                    jTextFieldUsuario.setText(user.getUsuario());
                    String permissoes = user.getPermissoes();
                    jPasswordFieldSenha.setText(user.getSenha());
                  
                }

            } else {
                JOptionPane.showMessageDialog(this, "Aconteceu um problema ao obter os dados.");
                Data.hash.remove("usuarioEditar");
            }
        }
    }
}
