/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncargadoDeLaboratorio;

/**
 *
 * @author CRUZ_2019
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btncrearprogramacion = new rsbuttom.RSButtonMetro();
        btncerrrarsesion = new rsbuttom.RSButtonMetro();
        btnmodificar = new rsbuttom.RSButtonMetro();
        btnprogramaciones = new rsbuttom.RSButtonMetro();
        btncalificar = new rsbuttom.RSButtonMetro();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(121, 11, 42));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Encargado de laboratorio");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncrearprogramacion.setBackground(new java.awt.Color(38, 38, 38));
        btncrearprogramacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Modificar2.png"))); // NOI18N
        btncrearprogramacion.setText("CREAR PROGRAMACION");
        btncrearprogramacion.setColorHover(new java.awt.Color(173, 16, 60));
        btncrearprogramacion.setColorNormal(new java.awt.Color(38, 38, 38));
        btncrearprogramacion.setColorPressed(new java.awt.Color(121, 11, 42));
        btncrearprogramacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncrearprogramacion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncrearprogramacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearprogramacionActionPerformed(evt);
            }
        });
        jPanel3.add(btncrearprogramacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 130));

        btncerrrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png"))); // NOI18N
        btncerrrarsesion.setText("CERRAR SESIÓN");
        btncerrrarsesion.setColorHover(new java.awt.Color(215, 79, 42));
        btncerrrarsesion.setColorNormal(new java.awt.Color(38, 38, 38));
        btncerrrarsesion.setColorPressed(new java.awt.Color(150, 55, 29));
        btncerrrarsesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncerrrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrarsesionActionPerformed(evt);
            }
        });
        jPanel3.add(btncerrrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 250, 130));

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo2.png"))); // NOI18N
        btnmodificar.setText("MODIFICAR ");
        btnmodificar.setColorHover(new java.awt.Color(156, 127, 0));
        btnmodificar.setColorNormal(new java.awt.Color(38, 38, 38));
        btnmodificar.setColorPressed(new java.awt.Color(224, 182, 0));
        btnmodificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 140));

        btnprogramaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Programaciones2.png"))); // NOI18N
        btnprogramaciones.setText("PROGRAMACIONES");
        btnprogramaciones.setColorHover(new java.awt.Color(5, 134, 154));
        btnprogramaciones.setColorNormal(new java.awt.Color(38, 38, 38));
        btnprogramaciones.setColorPressed(new java.awt.Color(3, 94, 107));
        btnprogramaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnprogramaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprogramacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnprogramaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 140));

        btncalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calificar2.png"))); // NOI18N
        btncalificar.setText("CALIFICAR");
        btncalificar.setColorHover(new java.awt.Color(24, 152, 0));
        btncalificar.setColorNormal(new java.awt.Color(38, 38, 38));
        btncalificar.setColorPressed(new java.awt.Color(17, 106, 0));
        btncalificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncalificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btncalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalificarActionPerformed(evt);
            }
        });
        jPanel3.add(btncalificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 680));

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1250, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearprogramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearprogramacionActionPerformed
        // TODO add your handling code here:
        frmcrearprograma form=new frmcrearprograma();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btncrearprogramacionActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
        frmModificarhorario form=new frmModificarhorario();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnprogramacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprogramacionesActionPerformed
        // TODO add your handling code here:
        frmProgramaciones form=new frmProgramaciones();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnprogramacionesActionPerformed

    private void btncalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalificarActionPerformed
        // TODO add your handling code here:
        frmCalificar form=new frmCalificar();
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btncalificarActionPerformed

    private void btncerrrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrarsesionActionPerformed
        // TODO add your handling code here:
        frLogin form=new frLogin();
        form.setVisible(true);
        
        
        this.setVisible(false);
    }//GEN-LAST:event_btncerrrarsesionActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btncalificar;
    private rsbuttom.RSButtonMetro btncerrrarsesion;
    private rsbuttom.RSButtonMetro btncrearprogramacion;
    private rsbuttom.RSButtonMetro btnmodificar;
    private rsbuttom.RSButtonMetro btnprogramaciones;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
