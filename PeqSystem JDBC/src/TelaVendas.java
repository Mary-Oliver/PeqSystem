
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVendas extends javax.swing.JFrame {

    private final List<Double> totaisProdutos = new ArrayList<>();

    public TelaVendas() {
        initComponents();
setLocationRelativeTo(null);


    }

    private void atualizarTotalVenda() {
        double total = 0.0;

        for (int i = 0; i < jTableTabelaV.getRowCount(); i++) {
            Object valor = jTableTabelaV.getValueAt(i, 3); 
            if (valor != null) {
                total += Double.parseDouble(valor.toString());
            }
        }

        jTextFieldTotalV.setText(String.format("%.2f", total));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaV = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldTotalV = new javax.swing.JTextField();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldDataVenda = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bem vindo ao PeqSystem");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 1, 128));
        jLabel1.setText("Venda");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Data da Venda");

        jTableTabelaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Preço Unitário", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTableTabelaV);

        jButton1.setBackground(new java.awt.Color(0, 1, 128));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Adicionar Produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Total Venda:");

        jButton2.setBackground(new java.awt.Color(0, 1, 128));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Finalizar Venda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 1, 128));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldTotalV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalVActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 1, 128));
        jButton4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 1, 128));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText(" Nova Venda");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo Oficial 200x200.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTotalV, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1)
                                .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTotalV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTableTabelaV.getModel();

        
        String produto = JOptionPane.showInputDialog("Produto:");
        String quantidadeStr = JOptionPane.showInputDialog("Quantidade:");
        String precoUnitarioStr = JOptionPane.showInputDialog("Preço Unitário:");

        try {
            int quantidade = Integer.parseInt(quantidadeStr);
            double precoUnitario = Double.parseDouble(precoUnitarioStr);
            double total = precoUnitario * quantidade;

           
            model.addRow(new Object[]{produto, quantidade, precoUnitario, total});

          
            atualizarTotalVenda();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valores inválidos. Verifique a quantidade e o preço.");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    for (int i = 0; i < jTableTabelaV.getRowCount(); i++) {
        Object produto = jTableTabelaV.getValueAt(i, 0); 
        Object quantidade = jTableTabelaV.getValueAt(i, 1);
        Object preco = jTableTabelaV.getValueAt(i, 2);
        Object total = jTableTabelaV.getValueAt(i, 3);

        if (produto == null || produto.toString().trim().isEmpty()) {
            continue;
        }

      
        if (quantidade == null || preco == null || total == null) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos da linha do produto antes de finalizar a venda.");
            return;
        }
    }

    String cliente = jTextFieldCliente.getText();
    String data = jTextFieldDataVenda.getText();

   
    DefaultTableModel model = (DefaultTableModel) jTableTabelaV.getModel();
    double soma = 0;
    for (int i = 0; i < model.getRowCount(); i++) {
        Object valorObj = model.getValueAt(i, 3);
        if (valorObj != null) {
            try {
                soma += Double.parseDouble(valorObj.toString());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erro ao calcular o total da linha " + (i + 1));
                return;
            }
        }
    }

    jTextFieldTotalV.setText(String.format("%.2f", soma));

    JOptionPane.showMessageDialog(this, "Venda finalizada para " + cliente
            + "\nData: " + data + "\nTotal: R$" + String.format("%.2f", soma));



    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTableTabelaV.getModel();
        model.setRowCount(0);
        jTextFieldCliente.setText("");
        jTextFieldDataVenda.setText("");
        jTextFieldTotalV.setText("");


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldTotalVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalVActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

   
    jTextFieldCliente.setText("");
    jTextFieldDataVenda.setText("");
    jTextFieldTotalV.setText("");

   
    DefaultTableModel model = (DefaultTableModel) jTableTabelaV.getModel();
    model.setRowCount(0);
    
    JOptionPane.showMessageDialog(this, "Tela pronta para nova venda!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

   
    int linhaSelecionada = jTableTabelaV.getSelectedRow();
    
    if (linhaSelecionada == -1) {
        JOptionPane.showMessageDialog(this, "Selecione uma linha para editar ou excluir.");
        return;
    }
    
   
    Object[] opcoes = {"Editar", "Excluir", "Cancelar"};
    int opcao = JOptionPane.showOptionDialog(this, "Escolha uma ação para o item:",
                                              "Opção de Edição",
                                              JOptionPane.YES_NO_CANCEL_OPTION,
                                              JOptionPane.QUESTION_MESSAGE,
                                              null,
                                              opcoes,
                                              opcoes[0]);
    if (opcao == 0) { // Editar
        DefaultTableModel model = (DefaultTableModel) jTableTabelaV.getModel();
        
       
        String produtoAtual = model.getValueAt(linhaSelecionada, 0).toString();
        String quantidadeAtual = model.getValueAt(linhaSelecionada, 1).toString();
        String precoAtual = model.getValueAt(linhaSelecionada, 2).toString();
        
       
        String novoProduto = JOptionPane.showInputDialog(this, "Editar Produto:", produtoAtual);
        String novaQuantidadeStr = JOptionPane.showInputDialog(this, "Editar Quantidade:", quantidadeAtual);
        String novoPrecoStr = JOptionPane.showInputDialog(this, "Editar Preço Unitário:", precoAtual);
        
       
        if (novoProduto == null || novaQuantidadeStr == null || novoPrecoStr == null) {
            return;
        }
        
        try {
            int novaQuantidade = Integer.parseInt(novaQuantidadeStr);
            double novoPreco = Double.parseDouble(novoPrecoStr);
            double novoTotal = novaQuantidade * novoPreco;
            
          
            model.setValueAt(novoProduto, linhaSelecionada, 0);
            model.setValueAt(novaQuantidade, linhaSelecionada, 1);
            model.setValueAt(novoPreco, linhaSelecionada, 2);
            model.setValueAt(novoTotal, linhaSelecionada, 3);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro: quantidade e preço devem ser valores numéricos.");
        }
    } else if (opcao == 1) { 
       
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja excluir este item?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) jTableTabelaV.getModel();
            model.removeRow(linhaSelecionada);
        }
    } else {
       
        return;
    }
    
   
    atualizarTotalVenda();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaV;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldDataVenda;
    private javax.swing.JTextField jTextFieldTotalV;
    // End of variables declaration//GEN-END:variables
}
