/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Datos.RESThttp;

/**
 *
 * @author CRUZ_2019
 */
public class Calificacion {

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
    
    private String idCalificacion;
    private String calificacion;
    private String comentarios;
    
    public String consultaCrediencial(String link) {
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()

        return elJson;
    }

    
    
    
}
