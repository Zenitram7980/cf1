package mx.cfe.ssb.vmc.model;

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
public class General {

    private String id;
    private String identificadorSegmento;
    private String claveUsuario;
    private String claveUsuarioAnterior;
    private String tipoUsuario;
    private String formato;
    private String version;
    private String nombreOtorgante;

    private String nacionalidad;
    private String banxico;
    private String pais;

    private String plazo;
    private String tipoCredito;
    private String moneda;
    private String numeroPagos;
    private String frecuenciaPagos;

    public General() {
        id = "";
        identificadorSegmento = "";
        claveUsuario = "";
        claveUsuarioAnterior = "";
        tipoUsuario = "";
        formato = "";
        version = "";
        nombreOtorgante = "";

        nacionalidad = "";
        banxico = "";
        pais = "";

        plazo = "";
        tipoCredito = "";
        moneda = "";
        numeroPagos = "";
        frecuenciaPagos = "";
    }

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement
    public String getIdentificadorSegmento() {
        return identificadorSegmento;
    }

    public void setIdentificadorSegmento(String identificadorSegmento) {
        this.identificadorSegmento = identificadorSegmento;
    }

    @XmlElement
    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    @XmlElement
    public String getClaveUsuarioAnterior() {
        return claveUsuarioAnterior;
    }

    public void setClaveUsuarioAnterior(String claveUsuarioAnterior) {
        this.claveUsuarioAnterior = claveUsuarioAnterior;
    }

    @XmlElement
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @XmlElement
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @XmlElement
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlElement
    public String getNombreOtorgante() {
        return nombreOtorgante;
    }

    public void setNombreOtorgante(String nombreOtorgante) {
        this.nombreOtorgante = nombreOtorgante;
    }

    @XmlElement
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @XmlElement
    public String getBanxico() {
        return banxico;
    }

    public void setBanxico(String banxico) {
        this.banxico = banxico;
    }

    @XmlElement
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @XmlElement
    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    @XmlElement
    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    @XmlElement
    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @XmlElement
    public String getNumeroPagos() {
        return numeroPagos;
    }

    public void setNumeroPagos(String numeroPagos) {
        this.numeroPagos = numeroPagos;
    }

    @XmlElement
    public String getFrecuenciaPagos() {
        return frecuenciaPagos;
    }

    public void setFrecuenciaPagos(String frecuenciaPagos) {
        this.frecuenciaPagos = frecuenciaPagos;
    }

    @Override
    public String toString() {
        return "General{" + "id=" + id + ", identificadorSegmento=" + identificadorSegmento + ", claveUsuario=" + claveUsuario + ", claveUsuarioAnterior=" + claveUsuarioAnterior + ", tipoUsuario=" + tipoUsuario + ", formato=" + formato + ", version=" + version + ", nombreOtorgante=" + nombreOtorgante + ", nacionalidad=" + nacionalidad + ", banxico=" + banxico + ", pais=" + pais + ", plazo=" + plazo + ", tipoCredito=" + tipoCredito + ", moneda=" + moneda + ", numeroPagos=" + numeroPagos + ", frecuenciaPagos=" + frecuenciaPagos + '}';
    }
    
    
}
