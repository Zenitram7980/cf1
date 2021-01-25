package mx.cfe.ssb.vmc.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Angel Adonay Basurto Nieto 
 * @version 1.0 
 * @date 08/06/2018 
 */
@XmlRootElement
public class DatosGenerales {

    private String version;
    private List<General> datos;

    public DatosGenerales() {
        version = "";
        datos = new ArrayList<>();
    }
    
    @XmlAttribute
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlElement
    public List<General> getDatos() {
        return datos;
    }

    public void setDatos(List<General> datos) {
        this.datos = datos;
    }

}
