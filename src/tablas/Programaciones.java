/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Datos.RESThttp;
import com.google.gson.Gson;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author CRUZ_2019
 */
public class Programaciones {

    /**
     * @return the idProgramacion
     */
    public String getIdProgramacion() {
        return idProgramacion;
    }

    /**
     * @param idProgramacion the idProgramacion to set
     */
    public void setIdProgramacion(String idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    /**
     * @return the tiempoTranscurrido
     */
    public String getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    /**
     * @param tiempoTranscurrido the tiempoTranscurrido to set
     */
    public void setTiempoTranscurrido(String tiempoTranscurrido) {
        this.tiempoTranscurrido = tiempoTranscurrido;
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

    /**
     * @return the calificacion
     */
    public String getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the estadoLimpieza
     */
    public String getEstadoLimpieza() {
        return estadoLimpieza;
    }

    /**
     * @param estadoLimpieza the estadoLimpieza to set
     */
    public void setEstadoLimpieza(String estadoLimpieza) {
        this.estadoLimpieza = estadoLimpieza;
    }

    /**
     * @return the estadoCalificacion
     */
    public String getEstadoCalificacion() {
        return estadoCalificacion;
    }

    /**
     * @param estadoCalificacion the estadoCalificacion to set
     */
    public void setEstadoCalificacion(String estadoCalificacion) {
        this.estadoCalificacion = estadoCalificacion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the idProgramacion
     */
    private String idProgramacion;
    private String tiempoTranscurrido;
    private String horario;
    private String calificacion;
    private String estadoLimpieza;
    private String estadoCalificacion;
    private String comentario;

    public String consultaCrediencial(String link) {
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()

        return elJson;
    }

    public void InsertarUsuario(String api, String id, String tiempoTranscurrido, String horario, String calificacion, String estadoLimpieza, String estadoCalificacion, String comentario) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idProgramacion", id);
        objeto.put("tiempoTranscurrido", tiempoTranscurrido);
        objeto.put("horario", horario);
        objeto.put("calificacion", calificacion);
        objeto.put("estadoLimpieza", estadoLimpieza);
        objeto.put("estadoCalificacion", estadoCalificacion);
        objeto.put("comentario", comentario);
        
        rest.sentenciaAccion(api, objeto);
        

    }
    public void ActulizarDatos(String api, String id, String tiempoTranscurrido, String horario, String calificacion, String estadoLimpieza, String estadoCalificacion, String comentario) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idProgramacion", id);
        objeto.put("tiempoTranscurrido", tiempoTranscurrido);
        objeto.put("horario", horario);
        objeto.put("calificacion", calificacion);
        objeto.put("estadoLimpieza", estadoLimpieza);
        objeto.put("estadoCalificacion", estadoCalificacion);
        objeto.put("comentario", comentario);
        
        rest.sentenciaAccion(api, objeto);
        

    }
    public void EliminarDatos(String api, String id) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idProgramacion", id);
        
        
        rest.sentenciaAccion(api, objeto);
        

    }
    
}
