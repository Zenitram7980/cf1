package mx.cfe.ssb.vmc.db;

import mx.cfe.ssb.vmc.model.Servidor;
import mx.cfe.ssb.vmc.model.Servidores;
import mx.cfe.ssb.vmc.xml.XmlAccess;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @version 1.0
 * date: 08/02/2018
 */
public class Util {

    public static String getCadena(String clave) {
        String cadena = "";

        Servidores servidores = (Servidores) XmlAccess.leerXML("servidores.xml", Servidores.class);

        for (Servidor s : servidores.getServidor()) {
            if (clave.equals(s.getId())) {
                cadena = s.cadenaConexion();
            }
        }

        return cadena;
    }
}
