package mx.cfe.ssb.vmc.burocredito.model;

import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class EM {

    private String identificador;
    private String rfc;
    private String codigoCiudadano;
    private String numeroDun;
    private String compannia;
    private String nombre1;
    private String nombre2;
    private String paterno;
    private String materno;
    private String nacionalidad;
    private String calificacionBancoMex;
    private String banxico1;
    private String banxico2;
    private String banxico3;
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
    private String claveCosolidacion;

    public EM() {
        identificador = "EM";
        rfc = "";
        codigoCiudadano = "";
        numeroDun = "";
        compannia = "";
        nombre1 = "";
        nombre2 = "";
        paterno = "";
        materno = "";
        nacionalidad = "";
        calificacionBancoMex = "";
        banxico1 = "";
        banxico2 = "";
        banxico3 = "";
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
        claveCosolidacion = "";
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public String getCompannia() {
        return compannia;
    }

    public void setCompannia(String compannia) {
        this.compannia = compannia;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        if (nombre2.length() < 2) {
            return "";
        }
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCalificacionBancoMex() {
        return calificacionBancoMex;
    }

    public void setCalificacionBancoMex(String calificacionBancoMex) {
        this.calificacionBancoMex = calificacionBancoMex;
    }

    public String getBanxico1() {
        return banxico1;
    }

    public void setBanxico1(String banxico1) {
        this.banxico1 = banxico1;
    }

    public String getBanxico2() {
        return banxico2;
    }

    public void setBanxico2(String banxico2) {
        this.banxico2 = banxico2;
    }

    public String getBanxico3() {
        return banxico3;
    }

    public void setBanxico3(String banxico3) {
        this.banxico3 = banxico3;
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

    public String getClaveCosolidacion() {
        return claveCosolidacion;
    }

    public void setClaveCosolidacion(String claveCosolidacion) {
        this.claveCosolidacion = claveCosolidacion;
    }

    @Override
    public String toString() {
        if ("2".equals(tipoCliente) && materno.length() < 2) {
            this.materno = "NO PROPORCIONADO";
        }
        String cadena = "";
        cadena += identificador + identificador
                + "00" + Util.cadenaLlenaEspacios(rfc, 13)
                + "01" + Util.cadenaLlenaEspacios(codigoCiudadano, 18)
                + "02" + Util.cadenaLlenaCaracter("", "0", 10)
                + "03" + Util.cadenaLlenaEspacios(compannia, 150)
                + "04" + Util.cadenaLlenaEspacios(nombre1, 30)
                + "05" + Util.cadenaLlenaEspacios(nombre2, 30)
                + "06" + Util.cadenaLlenaEspacios(paterno, 25)
                + "07" + Util.cadenaLlenaEspacios(materno, 25)
                + "08" + Util.cadenaLlenaEspacios(nacionalidad, 2)
                + "09" + Util.cadenaLlenaEspacios(calificacionBancoMex, 2)
                + "10" + Util.cadenaLlenaNumerico(banxico1, 11)
                + "11" + Util.cadenaLlenaNumerico(banxico2, 11)
                + "12" + Util.cadenaLlenaNumerico(banxico3, 11)
                + "13" + Util.cadenaLlenaEspacios(direccion1, 40)
                + "14" + Util.cadenaLlenaEspacios(direccion2, 40)
                + "15" + Util.cadenaLlenaEspacios(coloniaPoblacion, 60)
                + "16" + Util.cadenaLlenaEspacios(delegacionMunicipio, 40)
                + "17" + Util.cadenaLlenaEspacios(ciudad, 40)
                + "18" + Util.cadenaLlenaEspacios(estado, 4)
                + "19" + Util.cadenaLlenaEspacios(cp, 10)
                + "20" + Util.cadenaLlenaEspacios(telefono, 11)
                + "21" + Util.cadenaLlenaEspacios(extension, 8)
                + "22" + Util.cadenaLlenaEspacios(fax, 11)
                + "23" + Util.cadenaLlenaNumerico(tipoCliente, 1)
                + "24" + Util.cadenaLlenaEspacios(estadoExtranjero, 40)
                + "25" + Util.cadenaLlenaEspacios(pais, 2)
                + "26" + Util.cadenaLlenaNumerico(claveCosolidacion, 8)
                + "27" + Util.cadenaLlenaEspacios("", 87);

        return cadena;
    }

    public String toStringCSV() {
        String cadena = "";
        cadena += identificador + ","
                + rfc + ","
                + codigoCiudadano + ","
                + Util.cadenaLlenaCaracter("", "0", 10) + ","
                + compannia + ","
                + nombre1 + ","
                + nombre2 + ","
                + paterno + ","
                + materno + ","
                + nacionalidad + ","
                + calificacionBancoMex + ","
                + banxico1 + ","
                + banxico2 + ","
                + banxico3 + ","
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
                + pais + ","
                + claveCosolidacion + ",,";

        return cadena;
    }

}
