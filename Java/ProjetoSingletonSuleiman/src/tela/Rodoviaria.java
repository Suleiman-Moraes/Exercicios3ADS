/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Busao;

/**
 *
 * @author Veronika
 */
public class Rodoviaria extends javax.swing.JFrame {

    Busao busao1 = null;
    Busao busao2 = null;
    
    public Rodoviaria() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPoltronaGyn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonTrueGyn = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaidaGyn = new javax.swing.JTextArea();
        jButtonGyn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaidaPalmas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPoltronaPalmas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonFalsePalmas = new javax.swing.JRadioButton();
        jButtonPalmas = new javax.swing.JButton();
        jLabelEtinerario = new javax.swing.JLabel();
        jButtonCtriar = new javax.swing.JButton();
        jTextFieldEtinerario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RODOVIÁRIAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)), "RODOVIÁRIAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Goiânia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Número da Poltrona: ");

        jTextFieldPoltronaGyn.setEditable(false);
        jTextFieldPoltronaGyn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPoltronaGyn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPoltronaGynKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Status:");

        jRadioButtonTrueGyn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonTrueGyn.setText("Oculpada");

        jTextAreaSaidaGyn.setEditable(false);
        jTextAreaSaidaGyn.setColumns(20);
        jTextAreaSaidaGyn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextAreaSaidaGyn.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSaidaGyn);

        jButtonGyn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGyn.setText("OK");
        jButtonGyn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGynActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jTextFieldPoltronaGyn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonTrueGyn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGyn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPoltronaGyn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jRadioButtonTrueGyn))
                    .addComponent(jButtonGyn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Palmas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTextAreaSaidaPalmas.setEditable(false);
        jTextAreaSaidaPalmas.setColumns(20);
        jTextAreaSaidaPalmas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextAreaSaidaPalmas.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaidaPalmas);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Número da Poltrona: ");

        jTextFieldPoltronaPalmas.setEditable(false);
        jTextFieldPoltronaPalmas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPoltronaPalmas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPoltronaPalmasKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Status:");

        jRadioButtonFalsePalmas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButtonFalsePalmas.setText("Oculpado");

        jButtonPalmas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPalmas.setText("OK");
        jButtonPalmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPalmasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonFalsePalmas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPalmas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jTextFieldPoltronaPalmas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPoltronaPalmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jRadioButtonFalsePalmas))
                    .addComponent(jButtonPalmas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabelEtinerario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEtinerario.setText("Etinerário");

        jButtonCtriar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCtriar.setText("Criar");
        jButtonCtriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCtriarActionPerformed(evt);
            }
        });

        jTextFieldEtinerario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEtinerario)
                        .addGap(146, 146, 146)
                        .addComponent(jTextFieldEtinerario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCtriar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEtinerario)
                    .addComponent(jButtonCtriar)
                    .addComponent(jTextFieldEtinerario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGynActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGynActionPerformed
        try {
            if(!jTextFieldPoltronaGyn.getText().isEmpty()){
                boolean pol = false;
                busao1.alocarPoltronas(jRadioButtonTrueGyn.isSelected(), Integer.parseInt(jTextFieldPoltronaGyn.getText()));
            }
            jTextAreaSaidaGyn.setText(busao1.miniatura());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGynActionPerformed

    private void jButtonPalmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPalmasActionPerformed
        try {
            if(!jTextFieldPoltronaPalmas.getText().isEmpty()){
                boolean pol = false;
                busao2.alocarPoltronas(jRadioButtonFalsePalmas.isSelected(), Integer.parseInt(jTextFieldPoltronaPalmas.getText()));
            }
            jTextAreaSaidaPalmas.setText(busao2.miniatura());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPalmasActionPerformed

    private void jButtonCtriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCtriarActionPerformed
        busao1 = Busao.getBusao(jTextFieldEtinerario.getText());
        busao2 = Busao.getBusao(jTextFieldEtinerario.getText());
        
        jTextAreaSaidaGyn.setText(busao1.miniatura());
        jTextAreaSaidaPalmas.setText(busao2.miniatura());
        
        jTextFieldPoltronaGyn.setEditable(true);
        jTextFieldPoltronaPalmas.setEditable(true);
    }//GEN-LAST:event_jButtonCtriarActionPerformed

    private void jTextFieldPoltronaGynKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPoltronaGynKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            
        }catch(NumberFormatException err){
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldPoltronaGynKeyTyped

    private void jTextFieldPoltronaPalmasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPoltronaPalmasKeyTyped
        try {
            int x = Integer.parseInt(String.valueOf(evt.getKeyChar()));
            
        }catch(NumberFormatException err){
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextFieldPoltronaPalmasKeyTyped

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
            java.util.logging.Logger.getLogger(Rodoviaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rodoviaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rodoviaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rodoviaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rodoviaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCtriar;
    private javax.swing.JButton jButtonGyn;
    private javax.swing.JButton jButtonPalmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEtinerario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonFalsePalmas;
    private javax.swing.JRadioButton jRadioButtonTrueGyn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaSaidaGyn;
    private javax.swing.JTextArea jTextAreaSaidaPalmas;
    private javax.swing.JTextField jTextFieldEtinerario;
    private javax.swing.JTextField jTextFieldPoltronaGyn;
    private javax.swing.JTextField jTextFieldPoltronaPalmas;
    // End of variables declaration//GEN-END:variables
}
