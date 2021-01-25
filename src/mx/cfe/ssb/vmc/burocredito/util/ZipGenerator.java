package mx.cfe.ssb.vmc.burocredito.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 09/02/2018
 */
public class ZipGenerator {

    public static String generar(String[] archivos, String ruta) {
        String archivo = crearNombre();

        ZipOutputStream out = null;
        FileInputStream in = null;

        try {
            // out put file 
            out = new ZipOutputStream(new FileOutputStream(ruta + archivo));

            for (String arc : archivos) {
                
                
                
                in = new FileInputStream(ruta + arc);

                // name the file inside the zip  file 
                out.putNextEntry(new ZipEntry(arc));

                // buffer size
                byte[] b = new byte[1024];
                int count;

                while ((count = in.read(b)) > 0) {
                    out.write(b, 0, count);
                }

                in = new FileInputStream(ruta + arc);
                
                File f = new File(ruta + arc);
                f.deleteOnExit();
                
            }

        } catch (IOException e) {
            System.out.println("Error al generar archivo ZIP: " + e.getMessage());
            archivo = "";
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo ZIP: " + e.getMessage());
                archivo = "";
            }
        }

        return archivo;
    }

    private static String crearNombre() {
        String nombre = "";
        nombre = "";
        nombre += "BC_";
        nombre += Calendar.getInstance().get(Calendar.YEAR);
        nombre += formatoMes(Calendar.getInstance().get(Calendar.MONTH));
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.DATE));
        nombre += "_";
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.MINUTE));
        nombre += formatoNumero(Calendar.getInstance().get(Calendar.SECOND));
        nombre += ".zip";
        
        return nombre;
    }
    
    private static String formatoMes(int mes){
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
    
    private static String formatoNumero(int numero){
        
        if(numero < 10){
            return "0" + numero;
        }else{
            return "" + numero;
        }
    }
}
