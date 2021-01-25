package mx.cfe.ssb.vmc.burocredito.model;

import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class AV {

    private String identificador;
    private String rfcAval;
    private String codigoCiudadano;
    private String numeroDun;                // revisar
    private String nombreCia;
    private String nombre1;
    private String nombre2;
    private String paterno;
    private String materno;
    private String direccion1;
    private String direccion2;
    private String coloniaPoblacion;
    private String delegacionMunicipio;
    private String ciudad;
    private String estado;
    private String cp;
    private String telefono;
    private String extension;
    private String fax;
    private String tipoCliente;
    private String estadoExtranjero;
    private String pais;

    public AV() {
        identificador = "AV";
        rfcAval = "";
        codigoCiudadano = "";
        numeroDun = "";
        nombreCia = "";
        nombre1 = "";
        nombre2 = "";
        paterno = "";
        materno = "";
        direccion1 = "";
        direccion2 = "";
        coloniaPoblacion = "";
        delegacionMunicipio = "";
        ciudad = "";
        estado = "";
        cp = "";
        telefono = "";
        extension = "";
        fax = "";
        tipoCliente = "";
        estadoExtranjero = "";
        pais = "";
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getRfcAval() {
        return rfcAval;
    }

    public void setRfcAval(String rfcAval) {
        this.rfcAval = rfcAval;
    }

    public String getCodigoCiudadano() {
        return codigoCiudadano;
    }

    public void setCodigoCiudadano(String codigoCiudadano) {
        this.codigoCiudadano = codigoCiudadano;
    }

    public String getNumeroDun() {
        return numeroDun;
    }

    public void setNumeroDun(String numeroDun) {
        this.numeroDun = numeroDun;
    }

    public String getNombreCia() {
        return nombreCia;
    }

    public void setNombreCia(String nombreCia) {
        this.nombreCia = nombreCia;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getColoniaPoblacion() {
        return coloniaPoblacion;
    }

    public void setColoniaPoblacion(String coloniaPoblacion) {
        this.coloniaPoblacion = coloniaPoblacion;
    }

    public String getDelegacionMunicipio() {
        return delegacionMunicipio;
    }

    public void setDelegacionMunicipio(String delegacionMunicipio) {
        this.delegacionMunicipio = delegacionMunicipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getEstadoExtranjero() {
        return estadoExtranjero;
    }

    public void setEstadoExtranjero(String estadoExtranjero) {
        this.estadoExtranjero = estadoExtranjero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        if (direccion1.equals("")) {
            return "";
        }
        String cadena = "";
        cadena += identificador + identificador
                + "00" + Util.cadenaLlenaEspacios(rfcAval, 13)
                + "01" + Util.cadenaLlenaEspacios(codigoCiudadano, 18)
                + "02" + Util.cadenaLlenaCaracter("", "0", 10)
                + "03" + Util.cadenaLlenaEspacios(nombreCia, 150)
                + "04" + Util.cadenaLlenaEspacios(nombre1, 30)
                + "05" + Util.cadenaLlenaEspacios(nombre2, 30)
                + "06" + Util.cadenaLlenaEspacios(paterno, 25)
                + "07" + Util.cadenaLlenaEspacios(materno, 25)
                + "08" + Util.cadenaLlenaEspacios(direccion1, 40)
                + "09" + Util.cadenaLlenaEspacios(direccion2, 40)
                + "10" + Util.cadenaLlenaEspacios(coloniaPoblacion, 60)
                + "11" + Util.cadenaLlenaEspacios(delegacionMunicipio, 40)
                + "12" + Util.cadenaLlenaEspacios(ciudad, 40)
                + "13" + Util.cadenaLlenaEspacios(estado, 4)
                + "14" + Util.cadenaLlenaEspacios(cp, 10)
                + "15" + Util.cadenaLlenaEspacios(telefono, 11)
                + "16" + Util.cadenaLlenaEspacios(extension, 8)
                + "17" + Util.cadenaLlenaEspacios(fax, 11)
                + "18" + Util.cadenaLlenaEspacios(tipoCliente, 1)
                + "19" + Util.cadenaLlenaEspacios(estadoExtranjero, 40)
                + "20" + Util.cadenaLlenaEspacios(pais, 2)
                + "21" + Util.cadenaLlenaEspacios("", 94);

        return cadena;
    }

    public String ToStringCSV() {
        String cadena = "";

        cadena += identificador + ","
                + rfcAval + ","
                + codigoCiudadano + ","
                + Util.cadenaLlenaCaracter("", "0", 10) + ","
                + nombreCia + ","
                + nombre1 + ","
                + nombre2 + ","
                + paterno + ","
                + materno + ","
                + direccion1 + ","
                + direccion2 + ","
                + coloniaPoblacion + ","
                + delegacionMunicipio + ","
                + ciudad + ","
                + estado + ","
                + cp + ","
                + telefono + ","
                + extension + ","
                + fax + ","
                + tipoCliente + ","
                + estadoExtranjero + ","
                + pais + ",,";

        return cadena;
    }

    
}
