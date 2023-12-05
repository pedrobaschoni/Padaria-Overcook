/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.edu.ifsp.pep.view;

import br.edu.ifsp.pep.model.Produto;
import br.edu.ifsp.pep.model.TipoProduto;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ProdutoCreateForm extends javax.swing.JDialog {

    /**
     * Creates new form ProdutoCreateForm
     */
    private boolean isEditar = false;

    private Produto produto = new Produto();

    public void setIsEditar(boolean isEditar) {
        this.isEditar = isEditar;
    }

    public Produto getProduto() {

        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto.setId(produto.getId());
        tfDescricao.setText(produto.getDescricao());
        tfPreco.setText(String.valueOf(produto.getPreco()));
        jsQuantidade.setValue(produto.getQuantidade());

        switch (produto.getTipo()) {
            case Produzido:
                rbProcessado.setSelected(true);
                break;

            case Industrializado:
                rbInsumo.setSelected(true);
                break;
        }
    }

    public ProdutoCreateForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);
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
        panelBorderGradient3 = new br.ifsp.edu.pep.view.awt.PanelBorderGradient();
        panelBorderGradient4 = new br.ifsp.edu.pep.view.awt.PanelBorderGradient();
        jSeparator3 = new javax.swing.JSeparator();
        jsQuantidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        panelBorderGradient1 = new br.ifsp.edu.pep.view.awt.PanelBorderGradient();
        panelBorderGradient2 = new br.ifsp.edu.pep.view.awt.PanelBorderGradient();
        jLabel5 = new javax.swing.JLabel();
        rbInsumo = new javax.swing.JRadioButton();
        rbProcessado = new javax.swing.JRadioButton();
        tfPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        pConfrmar = new br.ifsp.edu.pep.view.awt.PanelBorderGradientButtonMenu();
        lEnviar = new javax.swing.JLabel();
        pConfrmar1 = new br.ifsp.edu.pep.view.awt.PanelBorderGradientButtonMenu();
        lcancelar = new javax.swing.JLabel();
        lTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelBorderGradient3.setFirstColor(new java.awt.Color(65, 38, 165));

        panelBorderGradient4.setFirstColor(new java.awt.Color(255, 255, 255));
        panelBorderGradient4.setSecondColor(new java.awt.Color(255, 255, 255));

        jsQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jsQuantidade.setBorder(null);
        jsQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Quantidade");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Preco");

        panelBorderGradient1.setForeground(new java.awt.Color(255, 255, 255));
        panelBorderGradient1.setFirstColor(new java.awt.Color(204, 204, 204));
        panelBorderGradient1.setSecondColor(new java.awt.Color(255, 255, 255));

        panelBorderGradient2.setForeground(new java.awt.Color(255, 255, 255));
        panelBorderGradient2.setFirstColor(new java.awt.Color(255, 255, 255));
        panelBorderGradient2.setSecondColor(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setText("Tipo");

        buttonGroup1.add(rbInsumo);
        rbInsumo.setText("Industrializado");

        buttonGroup1.add(rbProcessado);
        rbProcessado.setText("Fabricado");

        javax.swing.GroupLayout panelBorderGradient2Layout = new javax.swing.GroupLayout(panelBorderGradient2);
        panelBorderGradient2.setLayout(panelBorderGradient2Layout);
        panelBorderGradient2Layout.setHorizontalGroup(
            panelBorderGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panelBorderGradient2Layout.createSequentialGroup()
                        .addComponent(rbInsumo)
                        .addGap(18, 18, 18)
                        .addComponent(rbProcessado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorderGradient2Layout.setVerticalGroup(
            panelBorderGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInsumo)
                    .addComponent(rbProcessado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorderGradient1Layout = new javax.swing.GroupLayout(panelBorderGradient1);
        panelBorderGradient1.setLayout(panelBorderGradient1Layout);
        panelBorderGradient1Layout.setHorizontalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorderGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        panelBorderGradient1Layout.setVerticalGroup(
            panelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(panelBorderGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tfPreco.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Descricao");

        tfDescricao.setBorder(null);

        pConfrmar.setFirstColor(new java.awt.Color(65, 38, 165));
        pConfrmar.setSecondColor(new java.awt.Color(65, 38, 165));

        lEnviar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lEnviar.setForeground(new java.awt.Color(255, 255, 255));
        lEnviar.setText("Cadastrar");
        lEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lEnviarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pConfrmarLayout = new javax.swing.GroupLayout(pConfrmar);
        pConfrmar.setLayout(pConfrmarLayout);
        pConfrmarLayout.setHorizontalGroup(
            pConfrmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfrmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pConfrmarLayout.setVerticalGroup(
            pConfrmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfrmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEnviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pConfrmar1.setFirstColor(new java.awt.Color(65, 38, 165));
        pConfrmar1.setSecondColor(new java.awt.Color(65, 38, 165));

        lcancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lcancelar.setForeground(new java.awt.Color(255, 255, 255));
        lcancelar.setText("Cancelar");
        lcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lcancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pConfrmar1Layout = new javax.swing.GroupLayout(pConfrmar1);
        pConfrmar1.setLayout(pConfrmar1Layout);
        pConfrmar1Layout.setHorizontalGroup(
            pConfrmar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfrmar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pConfrmar1Layout.setVerticalGroup(
            pConfrmar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConfrmar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorderGradient4Layout = new javax.swing.GroupLayout(panelBorderGradient4);
        panelBorderGradient4.setLayout(panelBorderGradient4Layout);
        panelBorderGradient4Layout.setHorizontalGroup(
            panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPreco)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorderGradient4Layout.createSequentialGroup()
                        .addGroup(panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorderGradient4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(382, 469, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addComponent(jsQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient4Layout.createSequentialGroup()
                        .addComponent(pConfrmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pConfrmar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        panelBorderGradient4Layout.setVerticalGroup(
            panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderGradient4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(panelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorderGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pConfrmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pConfrmar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        lTitulo1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        lTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo1.setText("Cadastro de Produto");

        javax.swing.GroupLayout panelBorderGradient3Layout = new javax.swing.GroupLayout(panelBorderGradient3);
        panelBorderGradient3.setLayout(panelBorderGradient3Layout);
        panelBorderGradient3Layout.setHorizontalGroup(
            panelBorderGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorderGradient4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorderGradient3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorderGradient3Layout.setVerticalGroup(
            panelBorderGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderGradient3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBorderGradient4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorderGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBorderGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lEnviarMouseClicked
        if (!isEditar) {
            produto.setId(null);
        }

        if (tfDescricao.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Necessario colocar a descricao");
            tfDescricao.requestFocus();

        } else if (tfPreco.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Necessario colocar o valor");
            tfPreco.requestFocus();

        } else if (Double.parseDouble(tfPreco.getText()) < 0) {

            JOptionPane.showMessageDialog(null, "Valor invalido");
            tfPreco.requestFocus();

        }
        else {

            if (rbInsumo.isSelected()) {

                produto.setTipo(TipoProduto.Industrializado);

                produto.setDescricao(tfDescricao.getText());
                produto.setQuantidade((Integer) jsQuantidade.getValue());
                
                try {
                
                produto.setPreco(Double.valueOf(tfPreco.getText()));
                
            } catch (InputMismatchException ex) {
            
                JOptionPane.showMessageDialog(null, "Valor invalido");
                tfPreco.requestFocus();
            }
                
                

                this.dispose();
            }

            else if (rbProcessado.isSelected()) {

                produto.setTipo(TipoProduto.Industrializado);

                produto.setDescricao(tfDescricao.getText());
                produto.setQuantidade((Integer) jsQuantidade.getValue());
                produto.setPreco(Double.valueOf(tfPreco.getText()));

                this.dispose();
            } else {

                JOptionPane.showMessageDialog(null, "Necessario selecionar um tipo");
                rbInsumo.requestFocus();
            }

        }
    }//GEN-LAST:event_lEnviarMouseClicked

    private void lcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lcancelarMouseClicked
        produto = null;

        this.dispose();
    }//GEN-LAST:event_lcancelarMouseClicked

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
            java.util.logging.Logger.getLogger(ProdutoCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoCreateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProdutoCreateForm dialog = new ProdutoCreateForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jsQuantidade;
    private javax.swing.JLabel lEnviar;
    private javax.swing.JLabel lTitulo1;
    private javax.swing.JLabel lcancelar;
    private br.ifsp.edu.pep.view.awt.PanelBorderGradientButtonMenu pConfrmar;
    private br.ifsp.edu.pep.view.awt.PanelBorderGradientButtonMenu pConfrmar1;
    private br.ifsp.edu.pep.view.awt.PanelBorderGradient panelBorderGradient1;
    private br.ifsp.edu.pep.view.awt.PanelBorderGradient panelBorderGradient2;
    private br.ifsp.edu.pep.view.awt.PanelBorderGradient panelBorderGradient3;
    private br.ifsp.edu.pep.view.awt.PanelBorderGradient panelBorderGradient4;
    private javax.swing.JRadioButton rbInsumo;
    private javax.swing.JRadioButton rbProcessado;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
