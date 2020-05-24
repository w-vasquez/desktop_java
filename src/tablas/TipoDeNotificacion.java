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
public class TipoDeNotificacion 
{
    private String idTipoNotificacion;
    private String tipoNotificacion;

    public String getTipoNotificacion() {
        return idTipoNotificacion;
    }

    public void setTipoNotificacion(String TipoNotificacion) {
        this.idTipoNotificacion = TipoNotificacion;
    }

    public String getTipoNotificacionn() {
        return tipoNotificacion;
    }

    public void setTipoNotificacionn(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }
    
    public String consultaCrediencial(String link){
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()
        
        
        return elJson;
    }
 
   
   
    
}
