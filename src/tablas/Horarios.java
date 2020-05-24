/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import Datos.RESThttp;
import java.io.IOException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author CRUZ_2019
 */
public class Horarios {
    

    /**
     * @return the idHorario
     */
    public String getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the lunes
     */
    public String getLunes() {
        return lunes;
    }

    /**
     * @param lunes the lunes to set
     */
    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    /**
     * @return the martes
     */
    public String getMartes() {
        return martes;
    }

    /**
     * @param martes the martes to set
     */
    public void setMartes(String martes) {
        this.martes = martes;
    }

    /**
     * @return the miercoles
     */
    public String getMiercoles() {
        return miercoles;
    }

    /**
     * @param miercoles the miercoles to set
     */
    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    /**
     * @return the jueves
     */
    public String getJueves() {
        return jueves;
    }

    /**
     * @param jueves the jueves to set
     */
    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    /**
     * @return the viernes
     */
    public String getViernes() {
        return viernes;
    }

    /**
     * @param viernes the viernes to set
     */
    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    /**
     * @return the sabado
     */
    public String getSabado() {
        return sabado;
    }

    /**
     * @param sabado the sabado to set
     */
    public void setSabado(String sabado) {
        this.sabado = sabado;
    }

    /**
     * @return the domingo
     */
    public String getDomingo() {
        return domingo;
    }

    /**
     * @param domingo the domingo to set
     */
    public void setDomingo(String domingo) {
        this.domingo = domingo;
    }

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
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
     * @return the ordenanza
     */
    public String getOrdenanza() {
        return ordenanza;
    }

    /**
     * @param ordenanza the ordenanza to set
     */
    public void setOrdenanza(String ordenanza) {
        this.ordenanza = ordenanza;
    }

    /**
     * @return the fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the laboratorio
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    /**
     * @return the notificacion
     */
    public String getNotificacion() {
        return notificacion;
    }

    /**
     * @param notificacion the notificacion to set
     */
    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

   

    

    
    
    
    
    private String idHorario;
    private String lunes;
    private String martes; 
    private String miercoles;
    private String jueves;
    private String viernes;
    private String sabado;
    private String domingo;
    private String fechaInicio;
    private String fechaFin;
    private String horaInicio; 
    private String horaFin;
    private String nombre;
    private String ordenanza;
    private String fechaCreacion;
    private String laboratorio;
    private String notificacion;
    
    public String consultaCrediencial(String link) {
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()

        return elJson;
    }

    public void InsertarUsuario(String api, String idHorario, String lunes, String martes, String miercoles, String jueves,String viernes,String sabado,String domingo,String fechaInicio,
            String fechaFin,String horaInicio,String horaFin,String nombre,String ordenanza,String  fechaCreacion,String laboratorio,String notificacion) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idHorario", idHorario);
        objeto.put("lunes", lunes);
        objeto.put("martes", martes);
        objeto.put("miercoles", miercoles);
        objeto.put("jueves", jueves);
        objeto.put("viernes", viernes);
        objeto.put("sabado", sabado);
        objeto.put("domingo", domingo);
        objeto.put("fechaInicio", fechaInicio);
        objeto.put("fechaFin", fechaFin);
        objeto.put("horaInicio", horaInicio);
        objeto.put("horaFin", horaFin);
        objeto.put("nombre", nombre);
        objeto.put("ordenanza", ordenanza);
        objeto.put("fechaCreacion", fechaCreacion);
        objeto.put("laboratorio", laboratorio);
        objeto.put("notificacion", notificacion);
                
        rest.sentenciaAccion(api, objeto);
        

    }
    public void ActulizarDatos(String api, String idHorario, String lunes, String martes, String miercoles, String jueves,String viernes,String sabado,String domingo,String fechaInicio,
            String fechaFin,String horaInicio,String horaFin,String nombre,String ordenanza,String  fechaCreacion,String laboratorio,String notificacion) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

         objeto.put("idHorario", idHorario);
        objeto.put("lunes", lunes);
        objeto.put("martes", martes);
        objeto.put("miercoles", miercoles);
        objeto.put("jueves", jueves);
        objeto.put("viernes", viernes);
        objeto.put("sabado", sabado);
        objeto.put("domingo", domingo);
        objeto.put("fechaInicio", fechaInicio);
        objeto.put("fechaFin", fechaFin);
        objeto.put("horaInicio", horaInicio);
        objeto.put("horaFin", horaFin);
        objeto.put("nombre", nombre);
        objeto.put("ordenanza", ordenanza);
          objeto.put("fechaCreacion", fechaCreacion);
        objeto.put("laboratorio", laboratorio);
        objeto.put("notificacion", notificacion);
        
        rest.sentenciaAccion(api, objeto);
        

    }
     public void EliminarDatos(String api, String id) throws JSONException, IOException {
        RESThttp rest= new RESThttp();
        JSONObject objeto = new JSONObject();

        objeto.put("idHorario", id);
        
        
        rest.sentenciaAccion(api, objeto);
        

    }
    
    
}
