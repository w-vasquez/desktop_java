/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncargadoDeLaboratorio;

import static EncargadoDeLaboratorio.frmCrearNotificacion.lstregistros;
import com.google.gson.Gson;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablas.Horarios;
import tablas.mostrarHorarios;

/**
 *
 * @author CRUZ_2019
 */
public class frmCrearhorarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCrearhorarios
     */
    Horarios objhorarios;
    mostrarHorarios objhorario;
    public Integer totalregistros;
    DefaultTableModel modelo;
    Statement objEjecutaConsulta;

    public frmCrearhorarios() {
        initComponents();

        objhorario = new mostrarHorarios();
        modelo = new DefaultTableModel();

        lstregistros.setModel(modelo);

        mostrar("");

    }

    public Boolean Validar_CampoHora(String Hora) {
        boolean b;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(":");

        if ((a[0] == ' ') || (a[1] == ' ') || (a[2] == ' ') || (a[3] == ' ') || (a[4] == ' ') || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;

    }

    void limpiarcampos() {
        txtidhorario.setText("");
        txtnombrehorario.setText("");
        txtnombreordenanza.setText("");
        txtnombrelabo.setText("");
        ckblunes.setSelected(false);
        ckbmartes.setSelected(false);
        ckbmiercoles.setSelected(false);
        ckbjueves.setSelected(false);
        ckbviernes.setSelected(false);
        ckbsabado.setSelected(false);
        ckbdomingo.setSelected(false);
        txthorainicio.setText("");
        txthorafinal.setText("");
        txtnombrehorario.setText("");
        txtidordenanza.setText("");
        txtlaboratorio.setText("");
        txtnotificacion.setText("");

    }

    void mostrar(String buscar) {
        // TODO add your handling code here:
        //Instanciar clase de la tabla

        Gson gson = new Gson();

        totalregistros = 0;
        //instansiar la clase Gson que convierte el Json a array en java
        //Gson gson = new Gson();
        //envio datos al metodo
        String url = "http://limpieza.azurewebsites.net/WS/API/vistaHorario/mostrar.php";

        //Ejecuto consulta con los parametros de link
        String elJson = objhorario.consultaCrediencial(url);

        //convertir a objeto de java
        mostrarHorarios[] listado = gson.fromJson(elJson, mostrarHorarios[].class);
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("HORARIO");
        modelo.addColumn("ORDENANZA");
        modelo.addColumn("ID");
        modelo.addColumn("FECHA CREACION");
        modelo.addColumn("FECHA INICIO");
        modelo.addColumn("FECHA FINAL");
        modelo.addColumn("HORA INICIO");
        modelo.addColumn("HORA FINAL");
        modelo.addColumn("ID");
        modelo.addColumn("LABORATORIO");
        modelo.addColumn("L");
        modelo.addColumn("M");
        modelo.addColumn("MI");
        modelo.addColumn("J");
        modelo.addColumn("V");
        modelo.addColumn("S");
        modelo.addColumn("D");
        modelo.addColumn("NOTIFICACION");

        Vector fila;
        lstregistros.setModel(modelo);

        //PARA SABER CUANTOS REGISTROS EXISTEN
        //int cantidadRegistros = objUsuarios.getCantidadRegistros();
        //PARA CREAR REGISTROS POR REGISTROS
        //DE LA TABLA DE NUESTRA BASE DE DATOS
        for (mostrarHorarios registros : listado) {

            //CREAMOS UNA NUEVA FILA PARA LA TABLA
            fila = new Vector();
            // AGREGAMOS LA MISMA FILA PARA LA TABLA
            //A NUESTRO VECTOR

            //fila.add(indice);
            fila.add(registros.getIdHorario());
            fila.add(registros.getNomHorario());
            fila.add(registros.getNomUsuario() + "  " + registros.getApeUsuario());
            //fila.add(registros.getApeUsuario());
            fila.add(registros.getIdOrdenanza());
            fila.add(registros.getfCrea());
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
            fila.add(registros.getNotificacion());

            //AGREGAMOS LA FILA COMPLETA DE DATOS
            //AL CONTENEDOR QUE ESTAMOS DIBUJANDO
            totalregistros++;
            modelo.addRow(fila);
        }
        lblregistros.setText("Total registros: " + Integer.toString(totalregistros));
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtidhorario = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnombrehorario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidordenanza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtlaboratorio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtnotificacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ckblunes = new javax.swing.JCheckBox();
        ckbmartes = new javax.swing.JCheckBox();
        ckbmiercoles = new javax.swing.JCheckBox();
        ckbjueves = new javax.swing.JCheckBox();
        ckbviernes = new javax.swing.JCheckBox();
        ckbsabado = new javax.swing.JCheckBox();
        ckbdomingo = new javax.swing.JCheckBox();
        btnvistaordenanzas = new javax.swing.JButton();
        txtnombreordenanza = new javax.swing.JTextField();
        btnvistanotificacion = new javax.swing.JButton();
        dtbfechainicio = new com.toedter.calendar.JDateChooser();
        dtbfechafin = new com.toedter.calendar.JDateChooser();
        dtbfechacreacion = new com.toedter.calendar.JDateChooser();
        btnvistalaboratorio = new javax.swing.JButton();
        txtnombrelabo = new javax.swing.JTextField();
        txthorainicio = new javax.swing.JFormattedTextField();
        txthorafinal = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstregistros = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtidhorariobuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblregistros = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        fondo.setBackground(new java.awt.Color(121, 11, 42));

        jPanel1.setBackground(new java.awt.Color(173, 16, 60));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo horario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        txtidhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidhorarioActionPerformed(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.GIF"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha Inicio");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha Final:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Hora Inicio:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Hora Fin:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Creacion:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ordenanza:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Laboratorio:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Notificacion:");

        jPanel2.setBackground(new java.awt.Color(121, 11, 42));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dias:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N

        ckblunes.setBackground(new java.awt.Color(121, 11, 42));
        ckblunes.setForeground(new java.awt.Color(255, 255, 255));
        ckblunes.setText("Lunes: ");
        ckblunes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckbmartes.setBackground(new java.awt.Color(121, 11, 42));
        ckbmartes.setForeground(new java.awt.Color(255, 255, 255));
        ckbmartes.setText("Martes: ");
        ckbmartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckbmartes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckbmiercoles.setBackground(new java.awt.Color(121, 11, 42));
        ckbmiercoles.setForeground(new java.awt.Color(255, 255, 255));
        ckbmiercoles.setText("Miercoles:");
        ckbmiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckbmiercoles.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckbjueves.setBackground(new java.awt.Color(121, 11, 42));
        ckbjueves.setForeground(new java.awt.Color(255, 255, 255));
        ckbjueves.setText("Jueves: ");
        ckbjueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckbjueves.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckbviernes.setBackground(new java.awt.Color(121, 11, 42));
        ckbviernes.setForeground(new java.awt.Color(255, 255, 255));
        ckbviernes.setText("Viernes: ");
        ckbviernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckbviernes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckbsabado.setBackground(new java.awt.Color(121, 11, 42));
        ckbsabado.setForeground(new java.awt.Color(255, 255, 255));
        ckbsabado.setText("Sabado: ");
        ckbsabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckbsabado.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ckbdomingo.setBackground(new java.awt.Color(121, 11, 42));
        ckbdomingo.setForeground(new java.awt.Color(255, 255, 255));
        ckbdomingo.setText("Domingo: ");
        ckbdomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckbdomingo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ckblunes)
                    .addComponent(ckbmartes)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ckbdomingo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ckbmiercoles)
                        .addComponent(ckbjueves, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ckbviernes, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ckbsabado, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckblunes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbmartes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbmiercoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbjueves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbviernes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbsabado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbdomingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnvistaordenanzas.setText("...");
        btnvistaordenanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistaordenanzasActionPerformed(evt);
            }
        });

        btnvistanotificacion.setText("...");
        btnvistanotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistanotificacionActionPerformed(evt);
            }
        });

        btnvistalaboratorio.setText("...");

        try {
            txthorainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txthorafinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombrehorario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dtbfechacreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombreordenanza, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnvistaordenanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtidordenanza, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel6)
                            .addComponent(jLabel19))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtbfechainicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtbfechafin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtnotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                            .addComponent(btnvistanotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtnombrelabo))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txthorafinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addComponent(txthorainicio, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnvistalaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(980, 980, 980))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtnombrehorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnvistaordenanzas)
                            .addComponent(txtnombreordenanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidordenanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(dtbfechacreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(dtbfechainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtbfechafin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txthorainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txthorafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvistalaboratorio)
                    .addComponent(txtnombrelabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtnotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvistanotificacion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Horarios");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de horarios"));

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
        });
        jScrollPane2.setViewportView(lstregistros);

        jLabel13.setText("Horarios:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtidhorariobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lblregistros)
                        .addGap(24, 24, 24)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtidhorariobuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnsalir)
                    .addComponent(btneliminar))
                .addGap(4, 4, 4)
                .addComponent(lblregistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69))
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

    private void txtidhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidhorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidhorarioActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
         
        if (txtidhorario.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar un ID");
            txtidhorario.requestFocus();
            return;
        }
        if (txtidordenanza.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar un ordennza");
            txtidordenanza.requestFocus();
            return;
        }
        if (txtlaboratorio.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar un laboratorio");
            txtlaboratorio.requestFocus();
            return;
        }
        if (txtnotificacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar una notificacion");
            txtnotificacion.requestFocus();
            return;
        }

        Horarios func = new Horarios();

        String idhorario = txtidhorario.getText().toString().trim();
        //String lunes = txtlunes.getText().toString().trim();
        String lunes, martes, miercoles, jueves, viernes, sabado, domingo;
        if (ckblunes.isSelected()) {
            lunes = "1";
        } else {
            lunes = "0";
        }
        if (ckbmartes.isSelected()) {
            martes = "1";
        } else {
            martes = "0";
        }
        if (ckbmiercoles.isSelected()) {
            miercoles = "1";
        } else {
            miercoles = "0";
        }
        if (ckbjueves.isSelected()) {
            jueves = "1";
        } else {
            jueves = "0";
        }
        if (ckbviernes.isSelected()) {
            viernes = "1";
        } else {
            viernes = "0";
        }
        if (ckbsabado.isSelected()) {
            sabado = "1";
        } else {
            sabado = "0";
        }
        if (ckbdomingo.isSelected()) {
            domingo = "1";
        } else {
            domingo = "0";
        }

        int a, m, d;
        a = dtbfechainicio.getCalendar().get(Calendar.YEAR);
        d = dtbfechainicio.getCalendar().get(Calendar.DAY_OF_MONTH);
        m = dtbfechainicio.getCalendar().get(Calendar.MONTH) + 1;
        String fechaInicio = a + "-" + m + "-" + d;

        a = dtbfechafin.getCalendar().get(Calendar.YEAR);
        d = dtbfechafin.getCalendar().get(Calendar.DAY_OF_MONTH);
        m = dtbfechafin.getCalendar().get(Calendar.MONTH) + 1;
        String fechaFin = a + "-" + m + "-" + d;

        String horaincio = txthorainicio.getText().toString().trim();
        String horafin = txthorafinal.getText().toString().trim();
        String nombre = txtnombrehorario.getText().toString().trim();
        String ordenanza = txtidordenanza.getText().toString().trim();

        a = dtbfechacreacion.getCalendar().get(Calendar.YEAR);
        d = dtbfechacreacion.getCalendar().get(Calendar.DAY_OF_MONTH);
        m = dtbfechacreacion.getCalendar().get(Calendar.MONTH) + 1;
        String fechaCreacion = a + "-" + m + "-" + d;

        String laboratorio = txtlaboratorio.getText().toString().trim();
        String notificacion = txtnotificacion.getText().toString().trim();

        String url = "http://limpieza.azurewebsites.net/WS/API/horario/actualizar.php";

        try {
            func.ActulizarDatos(url, idhorario, lunes, martes, miercoles, jueves, viernes, sabado, domingo, fechaInicio, fechaFin, horaincio, horafin, nombre, ordenanza, fechaCreacion, laboratorio, notificacion);
            JOptionPane.showMessageDialog(rootPane, "El horario fue actualizado correctamente");
            mostrar("");
        } catch (Exception e) {
        }

        limpiarcampos();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        limpiarcampos();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        Horarios func = new Horarios();
        
        if (txtidhorario.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar un ID");
            txtidhorario.requestFocus();
            return;
        }
        if (txtidordenanza.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar un ordennza");
            txtidordenanza.requestFocus();
            return;
        }
        if (txtlaboratorio.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar un laboratorio");
            txtlaboratorio.requestFocus();
            return;
        }
        if (txtnotificacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debes asignar una notificacion");
            txtnotificacion.requestFocus();
            return;
        }

        String idhorario = txtidhorario.getText().toString().trim();
        String lunes, martes, miercoles, jueves, viernes, sabado, domingo;
        if (ckblunes.isSelected()) {
            lunes = "1";
        } else {
            lunes = "0";
        }
        if (ckbmartes.isSelected()) {
            martes = "1";
        } else {
            martes = "0";
        }
        if (ckbmiercoles.isSelected()) {
            miercoles = "1";
        } else {
            miercoles = "0";
        }
        if (ckbjueves.isSelected()) {
            jueves = "1";
        } else {
            jueves = "0";
        }
        if (ckbviernes.isSelected()) {
            viernes = "1";
        } else {
            viernes = "0";
        }
        if (ckbsabado.isSelected()) {
            sabado = "1";
        } else {
            sabado = "0";
        }
        if (ckbdomingo.isSelected()) {
            domingo = "1";
        } else {
            domingo = "0";
        }
        int a, m, d;
        a = dtbfechainicio.getCalendar().get(Calendar.YEAR);
        d = dtbfechainicio.getCalendar().get(Calendar.DAY_OF_MONTH);
        m = dtbfechainicio.getCalendar().get(Calendar.MONTH);
        String fechaInicio = a + "-" + m + "-" + d;
        int aa, mm, dd;

        aa = dtbfechafin.getCalendar().get(Calendar.YEAR);
        mm = dtbfechafin.getCalendar().get(Calendar.DAY_OF_MONTH);
        dd = dtbfechafin.getCalendar().get(Calendar.MONTH);
        String fechaFin = aa + "-" + mm + "-" + dd;

        String horaincio = txthorainicio.getText().toString().trim();
        String horafin = txthorafinal.getText().toString().trim();
        String nombre = txtnombrehorario.getText().toString().trim();
        String ordenanza = txtidordenanza.getText().toString().trim();

        a = dtbfechacreacion.getCalendar().get(Calendar.YEAR);
        d = dtbfechacreacion.getCalendar().get(Calendar.DAY_OF_MONTH);
        m = dtbfechacreacion.getCalendar().get(Calendar.MONTH);
        String fechaCreacion = a + "-" + m + "-" + d;

        String laboratorio = txtlaboratorio.getText().toString().trim();
        String notificacion = txtnotificacion.getText().toString().trim();
        String url = "http://limpieza.azurewebsites.net/WS/API/horario/insertar.php";

        try {

            func.InsertarUsuario(url, idhorario, lunes, martes, miercoles, jueves, viernes, sabado, domingo, fechaInicio, fechaFin, horaincio, horafin, nombre, ordenanza, fechaCreacion, laboratorio, notificacion);

            JOptionPane.showMessageDialog(rootPane, "El horario fue insertado correctamente");
            mostrar("");

        } catch (Exception e) {
        }

        limpiarcampos();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void lstregistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstregistrosMouseClicked
        // TODO add your handling code here:

        int fila = lstregistros.rowAtPoint(evt.getPoint());
        String lunes, martes, miercoles, jueves, viernes, sabado, domingo;

        txtidhorario.setText(lstregistros.getValueAt(fila, 0).toString());
        txtnombrehorario.setText(lstregistros.getValueAt(fila, 1).toString());
        txtnombreordenanza.setText(lstregistros.getValueAt(fila, 2).toString());
        txtidordenanza.setText(lstregistros.getValueAt(fila, 3).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) lstregistros.getValueAt(fila, 4).toString());

            dtbfechacreacion.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmCrearhorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) lstregistros.getValueAt(fila, 5).toString());

            dtbfechainicio.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmCrearhorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) lstregistros.getValueAt(fila, 6).toString());

            dtbfechafin.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmCrearhorarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        txthorainicio.setText(lstregistros.getValueAt(fila, 7).toString());
        txthorafinal.setText(lstregistros.getValueAt(fila, 8).toString());
        txtlaboratorio.setText(lstregistros.getValueAt(fila, 9).toString());
        txtnombrelabo.setText(lstregistros.getValueAt(fila, 10).toString());

        lunes = lstregistros.getValueAt(fila, 11).toString();
        if (lunes.equals("1")) {
            ckblunes.setSelected(true);
        }

        martes = lstregistros.getValueAt(fila, 12).toString();
        if (martes.equals("1")) {
            ckbmartes.setSelected(true);
        }

        miercoles = lstregistros.getValueAt(fila, 13).toString();
        if (miercoles.equals("1")) {
            ckbmiercoles.setSelected(true);
        }
        jueves = lstregistros.getValueAt(fila, 14).toString();
        if (jueves.equals("1")) {
            ckbjueves.setSelected(true);
        }
        viernes = lstregistros.getValueAt(fila, 15).toString();
        if (viernes.equals("1")) {
            ckbviernes.setSelected(true);
        }
        sabado = lstregistros.getValueAt(fila, 16).toString();
        if (sabado.equals("1")) {
            ckbsabado.setSelected(true);
        }
        domingo = lstregistros.getValueAt(fila, 17).toString();
        if (domingo.equals("1")) {
            ckbdomingo.setSelected(true);
        }
        txtnotificacion.setText(lstregistros.getValueAt(fila, 18).toString());

    }//GEN-LAST:event_lstregistrosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        Gson gson = new Gson();
        Horarios func = new Horarios();

        String idhorario = txtidhorariobuscar.getText();

        String url = "http://limpieza.azurewebsites.net/WS/API/horario/mostrarP.php?";

        String parametros = "idHorario=" + idhorario;

        //Ejecuto consulta con los parametros de link
        String elJson = "[" + func.consultaCrediencial(url + parametros) + "]";

        try {

            if (!txtidhorariobuscar.getText().equals("")) {
                //Ejecuto consulta con los parametros de link

                //convertir a objeto de java
                Horarios[] listado = gson.fromJson(elJson, Horarios[].class);
                DefaultTableModel modelo;
                modelo = new DefaultTableModel();
                modelo = new DefaultTableModel();
                modelo.addColumn("ID");
                modelo.addColumn("LUNES");
                modelo.addColumn("MARTES");
                modelo.addColumn("MIERCOLES");
                modelo.addColumn("JUEVES");
                modelo.addColumn("VIERNES");
                modelo.addColumn("SABADO");
                modelo.addColumn("DOMINGO");
                modelo.addColumn("FECHA INICIO");
                modelo.addColumn("FECHA FINAL");
                modelo.addColumn("HORA INICIO");
                modelo.addColumn("HORA FINAL");
                modelo.addColumn("NOMBRE");
                modelo.addColumn("ORDENZA");
                modelo.addColumn("FECHA CREACION");
                modelo.addColumn("LABORATORIO");
                modelo.addColumn("NOTIFICACION");

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
                fila.add(listado[0].getIdHorario());
                fila.add(listado[0].getLunes());
                fila.add(listado[0].getMartes());
                fila.add(listado[0].getMiercoles());
                fila.add(listado[0].getJueves());
                fila.add(listado[0].getViernes());
                fila.add(listado[0].getSabado());
                fila.add(listado[0].getDomingo());
                fila.add(listado[0].getFechaInicio());
                fila.add(listado[0].getFechaFin());
                fila.add(listado[0].getHoraInicio());
                fila.add(listado[0].getHoraFin());
                fila.add(listado[0].getNombre());
                fila.add(listado[0].getOrdenanza());
                fila.add(listado[0].getFechaCreacion());
                fila.add(listado[0].getLaboratorio());
                fila.add(listado[0].getNotificacion());

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

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidhorario.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar el horario", "Confirmar", 2);
            if (confirmacion == 0) {
                {
                    Horarios func = new Horarios();

                    String idhorario = txtidhorario.getText().toString().trim();

                    String url = "http://limpieza.azurewebsites.net/WS/API/horario/eliminar.php";

                    try {
                        func.EliminarDatos(url, idhorario);
                        JOptionPane.showMessageDialog(rootPane, "El horario fue eliminado correctamente");
                    } catch (Exception e) {
                    }
                    mostrar("");
                    limpiarcampos();
                }
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnvistaordenanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistaordenanzasActionPerformed
        // TODO add your handling code here:

        frmVistaOrdenanza form = new frmVistaOrdenanza();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnvistaordenanzasActionPerformed

    private void btnvistanotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistanotificacionActionPerformed
        // TODO add your handling code here:
        frmVistaNotificacion form = new frmVistaNotificacion();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnvistanotificacionActionPerformed

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
            java.util.logging.Logger.getLogger(frmCrearhorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrearhorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrearhorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrearhorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrearhorarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnvistalaboratorio;
    private javax.swing.JButton btnvistanotificacion;
    private javax.swing.JButton btnvistaordenanzas;
    private javax.swing.JCheckBox ckbdomingo;
    private javax.swing.JCheckBox ckbjueves;
    private javax.swing.JCheckBox ckblunes;
    private javax.swing.JCheckBox ckbmartes;
    private javax.swing.JCheckBox ckbmiercoles;
    private javax.swing.JCheckBox ckbsabado;
    private javax.swing.JCheckBox ckbviernes;
    private com.toedter.calendar.JDateChooser dtbfechacreacion;
    private com.toedter.calendar.JDateChooser dtbfechafin;
    private com.toedter.calendar.JDateChooser dtbfechainicio;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblregistros;
    public static javax.swing.JTable lstregistros;
    private javax.swing.JFormattedTextField txthorafinal;
    private javax.swing.JFormattedTextField txthorainicio;
    private javax.swing.JTextField txtidhorario;
    private javax.swing.JTextField txtidhorariobuscar;
    public static javax.swing.JTextField txtidordenanza;
    private javax.swing.JTextField txtlaboratorio;
    private javax.swing.JTextField txtnombrehorario;
    private javax.swing.JTextField txtnombrelabo;
    public static javax.swing.JTextField txtnombreordenanza;
    public static javax.swing.JTextField txtnotificacion;
    // End of variables declaration//GEN-END:variables
}
