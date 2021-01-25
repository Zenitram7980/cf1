package mx.cfe.ssb.vmc.burocredito.util;

import mx.cfe.ssb.vmc.burocredito.dao.Archivos;
import mx.cfe.ssb.vmc.burocredito.model.Servicio;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 29/01/2018
 */
public class Validar {

    public static boolean validarServicio(Servicio ser, Archivos archivo) {

        if ("".equals(ser.em.getRfc())) {
            archivo.escribirLinea(ser.cr.getContrato() + ",RFC Vacio,");
            return false;
        } else if (!"1".equals(ser.em.getTipoCliente()) && !"2".equals(ser.em.getTipoCliente())) {
            archivo.escribirLinea(ser.cr.getContrato() + ",Tipo de Cliente invalido (Solo 1 y 2)," + ser.cr.getTipoCredito());
            return false;
        } else if ("1".equals(ser.em.getTipoCliente()) && ser.em.getRfc().length() < 9) { // Moral
            archivo.escribirLinea(ser.cr.getContrato() + ",RFC menor a 9 caracteres," + ser.em.getRfc());
            return false;
        } else if ("2".equals(ser.em.getTipoCliente()) && ser.em.getRfc().length() < 10) { // Fisica
            archivo.escribirLinea(ser.cr.getContrato() + ",RFC menor a 12 caracteres," + ser.em.getRfc());
            return false;
        } else if ("1".equals(ser.em.getTipoCliente()) && ser.em.getCompannia().length() < 3) { // Moral
            archivo.escribirLinea(ser.cr.getContrato() + ",El nombre de la compañia no es valida (Debe contener minimo 3 caracteres)," + ser.em.getCompannia());
            return false;
        } else if ("2".equals(ser.em.getTipoCliente()) && ser.em.getNombre1().length() == 0) { // Fisica
            archivo.escribirLinea(ser.cr.getContrato() + ",El Nombre no es valido (Tipo de cliente Persona Moral)," + ser.em.getNombre1());
            return false;
        } else if ("2".equals(ser.em.getTipoCliente()) && ser.em.getPaterno().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",El Apellido Paterno no es valido," + ser.em.getPaterno());
            return false;
            //} else if ("2".equals(ser.em.getTipoCliente()) && ser.em.getMaterno().length() == 0) {
            //    archivo.escribirLinea(ser.cr.getContrato() + ",El Apellido Materno no es valido," + ser.em.getMaterno());
            //    return false;
        } else if (ser.em.getDireccion1().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene una direccion,");
            return false;
        } else if (ser.em.getColoniaPoblacion().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene una colonia (Poblacion),");
            return false;
        } else if (ser.em.getDelegacionMunicipio().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene municipio (Delegacion),");
            return false;
        } else if (ser.em.getCiudad().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene Ciudad,");
            return false;
        } else if (ser.em.getEstado().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene Estado,");
            return false;
        } else if (ser.em.getCp().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene Codigo Postal,");
            return false;
        } else if (ser.cr.getFechaApertura().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene Fecha de Apertura,");
            return false;
        } else if (ser.cr.getFechaUltimoPago().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene Fecha de Ultimo Pago,");
            return false;
        } else if (ser.cr.getFechaPrimerIncum().length() == 0 && !"0".equals(ser.de.getDiasVencimiento())) {
            archivo.escribirLinea(ser.cr.getContrato() + ",Error en la fecha de primer incumplimiento,Tiene " + ser.de.getDiasVencimiento() + " dias de vencimiento y no cuenta con fecha de primer incumplimiento");
            return false;
        } else if (ser.de.getDiasVencimiento().length() == 0) {
            archivo.escribirLinea(ser.cr.getContrato() + ",No contiene dias de vencimiento,");
            return false;
        } else if (!ser.cr.getImportePagos().equals(ser.cr.getSaldoInsoluto())) {
            archivo.escribirLinea(ser.cr.getContrato() + ",El importe y el saldo no coinciden,Importe: " + ser.cr.getImportePagos() + ", Saldo: " + ser.cr.getSaldoInsoluto());
            return false;
        } else if ("0".equals(ser.cr.getSaldoInsoluto()) && !"0".equals(ser.de.getDiasVencimiento())) {
            archivo.escribirLinea(ser.cr.getContrato() + ",Saldo Insoluto 0 y tiene dias de vencimiento,Dias: " + ser.de.getDiasVencimiento());
            return false;
        }

        return true;
    }

    public static String cadenaQuitaCaracteresEspeciales(String cadena) {
        if (cadena == null || "".equals(cadena.trim())) {
            return "";
        }

        cadena = cadena.replaceAll("Á", "A");
        cadena = cadena.replaceAll("É", "E");
        cadena = cadena.replaceAll("Í", "I");
        cadena = cadena.replaceAll("Ó", "O");
        cadena = cadena.replaceAll("Ú", "U");
        cadena = cadena.replaceAll("á", "a");
        cadena = cadena.replaceAll("é", "e");
        cadena = cadena.replaceAll("í", "i");
        cadena = cadena.replaceAll("ó", "o");
        cadena = cadena.replaceAll("ú", "u");
        //cadena = cadena.replaceAll("ñ", "n");
        //cadena = cadena.replaceAll("Ñ", "N");
        cadena = cadena.replaceAll("[^a-zA-Z0-9\\.\\-\\(\\)]", " ");
        cadena = cadena.toUpperCase();

        return cadena;
    }

    private boolean validarRfc(String rfc, String tipo) {
        boolean res = true;
        if ("1".equals(tipo)) { // MORAL TSA020210R43
            char[] caracteres = rfc.toCharArray();
            if (rfc.length() < 9) {
                return false;
            } else if (Character.isLetter(caracteres[0])) {
                return false;
            } else if (Character.isLetter(caracteres[1])) {
                return false;
            } else if (Character.isLetter(caracteres[2])) {
                return false;
            } else if (Character.isDigit(caracteres[3])) {
                return false;
            } else if (Character.isDigit(caracteres[4])) {
                return false;
            } else if (Character.isDigit(caracteres[5])) {
                return false;
            } else if (Character.isDigit(caracteres[6])) {
                return false;
            } else if (Character.isDigit(caracteres[7])) {
                return false;
            } else if (Character.isDigit(caracteres[8])) {
                return false;
            }

        } else if ("2".equals(tipo)) { //FISICA  BANA850910T97
            char[] caracteres = rfc.toCharArray();
            if (rfc.length() < 9) {
                return false;
            } else if (Character.isLetter(caracteres[0])) {
                return false;
            } else if (Character.isLetter(caracteres[1])) {
                return false;
            } else if (Character.isLetter(caracteres[2])) {
                return false;
            } else if (Character.isLetter(caracteres[3])) {
                return false;
            } else if (Character.isDigit(caracteres[4])) {
                return false;
            } else if (Character.isDigit(caracteres[5])) {
                return false;
            } else if (Character.isDigit(caracteres[6])) {
                return false;
            } else if (Character.isDigit(caracteres[7])) {
                return false;
            } else if (Character.isDigit(caracteres[8])) {
                return false;
            }
        } else {
            res = false;
        }
        return res;
    }
}
