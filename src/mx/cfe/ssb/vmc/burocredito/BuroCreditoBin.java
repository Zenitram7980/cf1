package mx.cfe.ssb.vmc.burocredito;

import mx.cfe.ssb.vmc.burocredito.dao.Scintegral;
import mx.cfe.ssb.vmc.burocredito.util.Util;

/**
 * <strong>Buro de Credito CFE Suministrador de Servicios Basicos</strong><br>
 * <p>
 * Aplicación para la depuración y generación del archivo CIB necesario para la 
 * incorporación de servicios al Sistema del Buro de Credito en base a la 
 * información contenida en las Bases de Suministro.
 * </p>
 * <p>
 * Recibe dos parámetros, el primero la clave de la división, este se utiliza 
 * para encontrar la cadena de conexión a la base de datos en el archivo 
 * servidores.xml y el segundo es la ruta completa de la carpeta donde queremos 
 * que escriba nuestro archivo de salida.<br>
 * <br>
 * Ejemplo<br>
 * <code>java –jar BuroCreditoBin.jar DM D:\bc\</code><br>
 * <br>
 * <strong>date:</strong> 25/01/2018<br>
 * <strong>company:</strong> CFE Sumunistrador de Servicios Basicos - División Comercial Valle de México Centro
 * </p>
 * 
 * @author Angel Adonay Basurto Nieto
 * @version 0.1.0
 */
public class BuroCreditoBin {

    /**
     * @param args Llea tres argumentos<br><br><code>java –jar BuroCreditoBin.jar DM 11 D:\bc\</code>
     */
    public static void main(String[] args) {
        
        if(args.length != 3){
            System.out.println("Favor de agregar la clave de la DIVISIÓN, la clave de ZONA y carpeta de escritura.");
            return;
        }
        
        String division = args[0];
        String zona = args[1];
        String carpeta = args[2];
        
        
//        System.out.println(Util.fechaActualHora() + " Inicio");
        Scintegral.llenarBuro(division, zona, carpeta);
//        System.out.println(Util.fechaActualHora() + " Fin");
    }
    
}
