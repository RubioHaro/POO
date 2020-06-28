package Sincronizacion;


/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class GestorHilos {

    synchronized void llamar(String mensaje) {
        System.out.print("[" + mensaje);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Interrumpido");
        }
        System.out.println("]");
    }
}
