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
public class Laboratorios 
{
    private String idLaboratorio;
    private String nombre;
    private String responsable;
    private String capacidad;
    private String edificio;
    private String telefono;
    
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the responsable
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * @param responsable the responsable to set
     */
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    /**
     * @return the capacidad
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the edificio
     */
    public String getEdificio() {
        return edificio;
    }

    /**
     * @param edificio the edificio to set
     */
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //metodo para devolver uno o varios datos
    public String mostrarDatos(String api)
    {
        RESThttp rest =new RESThttp();
        String elJson=rest.sentenciaSelect(api);
        
        return elJson;
    }
    
    //metoddo para insertar y actualizar datos
    public void InsertarDatos(String api,String id,String nombre,String responsable,String capacidad,String edificio,String telefono) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
        
        //verificar los datos
        System.out.println(api);
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(responsable);
        System.out.println(capacidad);
        System.out.println(edificio);
        System.out.println(telefono);
 
        
        //{"idLaboratorio":null,"nombre":null,"responsable":null,"capacidad":null,"edificio":null,"telefono":null}
       JSONObject objeto = new JSONObject();
        objeto.put("idLaboratorio", id);
        objeto.put("nombre", nombre);
        objeto.put("responsable", responsable);
        objeto.put("capacidad", capacidad);
        objeto.put("edificio", edificio);
        objeto.put("telefono", telefono);
        
        rest.sentenciaAccion(api,objeto);
    }
    
    //metodo para eliminar datos
    public void eliminarDatos(String api,String id) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
        System.out.println(api);
        System.out.println(id);
        
       JSONObject objeto = new JSONObject();
       objeto.put("idLaboratorio", id);
        
        rest.sentenciaAccion(api,objeto);
    }
}
