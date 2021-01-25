package mx.cfe.ssb.vmc.xml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @version 1.0
 * date: 08/02/2018
 */
public class XmlAccess {
    
    public static Object leerXML(String ruta, Class cl) {
        Object obj = null;
        
        try {

            File file = new File(ruta);
            JAXBContext context = JAXBContext.newInstance(cl);

            Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
            obj = (Object) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            System.out.println("Error al leer el Archivo XML: " + e.getMessage());
        }
        
        return obj;
    }
    
}
