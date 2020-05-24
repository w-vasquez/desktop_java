package tablas;


import Datos.RESThttp;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;


public class Usuario {
    private int idUsuario;
    private String idTipoUsuario;
    private String nombre;
    private String apellido ;
    private String f_noc ;
    private String correo ;
    private String estado ;
    private String telefono ;
    private String password;
    
    

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(String idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getF_noc() {
        return f_noc;
    }

    public void setF_noc(String f_noc) {
        this.f_noc = f_noc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }  

    //Consulta a la API
    public String consultaCrediencial(String link){
        // link = getUrl()+getParametros();
        RESThttp rest = new RESThttp();
        String elJson = rest.sentenciaSelect(link);
        //usuario.getLink().toString()
        
        
        return elJson;
    }
    

    public String mostrarDatos(String api)
    {
        RESThttp rest =new RESThttp();
        String elJson=rest.sentenciaSelect(api);
        
        return elJson;
    }
    
    public void InsertarDatos(String api,String id,String idtipo,String nombre,String apellido,String fec,String correo ,String estado ,String telefono ,String pass) throws JSONException, IOException
    {
        RESThttp rest =new RESThttp();
          
        //{"idUsuario":"1","idTipoUsuario":"1","nombre":"Wilfredo","apellido":"Vasquez","f_noc":"2020-05-12",
        //"correo":"2740882018@mail.utec.edu.sv","estado":"Activo","telefono":"77877658","password":"123"
       JSONObject objeto = new JSONObject();
        objeto.put("idUsuario", id);
        objeto.put("idTipoUsuario", idtipo);
        objeto.put("nombre", nombre);
        objeto.put("apellido", apellido);
        objeto.put("f_noc", fec);
        objeto.put("correo", correo);
        objeto.put("estado", estado);
        objeto.put("telefono", telefono);
        objeto.put("password", pass);

        
        rest.sentenciaAccion(api,objeto);
    }
    
    
}
