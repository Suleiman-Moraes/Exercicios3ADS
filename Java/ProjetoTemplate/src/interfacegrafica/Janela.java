/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacegrafica;

import javax.swing.JOptionPane;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import persistencia.LerArquivo;
import util.OrdernacaoAnoNome;
import util.OrdernacaoContratoNome;
import util.OrdernacaoEscolaNome;
import util.OrdernacaoEscolaTitulacaoNome;
import util.OrdernacaoTitulacaoNome;

/**
 *
 * @author eugeniojulio
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    public Janela() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridAlunos = new javax.swing.JTable();
        jButtonTitulacao_Nome = new javax.swing.JButton();
        jButtonEscola_Titulacao_Nome = new javax.swing.JButton();
        jButtonMatriculaMaiorDezK_Nome = new javax.swing.JButton();
        jButtonAno_Nome = new javax.swing.JButton();
        jButtonTipoContrato_Nome = new javax.swing.JButton();
        jButtonEscola_Nome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTA DE ALUNOS");

        jTableGridAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MATRICULA", "NOME", "ESCOLA", "TITULAÇÃO", "TIPO DE CONTRATO", "DATA DE ADIMIÇÃO"
            }
        ));
        jScrollPane1.setViewportView(jTableGridAlunos);

        jButtonTitulacao_Nome.setText("TITULACAO_NOME");
        jButtonTitulacao_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTitulacao_NomeActionPerformed(evt);
            }
        });

        jButtonEscola_Titulacao_Nome.setText("ESCOLA_TITULACAO_NOME");
        jButtonEscola_Titulacao_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscola_Titulacao_NomeActionPerformed(evt);
            }
        });

        jButtonMatriculaMaiorDezK_Nome.setText("MATRICULA > 10.000_NOME");
        jButtonMatriculaMaiorDezK_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatriculaMaiorDezK_NomeActionPerformed(evt);
            }
        });

        jButtonAno_Nome.setText("ANO_NOME");
        jButtonAno_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAno_NomeActionPerformed(evt);
            }
        });

        jButtonTipoContrato_Nome.setText("TIPO DE CONTRARO_NOME");
        jButtonTipoContrato_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTipoContrato_NomeActionPerformed(evt);
            }
        });

        jButtonEscola_Nome.setText("ESCOLA_NOME");
        jButtonEscola_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscola_NomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonEscola_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTitulacao_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEscola_Titulacao_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMatriculaMaiorDezK_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAno_Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTipoContrato_Nome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTitulacao_Nome)
                    .addComponent(jButtonEscola_Titulacao_Nome)
                    .addComponent(jButtonMatriculaMaiorDezK_Nome)
                    .addComponent(jButtonAno_Nome)
                    .addComponent(jButtonTipoContrato_Nome)
                    .addComponent(jButtonEscola_Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void imprimirNaGrid(List<Aluno> dados){
        try{
            DefaultTableModel model =  (DefaultTableModel) jTableGridAlunos.getModel();
            model.setNumRows(0);
            for (Aluno x : dados) {
                String[] linha = new String[6];
                linha[0]= x.getMatricula() + "";
                linha[1]= x.getNome();
                linha[2]= x.getEscola();
                linha[3]= x.getTitulacao();
                linha[4]= x.getTipoDoContrato();
                linha[5]= x.getDataDeAdmicaoString();
                
                model.addRow(linha);
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }
    private void jButtonEscola_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscola_NomeActionPerformed
        try{
            OrdernacaoEscolaNome objeto = new OrdernacaoEscolaNome();
            imprimirNaGrid(objeto.bolha(LerArquivo.lerDados()));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonEscola_NomeActionPerformed

    private void jButtonTitulacao_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTitulacao_NomeActionPerformed
        try{
            OrdernacaoTitulacaoNome objeto = new OrdernacaoTitulacaoNome();
            imprimirNaGrid(objeto.bolha(LerArquivo.lerDados()));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonTitulacao_NomeActionPerformed

    private void jButtonEscola_Titulacao_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscola_Titulacao_NomeActionPerformed
        try{
            OrdernacaoEscolaTitulacaoNome objeto = new OrdernacaoEscolaTitulacaoNome();
            imprimirNaGrid(objeto.bolha(LerArquivo.lerDados()));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonEscola_Titulacao_NomeActionPerformed

    private void jButtonMatriculaMaiorDezK_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatriculaMaiorDezK_NomeActionPerformed
//        try{
//            Ordernacao objeto = new OrdernacaoEscolaNome();
//            imprimirNaGrid(objeto.bolha(LerArquivo.lerDados()));
//        }catch(Exception erro){
//            JOptionPane.showMessageDialog(rootPane, erro);
//        }
    }//GEN-LAST:event_jButtonMatriculaMaiorDezK_NomeActionPerformed

    private void jButtonAno_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAno_NomeActionPerformed
        try{
            OrdernacaoAnoNome objeto = new OrdernacaoAnoNome();
            imprimirNaGrid(objeto.bolha(LerArquivo.lerDados()));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonAno_NomeActionPerformed

    private void jButtonTipoContrato_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTipoContrato_NomeActionPerformed
        try{
            OrdernacaoContratoNome objeto = new OrdernacaoContratoNome();
            imprimirNaGrid(objeto.bolha(LerArquivo.lerDados()));
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jButtonTipoContrato_NomeActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAno_Nome;
    private javax.swing.JButton jButtonEscola_Nome;
    private javax.swing.JButton jButtonEscola_Titulacao_Nome;
    private javax.swing.JButton jButtonMatriculaMaiorDezK_Nome;
    private javax.swing.JButton jButtonTipoContrato_Nome;
    private javax.swing.JButton jButtonTitulacao_Nome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridAlunos;
    // End of variables declaration//GEN-END:variables
}