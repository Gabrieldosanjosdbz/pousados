package telas;
import Telas.home;
import telas.Cad_Clientes;
import telas.clientes;
import dal.ModuloConexao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class editarQuartos extends javax.swing.JFrame {
    private String numberQuarto;
    Connection conn = null;
    PreparedStatement pstmtQuarto = null;
    ResultSet rsQuarto = null;
    
    public void setNumberQuarto(String numberQuarto){
        this.numberQuarto = numberQuarto;
    }
    
    public editarQuartos() {
        initComponents();
        conn = ModuloConexao.conector();
    }
    
    private void consultarQuarto(String numeroQuarto) {
        try {
            // Consulta para obter os dados do quarto
            String sqlQuarto = "SELECT numero_quarto, preco, descricao, prev_entrada, prev_saida, id_cliente FROM quartos WHERE numero_quarto = ?";
            pstmtQuarto = conn.prepareStatement(sqlQuarto);
            pstmtQuarto.setString(1, numeroQuarto);
            rsQuarto = pstmtQuarto.executeQuery();

            // Verifica se há resultados
            if (rsQuarto.next()) {
                // Obtém os dados do quarto
                String numeroQuartoResultado = rsQuarto.getString("numero_quarto");
                String precoResultado = rsQuarto.getString("preco");
                String descricaoResultado = rsQuarto.getString("descricao");
                String prevEntradaResultado = rsQuarto.getString("prev_entrada");
                String prevSaidaResultado = rsQuarto.getString("prev_saida");
                int idCliente = rsQuarto.getInt("id_cliente");

                // Exibe os dados do quarto nas labels correspondentes
                numeroQuartoo.setText(numeroQuartoResultado);
                preco.setText(precoResultado);
                prevEntrada.setText(prevEntradaResultado);
                prevSaida.setText(prevSaidaResultado);
                descricao.setText(descricaoResultado);

                // Consulta para obter os dados do cliente
                String sqlCliente = "SELECT nome, ddd, telefone, cidade, email FROM clientes WHERE id = ?";
                PreparedStatement pstmtCliente = conn.prepareStatement(sqlCliente);
                pstmtCliente.setInt(1, idCliente);
                ResultSet rsCliente = pstmtCliente.executeQuery();

                // Verifica se há resultados
                if (rsCliente.next()) {
                    // Obtém os dados do cliente
                    String nomeCliente = rsCliente.getString("nome");
                    String dddCliente = rsCliente.getString("ddd");
                    String telefoneCliente = rsCliente.getString("telefone");
                    String cidadeCliente = rsCliente.getString("cidade");
                    String emailCliente = rsCliente.getString("email");

                    // Exibe os dados do cliente nas labels correspondentes
                    nome.setText(nomeCliente);
                    email.setText(emailCliente);
                    ddd.setText(dddCliente);
                    numero.setText(telefoneCliente);
                    cidade.setText(cidadeCliente);
                } else {
                    // Se não houver cliente correspondente, limpa as labels do cliente
                    nome.setText("");
                    email.setText("");
                    ddd.setText("");
                    numero.setText("");
                    cidade.setText("");
                }

            } else {
                // Se não houver quarto correspondente, limpa todas as labels
                numero.setText("");
                preco.setText("");
                prevEntrada.setText("");
                prevSaida.setText("");
                descricao.setText("");
                nome.setText("");
                email.setText("");
                ddd.setText("");
                numero.setText("");
                cidade.setText("");
            }

            // Fecha as conexões e declarações
            rsQuarto.close();
            pstmtQuarto.close();
            
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao consultar o quarto: " + e.getMessage());
        }
    }
    
    private void excluirReserva() {
        int confirmacao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir essa reserva?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
                // Query para atualizar os campos desejados na tabela quartos
                String sql = "UPDATE quartos SET prev_entrada = NULL, prev_saida = NULL, id_cliente = NULL, disponivel = 1 WHERE numero_quarto = ?";
                Connection conn = ModuloConexao.conector();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, numberQuarto); // Substitua "numberQuarto" pela variável que contém o número do quarto a ser excluído
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Reserva excluída com sucesso!");

                pstmt.close();
                conn.close();
                
                home home = new home();
                home.setVisible(true);
                this.dispose();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao excluir reserva: " + e.getMessage());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroQuartoo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prevEntrada = new javax.swing.JLabel();
        prevSaida = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        excluir = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ddd = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CONSULTAR OU EXCLUIR RESERVA");

        jLabel2.setText("Numero do quarto:");

        numeroQuartoo.setText("0");

        jLabel3.setText("Descrição do quarto");

        descricao.setColumns(20);
        descricao.setLineWrap(true);
        descricao.setRows(5);
        descricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descricao);

        jLabel4.setText("previsão de entrada: ");

        jLabel5.setText("previsão de saída");

        prevEntrada.setText("23/06/2006");

        prevSaida.setText("23/06/2006");

        jLabel6.setText("preco: R$");

        preco.setText("300");

        excluir.setText("EXCLUIR RESERVA");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome do cliente: ");

        nome.setText("Gabriel");

        jLabel10.setText("email:");

        email.setText("gabrieldosanjosdbz@gmail.com");

        jLabel12.setText("Contato: ");

        ddd.setText("11");

        jLabel14.setText("-");

        numero.setText("956850568");

        jLabel16.setText("cidade:");

        cidade.setText("São Paulo");

        jMenu2.setText("Home");

        jMenuItem1.setText("home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cadastrar clientes");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("cadastrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("consultar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numeroQuartoo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(prevEntrada))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(prevSaida)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email)
                                    .addComponent(jLabel12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ddd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numero))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidade)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(voltar)
                                .addGap(36, 36, 36)))
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numeroQuartoo)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nome))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddd)
                            .addComponent(jLabel14)
                            .addComponent(numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevEntrada)
                    .addComponent(prevSaida))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(excluir)
                        .addComponent(voltar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(preco)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        excluirReserva(); 
    }//GEN-LAST:event_excluirActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        home home = new home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        consultarQuarto(numberQuarto);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        home home = new home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Cad_Clientes cad_clientes = new Cad_Clientes();
        cad_clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        clientes clientes = new clientes();
        clientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

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
            java.util.logging.Logger.getLogger(editarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarQuartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel ddd;
    private javax.swing.JTextArea descricao;
    private javax.swing.JLabel email;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel numeroQuartoo;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel prevEntrada;
    private javax.swing.JLabel prevSaida;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
