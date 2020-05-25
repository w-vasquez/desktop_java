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
 * @author tatia
 */
public class Calificar {
   private String idCalificacion ; 
   private String calificacion ; 
   private String  comentarios ;

    /**
     * @return the idCalificacion
     */
    public String getIdCalificacion() {
        return idCalificacion;
    }

    /**
     * @param idCalificacion the idCalificacion to set
     */
    public void setIdCalificacion(String idCalificacion) {
        this.idCalificacion = idCalificacion;
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
     * @return the comentarios
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * @param comentarios the comentarios to set
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
     
    
    public String mostrarDatos (String api) {
        RESThttp obj = new RESThttp();
        
        String Json = obj.sentenciaSelect (api) ; 
        
        return Json ; 
      
    
    }
    
    public void insertarDatos(String api, String idCalificacion, String calificacion, String comentario) throws JSONException, IOException{
        RESThttp obj = new RESThttp();
        
        
        JSONObject objeto = new JSONObject(); 
        objeto.put("idCalificacion",idCalificacion);
        objeto.put("calificacion",calificacion);
        objeto.put("comentarios", comentario);
        
        obj.sentenciaAccion(api, objeto);
        
        
        
    }
    
      public void actualizarDatos(String api, String idCalificacion, String calificacion, String comentario) throws JSONException, IOException{
        RESThttp obj = new RESThttp();
        
        
        JSONObject objeto = new JSONObject(); 
        objeto.put("idCalificacion",idCalificacion);
        objeto.put("calificacion",calificacion);
        objeto.put("comentarios", comentario);
        
        obj.sentenciaAccion(api, objeto);
        
        
        
    }
        public void eliminarDatos(String api, String idCalificacion) throws JSONException, IOException{
        RESThttp obj = new RESThttp();
        
        
        JSONObject objeto = new JSONObject(); 
        objeto.put("idCalificacion",idCalificacion);
        
        
        obj.sentenciaAccion(api, objeto);
        
        
        
    }
  
    
  
   
   
    
}
