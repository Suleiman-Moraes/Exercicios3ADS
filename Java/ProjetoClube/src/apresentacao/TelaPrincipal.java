package apresentacao;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

//    FundoTela tela;
    
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
//        setLayout(new GridLayout());
//        tela = new FundoTela(new File("src\\imagem\\Screenshot_20180312-220017_2.png").getAbsolutePath());
//        getContentPane().add(tela);
        
//        ImageIcon imagem = new ImageIcon(new File("src\\imagem\\Screenshot_20180312-220017_2.png").getAbsolutePath());
//        Image image = imagem.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT);
//        jLabel1.setIcon(new ImageIcon(image));
    }

    private void sair(){
        try {
            int x = JOptionPane.showConfirmDialog(rootPane, "Sair sem \"Salvar\" ??\nTodos os dados não salvos serão perdidios", "ALERTA", JOptionPane.YES_NO_OPTION);
            if(x == 0 || x == -1) System.exit(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemTipoAssociadoCadastro = new javax.swing.JMenuItem();
        jMenuItemAssociado = new javax.swing.JMenuItem();
        jMenuItemPedidoCadastro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Clube Associado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItemTipoAssociadoCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTipoAssociadoCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenuItemTipoAssociadoCadastro.setText("Tipo Associado");
        jMenuItemTipoAssociadoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipoAssociadoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemTipoAssociadoCadastro);

        jMenuItemAssociado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenuItemAssociado.setText("Associado");
        jMenuItemAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAssociadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAssociado);

        jMenuItemPedidoCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenuItemPedidoCadastro.setText("Pedido");
        jMenuItemPedidoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPedidoCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPedidoCadastro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentações");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Relatórios");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        this.sair();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sair();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemTipoAssociadoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipoAssociadoCadastroActionPerformed
        try {
            FrmTipoAssociadoCadastro janela = new FrmTipoAssociadoCadastro(this.jDesktopPanePrincipal);
            this.jDesktopPanePrincipal.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemTipoAssociadoCadastroActionPerformed

    private void jMenuItemAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAssociadoActionPerformed
        try {
            FrmAssociadoCadastro janela = new FrmAssociadoCadastro(this.jDesktopPanePrincipal);
            this.jDesktopPanePrincipal.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemAssociadoActionPerformed

    private void jMenuItemPedidoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPedidoCadastroActionPerformed
        try {
            FrmPedidoCadastro janela = new FrmPedidoCadastro(this.jDesktopPanePrincipal);
            this.jDesktopPanePrincipal.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemPedidoCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAssociado;
    private javax.swing.JMenuItem jMenuItemPedidoCadastro;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTipoAssociadoCadastro;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
