/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Telas.home;
import dal.ModuloConexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CT Desenvolvimento
 */
public class Login extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    /*
        è usado para executar a mesma instrução repetidamemente em alta eficiência. 
        Ela consiste em preparar e excutar
    */
    ResultSet rs = null;

    public Login() {
        initComponents();
        conexao = ModuloConexao.conector();
    }
    
    public void logar(){
        String sql = "SELECT * FROM login WHERE email=? AND senha=?";
        try {
            //capturar oque o usuario digitar na caixa de usuario e senha
            pst = conexao.prepareStatement(sql);
            pst.setString(1,input_email.getText());
            pst.setString(2,input_senha.getText());
            
            //a linha abaixo executa a consulta
            rs = pst.executeQuery();
            
            if (rs.next()){
                //Se existir usuario e senha correspodente abriará um novo formulário
                home home = new home();
                home.setVisible(true);
                home.nomeAdmin.setText(rs.getString(2));
                this.dispose();
                /*
                    é um método que implementa o código necessário para finalizar
                    o objeto e liberar a memória.
                */
                conexao.close();
             
            }
            else {
                JOptionPane.showMessageDialog(null,"Usuario e/ou senha inválido");
            }
        }
        catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    
    public void limpar(){
        try {
            input_email.setText("");
            input_senha.setText("");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        label_emaill = new javax.swing.JLabel();
        label_senha = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        input_senha = new javax.swing.JPasswordField();
        button_entrar = new javax.swing.JButton();
        button_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Login Pousados");

        label_emaill.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        label_emaill.setText("Email");

        label_senha.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        label_senha.setText("Senha");

        input_senha.setText("jPasswordField1");

        button_entrar.setText("Entrar");
        button_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_entrarActionPerformed(evt);
            }
        });

        button_limpar.setText("Limpar");
        button_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(label_emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(label_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_entrarActionPerformed
        logar();
    }//GEN-LAST:event_button_entrarActionPerformed

    private void button_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_limparActionPerformed
        limpar();
    }//GEN-LAST:event_button_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_entrar;
    private javax.swing.JButton button_limpar;
    private javax.swing.JTextField input_email;
    private javax.swing.JPasswordField input_senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_emaill;
    private javax.swing.JLabel label_senha;
    // End of variables declaration//GEN-END:variables
}
