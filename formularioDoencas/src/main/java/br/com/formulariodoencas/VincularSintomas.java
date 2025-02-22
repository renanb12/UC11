/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.formulariodoencas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 05632593029
 */
public class VincularSintomas extends javax.swing.JFrame {

    /**
     * Creates new form Diagnostico
     */
    private int idDoenca = -1;

    public VincularSintomas() {
        initComponents();
        atualizarTabelaSintomas("");
        atualizarTabelaDoencaSintoma();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDoenca = new javax.swing.JTextField();
        txtVincularSintomas = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnVincularSintomas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSintoma = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoencaSintoma = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Digite a doença");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnVincularSintomas.setText("Vincular Sintomas");
        btnVincularSintomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularSintomasActionPerformed(evt);
            }
        });

        tblSintoma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sintoma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSintoma);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tblDoencaSintoma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doenca", "Sintoma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDoencaSintoma);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtVincularSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVincularSintomas)))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(17, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnExcluir)
                .addGap(146, 146, 146)
                .addComponent(btnCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVincularSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVincularSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        new TelaPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVincularSintomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularSintomasActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblSintoma.getSelectedRow();
        if (selectedRow >= 0 && idDoenca != -1) {
            String sintoma = tblSintoma.getValueAt(selectedRow, 0).toString();
            int idSintoma = getIdSintoma(sintoma);
            if (idSintoma != -1) {
                vincularSintoma(idDoenca, idSintoma);
                atualizarTabelaDoencaSintoma();
            } else {
                JOptionPane.showMessageDialog(this, "Sintoma não encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um sintoma e certifique-se de que a doença está pesquisada.");
        }
    }//GEN-LAST:event_btnVincularSintomasActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String nomeDoenca = txtDoenca.getText();
        idDoenca = pesquisarDoenca(nomeDoenca);
        if (idDoenca != -1) {
            txtVincularSintomas.setText(nomeDoenca);
            txtVincularSintomas.setEditable(false);
            atualizarTabelaSintomas(""); // Atualiza a tabela de sintomas
        } else {
            JOptionPane.showMessageDialog(this, "Doença não encontrada.");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoencaSintoma.getSelectedRow();
        if (selectedRow >= 0) {
            String doenca = tblDoencaSintoma.getValueAt(selectedRow, 0).toString();
            String sintoma = tblDoencaSintoma.getValueAt(selectedRow, 1).toString();
            int idDoenca = getIdDoenca(doenca);
            int idSintoma = getIdSintoma(sintoma);
            
            if (idDoenca != -1 && idSintoma != -1) {
                excluirVinculo(idDoenca, idSintoma);
                atualizarTabelaDoencaSintoma(); // Atualiza a tabela de doenças e sintomas
            } else {
                JOptionPane.showMessageDialog(this, "Doença ou sintoma não encontrados.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um vínculo para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    private void atualizarTabelaSintomas(String filtro) {
        DefaultTableModel model = (DefaultTableModel) tblSintoma.getModel();
        model.setRowCount(0);
        String sql = "SELECT id, nome FROM sintomas WHERE nome LIKE ?";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + filtro + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                model.addRow(new Object[]{nome});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int pesquisarDoenca(String nomeDoenca) {
        String sql = "SELECT id FROM doencas WHERE nome = ?";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeDoenca);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar doença: " + e.getMessage());
        }
        return -1;
    }
    
    private int getIdDoenca(String nomeDoenca) {
        String sql = "SELECT id FROM doencas WHERE nome = ?";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeDoenca);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar ID da doença: " + e.getMessage());
        }
        return -1;
    }
    
    private int getIdSintoma(String nomeSintoma) {
        String sql = "SELECT id FROM sintomas WHERE nome = ?";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nomeSintoma);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar ID do sintoma: " + e.getMessage());
        }
        return -1;
    }

    private void vincularSintoma(int idDoenca, int idSintoma) {
        String sql = "INSERT INTO doenca_sintoma (doenca_id, sintoma_id) VALUES (?, ?)";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idDoenca);
            pstmt.setInt(2, idSintoma);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Sintoma vinculado com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Nenhuma linha afetada. Verifique se a vinculação já existe.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao vincular sintoma: " + e.getMessage());
        }
    }

    private void atualizarTabelaDoencaSintoma() {
        DefaultTableModel model = (DefaultTableModel) tblDoencaSintoma.getModel();
        model.setRowCount(0);
        String sql = "SELECT d.nome AS doenca, s.nome AS sintoma " +
                     "FROM doenca_sintoma ds " +
                     "JOIN doencas d ON ds.doenca_id = d.id " +
                     "JOIN sintomas s ON ds.sintoma_id = s.id";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                String doenca = rs.getString("doenca");
                String sintoma = rs.getString("sintoma");
                model.addRow(new Object[]{doenca, sintoma});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao atualizar tabela de doenças e sintomas: " + e.getMessage());
        }
    }
    
    private void excluirVinculo(int idDoenca, int idSintoma) {
        String sql = "DELETE FROM doenca_sintoma WHERE doenca_id = ? AND sintoma_id = ?";
        try (Connection conn = ConexaoBD.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idDoenca);
            pstmt.setInt(2, idSintoma);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Vínculo excluído com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum vínculo encontrado para exclusão.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao excluir vínculo: " + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(VincularSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VincularSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VincularSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VincularSintomas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VincularSintomas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVincularSintomas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDoencaSintoma;
    private javax.swing.JTable tblSintoma;
    private javax.swing.JTextField txtDoenca;
    private javax.swing.JTextField txtVincularSintomas;
    // End of variables declaration//GEN-END:variables
}
