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
public class OrdenanzaLaboratorio 
{

    /**
     * @return the idOrdenanza
     */
    public String getIdOrdenanza() {
        return idOrdenanza;
    }

    /**
     * @param idOrdenanza the idOrdenanza to set
     */
    public void setIdOrdenanza(String idOrdenanza) {
        this.idOrdenanza = idOrdenanza;
    }

    /**
     * @return the idLaboratorio
     */
    public String getIdLaboratorio() {
        return idLaboratorio;
    }

    /**
     * @param idLaboratorio the idLaboratorio to set
     */
    public void setIdLaboratorio(String idLaboratorio) {
        this.idLaboratorio = idLaboratorio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    private String idOrdenanza;
    private String idLaboratorio;
    private String estado;
    
    public String mostrarDatos(String api)
    {
        RESThttp rest =new RESThttp();
        String elJson=rest.sentenciaSelect(api);
        
        return elJson;
    }
    
    public void InsertarDatos(String api,String idOrde,String idLab) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
        
        //verificar los datos
        System.out.println(api);
        System.out.println(idOrde);
        System.out.println(idLab);
 
        
        //{"idLaboratorio":null,"nombre":null,"responsable":null,"capacidad":null,"edificio":null,"telefono":null}
       JSONObject objeto = new JSONObject();
        objeto.put("idOrdenanza", idOrde);
        objeto.put("idLaboratorio", idLab);
        
        rest.sentenciaAccion(api,objeto);
    }
}
