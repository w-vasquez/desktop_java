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
public class mostrarHorarios {

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
     * @return the nomHorario
     */
    public String getNomHorario() {
        return nomHorario;
    }

    /**
     * @param nomHorario the nomHorario to set
     */
    public void setNomHorario(String nomHorario) {
        this.nomHorario = nomHorario;
    }

    /**
     * @return the nomUsuario
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * @param nomUsuario the nomUsuario to set
     */
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

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
     * @return the fCrea
     */
    public String getfCrea() {
        return fCrea;
    }

    /**
     * @param fCrea the fCrea to set
     */
    public void setfCrea(String fCrea) {
        this.fCrea = fCrea;
    }

    /**
     * @return the fIni
     */
    public String getfIni() {
        return fIni;
    }

    /**
     * @param fIni the fIni to set
     */
    public void setfIni(String fIni) {
        this.fIni = fIni;
    }

    /**
     * @return the fFin
     */
    public String getfFin() {
        return fFin;
    }

    /**
     * @param fFin the fFin to set
     */
    public void setfFin(String fFin) {
        this.fFin = fFin;
    }

    /**
     * @return the hIni
     */
    public String gethIni() {
        return hIni;
    }

    /**
     * @param hIni the hIni to set
     */
    public void sethIni(String hIni) {
        this.hIni = hIni;
    }

    /**
     * @return the hFin
     */
    public String gethFin() {
        return hFin;
    }

    /**
     * @param hFin the hFin to set
     */
    public void sethFin(String hFin) {
        this.hFin = hFin;
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
     * @return the nomLab
     */
    public String getNomLab() {
        return nomLab;
    }

    /**
     * @param nomLab the nomLab to set
     */
    public void setNomLab(String nomLab) {
        this.nomLab = nomLab;
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
    private String nomHorario;
    private String nomUsuario; 

    public String getApeUsuario() {
        return apeUsuario;
    }

    public void setApeUsuario(String apeUsuario) {
        this.apeUsuario = apeUsuario;
    }
    private String apeUsuario; 
    private String idOrdenanza;
    private String fCrea;
    private String fIni;
    private String fFin;
    private String hIni;
    private String hFin;
    private String idLaboratorio;
    private String nomLab; 
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private String sabado;
    private String domingo;
    private String notificacion;
    public String consultaCrediencial(String link) {
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()

        return elJson;
    }
    
    
    
   
    
}
