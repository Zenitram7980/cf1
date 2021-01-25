package mx.cfe.ssb.vmc.burocredito.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class InformacionCredito {

    private HD hd;
    private List<Servicio> servicios;
    private TS ts;

    public InformacionCredito() {
        hd = new HD();
        servicios = new ArrayList<Servicio>();
        ts = new TS();
    }

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public TS getTs() {
        llenarTS();
        return ts;
    }

    public void setTs(TS ts) {
        this.ts = ts;
    }

    public void llenarTS() {
        long cantidad = 0;
        int numero = 0;
        for (Servicio ser : servicios) {
            numero++;
            if (ser.cr.getSaldoInicial().length() > 0) {
                cantidad += Long.parseLong(ser.cr.getSaldoInicial());
            }
        }

        ts.setCantidad(String.valueOf(cantidad));
        ts.setNumeroCompanias(String.valueOf(numero));
    }

    @Override
    public String toString() {
        llenarTS();

        String cadena = "";
        cadena += hd.toString();
        for (Servicio ser : servicios) {
            cadena += ser.toString();
        }
        cadena += ts.toString();

        return cadena;
    }

    public String toStringCSV() {
        llenarTS();

        String cadena = "";
        cadena += hd.toStringCSV();
        for (Servicio ser : servicios) {
            cadena += "\n" + ser.toStringCSV();
        }
        cadena += ts.toStringCSV();

        return cadena;
    }
}
