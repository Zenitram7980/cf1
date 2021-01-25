package mx.cfe.ssb.vmc.burocredito.model;

import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class DE {

    private String identificador;
    private String rfcEmpresa;
    private String contrato;
    private String diasVencimiento;
    private String cantidad;
    private String intereses;

    public DE() {
        identificador = "DE";
        rfcEmpresa = "";
        contrato = "";
        diasVencimiento = "";
        cantidad = "";
        intereses = "";
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getRfcEmpresa() {
        return rfcEmpresa;
    }

    public void setRfcEmpresa(String rfcEmpresa) {
        this.rfcEmpresa = rfcEmpresa;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getDiasVencimiento() {
        return diasVencimiento;
    }

    public void setDiasVencimiento(String diasVencimiento) {
        this.diasVencimiento = diasVencimiento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += identificador + identificador
                + "00" + Util.cadenaLlenaEspacios(rfcEmpresa, 13)
                + "01" + Util.cadenaLlenaEspacios(contrato, 25)
                + "02" + Util.cadenaLlenaNumerico(diasVencimiento, 3)
                + "03" + Util.cadenaLlenaNumerico(cantidad, 20)
                + "04" + Util.cadenaLlenaNumerico(intereses, 20)
                + "05" + Util.cadenaLlenaEspacios("", 53);

        return cadena;
    }

    public String toStringCSV() {
        String cadena = "";
        cadena += identificador + ","
                + rfcEmpresa + ","
                + contrato + ","
                + diasVencimiento + ","
                + cantidad + ","
                + intereses + ",,";

        return cadena;
    }
}