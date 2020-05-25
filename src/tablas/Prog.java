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
 * @author l
 */
public class Prog 
{
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
    //{"idProgramacion":"1","tiempoTranscurrido":"10:00 pm","horario":"1","calificacion":"2",
    //"estadoLimpieza":"buena","estadoCalificacion":"Calificado","comentario":"Excelen"}
    
    private String idProgramacion;
    private String tiempoTranscurrido;
    private String horario;
    private String calificacion;
    private String estadoLimpieza;
    private String estadoCalificacion;
    private String comentario;
    
    public String mostrarDatos(String api)
    {
        RESThttp rest =new RESThttp();
        String elJson=rest.sentenciaSelect(api);
        
        return elJson;
    }
    
    //metoddo para insertar y actualizar datos
    public void InsertarDatos(String api,String id,String tiempo,String horario,String calificacion,String estadoL,String estadoC,String comentario) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
 
        
       JSONObject objeto = new JSONObject();
        objeto.put("idProgramacion", id);
        objeto.put("tiempoTranscurrido", tiempo);
        objeto.put("horario", horario);
        objeto.put("calificacion", calificacion);
        objeto.put("estadoLimpieza", estadoL);
        objeto.put("estadoCalificacion", estadoC);
        objeto.put("comentario", comentario);
        
        rest.sentenciaAccion(api,objeto);
    }
    
    //metodo para eliminar datos
    public void eliminarDatos(String api,String id) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
        
       JSONObject objeto = new JSONObject();
       objeto.put("idProgramacion", id);
        
        rest.sentenciaAccion(api,objeto);
    }
    
    public String consultaCrediencial(String link) {
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()

        return elJson;
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
    
    public void EliminarDatos(String api, String id) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idProgramacion", id);
        
        
        rest.sentenciaAccion(api, objeto);
        

    }
}
