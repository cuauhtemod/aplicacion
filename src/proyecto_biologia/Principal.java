
package proyecto_biologia;

import java.awt.Color;
import java.awt.Dimension;
/**
 *
 * @author 18PROGB0435
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.getContentPane().setBackground(Color.ORANGE);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tmlIntroduccion = new javax.swing.JMenuItem();
        ItmAspectosGenerales = new javax.swing.JMenuItem();
        ItmCloroplastos = new javax.swing.JMenuItem();
        ItmTilacoides = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        ItemCLOROFILA = new javax.swing.JMenuItem();
        ItemReferencias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen01.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 103, 300, 100));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Aspectos Generales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 243, 39));

        jLabel4.setText("Integrantes: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel5.setText("Jose Rodolfo Gaona Tinoco");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 142, -1));

        jLabel6.setText("Cuautemoc Gerardo Garcia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel7.setText("Jorge Ivan Suarez Alvarado");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("y Caracterisricas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 230, 36));

        jMenu1.setText("Temas");

        tmlIntroduccion.setText("Introduccion");
        tmlIntroduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmlIntroduccionActionPerformed(evt);
            }
        });
        jMenu1.add(tmlIntroduccion);

        ItmAspectosGenerales.setText("Aspectos Generales ");
        ItmAspectosGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmAspectosGeneralesActionPerformed(evt);
            }
        });
        jMenu1.add(ItmAspectosGenerales);

        ItmCloroplastos.setText("Los Cloroplastos");
        ItmCloroplastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmCloroplastosActionPerformed(evt);
            }
        });
        jMenu1.add(ItmCloroplastos);

        ItmTilacoides.setText("Los Tilacoides");
        ItmTilacoides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItmTilacoidesActionPerformed(evt);
            }
        });
        jMenu1.add(ItmTilacoides);

        jMenuItem1.setText("Proceso de Alimentacion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        ItemCLOROFILA.setText("La Clorofila");
        ItemCLOROFILA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCLOROFILAActionPerformed(evt);
            }
        });
        jMenu1.add(ItemCLOROFILA);

        ItemReferencias.setText("Referencias");
        ItemReferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemReferenciasActionPerformed(evt);
            }
        });
        jMenu1.add(ItemReferencias);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Pantalla2 next = new Pantalla2();
        next.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tmlIntroduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmlIntroduccionActionPerformed
       Pantalla2 obj1 =new Pantalla2 ();
       obj1.setVisible(true);
    }//GEN-LAST:event_tmlIntroduccionActionPerformed

    private void ItmAspectosGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmAspectosGeneralesActionPerformed
       Pantalla3 obj2 = new Pantalla3 ();
       obj2.setVisible(true);
    }//GEN-LAST:event_ItmAspectosGeneralesActionPerformed

    private void ItmCloroplastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmCloroplastosActionPerformed
        pantalla4 obj3 = new pantalla4 ();
        obj3.setVisible(true);
    }//GEN-LAST:event_ItmCloroplastosActionPerformed

    private void ItmTilacoidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItmTilacoidesActionPerformed
       Pantalla5 obj4 = new Pantalla5 ();
       obj4.setVisible(true);
    }//GEN-LAST:event_ItmTilacoidesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Pantalla6 obj5 = new Pantalla6 ();
       obj5.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ItemCLOROFILAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCLOROFILAActionPerformed
       Pantalla7 obj1 = new Pantalla7 ();
       obj1.setVisible(true);
    }//GEN-LAST:event_ItemCLOROFILAActionPerformed

    private void ItemReferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemReferenciasActionPerformed
      Pantalla8 obj2 = new Pantalla8 ();
      obj2.setVisible(true);
    }//GEN-LAST:event_ItemReferenciasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemCLOROFILA;
    private javax.swing.JMenuItem ItemReferencias;
    private javax.swing.JMenuItem ItmAspectosGenerales;
    private javax.swing.JMenuItem ItmCloroplastos;
    private javax.swing.JMenuItem ItmTilacoides;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem tmlIntroduccion;
    // End of variables declaration//GEN-END:variables
}
