/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import autoposto.Teste;
import java.awt.Color;

/**
 * Panel responsável pela tela TestePanel
 * 
 */
public class TestePanel extends javax.swing.JPanel {
    // exemplo de herança onde TestePanel herda características da classe javax.swing.JPanel
    
    private FramePrincipal frame;
    
    public TestePanel(FramePrincipal frame) {
        initComponents();
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lEtanol = new javax.swing.JLabel();
        lCifrao1 = new javax.swing.JLabel();
        tValorEtanol = new javax.swing.JLabel();
        tValorGasolina = new javax.swing.JLabel();
        lCifrao2 = new javax.swing.JLabel();
        lGasolina = new javax.swing.JLabel();
        lResultado = new javax.swing.JLabel();
        bOk = new javax.swing.JToggleButton();
        bVoltar = new javax.swing.JToggleButton();

        lEtanol.setText("ETANOL");

        lCifrao1.setText("R$");

        tValorEtanol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tValorEtanol.setText("0,00");

        tValorGasolina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tValorGasolina.setText("0,00");

        lCifrao2.setText("R$");

        lGasolina.setText("GASOLINA");

        lResultado.setText("RESULTADO:");

        bOk.setText("OK");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });

        bVoltar.setText("Voltar");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 99, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lResultado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lGasolina)
                                .addGap(21, 21, 21)
                                .addComponent(lCifrao2)
                                .addGap(18, 18, 18)
                                .addComponent(tValorGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lEtanol)
                                .addGap(33, 33, 33)
                                .addComponent(lCifrao1)
                                .addGap(18, 18, 18)
                                .addComponent(tValorEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bOk)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEtanol)
                    .addComponent(lCifrao1)
                    .addComponent(tValorEtanol))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lGasolina)
                    .addComponent(lCifrao2)
                    .addComponent(tValorGasolina))
                .addGap(42, 42, 42)
                .addComponent(lResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOk)
                    .addComponent(bVoltar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        // Voltar tela de opções
        frame.setPanel(new OptionsPanel(frame));        
    }//GEN-LAST:event_bVoltarActionPerformed

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        // Mostrar resultado do teste
        Teste teste = new Teste(1.3, 2.5);
        String resultado = teste.resultado();
        if(resultado.equals("#Erro")){
            resultado = "Valores Incorretos!! Tente novamente";
            lResultado.setForeground(Color.red);
        }else {
            resultado = lResultado.getText() + " Combustível a ser abastecido: " +resultado;
        }
        lResultado.setText(resultado);
    }//GEN-LAST:event_bOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bOk;
    private javax.swing.JToggleButton bVoltar;
    private javax.swing.JLabel lCifrao1;
    private javax.swing.JLabel lCifrao2;
    private javax.swing.JLabel lEtanol;
    private javax.swing.JLabel lGasolina;
    private javax.swing.JLabel lResultado;
    private javax.swing.JLabel tValorEtanol;
    private javax.swing.JLabel tValorGasolina;
    // End of variables declaration//GEN-END:variables
}
