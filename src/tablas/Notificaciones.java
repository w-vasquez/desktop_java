/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Datos.RESThttp;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author CRUZ_2019
 */
public class Notificaciones {
    private String idNotificacion;
    private String tipoNotificacion;
    private String frecuencia;
    private String tipoFrecuencia;
    private String horario;

    /**
     * @return the idNotificacion
     */
    public String getIdNotificacion() {
        return idNotificacion;
    }

    /**
     * @param idNotificacion the idNotificacion to set
     */
    public void setIdNotificacion(String idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    /**
     * @return the tipoNotificacion
     */
    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    /**
     * @param tipoNotificacion the tipoNotificacion to set
     */
    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    /**
     * @return the frecuencia
     */
    public String getFrecuencia() {
        return frecuencia;
    }

    /**
     * @param frecuencia the frecuencia to set
     */
    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
     * @return the tipoFrecuencia
     */
    public String getTipoFrecuencia() {
        return tipoFrecuencia;
    }

    /**
     * @param tipoFrecuencia the tipoFrecuencia to set
     */
    public void setTipoFrecuencia(String tipoFrecuencia) {
        this.tipoFrecuencia = tipoFrecuencia;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String consultaCrediencial(String link) {
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()

        return elJson;
    }

    public void InsertarUsuario(String api, String idNotificacion, String tipoNotificacion, String frecuencia, String tipoFrecuencia, String horario) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idNotificacion", idNotificacion);
        objeto.put("tipoNotificacion", tipoNotificacion);
        objeto.put("frecuencia", frecuencia);
        objeto.put("tipoFrecuencia", tipoFrecuencia);
        objeto.put("horario", horario);
                
        rest.sentenciaAccion(api, objeto);
        

    }
    public void ActulizarDatos(String api, String idNotificacion, String tipoNotificacion, String frecuencia, String tipoFrecuencia, String horario) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idNotificacion", idNotificacion);
        objeto.put("tipoNotificacion", tipoNotificacion);
        objeto.put("frecuencia", frecuencia);
        objeto.put("tipoFrecuencia", tipoFrecuencia);
        objeto.put("horario", horario);
        
        rest.sentenciaAccion(api, objeto);
        

    }
     public void EliminarDatos(String api, String id) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idNotificacion", id);
        
        
        rest.sentenciaAccion(api, objeto);
        

    }

    

}
