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
 * @date 08/02/2018
 */
@XmlRootElement
public class Servidores {
    private String version;
    private List<Servidor> servidor;

    public Servidores() {
        version = "1.0";
        servidor = new ArrayList<>();
    }

    @XmlAttribute
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlElement
    public List<Servidor> getServidor() {
        return servidor;
    }

    public void setServidor(List<Servidor> servidor) {
        this.servidor = servidor;
    }
    
}
