/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Vaixell;

/**
 *
 * @author marc
 */
public class gui_vaixells extends javax.swing.JFrame {

    Controlador ctl;

    /**
     * Creates new form gui_vaixells
     *
     * @param ctl
     */
    public gui_vaixells(Controlador ctl) throws SQLException {
        this.ctl = (ctl);

        initComponents();
        this.jtTabla.setModel(ctl.tmCodi(0, 0));

        for (int i = 1; i <= 3; i++) {
            this.cbCat.addItem(ctl.carregaCategoria(i));
        }

    }

    public void refrescarTaula() {
        try {
            this.jtTabla.setModel(ctl.tmCodi(this.cbCat.getSelectedIndex(), this.cdOrdenacio.getSelectedIndex()));
        } catch (SQLException ex) {
            Logger.getLogger(gui_vaixells.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jtTabla = new javax.swing.JTable();
        jbAfegir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEsborrar = new javax.swing.JButton();
        cbCat = new javax.swing.JComboBox<>();
        cdOrdenacio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbAfegir.setText("Afegir");
        jbAfegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAfegirActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEsborrar.setText("Esborrar");
        jbEsborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEsborrarActionPerformed(evt);
            }
        });

        cbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Totes" }));
        cbCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCatActionPerformed(evt);
            }
        });

        cdOrdenacio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codi", "Temps Compensat" }));
        cdOrdenacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdOrdenacioActionPerformed(evt);
            }
        });

        jLabel1.setText("Ordena per:");

        jLabel2.setText("Filtra per:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(cdOrdenacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(jLabel2)
                .addGap(119, 119, 119)
                .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jbModificar)
                .addGap(213, 213, 213)
                .addComponent(jbEsborrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAfegir)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdOrdenacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar)
                            .addComponent(jbEsborrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jbAfegir)))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCatActionPerformed
        this.refrescarTaula();
    }//GEN-LAST:event_cbCatActionPerformed

    private void cdOrdenacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdOrdenacioActionPerformed
        // TODO add your handling code here:
        this.refrescarTaula();
    }//GEN-LAST:event_cdOrdenacioActionPerformed

    private void jbAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAfegirActionPerformed
        // TODO add your handling code here:

        try {
            ctl.iniciaCRUD();
        } catch (SQLException ex) {
            Logger.getLogger(gui_vaixells.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.refrescarTaula();
    }//GEN-LAST:event_jbAfegirActionPerformed

    private void jbEsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEsborrarActionPerformed
        // TODO add your handling code here:

        int row = this.jtTabla.getSelectedRow();
        int col = 0;
        int res;
        try {
            res = (int) this.jtTabla.getValueAt(row, col);
            int dec = this.mostraMissatge();
            if (dec == 1) {
                ctl.esborraVaixell(res);
            }

            this.refrescarTaula();
        } catch (Exception e) {
            //     this.jButton3.setEnabled(false);

        }

    }//GEN-LAST:event_jbEsborrarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_formFocusGained

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_formHierarchyChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.refrescarTaula();
    }//GEN-LAST:event_formWindowActivated

    public Vaixell plenaVaixell() {

        try {

            int row = this.jtTabla.getSelectedRow();
            int codi = ((int) this.jtTabla.getValueAt(row, 0));
            Vaixell v = ctl.carregaVaixell(codi);
            return v;
        } catch (Exception ex) {
            //    Logger.getLogger(gui_vaixells.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        Vaixell v = this.plenaVaixell();
        if (v != null) {
            try {
                ctl.iniciaCRUD(v);
            } catch (Exception ex) {
                //            Logger.getLogger(gui_vaixells.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    public int mostraMissatge() {
        String mensaje = "¿Vols esborrar el Vaixel " + this.jtTabla.getValueAt(this.jtTabla.getSelectedRow(), 1) + " amb codi " + this.jtTabla.getValueAt(this.jtTabla.getSelectedRow(), 0) + "?";
        int decision = JOptionPane.showOptionDialog(this, mensaje, "Avis", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"No", "Si"}, null);

        return decision;
    }
    /**
     * @param args the command line arguments
     */
    //  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//            if ("Nimbus".equals(info.getName())) {
//                javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                break;
//            }
//        }
//    }
//    catch (ClassNotFoundException ex
//
//
//        ) {
//            java.util.logging.Logger.getLogger(gui_vaixells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    catch (InstantiationException ex
//
//
//        ) {
//            java.util.logging.Logger.getLogger(gui_vaixells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    catch (IllegalAccessException ex
//
//
//        ) {
//            java.util.logging.Logger.getLogger(gui_vaixells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    catch (javax.swing.UnsupportedLookAndFeelException ex
//
//
//        ) {
//            java.util.logging.Logger.getLogger(gui_vaixells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//    //</editor-fold>

    /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new gui_vaixells().setVisible(true);
//            }
//        });
//}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCat;
    private javax.swing.JComboBox<String> cdOrdenacio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAfegir;
    private javax.swing.JButton jbEsborrar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}