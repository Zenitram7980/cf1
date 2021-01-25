package mx.cfe.ssb.vmc.burocredito.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * date: 29/01/2018
 */
public class Archivos {

    private String nombre;
    private String carpeta;
    private String tipo;
    private File archivo;
    private BufferedWriter writer;

    public Archivos(String tipo, String carpeta) {
        this.tipo = tipo;

        crearNombre();

        this.carpeta = carpeta;

        archivo = null;
        writer = null;

        abrirArchivo();
    }

    private boolean abrirArchivo() {
        boolean res = false;

        try {
            archivo = new File(nombre);

            writer = new BufferedWriter(new FileWriter(carpeta + archivo));
            switch (tipo) {
                case "LOG":
                    writer.write("RPU,Error,Detalle");
                    writer.newLine();
                    break;
                case "EXE":
                    writer.write("Identificador,RFC,Codigo Ciudadano,Cadena,"
                            + "Compañia,Nombre 1,Nombre 2,Paterno,Materno,"
                            + "Nacionalidad,Calificación BancoMex,Banxico 1,"
                            + "Banxico 2,Banxico 3,Dirección 1,Dirección 2,"
                            + "Colonia Población,Delegación Municipio,Ciudad,"
                            + "Estado,CP,Telefono,Extension,Fax,Tipo Cliente,"
                            + "Estado Extranjero,Pais,Clave Consolidación,Cadena,"
                            
                            + "Identificador,RFC,Codigo Ciudadano,Cadena,"
                            + "Compañia,Nombre 1,Nombre 2,Paterno,Materno,"
                            + "porcentaje,Dirección 1,Dirección 2,"
                            + "Colonia Población,Delegación Municipio,Ciudad,"
                            + "Estado,CP,Telefono,Extension,Fax,Tipo Cliente,"
                            + "Estado Extranjero,Pais,Cadena,"
                            
                            + "Identificador,RFC Empresa,Numero de Experiencias,"
                            + "Contrato,Contrato Anterior,Fecha Apertura,Plazo,"
                            + "Tipo Credito,Saldo Inicial,Moneda,Numero Pagos,"
                            + "Frecuencia Pagos,Importe Pagos,Fecha UltimoPago,"
                            + "Fecha Reestructura,Pago Efectivo,Fecha Liquidacion,"
                            + "Quita,Dacion,Quebranto,Observaciones,Especiales,"
                            + "Fecha Primer Incum,Saldo Insoluto,"
                            + "Credito Maximo Utilizado,"
                            + "Fecha Ingreso Cartera Vencida,Cadena,"
                            
                            + "Identificador,RFC Empresa,Contrato,"
                            + "Dias Vencimiento,Cantidad,Cadena,"
                            
                            + "Identificador,RFC Aval,Codigo Ciudadano,Cadena,"
                            + "Compañia,Nombre 1,Nombre 2,Paterno,Materno,"
                            + "Direccion 1,Direccion 2,Colonia Poblacion,"
                            + "Delegacion Municipio,Ciudad,Estado,CP,Telefono,"
                            + "Extension,Fax,Tipo Cliente,Estado Extranjero,Pais,"
                            + "Cadena"
                            + "");
                    writer.newLine();
                    break;
            }

        } catch (IOException ex) {
            System.out.println("Error al ecribir: " + ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean escribirLinea(String linea) {
        try {
            writer.write(linea);
            writer.newLine();
        } catch (IOException ex) {
            System.out.println("Error al escribir: " + ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean escribir(String texto) {
        try {
            writer.write(texto);
        } catch (IOException ex) {
            System.out.println("Error al escribir: " + ex.getMessage());
            return false;
        }
        return true;
    }

    public boolean cerrarEscritura() {
        try {
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar escritura: " + ex.getMessage());
            return false;
        }
        return true;
    }

    private void crearNombre() {
        nombre = "";
        nombre += "BC_";
        nombre += Calendar.getInstance().get(Calendar.YEAR);
        nombre += formatoMes(Calendar.getInstance().get(Calendar.MONTH));
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.DATE));
        nombre += "_";
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.MINUTE));
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.SECOND));
        
        switch (tipo) {
            case "CIB":
                nombre += ".cib";
                break;
            case "LOG":
                nombre += "_log.csv";
                break;
            case "EXE":
                nombre += "_incorporado.csv";
                break;
            default:
                nombre += "_dat.txt";
                break;
        }
    }
    
    private String formatoMes(int mes){
        if(mes < 9){
            int valor = mes + 1;
            StringBuilder s =new StringBuilder();
            s.append("0");
            s.append(valor);
            return s.toString();
        }else{
            return "" + (mes + 1);
        }
    }
    
    private String formatoNumero(int numero){
        
        if(numero < 10){
            return "0" + numero;
        }else{
            return "" + numero;
        }
    }
    
    public String getNombre(){
        return nombre;
    }

}
