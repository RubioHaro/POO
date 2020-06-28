package Sincronizacion.Bloqueos;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HiloTipoB {

    public synchronized void obstruir(HiloTipoA a) {

        String nombre = Thread.currentThread().getName();
        System.out.println(nombre + " entra en B.obstruir()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B interrumpido,");
        }
        System.out.println(nombre + " llama al metodo A.ultimo()");
        a.ultimo();
    }

    public synchronized void ultimo() {

        System.out.println("Dentro de B.ultimo()");
    }
}
