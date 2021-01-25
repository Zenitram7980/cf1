package mx.cfe.ssb.vmc.burocredito.model;

import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class HD {

    private String identificador;            // HD
    private String identificadorSegmento;    // BNCPM
    private String institucion;              // 00 CLAVE DEL USUARIO
    private String instAnt;                  // 01 CLAVE DEL USUARIO ANTERIOR
    private String tipoInstitucion;          // 02 TIPO USUARIO 
    private String formato;                  // 03 TIPO DE FORMATO
    private String fecha;                    // 04 FECHA DE REPORTE DE INFORMACION
    private String periodo;                  // 05 PERIODO
    private String version;                  // 06 VERSION
    private String nombreOtorgante;          // 07 NOMBRE DEL OTORGANTE         AGREGADO 2018/05 - VERSION 05 
    
    public HD() {
        identificador = "HD";
        identificadorSegmento = "BNCPM";
        institucion = "2777";
        instAnt = "0000";
        tipoInstitucion = "012";
        formato = "1";
        fecha = "04112015";
        periodo = "102015";
        version = "03";
        nombreOtorgante = "";
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificadorSegmento() {
        return identificadorSegmento;
    }

    public void setIdentificadorSegmento(String identificadorSegmento) {
        this.identificadorSegmento = identificadorSegmento;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getInstAnt() {
        return instAnt;
    }

    public void setInstAnt(String instAnt) {
        this.instAnt = instAnt;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNombreOtorgante() {
        return nombreOtorgante;
    }

    public void setNombreOtorgante(String nombreOtorgante) {
        this.nombreOtorgante = nombreOtorgante;
    }
    
    

    @Override
    public String toString() {
        String cadena = "";
        cadena += identificador + identificadorSegmento
                + "00" + institucion
                + "01" + instAnt
                + "02" + tipoInstitucion
                + "03" + formato
                //+ "04" + Util.fechaActual()
                + "04" + Util.fechaUltimoDiaPeriodoReportado()
                + "05" + Util.fechaMesAnterior()
                + "06" + version
                + "07" + Util.cadenaLlenaEspacios(nombreOtorgante, 75)
                + "08" + Util.cadenaLlenaEspacios("", 52);
        return cadena;
    }

    public String toStringCSV() {
        String cadena = "";
        cadena += identificador + ","
                + institucion + ","
                + instAnt + ","
                + tipoInstitucion + ","
                + formato + ","
                + Util.fechaActual() + ","
                + Util.fechaMesAnterior() + ","
                + version + ","
                + nombreOtorgante + ",";
        return cadena;
    }

}
