package apresentacao;

import entidade.EAssociado;
import entidade.EItemPedido;
import entidade.EPedido;
import entidade.EProduto;
import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.NAssociado;
import negocio.NPedido;
import negocio.NProduto;
import util.Validacao;

public class FrmPedidoCadastro extends javax.swing.JInternalFrame {

    private Vector<String> cabecalho;
    private final String legenda = "Cadastro de Pedido";
    private EPedido pedido;
    private EAssociado associado;
    private EProduto produto;
    private JDesktopPane principal;
    private DefaultTableModel model;
    
    public FrmPedidoCadastro() {
        initComponents();

        limparTela();
    }
    public FrmPedidoCadastro(JDesktopPane pane) {
        this();
        this.principal = pane;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonPesquisarCodigo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonPesquisarAssociado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProduto = new javax.swing.JComboBox<>();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRetirar = new javax.swing.JButton();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jComboBoxAssociado = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Cadastro Pedido");

        jPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Código");
        jLabel1.setToolTipText("");

        jTextFieldCodigo.setEditable(false);

        jButtonPesquisarCodigo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisarCodigo.setText("Pesquisar");
        jButtonPesquisarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Associado");
        jLabel2.setToolTipText("");

        jButtonPesquisarAssociado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisarAssociado.setText("Pesquisar");
        jButtonPesquisarAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAssociadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Produto");
        jLabel3.setToolTipText("");

        jComboBoxProduto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBoxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Produto" }));

        jButtonPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonPesquisarProduto.setText("Pesquisar");
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Quantidade");
        jLabel4.setToolTipText("");

        jTextFieldQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantidadeKeyTyped(evt);
            }
        });

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Qtde", "Valor Unt.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProduto);
        if (jTableProduto.getColumnModel().getColumnCount() > 0) {
            jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTableProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTableProduto.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonRetirar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonRetirar.setText("Retirar");
        jButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarActionPerformed(evt);
            }
        });

        jTextFieldValorTotal.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Total Pedido");
        jLabel5.setToolTipText("");

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jComboBoxAssociado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jComboBoxAssociado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Associado" }));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonPesquisarCodigo))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonPesquisarAssociado)
                                            .addComponent(jButtonPesquisarProduto)))
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jButtonRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarCodigo)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPesquisarAssociado)
                        .addComponent(jComboBoxAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdicionar)
                            .addComponent(jButtonRetirar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonSalvar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            this.validaCampos();
            pedido.setAssociado((EAssociado) jComboBoxAssociado.getSelectedItem());
            new NPedido().salvar(pedido);
            
            JOptionPane.showMessageDialog(rootPane, "Dados Inseridos com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        try {
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        try {
            this.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jButtonPesquisarAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAssociadoActionPerformed
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarAssociadoActionPerformed

    private void jButtonPesquisarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarCodigoActionPerformed
        try {
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPesquisarCodigoActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        try {
            EItemPedido itemPedido = new EItemPedido();
            EProduto produtoSelecionado = (EProduto) jComboBoxProduto.getSelectedItem();
            
            if(produtoSelecionado.getId() == 0){
                throw new Exception("É necessário selecionar um produto");
            }
            itemPedido.setProduto(produtoSelecionado);
            
            itemPedido.setQuantidade(Float.parseFloat(jTextFieldQuantidade.getText().trim()));
            itemPedido.setPrecoEpoca(produtoSelecionado.getValorVenda());
            
            if(itemPedido.getQuantidade() <= 0){
                throw new Exception("É necessário informar a quantidade do produto");
            }
            
            adicionarItemNaLista(itemPedido);
            
            carregarTabela(pedido.getLista());
            
            jTextFieldValorTotal.setText(NumberFormat.getCurrencyInstance().format(pedido.getValorTotal()));
        } catch (Exception e) {
          JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarActionPerformed
        try {
            if(jTableProduto.getSelectedRow() == -1){
                throw new Exception("É necessário selecionar um item na lista");
            }
            if(pedido.getLista().isEmpty()){
                throw new Exception("É necessário ter item na lista para excluir");
            }
            pedido.getLista().remove(jTableProduto.getSelectedRow());
            carregarTabela(pedido.getLista());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRetirarActionPerformed

    private void jTextFieldQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeKeyTyped
        try {
            Validacao x = new Validacao();
            if(jTextFieldQuantidade.getText().trim().length() >= 6) evt.consume();
            if(!x.validaCampoNumero(String.valueOf(evt.getKeyChar()))) 
                evt.consume();
            if(jTextFieldQuantidade.getText().trim().length() > 0)
                Double.parseDouble(jTextFieldQuantidade.getText().trim());
        } catch (Exception e) {
            evt.consume();
            jTextFieldQuantidade.setText(jTextFieldQuantidade.getText().trim().substring(0, 
                    jTextFieldQuantidade.getText().trim().length() - 1));
        }
    }//GEN-LAST:event_jTextFieldQuantidadeKeyTyped
    
    private EPedido printTela(){
        EPedido pedido = new EPedido();
        if(!jTextFieldCodigo.getText().trim().isEmpty()){
            pedido.setIdentificador(Integer.parseInt(jTextFieldCodigo.getText().trim()));
        }
        
        if(jComboBoxAssociado.getSelectedIndex() != 0){
            pedido.setAssociado((EAssociado) jComboBoxAssociado.getSelectedItem());
        }
        
        if(!jTextFieldValorTotal.getText().trim().isEmpty()){
            pedido.setValorTotal(new Float(jTextFieldValorTotal.getText().trim()));
        }
        return pedido;
    }
    
    private void validaCampos() throws Exception{
        if(jComboBoxAssociado.getSelectedIndex() == 0){
            throw new Exception("Preencha o Associado");
        }
//        if(jComboBoxProduto.getSelectedIndex() == 0){
//            throw new Exception("Preencha o Produto");
//        }
        if(pedido.getLista().isEmpty()){
            throw new Exception("Necessario adiquirir ao menos um Produto");
        }
//        if(jTextFieldNome.getText().trim().isEmpty()){
//            throw new Exception("Preencha o campo Nome");
//        }
//        if(jTextFieldTelefone.getText().trim().isEmpty()){
//            throw new Exception("Preencha o campo Telefone");
//        }
//        if(jComboBox1.getSelectedIndex() == 0){
//            throw new Exception("Selecione o Tipo Associado");
//        }
    }
    
    private void preenchercombos(){
        try {
            this.preencherComboAssociado();
            this.preencherComboProduto();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherComboAssociado(){
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model.addElement("Selecione");

            for (EAssociado tipo : new NAssociado().listar()) {
                model.addElement(tipo);
            }
            
            jComboBoxAssociado.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void preencherComboProduto(){
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            model.addElement(new EProduto(0, "Selecione"));

            for (EProduto tipo : new NProduto().listar()) {
                model.addElement(tipo);
            }
            
            jComboBoxProduto.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limparTela(){
        pedido = new EPedido();
        jTextFieldCodigo.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValorTotal.setText("");
        
        jButtonExcluir.setEnabled(false);
        
        this.preenchercombos();
        
        carregarTabela(pedido.getLista());
    }
    
    private void carregarTabela(List<EItemPedido> detalhe){
        try {
            cabecalho = new Vector();
            cabecalho.add("Código");
            cabecalho.add("Produto");
            cabecalho.add("Quantidade");
            cabecalho.add("Valor Unitário");
            cabecalho.add("Valor Total");
            model = new DefaultTableModel(null, cabecalho);
            
            jTableProduto.setModel(model);
            model.setNumRows(0);
            pedido.setValorTotal(0);
            
            for (EItemPedido pedido : detalhe) {
                String[] vet = new String[5];
                
                vet[0] = pedido.getId() + "";
                vet[1] = pedido.getProduto().getNome();
                vet[2] = pedido.getQuantidade() + "";
                vet[3] = NumberFormat.getCurrencyInstance().format(pedido.getProduto().getValorVenda());
                vet[4] = NumberFormat.getCurrencyInstance().format(pedido.getQuantidade() * pedido.getProduto().getValorVenda());
                model.addRow(vet);
                
                this.pedido.setValorTotalAcumulando(pedido.getQuantidade() * pedido.getProduto().getValorVenda());
            }
            
            jTextFieldValorTotal.setText(NumberFormat.getCurrencyInstance().format(this.pedido.getValorTotal()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void adicionarItemNaLista(EItemPedido item){
        boolean achou = false;
        float qtde;
        
        for(EItemPedido itemPedido : pedido.getLista()){
            if(itemPedido.getProduto().getId() == item.getProduto().getId()){
                achou = true;
                qtde = itemPedido.getQuantidade();
                itemPedido.setQuantidade(qtde + item.getQuantidade());
                break;
            }
        }
        if(!achou){
            pedido.getLista().add(item);
        }
    }
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2,
                (d.height - this.getSize().height) / 2);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesquisarAssociado;
    private javax.swing.JButton jButtonPesquisarCodigo;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JButton jButtonRetirar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxAssociado;
    private javax.swing.JComboBox<String> jComboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables

}
