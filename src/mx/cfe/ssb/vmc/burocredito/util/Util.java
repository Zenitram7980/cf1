package mx.cfe.ssb.vmc.burocredito.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class Util {

    private static final SimpleDateFormat FORMATO_NORMAL = new SimpleDateFormat("ddMMyyyy");
    private static final SimpleDateFormat FORMATO_INVERSO = new SimpleDateFormat("yyyyMMdd");
    
    private static final SimpleDateFormat FORMATO_MESANNO = new SimpleDateFormat("MMyyyy");
    
    private static final SimpleDateFormat FORMATO_HORA = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public static String fechaActualHora() {
        return FORMATO_HORA.format(Calendar.getInstance().getTime());
    }
    

    public static String fechaActual() {
        return FORMATO_NORMAL.format(Calendar.getInstance().getTime());
    }

    public static String fechaActualInversa() {
        return FORMATO_INVERSO.format(Calendar.getInstance().getTime());
    }

    public static String fechaUltimoDiaPeriodoReportado() {
        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, -1);
        fecha.set(fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH), fecha.getActualMaximum(Calendar.DAY_OF_MONTH));

        return FORMATO_NORMAL.format(fecha.getTime());
    }

    public static String fechaMesAnterior() {

        Calendar fecha = Calendar.getInstance();
        fecha.add(Calendar.MONTH, -1);

        return FORMATO_MESANNO.format(fecha.getTime());
    }

    public static String cadenaLlenaEspacios(String cadena, int tamano) {
        if(cadena == null){
            cadena = "";
        }
        if (cadena.length() == tamano) {
            return cadena;
        } else if (cadena.length() > tamano) {
            return cadena.substring(0, tamano);
        } else {
            StringBuilder texto = new StringBuilder(cadena);
            for (; texto.length() < tamano;) {
                texto =  new StringBuilder(texto).append(" ");
            }
            return texto.toString();
        }
    }

    public static String cadenaLlenaCaracter(String cadena, String caracter, int tamano) {
        
        if (cadena.length() == tamano) {
            return cadena;
        } else if (cadena.length() > tamano) {
            return cadena.substring(0, tamano);
        } else {
            StringBuilder texto = new StringBuilder(cadena);
            for (; texto.length() < tamano;) {
                texto =  new StringBuilder(caracter).append(texto);
            }
            return texto.toString();
        }
    }
    
    public static String cadenaLlenaNumerico(String cadena, int tamano) {
        if (cadena.length() == tamano) {
            return cadena;
        } else if (cadena.length() > tamano) {
            return cadena.substring(0, tamano);
        } else {
            StringBuilder texto = new StringBuilder(cadena);
            for (; texto.length() < tamano;) {
                texto =  new StringBuilder("0").append(texto);
            }
            return texto.toString();
        }
    }
    
    public static String cadenaFormatoCP(String cp) {
        cp = Validar.cadenaQuitaCaracteresEspeciales(cp).replaceAll(" ", "");
        switch (cp.length()) {
            case 4:
                cp = "0" + cp;
                break;
            case 3:
                cp = "00" + cp;
                break;
            case 2:
                cp = "000" + cp;
                break;
            case 1:
                cp = "0000" + cp;
                break;
            case 0:
                cp = "00000";
                break;
            default:
                break;
        }

        if (cp.length() == 5
                && Character.isDigit(cp.charAt(0))
                && Character.isDigit(cp.charAt(1))
                && Character.isDigit(cp.charAt(2))
                && Character.isDigit(cp.charAt(3))
                && Character.isDigit(cp.charAt(4))) {
            return cp;
        } else {
            return "00000";
        }
    }
    
    /*
    public static String fechaFormatoComprobar(String fecha) {
        fecha = fecha.trim();
        if (fecha.length() != 8) {
            return "";
        }

        int anno = Integer.parseInt(fecha.substring(0, 4));
        int mes = Integer.parseInt(fecha.substring(4, 6));
        int dia = Integer.parseInt(fecha.substring(6, 8));

        System.out.println(anno + "-->" + mes + "-->" + dia);
        
        if (anno > 2009
                && anno <= Calendar.getInstance().get(Calendar.YEAR)
                && mes > 0
                && mes < 13
                && dia > 0
                && dia < 32) {
            if (Convert.ToInt32(fecha) <= Convert.ToInt32(fechaActualInversa())) {
                return fecha;
            } else {
                return "";
            }
        }

        String fechaModificada = fecha.SubString(4, 4) + fecha.SubString(2, 2) + fecha.SubString(0, 2);

        if (Convert.ToInt32(fechaModificada) <= Convert.ToInt32(fechaActualInversa())) {
            return fecha.SubString(4, 4) + fecha.SubString(2, 2) + fecha.SubString(0, 2);
        } else {
            return "";
        }
        *-/
        return "";
    }
/-*
    public static String fechaFormatoComprobarApertura(String fecha) {
        //Console.WriteLine(fecha);

        fecha = fecha.Trim();
        return fecha;
        if (fecha.Length != 8) {
            return "";
        }
        return fecha.SubString(6, 2) + fecha.SubString(4, 2) + fecha.SubString(0, 4);
        /*
            int anno = Convert.ToInt32(fecha.SubString(0, 4));
            int mes = Convert.ToInt32(fecha.SubString(4, 2));
            int dia = Convert.ToInt32(fecha.SubString(6, 2));

            int anoCien = Convert.ToInt32(DateTime.Now.AddYears(-100).ToString("yyyy"));

            if (anno > anoCien 
                && anno <= Convert.ToInt32(DateTime.Now.ToString("yyyy"))
                && mes > 0
                && mes < 13
                && dia > 0
                && dia < 32)
            {
                if (Convert.ToInt32(fecha) <= Convert.ToInt32(fechaActualInversa()))
                {
                    //return fecha;
                    return fecha.SubString(0, 2) + fecha.SubString(2, 2) + fecha.SubString(4, 4);
                }
                else
                {
                    return "";
                }
            }

            String fechaModificada = fecha.SubString(4, 4) + fecha.SubString(2, 2) + fecha.SubString(0, 2);

            if (Convert.ToInt32(fechaModificada) <= Convert.ToInt32(fechaActualInversa()))
            {
                //return fecha.SubString(4, 4) + fecha.SubString(2, 2) + fecha.SubString(0, 2);
                return fecha.SubString(0, 2) + fecha.SubString(2, 2) + fecha.SubString(4, 4);
            }
            else
            {
                return "";
            }
         *--/
    }

    



    

    public static String cadenaQuitaCaracteresEspeciales(String cadena) {
        return cadena.Replace(".", " ").Replace(",", " ").Replace(";", " ").Replace("Á", "A").Replace("É", "E").Replace("Í", "I").Replace("Ó", "O").Replace("Ú", "U").Replace("á", "a").Replace("é", "e").Replace("í", "i").Replace("ó", "o").Replace("ú", "u").Replace("\"", " ").Replace("'", " ").Replace("|", " ").Replace("\\", " ").Replace("/", " ").Replace("°", " ").ToUpper();
    }

    public static String cadenaFormatoDiasVencimiento(String dias) {
        if (dias.Length == 0) {
            return "0";
        } else if (dias.Length == 1) {
            if (Char.IsNumber(dias, 0)) {
                return dias;
            } else {
                return "";
            }
        } else if (dias.Length == 2) {
            if (Char.IsNumber(dias, 0)
                    && Char.IsNumber(dias, 1)) {
                return dias;
            } else {
                return "";
            }
        } else if (dias.Length == 3) {
            if (Char.IsNumber(dias, 0)
                    && Char.IsNumber(dias, 1)
                    && Char.IsNumber(dias, 2)) {
                return dias;
            } else {
                return "";
            }
        } else if (dias.Length > 3) {
            if (Char.IsNumber(dias, 0)
                    && Char.IsNumber(dias, 1)
                    && Char.IsNumber(dias, 2)) {
                return "999";
            } else {
                return "";
            }
        }
        return "";
    }

    public static String cadenaFormatoTelefono(String telefono) {
        telefono = Util.cadenaQuitaCaracteresEspeciales(telefono.Trim().Replace("-", "").Replace("(", "").Replace(")", ""));
        if (telefono.Length < 8) {
            return "";
        } else if (telefono.Length > 11) {
            return telefono.SubString(telefono.Length - 11);
        } else {
            return telefono;
        }
    }

    

    public static String cadenaFormatoRfc(String rfc, String tipo) {

        rfc = cadenaQuitaCaracteresEspeciales(rfc).Replace("-", "").Replace(" ", "");

        if (tipo == "1") {
            if (rfc.Length == 12
                    && (Char.IsLetter(rfc, 0) || rfc.SubString(0, 1) == "&")
                    && (Char.IsLetter(rfc, 1) || rfc.SubString(1, 1) == "&")
                    && (Char.IsLetter(rfc, 2) || rfc.SubString(2, 1) == "&")
                    && Char.IsNumber(rfc, 3)
                    && Char.IsNumber(rfc, 4)
                    && Char.IsNumber(rfc, 5)
                    && Char.IsNumber(rfc, 6)
                    && Char.IsNumber(rfc, 7)
                    && Char.IsNumber(rfc, 8)
                    && Char.IsLetterOrDigit(rfc, 9)
                    && Char.IsLetterOrDigit(rfc, 10)
                    && Char.IsLetterOrDigit(rfc, 11)) {
                //Console.WriteLine("Correcto");
                return rfc;
            } else {
                //Console.WriteLine("Incorrecto");
                return "";
            }
        } else if (tipo == "2") {
            if (rfc.Length == 13
                    && (Char.IsLetter(rfc, 0) || rfc.SubString(0, 1) == "&")
                    && (Char.IsLetter(rfc, 1) || rfc.SubString(1, 1) == "&")
                    && (Char.IsLetter(rfc, 2) || rfc.SubString(2, 1) == "&")
                    && (Char.IsLetter(rfc, 3) || rfc.SubString(3, 1) == "&")
                    && Char.IsNumber(rfc, 4)
                    && Char.IsNumber(rfc, 5)
                    && Char.IsNumber(rfc, 6)
                    && Char.IsNumber(rfc, 7)
                    && Char.IsNumber(rfc, 8)
                    && Char.IsNumber(rfc, 9)
                    && Char.IsLetterOrDigit(rfc, 10)
                    && Char.IsLetterOrDigit(rfc, 11)
                    && Char.IsLetterOrDigit(rfc, 12)) {
                //Console.WriteLine("Correcto");
                return rfc;
            } else {
                //Console.WriteLine("Incorrecto");
                return "";
            }
        }
        return rfc;
    }

    public static bool validarServicio(Servicio ser, String archivo) {

        if (ser.em.RFC == "") {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Error en RFC _ VACIO", archivo);
            return false;
        } else if (ser.em.TipoCliente != "1" && ser.em.TipoCliente != "2") {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Tipo de Cliente invalido", archivo);
            return false;
        } /*
            else if (ser.em.TipoCliente == "1" && ser.em.RFC.Length != 12)
            {
                Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Error en RFC", archivo);
                return false;
            }
            else if (ser.em.TipoCliente == "2" && ser.em.RFC.Length != 13)
            {
                Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Error en RFC", archivo);
                return false;
            }*--/ else if (ser.em.TipoCliente == "1" && ser.em.Compannia.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",El nombre de la compañia no es valida", archivo);
            return false;
        } else if (ser.em.TipoCliente == "2" && (ser.em.Nombre1.Length == 0 || ser.em.Paterno.Length == 0)) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",El nombre no es valido", archivo);
            return false;
        } else if (ser.em.Direccion1.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",No contiene una dirección valida", archivo);
            return false;
        } else if (ser.em.ColoniaPoblacion.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Colonia o población invalida", archivo);
            return false;
        } else if (ser.em.DelegacionMunicipio.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Delegación o Municipio invalida", archivo);
            return false;
        } else if (ser.em.Ciudad.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Validar la ciudad", archivo);
            return false;
        } else if (ser.em.Estado.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Favor de validar el estado", archivo);
            return false;
        } else if (ser.em.CP.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",CP invalido", archivo);
            return false;
        } else if (ser.cr.FechaApertura.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Verificar la Fecha de Apertura", archivo);
            return false;
        } else if (ser.cr.FechaUltimoPago.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Verificar la Fecha del Ultimo Pago", archivo);
            return false;
        } else if (ser.cr.FechaPrimerIncum.Length == 0 && ser.de.DiasVencimiento != "0") {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Verificar la Fecha del Primer Incumplimiento", archivo);
            return false;
        } else if (ser.de.DiasVencimiento.Length == 0) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Dias de vencimiento Erroneos", archivo);
            return false;
        } else if (ser.cr.ImportePagos != ser.cr.SaldoInsoluto) {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",EL importe y el saldo no coinciden", archivo);
            return false;
        } else if (ser.cr.SaldoInsoluto == "0" && ser.de.DiasVencimiento != "0") {
            Archivo.escribeArchivoAppend(ser.cr.Contrato + ",Saldo insoluto 0 y con dias de vencimiento", archivo);
            return false;
        }

        return true;
    }
     */
}
