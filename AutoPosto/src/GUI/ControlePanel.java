/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Prototype.*;
import autoposto.Bomba;
import autoposto.BombaDAO;
import autoposto.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author danilo
 */
public class ControlePanel extends javax.swing.JPanel {

    private FramePrincipal frame;
    private Combustivel etanol, diesel, gasolina;
    
    public ControlePanel (FramePrincipal frame){
        initComponents();
        this.frame = frame;
        carregarComboBox();
        carregarPrecos();
    }

    /**
     * Gera uma array para preencher o ComboBox com as opções de Bombas
     * que existem.
     */
    public void carregarComboBox(){
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) comboBoxCombustiveis.getModel();

        BombaDAO dao = new BombaDAO();
        List listaBombas = dao.obterLista();

        Bomba bomb;
        for (int i = 0; i < listaBombas.size(); i++) {
            bomb = (Bomba) listaBombas.get(i);
            modelo.addElement((Object) bomb.getDescricao());
        }
    }
    
    public void carregarPrecos(){
        CombustivelCache.loadCache();
        diesel = (Combustivel) CombustivelCache.getCombust(1);
        etanol = (Combustivel) CombustivelCache.getCombust(2);
        gasolina = (Combustivel) CombustivelCache.getCombust(3);
        
        tValorDiesel.setText(Float.toString(diesel.getValor()));
        tValorEtanol.setText(Float.toString(etanol.getValor()));
        tValorGasolina.setText(Float.toString(gasolina.getValor()));
    }
    
    private boolean insertBancoDados(int bomba, int combustivel, float valor){
        ControleDAO dao = new ControleDAO(new Controle(bomba,combustivel, valor));
        dao.adicionar();
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lBomba = new javax.swing.JLabel();
        bOk = new javax.swing.JToggleButton();
        bVoltar = new javax.swing.JButton();
        comboBoxCombustiveis = new javax.swing.JComboBox<>();
        radioDiesel = new javax.swing.JRadioButton();
        jCifrao1 = new javax.swing.JLabel();
        tValorDiesel = new javax.swing.JLabel();
        lLitrosDiesel = new javax.swing.JLabel();
        tLitrosDiesel = new javax.swing.JTextField();
        radioEtanol = new javax.swing.JRadioButton();
        jCifrao2 = new javax.swing.JLabel();
        tValorEtanol = new javax.swing.JLabel();
        lLitrosEtanol = new javax.swing.JLabel();
        tLitrosEtanol = new javax.swing.JTextField();
        lLitrosGasolina = new javax.swing.JLabel();
        tValorGasolina = new javax.swing.JLabel();
        tLitrosGasolina = new javax.swing.JTextField();
        jCifrao3 = new javax.swing.JLabel();
        radioGasolina = new javax.swing.JRadioButton();

        lBomba.setText("Bomba:");

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

        radioDiesel.setText("Diesel:");

        jCifrao1.setText("R$");

        tValorDiesel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tValorDiesel.setText("0,00");

        lLitrosDiesel.setText("Litros:");

        tLitrosDiesel.setText(" ");

        radioEtanol.setText("Etanol:");

        jCifrao2.setText("R$");

        tValorEtanol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tValorEtanol.setText("0,00");

        lLitrosEtanol.setText("Litros:");

        tLitrosEtanol.setText(" ");

        lLitrosGasolina.setText("Litros:");

        tValorGasolina.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tValorGasolina.setText("0,00");

        tLitrosGasolina.setText(" ");

        jCifrao3.setText("R$");

        radioGasolina.setText("Gasolina:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bOk)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCifrao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tValorDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lLitrosDiesel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tLitrosDiesel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCifrao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tValorEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lLitrosEtanol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tLitrosEtanol, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCifrao3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tValorGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lLitrosGasolina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tLitrosGasolina, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lBomba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxCombustiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBomba)
                    .addComponent(comboBoxCombustiveis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDiesel)
                    .addComponent(jCifrao1)
                    .addComponent(tValorDiesel)
                    .addComponent(lLitrosDiesel)
                    .addComponent(tLitrosDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioEtanol)
                    .addComponent(jCifrao2)
                    .addComponent(tValorEtanol)
                    .addComponent(lLitrosEtanol)
                    .addComponent(tLitrosEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioGasolina)
                    .addComponent(jCifrao3)
                    .addComponent(tValorGasolina)
                    .addComponent(lLitrosGasolina)
                    .addComponent(tLitrosGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
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
        
        boolean inserido = false;
        if (radioDiesel.isSelected()){
            inserido = insertBancoDados(
                    comboBoxCombustiveis.getSelectedIndex()+1,
                    1,
                    diesel.getValor() * Float.parseFloat(tValorDiesel.getText())
            );
        }
        if (radioEtanol.isSelected()){
            inserido = insertBancoDados(
                    comboBoxCombustiveis.getSelectedIndex() +1,
                    2,
                    etanol.getValor() * Float.parseFloat(tValorEtanol.getText())
            );
        }
        if (radioGasolina.isSelected()){
            inserido = insertBancoDados(comboBoxCombustiveis.getSelectedIndex() +1,
                    3,
                    gasolina.getValor() * Float.parseFloat(tValorGasolina.getText())
            );
        }
        
        if(inserido)
            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!!");
        else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir.");
    }//GEN-LAST:event_bOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bOk;
    private javax.swing.JButton bVoltar;
    private javax.swing.JComboBox<String> comboBoxCombustiveis;
    private javax.swing.JLabel jCifrao1;
    private javax.swing.JLabel jCifrao2;
    private javax.swing.JLabel jCifrao3;
    private javax.swing.JLabel lBomba;
    private javax.swing.JLabel lLitrosDiesel;
    private javax.swing.JLabel lLitrosEtanol;
    private javax.swing.JLabel lLitrosGasolina;
    private javax.swing.JRadioButton radioDiesel;
    private javax.swing.JRadioButton radioEtanol;
    private javax.swing.JRadioButton radioGasolina;
    private javax.swing.JTextField tLitrosDiesel;
    private javax.swing.JTextField tLitrosEtanol;
    private javax.swing.JTextField tLitrosGasolina;
    private javax.swing.JLabel tValorDiesel;
    private javax.swing.JLabel tValorEtanol;
    private javax.swing.JLabel tValorGasolina;
    // End of variables declaration//GEN-END:variables
}
