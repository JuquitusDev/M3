/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_villarcolomermarc_pt1.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import uf5_villarcolomermarc_pt1.controller.AddProducteController;
import uf5_villarcolomermarc_pt1.model.*;

/**
 *
 * @author Marc
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
   private AddProducteController ctl;

    public Menu(AddProducteController ctl) {
        this.ctl = ctl;
          /*
        boolean isMagatzem = cargarMagatzem(getNomFitxer());
        if (isMagatzem) {
            res = JOptionPane.showConfirmDialog(this, "Vols carregar el magatzem?", "Carregar magatzem", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
        if (res == JOptionPane.YES_OPTION) {
            m = getLectura(getNomFitxer());
        } else {
            m = new Magatzem();
        }*/
        initComponents();
  
      ArrayList<Categoria> acat = ctl.listCategories();
        for (Categoria categoria : acat) {
            categoriaSelect.addItem(categoria.getNom());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipus = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        preuLabel = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        stockLabel = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        codiLabel = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        descripcioLabel = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        ubicacioLabel = new javax.swing.JTextArea();
        codi = new javax.swing.JLabel();
        descripcio = new javax.swing.JLabel();
        ubicacio = new javax.swing.JLabel();
        preu = new javax.swing.JLabel();
        categoriaSelect = new javax.swing.JComboBox<>();
        tipusNormal = new javax.swing.JRadioButton();
        tipusFragil = new javax.swing.JRadioButton();
        tipusPerible = new javax.swing.JRadioButton();
        ofertaCheck = new javax.swing.JCheckBox();
        stock = new javax.swing.JLabel();
        afegir = new javax.swing.JButton();
        ubicacio1 = new javax.swing.JLabel();
        ubicacio2 = new javax.swing.JLabel();
        ubicacio3 = new javax.swing.JLabel();
        codi1 = new javax.swing.JLabel();
        codiError = new javax.swing.JLabel();
        stockError = new javax.swing.JLabel();
        ubicacioError = new javax.swing.JLabel();
        preuError = new javax.swing.JLabel();
        llista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        preuLabel.setColumns(20);
        preuLabel.setRows(5);
        preuLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                preuLabelFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(preuLabel);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        stockLabel.setColumns(20);
        stockLabel.setRows(5);
        stockLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stockLabelFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(stockLabel);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        codiLabel.setColumns(20);
        codiLabel.setRows(5);
        codiLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codiLabelFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(codiLabel);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descripcioLabel.setColumns(20);
        descripcioLabel.setRows(5);
        jScrollPane6.setViewportView(descripcioLabel);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ubicacioLabel.setColumns(20);
        ubicacioLabel.setRows(5);
        ubicacioLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ubicacioLabelFocusLost(evt);
            }
        });
        jScrollPane7.setViewportView(ubicacioLabel);

        codi.setText("Codi");

        descripcio.setText("Descripció");

        ubicacio.setText("Ubicació");

        preu.setText("Preu");

        categoriaSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaSelectActionPerformed(evt);
            }
        });

        Tipus.add(tipusNormal);
        tipusNormal.setSelected(true);
        tipusNormal.setText("Normal");
        tipusNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipusNormalActionPerformed(evt);
            }
        });

        Tipus.add(tipusFragil);
        tipusFragil.setText("Fràgil");

        Tipus.add(tipusPerible);
        tipusPerible.setText("Perible");

        stock.setText("Stock");

        afegir.setText("Afegir");
        afegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afegirActionPerformed(evt);
            }
        });

        ubicacio1.setText("Oferta");

        ubicacio2.setText("Categoria");

        ubicacio3.setText("Tipus");

        codi1.setText("Afegir Productes");

        codiError.setForeground(new java.awt.Color(255, 51, 51));

        stockError.setForeground(new java.awt.Color(255, 0, 51));

        ubicacioError.setForeground(new java.awt.Color(255, 0, 51));

        preuError.setForeground(new java.awt.Color(255, 0, 51));
        preuError.setToolTipText("");

        llista.setText("Llista de productes");
        llista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ubicacio2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(categoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ubicacio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(preu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(ubicacioError, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descripcio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ubicacio1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ubicacio3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(codi1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ofertaCheck)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipusNormal)
                                        .addGap(18, 18, 18)
                                        .addComponent(tipusFragil)
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(afegir)
                                            .addComponent(tipusPerible))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stockError, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(preuError, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                    .addComponent(codiError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(llista, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(codi1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(llista)
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codiError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(codi, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descripcio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(preu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(preuError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ubicacio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ubicacioError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(categoriaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tipusNormal)
                                            .addComponent(tipusFragil)
                                            .addComponent(tipusPerible))
                                        .addGap(72, 72, 72)))
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ubicacio2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ubicacio3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ofertaCheck)
                                    .addComponent(ubicacio1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stockError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addComponent(afegir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipusNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipusNormalActionPerformed

    }//GEN-LAST:event_tipusNormalActionPerformed

    private void codiLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codiLabelFocusLost
        if (!ctl.validarCodi(codiLabel.getText()).equals("")) {
            codiError.setText(ctl.validarCodi(codiLabel.getText()));
        } else {
            codiError.setText("");
        }
    }//GEN-LAST:event_codiLabelFocusLost

    private void preuLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_preuLabelFocusLost

        if (!ctl.validarPreu(preuLabel.getText()).equals("")) {
            preuError.setText(ctl.validarPreu(preuLabel.getText()));
        } else {
            preuError.setText("");
        }

    }//GEN-LAST:event_preuLabelFocusLost

    private void ubicacioLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ubicacioLabelFocusLost
        if (!ctl.validarUbicacio(ubicacioLabel.getText()).equals("")) {
            ubicacioError.setText(ctl.validarUbicacio(ubicacioLabel.getText()));
        } else {
            ubicacioError.setText("");
        }
    }//GEN-LAST:event_ubicacioLabelFocusLost

    private void stockLabelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stockLabelFocusLost
        if (!ctl.validarStock(stockLabel.getText()).equals("")) {
            stockError.setText(ctl.validarStock(stockLabel.getText()));
        } else {
            stockError.setText("");
        }
    }//GEN-LAST:event_stockLabelFocusLost

    private void categoriaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaSelectActionPerformed

    private void afegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afegirActionPerformed
        if (codiError.getText().equals("") && stockError.getText().equals("") && ubicacioError.getText().equals("") && preuError.getText().equals("")) {
            String tipus = "";
            if (tipusNormal.isSelected()) {
                tipus = "normal";
            } else if (tipusFragil.isSelected()) {
                tipus = "fragil";
            } else if (tipusPerible.isSelected()) {
                tipus = "perible";
            }

            Categoria c = new Categoria(categoriaSelect.getSelectedItem().toString());

            Producte p = new Producte(Integer.parseInt(codiLabel.getText()),
                    descripcioLabel.getText(),
                    Integer.parseInt(preuLabel.getText()),
                    ubicacioLabel.getText(),
                    c,
                    tipus,
                    ofertaCheck.isSelected(),
                    Integer.parseInt(stockLabel.getText())
            );
            ctl.submitProducte(p);
        }
        codiLabel.setText("");
        descripcioLabel.setText("");
        preuLabel.setText("");
        ubicacioLabel.setText("");
        categoriaSelect.setSelectedIndex(0);
        tipusNormal.setSelected(true);
        ofertaCheck.setSelected(false);
        stockLabel.setText("");
        
        
    }//GEN-LAST:event_afegirActionPerformed

    private void llistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llistaActionPerformed
       ctl.mostraLlista();
    }//GEN-LAST:event_llistaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu( new AddProducteController()).setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Tipus;
    private javax.swing.JButton afegir;
    private javax.swing.JComboBox<String> categoriaSelect;
    private javax.swing.JLabel codi;
    private javax.swing.JLabel codi1;
    private javax.swing.JLabel codiError;
    private javax.swing.JTextArea codiLabel;
    private javax.swing.JLabel descripcio;
    private javax.swing.JTextArea descripcioLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton llista;
    private javax.swing.JCheckBox ofertaCheck;
    private javax.swing.JLabel preu;
    private javax.swing.JLabel preuError;
    private javax.swing.JTextArea preuLabel;
    private javax.swing.JLabel stock;
    private javax.swing.JLabel stockError;
    private javax.swing.JTextArea stockLabel;
    private javax.swing.JRadioButton tipusFragil;
    private javax.swing.JRadioButton tipusNormal;
    private javax.swing.JRadioButton tipusPerible;
    private javax.swing.JLabel ubicacio;
    private javax.swing.JLabel ubicacio1;
    private javax.swing.JLabel ubicacio2;
    private javax.swing.JLabel ubicacio3;
    private javax.swing.JLabel ubicacioError;
    private javax.swing.JTextArea ubicacioLabel;
    // End of variables declaration//GEN-END:variables

}
