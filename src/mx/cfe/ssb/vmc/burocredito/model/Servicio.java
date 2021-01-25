package mx.cfe.ssb.vmc.burocredito.model;

/**
 *
 * @author Angel Adonay Basurto Nieto
 * @date 25/01/2018
 */
public class Servicio {

    public EM em;
    public AC ac;
    public CR cr;
    public DE de;
    public AV av;

    public Servicio() {
        em = new EM();
        ac = new AC();
        cr = new CR();
        de = new DE();
        av = new AV();
    }

    @Override
    public String toString() {
        return em.toString() + ac.toString() + cr.toString() + de.toString() + av.toString();
    }

    public String toStringCSV() {
        return em.toStringCSV() + ac.toStringCSV() + cr.toStringCSV() + de.toStringCSV() + av.ToStringCSV();
    }
}
