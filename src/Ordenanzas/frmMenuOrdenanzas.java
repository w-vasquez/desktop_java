/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenanzas;

import EncargadoDeLaboratorio.frLogin;

/**
 *
 * @author CRUZ_2019
 */
public class frmMenuOrdenanzas extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuOrdenanzas
     */
    
    int idUsuario = 0;
    public frmMenuOrdenanzas(int idUsuario) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.idUsuario = idUsuario;
        
    }

    private frmMenuOrdenanzas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnprogramaciones = new rsbuttom.RSButtonMetro();
        btnhistorial = new rsbuttom.RSButtonMetro();
        btncerrrar = new rsbuttom.RSButtonMetro();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(121, 11, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home3.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unnamed2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1218, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 70));

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnprogramaciones.setBackground(new java.awt.Color(38, 38, 38));
        btnprogramaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Programaciones2.png"))); // NOI18N
        btnprogramaciones.setText("Programaciones");
        btnprogramaciones.setColorHover(new java.awt.Color(156, 127, 0));
        btnprogramaciones.setColorNormal(new java.awt.Color(38, 38, 38));
        btnprogramaciones.setColorPressed(new java.awt.Color(224, 182, 0));
        btnprogramaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnprogramaciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnprogramaciones.setIconTextGap(10);
        btnprogramaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprogramacionesActionPerformed(evt);
            }
        });
        jPanel3.add(btnprogramaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 140));

        btnhistorial.setBackground(new java.awt.Color(38, 38, 38));
        btnhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Historial.png"))); // NOI18N
        btnhistorial.setText("HORARIOS");
        btnhistorial.setColorHover(new java.awt.Color(5, 134, 154));
        btnhistorial.setColorNormal(new java.awt.Color(38, 38, 38));
        btnhistorial.setColorPressed(new java.awt.Color(3, 94, 107));
        btnhistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnhistorial.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnhistorial.setIconTextGap(10);
        btnhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistorialActionPerformed(evt);
            }
        });
        jPanel3.add(btnhistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 138));

        btncerrrar.setBackground(new java.awt.Color(38, 38, 38));
        btncerrrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png"))); // NOI18N
        btncerrrar.setText("CERRAR SESIÓN");
        btncerrrar.setColorHover(new java.awt.Color(215, 79, 42));
        btncerrrar.setColorNormal(new java.awt.Color(38, 38, 38));
        btncerrrar.setColorPressed(new java.awt.Color(150, 55, 29));
        btncerrrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncerrrar.setIconTextGap(10);
        btncerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrrarActionPerformed(evt);
            }
        });
        jPanel3.add(btncerrrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 220, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 690));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 1130, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprogramacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprogramacionesActionPerformed
        // TODO add your handling code here:
          Historial form=new Historial(idUsuario);
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
      
    }//GEN-LAST:event_btnprogramacionesActionPerformed

    private void btnhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistorialActionPerformed
        // TODO add your handling code here:
        Historial form=new Historial(idUsuario);
        escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnhistorialActionPerformed

    private void btncerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrrarActionPerformed
        // TODO add your handling code here:
        frLogin form=new frLogin();
        form.toFront();
        form.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btncerrrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuOrdenanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuOrdenanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuOrdenanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuOrdenanzas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuOrdenanzas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btncerrrar;
    private rsbuttom.RSButtonMetro btnhistorial;
    private rsbuttom.RSButtonMetro btnprogramaciones;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
