/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvaro
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
        this.jtTabla.setModel(ctl.tmCodigo(0, 0));
        this.cbCat.addItem(ctl.carregaCategoria(1));
        this.cbCat.addItem(ctl.carregaCategoria(2));
        this.cbCat.addItem(ctl.carregaCategoria(3));
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cbCat = new javax.swing.JComboBox<>();
        cdOrdenacio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButton1)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2)
                        .addGap(74, 74, 74)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196)
                        .addComponent(cdOrdenacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdOrdenacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCatActionPerformed
        try {

            // TODO add your handling code here:
            this.jtTabla.setModel(ctl.tmCodigo(this.cbCat.getSelectedIndex(), this.cdOrdenacio.getSelectedIndex()));
        } catch (SQLException ex) {
            Logger.getLogger(gui_vaixells.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbCatActionPerformed

    private void cdOrdenacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdOrdenacioActionPerformed
        // TODO add your handling code here:
        try {
            System.out.println(this.cdOrdenacio.getSelectedIndex());
            // TODO add your handling code here:
            this.jtTabla.setModel(ctl.tmCodigo(this.cbCat.getSelectedIndex(), this.cdOrdenacio.getSelectedIndex()));
        } catch (SQLException ex) {
            Logger.getLogger(gui_vaixells.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cdOrdenacioActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
