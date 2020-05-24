/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncargadoDeLaboratorio;

import static EncargadoDeLaboratorio.frmcrearprograma.listaprogramciones;
import com.google.gson.Gson;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablas.Programaciones;
import tablas.Usuario;

/**
 *
 * @author CRUZ_2019
 */
public class frmProgramaciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmcrearprograma
     */
    Programaciones objProgramaciones;
    public Integer totalregistros;
    DefaultTableModel modelo;
    Statement objEjecutaConsulta;

    public frmProgramaciones() {
        initComponents();
        objProgramaciones =new Programaciones();
        modelo = new DefaultTableModel();
        
        listaprogramciones.setModel(modelo);

        mostrar() ;
        
            
         lblregistros.setText("Total registros: " + Integer.toString(totalregistros));
        /*lblregistros.setText("Total registros" + Integer.toString(totalregistros));*/
    }

    void mostrar() 
     {
       // TODO add your handling code here:
        //Instanciar clase de la tabla
         
         Gson gson = new Gson();
  
         totalregistros = 0;
        //instansiar la clase Gson que convierte el Json a array en java
        //Gson gson = new Gson();
        //envio datos al metodo
        String url = "http://limpieza.azurewebsites.net/WS/API/programacion/mostrar.php";
        

        //Ejecuto consulta con los parametros de link
        
       
        String elJson =objProgramaciones.consultaCrediencial(url);
        
        //convertir a objeto de java
        Programaciones[] listado = gson.fromJson(elJson , Programaciones[].class);
        DefaultTableModel modelo;
         modelo = new DefaultTableModel();
        modelo.addColumn("IdProgramacion");
        modelo.addColumn("Tiempo");
        modelo.addColumn("Horarios");
        modelo.addColumn("Calificacion");
        modelo.addColumn("Estado Limpieza");
        modelo.addColumn("Estado Calificacion");
        modelo.addColumn("Comentario");
        Vector fila;
          listaprogramciones.setModel(modelo);
       
        
        //PARA SABER CUANTOS REGISTROS EXISTEN
        //int cantidadRegistros = objUsuarios.getCantidadRegistros();
        //PARA CREAR REGISTROS POR REGISTROS
        //DE LA TABLA DE NUESTRA BASE DE DATOS

        for (Programaciones registros : listado) {

            //CREAMOS UNA NUEVA FILA PARA LA TABLA
              fila = new Vector();
            // AGREGAMOS LA MISMA FILA PARA LA TABLA
            //A NUESTRO VECTOR

            //fila.add(indice);
                fila.add(registros.getIdProgramacion());
                fila.add(registros.getTiempoTranscurrido());
                fila.add(registros.getHorario());
                fila.add(registros.getCalificacion());
                fila.add(registros.getEstadoLimpieza());
                fila.add(registros.getEstadoCalificacion());
                fila.add(registros.getComentario());

            //AGREGAMOS LA FILA COMPLETA DE DATOS
            //AL CONTENEDOR QUE ESTAMOS DIBUJANDO
            totalregistros++;
            modelo.addRow(fila);
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

        fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaprogramciones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtidpro = new javax.swing.JTextField();
        btnbuscarprogrmaciones = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblregistros = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        fondo.setBackground(new java.awt.Color(121, 11, 42));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE PROGRAMACIONES");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de programaciones"));

        listaprogramciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(listaprogramciones);

        jLabel7.setText("Programaciones:");

        btnbuscarprogrmaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnbuscarprogrmaciones.setText("Buscar");
        btnbuscarprogrmaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarprogrmacionesActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.gif"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtidpro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarprogrmaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblregistros)
                .addGap(154, 154, 154))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtidpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarprogrmaciones)
                    .addComponent(btnsalir))
                .addGap(4, 4, 4)
                .addComponent(lblregistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarprogrmacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarprogrmacionesActionPerformed
        // TODO add your handling code here:
        Gson gson = new Gson();
        Programaciones func = new Programaciones();

        
        String idprogramacion = txtidpro.getText();
        

        String url = "http://limpieza.azurewebsites.net/WS/API/programacion/mostrarP.php?";
        
     
        String parametros = "idProgramacion="+idprogramacion;
        
        //Ejecuto consulta con los parametros de link
        String elJson =  "["+func.consultaCrediencial(url+parametros)+"]";
        
        

        try {
            
            if(!txtidpro.getText().equals(""))
            {
                //Ejecuto consulta con los parametros de link

        //convertir a objeto de java
        Programaciones[] listado = gson.fromJson(elJson, Programaciones[].class);
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Tiempo");
        modelo.addColumn("Horarios");
        modelo.addColumn("Calificacion");
        modelo.addColumn("Estado Limpieza");
        modelo.addColumn("Estado Calificacion");
        modelo.addColumn("Comentario");
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
            fila.add(listado[0].getIdProgramacion());
            fila.add(listado[0].getTiempoTranscurrido());
            fila.add(listado[0].getHorario());
            fila.add(listado[0].getCalificacion());
            fila.add(listado[0].getEstadoLimpieza());
            fila.add(listado[0].getEstadoCalificacion());
            fila.add(listado[0].getComentario());

            //AGREGAMOS LA FILA COMPLETA DE DATOS
            //AL CONTENEDOR QUE ESTAMOS DIBUJANDO
            totalregistros++;
            modelo.addRow(fila);
            listaprogramciones.setModel(modelo);
            
            
        }
            else {
           mostrar() ;
            }
        
        }
            
            
        
       catch (Exception e) 
       {
        }
    }//GEN-LAST:event_btnbuscarprogrmacionesActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmProgramaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProgramaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProgramaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProgramaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProgramaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarprogrmaciones;
    private javax.swing.JButton btnsalir;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblregistros;
    public static javax.swing.JTable listaprogramciones;
    private javax.swing.JTextField txtidpro;
    // End of variables declaration//GEN-END:variables
}
