package mx.cfe.ssb.vmc.burocredito.model;

import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class TS {

    private String identificador;
    private String numeroCompanias;
    private String cantidad;

    public TS() {
        identificador = "TS";
        numeroCompanias = "";
        cantidad = "";
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNumeroCompanias() {
        return numeroCompanias;
    }

    public void setNumeroCompanias(String numeroCompanias) {
        this.numeroCompanias = numeroCompanias;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        cadena += identificador + identificador
                + "00" + Util.cadenaLlenaNumerico(numeroCompanias, 7)
                + "01" + Util.cadenaLlenaNumerico(cantidad, 30)
                + "02" + Util.cadenaLlenaEspacios("", 53);

        return cadena;
    }

    public String toStringCSV() {
        String cadena = "";
        cadena += identificador + ","
                + numeroCompanias + ","
                + cantidad + ","
                + "" + ",";

        return cadena;
    }

}
