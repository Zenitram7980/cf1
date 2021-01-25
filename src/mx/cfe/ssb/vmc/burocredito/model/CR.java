package mx.cfe.ssb.vmc.burocredito.model;

import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class CR {

    private String identificador;
    private String rfcEmpresa;
    private String numeroExperiencias;
    private String contrato;
    private String contratoAnterior;
    private String fechaApertura;
    private String plazo;
    private String tipoCredito;
    private String saldoInicial;
    private String moneda;
    private String numeroPagos;
    private String frecuenciaPagos;
    private String importePagos;
    private String fechaUltimoPago;
    private String fechaReestructura;
    private String pagoEfectivo;
    private String fechaLiquidacion;
    private String quita;
    private String dacion;
    private String quebranto;
    private String observaciones;
    private String especiales;
    private String fechaPrimerIncum;
    private String saldoInsoluto;
    
    private String creditoMaximoUtilizado;
    private String fechaIngresoCarteraVencida;
    

    public CR() {
        identificador = "CR";
        rfcEmpresa = "";
        numeroExperiencias = "";
        contrato = "";
        contratoAnterior = "";
        fechaApertura = "";
        plazo = "";
        tipoCredito = "";
        saldoInicial = "";
        moneda = "";
        numeroPagos = "";
        frecuenciaPagos = "";
        importePagos = "";
        fechaUltimoPago = "";
        fechaReestructura = "";
        pagoEfectivo = "";
        fechaLiquidacion = "";
        quita = "";
        dacion = "";
        quebranto = "";
        observaciones = "";
        especiales = "";
        fechaPrimerIncum = "";
        saldoInsoluto = "";
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

    public String getNumeroExperiencias() {
        return numeroExperiencias;
    }

    public void setNumeroExperiencias(String numeroExperiencias) {
        this.numeroExperiencias = numeroExperiencias;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getContratoAnterior() {
        return contratoAnterior;
    }

    public void setContratoAnterior(String contratoAnterior) {
        this.contratoAnterior = contratoAnterior;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public String getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(String saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getNumeroPagos() {
        return numeroPagos;
    }

    public void setNumeroPagos(String numeroPagos) {
        this.numeroPagos = numeroPagos;
    }

    public String getFrecuenciaPagos() {
        return frecuenciaPagos;
    }

    public void setFrecuenciaPagos(String frecuenciaPagos) {
        this.frecuenciaPagos = frecuenciaPagos;
    }

    public String getImportePagos() {
        return importePagos;
    }

    public void setImportePagos(String importePagos) {
        this.importePagos = importePagos;
    }

    public String getFechaUltimoPago() {
        return fechaUltimoPago;
    }

    public void setFechaUltimoPago(String fechaUltimoPago) {
        this.fechaUltimoPago = fechaUltimoPago;
    }

    public String getFechaReestructura() {
        return fechaReestructura;
    }

    public void setFechaReestructura(String fechaReestructura) {
        this.fechaReestructura = fechaReestructura;
    }

    public String getPagoEfectivo() {
        return pagoEfectivo;
    }

    public void setPagoEfectivo(String pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    public String getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    public void setFechaLiquidacion(String fechaLiquidacion) {
        this.fechaLiquidacion = fechaLiquidacion;
    }

    public String getQuita() {
        return quita;
    }

    public void setQuita(String quita) {
        this.quita = quita;
    }

    public String getDacion() {
        return dacion;
    }

    public void setDacion(String dacion) {
        this.dacion = dacion;
    }

    public String getQuebranto() {
        return quebranto;
    }

    public void setQuebranto(String quebranto) {
        this.quebranto = quebranto;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEspeciales() {
        return especiales;
    }

    public void setEspeciales(String especiales) {
        this.especiales = especiales;
    }

    public String getFechaPrimerIncum() {
        return fechaPrimerIncum;
    }

    public void setFechaPrimerIncum(String fechaPrimerIncum) {
        this.fechaPrimerIncum = fechaPrimerIncum;
    }

    public String getSaldoInsoluto() {
        return saldoInsoluto;
    }

    public void setSaldoInsoluto(String saldoInsoluto) {
        this.saldoInsoluto = saldoInsoluto;
    }

    public String getCreditoMaximoUtilizado() {
        return creditoMaximoUtilizado;
    }

    public void setCreditoMaximoUtilizado(String creditoMaximoUtilizado) {
        this.creditoMaximoUtilizado = creditoMaximoUtilizado;
    }

    public String getFechaIngresoCarteraVencida() {
        return fechaIngresoCarteraVencida;
    }

    public void setFechaIngresoCarteraVencida(String fechaIngresoCarteraVencida) {
        this.fechaIngresoCarteraVencida = fechaIngresoCarteraVencida;
    }
    
    
    
    @Override
    public String toString() {
        String cadena = "";
        cadena += identificador + identificador
                + "00" + Util.cadenaLlenaEspacios(rfcEmpresa, 13)
                + "01" + Util.cadenaLlenaNumerico(numeroExperiencias, 6)
                + "02" + Util.cadenaLlenaEspacios(contrato, 25)
                + "03" + Util.cadenaLlenaEspacios(contratoAnterior, 25)
                + "04" + Util.cadenaLlenaNumerico(fechaApertura, 8)
                + "05" + Util.cadenaLlenaNumerico(plazo, 6)
                + "06" + Util.cadenaLlenaNumerico(tipoCredito, 4)
                + "07" + Util.cadenaLlenaNumerico(saldoInicial, 20)
                + "08" + Util.cadenaLlenaNumerico(moneda, 3)
                + "09" + Util.cadenaLlenaNumerico(numeroPagos, 4)
                + "10" + Util.cadenaLlenaNumerico(frecuenciaPagos, 5)
                + "11" + Util.cadenaLlenaNumerico(importePagos, 20)
                + "12" + Util.cadenaLlenaNumerico(fechaUltimoPago, 8)
                + "13" + Util.cadenaLlenaNumerico(fechaReestructura, 8)
                + "14" + Util.cadenaLlenaNumerico(pagoEfectivo, 20)
                + "15" + Util.cadenaLlenaNumerico(fechaLiquidacion, 8)
                + "16" + Util.cadenaLlenaNumerico(quita, 20)
                + "17" + Util.cadenaLlenaNumerico(dacion, 20)
                + "18" + Util.cadenaLlenaNumerico(quebranto, 20)
                + "19" + Util.cadenaLlenaEspacios(observaciones, 4)
                + "20" + Util.cadenaLlenaEspacios(especiales, 1)
                + "21" + Util.cadenaLlenaNumerico(fechaPrimerIncum, 8)
                + "22" + Util.cadenaLlenaNumerico(saldoInsoluto, 20)
                + "23" + Util.cadenaLlenaNumerico(creditoMaximoUtilizado, 20)
                + "24" + Util.cadenaLlenaNumerico(fechaIngresoCarteraVencida, 8)
                + "25" + Util.cadenaLlenaEspacios("", 40);
        return cadena;
    }

    public String toStringCSV() {
        String cadena = "";
        cadena += identificador + ","
                + rfcEmpresa + ","
                + numeroExperiencias + ","
                + contrato + ","
                + contratoAnterior + ","
                + fechaApertura + ","
                + plazo + ","
                + tipoCredito + ","
                + saldoInicial + ","
                + moneda + ","
                + numeroPagos + ","
                + frecuenciaPagos + ","
                + importePagos + ","
                + fechaUltimoPago + ","
                + fechaReestructura + ","
                + pagoEfectivo + ","
                + fechaLiquidacion + ","
                + quita + ","
                + dacion + ","
                + quebranto + ","
                + observaciones + ","
                + especiales + ","
                + fechaPrimerIncum + ","
                + saldoInsoluto + ","
                + creditoMaximoUtilizado + ","
                + fechaIngresoCarteraVencida + ",,";

        return cadena;
    }
}
