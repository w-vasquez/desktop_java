/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Wilfredo Jr
 */
public class Prov {
    private Connection objConexion = null;
    private Statement objEjecutaConsulta;
    private ResultSet objResultado;
    PreparedStatement pstm = null;

    private void abrirConexion() {
        // Initialize connection variables.	
        String host = "limpieza.mysql.database.azure.com:3306";
        String database = "laboratorio";
        String user = "principal@limpieza";
        String password = "4t3c_2020";
        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            String url = String.format("jdbc:mysql://%s/%s", host, database);

            // Set connection properties.
            Properties properties = new Properties();
            properties.setProperty("user", user);
            properties.setProperty("password", password);
            properties.setProperty("useSSL", "true");
            properties.setProperty("verifyServerCertificate", "true");
            properties.setProperty("requireSSL", "false");

            objConexion = DriverManager.getConnection(url, properties);
            
            //objConexion = DriverManager.getConnection("jdbc:mysql://localhost/b2740882018","root","");
            objEjecutaConsulta = objConexion.createStatement();

        } catch (Exception e) {
            System.out.println("No me pude conectar a la base de datos por esto: " + e.getMessage());
        }
    }

    private void cerrarConexion() {
        try {
            if (objConexion != null) {
                objConexion.close();
            }
        } catch (Exception e) {
            System.out.println("No pude cerrar la conexion por esto: " + e.getMessage());
        }
    }

    //sentencias sql insert, update, delete
    public int setEjecutaSenteciasAccion(String consultaSql){
        try {
            abrirConexion();
            //objEjecutaConsulta.execute(consultaSql);
            
            pstm  = objConexion.prepareStatement(consultaSql, Statement.RETURN_GENERATED_KEYS);
            int affectedRows = pstm.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo guardar");
            }
            
            objResultado = pstm.getGeneratedKeys();
            if (objResultado.next()) {
                int idGenerado = objResultado.getInt(1);
                return idGenerado;
            } 
        } catch (SQLException e) {
            //e.printStackTrace();
            System.out.println("No se ejecuto la consulta por esto: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        
        return 0;
    }
    
    public String getSelectProgramacion(String consultaSql, int tipo){
        Programaciones objProgramaciones;
        String elJson = null;
        ArrayList<Programaciones> listaProgramaciones = new ArrayList<>();
        Gson gson = new Gson();
        try {
            abrirConexion();
            objResultado = objEjecutaConsulta.executeQuery(consultaSql);
            boolean existenDatos = false;
            while (objResultado.next()) {
                    existenDatos = true;
                    objProgramaciones = new Programaciones();
                    objProgramaciones.setIdProgramacion(objResultado.getString(1));
                    objProgramaciones.setTiempoTranscurrido(objResultado.getString(2));
                    objProgramaciones.setHorario(objResultado.getString(3));
                    objProgramaciones.setCalificacion(objResultado.getString(4));
                    objProgramaciones.setEstadoLimpieza(objResultado.getString(5));
                    objProgramaciones.setEstadoCalificacion(objResultado.getString(6));
                    objProgramaciones.setComentario(objResultado.getString(7));
                    listaProgramaciones.add(objProgramaciones);
                }
            
            if (existenDatos) {
                elJson = gson.toJson(listaProgramaciones);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("No se ejecutó la sentencia SELECT");
        }
        cerrarConexion();
        return elJson;
    }
}
