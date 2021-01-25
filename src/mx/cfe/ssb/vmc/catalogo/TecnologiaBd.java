package mx.cfe.ssb.vmc.catalogo;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @version 1.0
 * date: 08/02/2018
 */
public enum TecnologiaBd {
    MYSQL("MYSQL"),
    MSSQL("MSSQL");
    
    private String tecnologia;

    private TecnologiaBd(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return tecnologia;
    }
}
