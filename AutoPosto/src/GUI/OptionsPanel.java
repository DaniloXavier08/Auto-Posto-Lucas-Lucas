package GUI;

/**
 * Painel responsável pela tela de opções que será o meio de transporte entre as demais telas
 * @author danilo
 */
public class OptionsPanel extends javax.swing.JPanel {
    //Exemplo de herança onde OptionsPanel herda caracteristicas da classe javax.swing.JPanel

    private final FramePrincipal frame;
    
    /**
     * Método construtor
     * @param frame 
     */
    public OptionsPanel(FramePrincipal frame){
        initComponents();
        this.frame =  frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bAtualizar = new javax.swing.JButton();
        bRelatorio = new javax.swing.JToggleButton();
        bTeste = new javax.swing.JToggleButton();
        bControle = new javax.swing.JToggleButton();

        bAtualizar.setText("Atualizar Valores");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bRelatorio.setText("Relatório");
        bRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRelatorioActionPerformed(evt);
            }
        });

        bTeste.setText("Teste (GAS/ALC)");
        bTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTesteActionPerformed(evt);
            }
        });

        bControle.setText("Controle Bomba");
        bControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bControleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bControle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bTeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(bControle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bTeste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRelatorio)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bControleActionPerformed
        // chamar tela de controle
        frame.setPanel(new ControlePanel(frame));
    }//GEN-LAST:event_bControleActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        // chama tela de atualizar valores dos combustíveis
        frame.setPanel(new CombustivelPanel(frame));
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTesteActionPerformed
        // chama tela de teste
        frame.setPanel(new TestePanel(frame));
    }//GEN-LAST:event_bTesteActionPerformed

    private void bRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRelatorioActionPerformed
        // Torna o painel RelatorioPanel visivel.
        frame.setPanel(new RelatorioPanel(frame));
    }//GEN-LAST:event_bRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JToggleButton bControle;
    private javax.swing.JToggleButton bRelatorio;
    private javax.swing.JToggleButton bTeste;
    // End of variables declaration//GEN-END:variables
}
