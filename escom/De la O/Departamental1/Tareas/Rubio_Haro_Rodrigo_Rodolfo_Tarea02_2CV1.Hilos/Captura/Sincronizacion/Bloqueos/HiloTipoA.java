package Sincronizacion.Bloqueos;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HiloTipoA {

    public synchronized void construir(HiloTipoB b) {
        String nombre = Thread.currentThread().getName();
        System.out.println(nombre + " entra en A.construir()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A interrumpido");
        }
        System.out.println(nombre + " llama al metodo B.ultimo()");
        b.ultimo();
    }

    synchronized void ultimo() {
        System.out.println("Dentro de A.ultimo()");
    }
}
