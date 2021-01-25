package mx.cfe.ssb.vmc.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @version 1.0
 * @date 08/02/2018
 */
@XmlRootElement
public class Servidor {
    
    private String id;
    private String nombre;
    private String ip;
    private String puerto;
    private String baseDatos;
    private String usuario;
    private String contrasenna;
    private String servidor;

    public Servidor() {
        id = "";
        nombre = "";
        ip = "";
        puerto = "";
        baseDatos = "";
        usuario = "";
        contrasenna = "";
        servidor = "";
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlElement
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @XmlElement
    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    @XmlElement
    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }

    @XmlElement
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @XmlElement
    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    @XmlElement
    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String cadenaConexion(){
        String cadena = "";
        switch(servidor){
            case "MSSQL":
                cadena = "jdbc:sqlserver://" + ip + ":" + puerto + ";databaseName=" 
                        + baseDatos + ";user=" + usuario + ";password=" + contrasenna;
                break;
            case "MYSQL":
                break;
        }
        return cadena;
    }
    
}
