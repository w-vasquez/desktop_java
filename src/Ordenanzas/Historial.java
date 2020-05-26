/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenanzas;

import EncargadoDeLaboratorio.frmProgramaciones;
import com.google.gson.Gson;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablas.mostrarHorarios;

/**
 *
 * @author 50372
 */
public class Historial extends javax.swing.JInternalFrame {

    /**
     * Creates new form Historial
     */
    int idUsuario;
    DefaultTableModel contenedor;

    public Historial(int idUsuario) {
        initComponents();
        this.idUsuario = idUsuario;
        System.out.println(idUsuario);

        contenedor = new DefaultTableModel();
        contenedor.addColumn("ID Horario");
        contenedor.addColumn("Nom Horario");
        contenedor.addColumn("Nombre completo");
        //contenedor.addColumn("Apell Usuario");
        //contenedor.addColumn("ID Hordenanza");
        //contenedor.addColumn("Fech Creacion");
        contenedor.addColumn("Fech Inicio");
        contenedor.addColumn("Fech FIN");
        contenedor.addColumn("Hora Inicio");
        contenedor.addColumn("Hora Fin");
        contenedor.addColumn("ID Lab");
        contenedor.addColumn("Nom Lab");
        contenedor.addColumn("Lunes");
        contenedor.addColumn("Martes");
        contenedor.addColumn("Miercoles");
        contenedor.addColumn("Jueves");
        contenedor.addColumn("Viernes");
        contenedor.addColumn("Sabado");
        contenedor.addColumn("Domingo");
        //contenedor.addColumn("Notificacion");

        lstUsuarios.setModel(contenedor);
        llenarTabla();
    }

    public void llenarTabla() {
        mostrarHorarios obj = new mostrarHorarios();
        Vector fila;
        Gson gson = new Gson();

        String api = "https://limpieza.azurewebsites.net/ws/API/vistaHorario/mostrarOrdenanza.php?";
        String ordenanza = "idOrdenanza=" + idUsuario;
        System.out.println(api + ordenanza);
        String elJson = obj.consultaCrediencial(api + ordenanza);

        try {
            //convertimos a un obj de java
            mostrarHorarios[] horarios = gson.fromJson(elJson, mostrarHorarios[].class);

            for (mostrarHorarios registros : horarios) {
                fila = new Vector();
                fila.add(registros.getIdHorario());
                fila.add(registros.getNomHorario());
                fila.add(registros.getNomUsuario()+" "+registros.getApeUsuario());
                //fila.add(registros.getApeUsuario());
                //fila.add(registros.getIdOrdenanza());
                //fila.add(registros.getfCrea());
                fila.add(registros.getfIni());
                fila.add(registros.getfFin());
                fila.add(registros.gethIni());
                fila.add(registros.gethFin());
                fila.add(registros.getIdLaboratorio());
                fila.add(registros.getNomLab());
                fila.add(registros.getLunes());
                fila.add(registros.getMartes());
                fila.add(registros.getMiercoles());
                fila.add(registros.getJueves());
                fila.add(registros.getViernes());
                fila.add(registros.getSabado());
                fila.add(registros.getDomingo());
                //fila.add(registros.getNotificacion());
                contenedor.addRow(fila);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "no hay horarios asigandos");
        }
    }

    private Historial() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Horarios");

        jPanel1.setBackground(new java.awt.Color(5, 134, 154));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horarios Programados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        lstUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        lstUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void lstUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuariosMouseClicked
        // TODO add your handling code here:
        int seleccionarDatos = lstUsuarios.rowAtPoint(evt.getPoint());
        String idHorario = (String) lstUsuarios.getValueAt(seleccionarDatos, 0);
        String nomHorario = (String) lstUsuarios.getValueAt(seleccionarDatos, 1);
        String nomOrdenanza = (String) lstUsuarios.getValueAt(seleccionarDatos, 2);
        //String idOrdenanza = String.valueOf(lstUsuarios.getValueAt(seleccionarDatos, 4));
        String fechIni = String.valueOf(lstUsuarios.getValueAt(seleccionarDatos, 3));
        String horaIni = String.valueOf(lstUsuarios.getValueAt(seleccionarDatos, 4));
        String nomLab = String.valueOf(lstUsuarios.getValueAt(seleccionarDatos, 8));

        mostrarHorarios objMostrarHorario = new mostrarHorarios();
        objMostrarHorario.setIdHorario(idHorario);
        objMostrarHorario.setNomHorario(nomHorario);
        objMostrarHorario.setNomUsuario(nomOrdenanza);
        objMostrarHorario.sethIni(horaIni);
        objMostrarHorario.setfIni(fechIni);
        objMostrarHorario.setIdOrdenanza(String.valueOf(idUsuario));
        objMostrarHorario.setNomLab(nomLab);
        
        
        FrmCronemetro form = new FrmCronemetro(objMostrarHorario);        
        form.setVisible(true);
    }//GEN-LAST:event_lstUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstUsuarios;
    // End of variables declaration//GEN-END:variables
}
