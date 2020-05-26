/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenanzas;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONException;
import tablas.Prog;
import tablas.Programaciones;
import tablas.mostrarHorarios;

/**
 *
 * @author Wilfredo Jr
 */
public class FrmCronemetro extends javax.swing.JFrame {

    /**
     * Creates new form FrmCronemetro
     */
    String idHorario;
    Programaciones objProgramaciones;
    Gson gson;
    int idProgramacion;

    static int miliseg = 0;
    static int seg = 0;
    static int min = 0;
    static int hor = 0;
    static boolean estado = true;

    public FrmCronemetro(mostrarHorarios mh) {
        initComponents();
        this.idHorario = mh.getIdHorario();
        txtNombreOrdenanza.setText(mh.getNomUsuario());
        txtHoraInicio.setText(mh.gethIni());
        txtLaboratorio.setText(mh.getNomLab());
        try {
            objProgramaciones = new Programaciones();
            objProgramaciones.setHorario(mh.getIdHorario());
            String elJson = objProgramaciones.getProgramaciones(objProgramaciones, 1);
            gson = new Gson();
            Programaciones[] listado = gson.fromJson(elJson, Programaciones[].class);

            cbProgramas.removeAllItems();

            for (Programaciones lista : listado) {
                cbProgramas.addItem(lista);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No hay programaciones asignda");
        }
        
        txtNombreOrdenanza.setEditable(false);
        txtHoraInicio.setEditable(false);
        txtLugar.setEditable(false);
        btnFinalizar.setEnabled(false);
    }

    private FrmCronemetro() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreOrdenanza = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbProgramas = new javax.swing.JComboBox<>();
        txtLaboratorio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(224, 182, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 19), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ordenanza: ");

        txtNombreOrdenanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreOrdenanzaActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Lugar:");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Hora de Inicio:");

        txtHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraInicioActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Programacion:");

        cbProgramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProgramasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreOrdenanza, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(cbProgramas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLaboratorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbProgramas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreOrdenanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Programa de Limpieza en Curso"));

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lb1.setText("00 : 00 : 00");

        lb2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb2.setText("0000");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(51, 255, 51));
        btnFinalizar.setText("FINALIZAR");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lb1)
                        .addGap(18, 18, 18)
                        .addComponent(lb2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnIniciar)
                .addGap(46, 46, 46)
                .addComponent(btnPausar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lb2))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnPausar)
                    .addComponent(btnBorrar))
                .addGap(33, 33, 33)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbProgramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProgramasActionPerformed
        // TODO add your handling code here:

        Programaciones p = (Programaciones) cbProgramas.getSelectedItem();
        idProgramacion = Integer.parseInt(p.getIdProgramacion());
    }//GEN-LAST:event_cbProgramasActionPerformed

    private void txtNombreOrdenanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreOrdenanzaActionPerformed
        // TODO add your handling code here:
        txtOrdenanza.transferFocus();
    }//GEN-LAST:event_txtNombreOrdenanzaActionPerformed

    private void txtHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraInicioActionPerformed
        // TODO add your handling code here:
        txtHora.transferFocus();
    }//GEN-LAST:event_txtHoraInicioActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        estado = true;
        
        Thread hilo = new Thread() {
            public void run() {
                for (;;) {
                    if (estado == true) {
                        try {
                            sleep(1);
                            if (miliseg >= 1000) {
                                miliseg = 0;
                                seg++;
                            }
                            if (seg >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min++;
                            }
                            if (min >= 60) {
                                miliseg = 0;
                                seg = 0;
                                min = 0;
                                hor++;
                            }
                            lb1.setText(hor + " : " + min + " : " + seg + " : ");
                            lb2.setText("" + miliseg);
                            miliseg++;
                        } catch (Exception e) {
                        }
                    } else {
                        break;
                    }
                }
            }
        };
        hilo.start();
        btnIniciar.setEnabled(false);
        btnFinalizar.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        System.out.println(resp);
        if (resp == 0) {
            estado = true;
            miliseg = 0;
            seg = 0;
            min = 0;
            hor = 0;
            lb1.setText("00" + " : " + "00" + " : " + "00" + " : ");
            lb2.setText("0000");
        }else{
            estado = false;
        }
        btnIniciar.setEnabled(true);
        btnFinalizar.setEnabled(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        // TODO add your handling code here:
        estado = false;
        btnIniciar.setEnabled(true);
        btnFinalizar.setEnabled(false);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        estado = false;
        /*idProgramacion
        tiempoTranscurrido
        horario
        calificacion
        estadoLimpieza
        estadoCalificacion
        comentario*/
        Prog pro = new Prog();
        String tiempoTranscurrido = hor + " : " + min + " : " + seg + " : " + miliseg;
        //String idProg = txtIDProgra.getText();
        //String C = "Pendiente";
        //String estadoC = "Pendiente";
        //String estadoL = "Finalizado";
        //String comenta = "pendiente";
        String api = "http://limpieza.azurewebsites.net/WS/API/programacion/actualizarTiempoTranscurrido.php";
        
       objProgramaciones = new Programaciones();
       objProgramaciones.setIdProgramacion(idHorario);
       objProgramaciones.setTiempoTranscurrido(tiempoTranscurrido);
        try {
            objProgramaciones.actualizarTiempoTranscurrido(objProgramaciones, api);
            JOptionPane.showMessageDialog(rootPane, "Ordenanza: "+txtNombreOrdenanza.getText()+"\nFinalizo la programacion en : "+txtLugar.getText()+"\nConun tiempo de: "+tiempoTranscurrido);
            this.dispose();
//        if(!idProg.equals("")&&!tiempoTranscurrido.equals(""))
//        {
//            try
//            {
//                pro.InsertarDatos(api, idProg, tiempoTranscurrido, idHorario, C, estadoL, estadoC, comenta);
//
//                JOptionPane.showMessageDialog(rootPane, "Programacion Finalizada");
//            } catch (JSONException ex) {
//                Logger.getLogger(FrmProgramaciones.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(FrmProgramaciones.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(rootPane, "Tiene que llenar todos los campos");
//        }
        } catch (JSONException ex) {
            Logger.getLogger(FrmCronemetro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmCronemetro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCronemetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCronemetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCronemetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCronemetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCronemetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JComboBox<Programaciones> cbProgramas;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtIDProgra;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNombreOrdenanza;
    private javax.swing.JTextField txtOrdenanza;
    // End of variables declaration//GEN-END:variables
}