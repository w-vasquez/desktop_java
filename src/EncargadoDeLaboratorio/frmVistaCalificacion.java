/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncargadoDeLaboratorio;

import com.google.gson.Gson;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import tablas.Calificacion;

/**
 *
 * @author CRUZ_2019
 */
public class frmVistaCalificacion extends javax.swing.JFrame {

    /**
     * Creates new form frmVistaCalificacion
     */
    public Integer totalregistros;
    Calificacion objcalificacion;
    DefaultTableModel modelo;

    public frmVistaCalificacion() {
        initComponents();
        this.setLocationRelativeTo(this);
        objcalificacion = new Calificacion();
        modelo = new DefaultTableModel();

        lstregistros.setModel(modelo);

        mostrar("");
    }

    void mostrar(String buscar) {
        // TODO add your handling code here:
        //Instanciar clase de la tabla

        Gson gson = new Gson();

        totalregistros = 0;
        //instansiar la clase Gson que convierte el Json a array en java
        //Gson gson = new Gson();
        //envio datos al metodo
        String url = "http://limpieza.azurewebsites.net/WS/API/calificacion/mostrar.php";

        //Ejecuto consulta con los parametros de link
        String elJson = objcalificacion.consultaCrediencial(url);

        //convertir a objeto de java
        Calificacion[] listado = gson.fromJson(elJson, Calificacion[].class);
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("CALIFICACION");
        modelo.addColumn("COMENTARIO");

        Vector fila;
        lstregistros.setModel(modelo);

        //PARA SABER CUANTOS REGISTROS EXISTEN
        //int cantidadRegistros = objUsuarios.getCantidadRegistros();
        //PARA CREAR REGISTROS POR REGISTROS
        //DE LA TABLA DE NUESTRA BASE DE DATOS
        for (Calificacion registros : listado) {

            //CREAMOS UNA NUEVA FILA PARA LA TABLA
            fila = new Vector();
            // AGREGAMOS LA MISMA FILA PARA LA TABLA
            //A NUESTRO VECTOR

            //fila.add(indice);
           fila.add(registros.getIdCalificacion());
            fila.add(registros.getCalificacion());
            fila.add(registros.getComentarios());
            

            //AGREGAMOS LA FILA COMPLETA DE DATOS
            //AL CONTENEDOR QUE ESTAMOS DIBUJANDO
            totalregistros++;
            modelo.addRow(fila);
        }
        lblregistros.setText("Total registros" + Integer.toString(totalregistros));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstregistros = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtidnotibuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de calificaciones"));

        lstregistros.setModel(new javax.swing.table.DefaultTableModel(
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
        lstregistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstregistrosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstregistrosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(lstregistros);

        jLabel13.setText("Calificaciones:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblregistros.setText("Registros:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblregistros)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(txtidnotibuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(242, 242, 242)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtidnotibuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblregistros)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstregistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstregistrosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lstregistrosMouseClicked

    private void lstregistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstregistrosMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int fila = lstregistros.getSelectedRow();
            String cod;
            String valor;

            cod = lstregistros.getValueAt(fila, 0).toString();

            frmcrearprograma.txtcalificacion.setText(cod);
            this.dispose();

        }
    }//GEN-LAST:event_lstregistrosMousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        Gson gson = new Gson();
        Calificacion func = new Calificacion();

        String idnotificacion = txtidnotibuscar.getText();

        String url = "http://limpieza.azurewebsites.net/WS/API/calificacion/mostrarP.php?";

        String parametros = "idNotificacion=" + idnotificacion;

        //Ejecuto consulta con los parametros de link
        String elJson = "[" + func.consultaCrediencial(url + parametros) + "]";

        try {

            if (!txtidnotibuscar.getText().equals("")) {
                //Ejecuto consulta con los parametros de link

                //convertir a objeto de java
                Calificacion[] listado = gson.fromJson(elJson, Calificacion[].class);
                DefaultTableModel modelo;
                modelo = new DefaultTableModel();
                modelo.addColumn("ID");
                modelo.addColumn("CALIFICACION");
                modelo.addColumn("COMENTARIO");

                Vector fila;

                //PARA SABER CUANTOS REGISTROS EXISTEN
                //int cantidadRegistros = objUsuarios.getCantidadRegistros();
                //PARA CREAR REGISTROS POR REGISTROS
                //DE LA TABLA DE NUESTRA BASE DE DATOS
                //CREAMOS UNA NUEVA FILA PARA LA TABLA
                fila = new Vector();
                // AGREGAMOS LA MISMA FILA PARA LA TABLA
                //A NUESTRO VECTOR

                //fila.add(indice);
                fila.add(listado[0].getIdCalificacion());
                fila.add(listado[0].getCalificacion());
                fila.add(listado[0].getComentarios());

                //AGREGAMOS LA FILA COMPLETA DE DATOS
                //AL CONTENEDOR QUE ESTAMOS DIBUJANDO
                totalregistros++;
                modelo.addRow(fila);
                lstregistros.setModel(modelo);

            } else {
                mostrar("");

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVistaCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVistaCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVistaCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVistaCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVistaCalificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblregistros;
    public static javax.swing.JTable lstregistros;
    private javax.swing.JTextField txtidnotibuscar;
    // End of variables declaration//GEN-END:variables
}
