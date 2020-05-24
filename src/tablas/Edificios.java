/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Datos.ConexionMySql;
import Datos.RESThttp;
import Datos.Usuarios;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author l
 */
public class Edificios 
{

    /**
     * @return the idEdificio
     */
    public String getIdEdificio() {
        return idEdificio;
    }

    /**
     * @param idEdificio the idEdificio to set
     */
    public void setIdEdificio(String idEdificio) {
        this.idEdificio = idEdificio;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return Edificio;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.Edificio = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the responsable
     */
    public String getResponsable() {
        return Responsable;
    }

    /**
     * @param responsable the responsable to set
     */
    public void setResponsable(String responsable) {
        this.Responsable = responsable;
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
    private String idEdificio;
    private String Edificio;
    private String direccion;
    private String Responsable;
    private String telefono;
    private String estado;
    
    public String mostrarDatos(String api)
    {
        RESThttp rest =new RESThttp();
        String elJson=rest.sentenciaSelect(api);
        
        return elJson;
    }
    
    //metoddo para insertar y actualizar datos
    public void InsertarDatos(String api,String id,String nombre,String direccion,String responsable,String telefono,String estado) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
        
        //verificar los datos
        System.out.println(api);
        System.out.println(id);
        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(responsable);
        System.out.println(telefono);
        System.out.println(estado);
 
        
       JSONObject objeto = new JSONObject();
        objeto.put("idEdificio", id);
        objeto.put("nombre", nombre);
        objeto.put("direccion", direccion);
        objeto.put("responsable", responsable);
        objeto.put("telefono", telefono);
        objeto.put("estado", estado);
        
        rest.sentenciaAccion(api,objeto);
    }
    
    //metodo para eliminar datos
    public void eliminarDatos(String api,String id) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
        System.out.println(api);
        System.out.println(id);
        
       JSONObject objeto = new JSONObject();
       objeto.put("idEdificio", id);
        
        rest.sentenciaAccion(api,objeto);
    }
    
   
    
}
