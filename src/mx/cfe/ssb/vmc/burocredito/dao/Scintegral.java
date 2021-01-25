package mx.cfe.ssb.vmc.burocredito.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.cfe.ssb.vmc.burocredito.model.InformacionCredito;
import mx.cfe.ssb.vmc.burocredito.model.Servicio;
import mx.cfe.ssb.vmc.model.DatosGenerales;
import mx.cfe.ssb.vmc.burocredito.util.Util;
import mx.cfe.ssb.vmc.burocredito.util.Validar;
import mx.cfe.ssb.vmc.burocredito.util.ZipGenerator;
import mx.cfe.ssb.vmc.model.General;
import mx.cfe.ssb.vmc.xml.XmlAccess;

/**
 *
 * @author Angel Adonay Basurto Nieto date: 29/01/2018
 */
public class Scintegral {

    public static boolean llenarBuro(String division, String zona, String carpeta) {
        DatosGenerales coleccion = (DatosGenerales) XmlAccess.leerXML("DatosGenerales.xml", DatosGenerales.class);
        General datos = new General();
        InformacionCredito info = new InformacionCredito();

        //System.out.println("1");

        String div = division.substring(0, 2);
        for (General col : coleccion.getDatos()) {
            if (col.getId().equals(div)) {
                datos = col;
                break;
            }
        }
        //System.out.println("2");

        info.getHd().setIdentificadorSegmento(datos.getIdentificadorSegmento());
        info.getHd().setInstitucion(datos.getClaveUsuario());
        info.getHd().setInstAnt(datos.getClaveUsuarioAnterior());
        info.getHd().setTipoInstitucion(datos.getTipoUsuario());
        info.getHd().setFormato(datos.getFormato());
        info.getHd().setVersion(datos.getVersion());
        info.getHd().setNombreOtorgante(datos.getNombreOtorgante());

        //System.out.println("3");

        Connection con = conectar(division);

        //System.out.println("4");
        CallableStatement stmt = null;
        ResultSet rs = null;

        //System.out.println("5");
        Archivos archivo = new Archivos("CIB", carpeta);
        Archivos exe = new Archivos("EXE", carpeta);
        archivo.escribir(info.getHd().toString());
        
        //System.out.println("6");

        try {
            String SQL = "{CALL sp_getDatosIncorporarBuroCredito(?)}";
            
            //System.out.println("7");

            stmt = con.prepareCall(SQL);
            
            //System.out.println("8");

            stmt.setString("zona", zona);

            //System.out.println("9");
            
            stmt.execute();
            
            //System.out.println("A");
            
            rs = stmt.getResultSet();
            
            //System.out.println("B");

            for (; rs.next();) {
                //System.out.println("C");

                Servicio ser = new Servicio();

                ser.em.setRfc(rs.getString("rfc"));
                ser.em.setCompannia(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("nombre")));
                ser.em.setNombre1(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("nombre1")));
                ser.em.setNombre2(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("nombre2")));
                ser.em.setPaterno(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("paterno")));
                ser.em.setMaterno(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("materno")));
                //ser.em.setNacionalidad(rs.getString("nacionalidad"));
                ser.em.setNacionalidad(datos.getNacionalidad());
                ser.em.setBanxico1(datos.getBanxico());
                ser.em.setDireccion1(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("direccion")));
                ser.em.setColoniaPoblacion(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("colonia")));
                ser.em.setDelegacionMunicipio(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("municipio")));
                ser.em.setCiudad(Validar.cadenaQuitaCaracteresEspeciales(rs.getString("ciudad")));
                ser.em.setEstado(rs.getString("abr_estado"));
                ser.em.setCp(Util.cadenaFormatoCP(rs.getString("cp")));
                ser.em.setTelefono(rs.getString("telefono"));
                ser.em.setTipoCliente(rs.getString("tipo"));
                ser.em.setPais(datos.getPais());

                ser.cr.setRfcEmpresa(rs.getString("rfc"));
                ser.cr.setContrato(rs.getString("rpu"));
                ser.cr.setFechaApertura(rs.getString("apertura"));
                // ser.cr.setPlazo(rs.getString("plazo"));           
                ser.cr.setPlazo(datos.getPlazo());
                ser.cr.setTipoCredito(datos.getTipoCredito());
                ser.cr.setSaldoInicial(rs.getString("imp"));
                ser.cr.setMoneda(datos.getMoneda());
                ser.cr.setNumeroPagos(datos.getNumeroPagos());
                ser.cr.setFrecuenciaPagos(datos.getFrecuenciaPagos());;
                ser.cr.setImportePagos(rs.getString("saldo_insoluto"));
                ser.cr.setFechaUltimoPago(rs.getString("f_ultimop"));
                ser.cr.setFechaPrimerIncum(rs.getString("incumple"));
                ser.cr.setSaldoInsoluto(rs.getString("saldo_insoluto"));
                ser.cr.setCreditoMaximoUtilizado(rs.getString("maximoCerditoOtorgado"));
                ser.cr.setFechaIngresoCarteraVencida(rs.getString("f_incorporaVencida"));

                ser.de.setRfcEmpresa(rs.getString("rfc"));
                ser.de.setContrato(rs.getString("rpu"));
                ser.de.setDiasVencimiento(rs.getString("dias"));
                ser.de.setCantidad(rs.getString("saldo_insoluto"));
                ser.de.setIntereses(rs.getString("intereses"));

                info.getServicios().add(ser);
                archivo.escribir(ser.toString());
                exe.escribirLinea(ser.toStringCSV());
            }

            //System.out.println("D");
        } catch (SQLException ex) {
            System.out.println("Error al consultar: " + ex.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la consulta: " + ex.getMessage());
            }
            desconectar(con);

            info.llenarTS();
            archivo.escribir(info.getTs().toString());

            archivo.cerrarEscritura();
            exe.cerrarEscritura();

            String[] nombres = new String[2];
            nombres[0] = archivo.getNombre();
            nombres[1] = exe.getNombre();

            System.out.println(ZipGenerator.generar(nombres, carpeta));
        }

        System.gc();

        return true;
    }

    private static Connection conectar(String division) {
        Connection conexion = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar la clase: " + ex.getMessage());
            return null;
        }

        try {
            conexion = DriverManager.getConnection(mx.cfe.ssb.vmc.db.Util.getCadena(division));
        } catch (SQLException ex) {
            System.out.println("Error al obtener conexión: " + ex.getMessage());
            return null;
        }
        return conexion;
    }

    private static void desconectar(Connection conexion) {
        try {

            conexion.close();

        } catch (SQLException ex) {
            System.out.println("Error al desconectar: " + ex.getMessage());
        }
    }
}
