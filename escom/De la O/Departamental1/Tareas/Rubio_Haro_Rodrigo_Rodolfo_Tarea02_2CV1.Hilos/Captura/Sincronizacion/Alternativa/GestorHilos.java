package Sincronizacion.Alternativa;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class GestorHilos {

    void llamando(String mensaje) {
        System.out.print("[" + mensaje);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrumpido");
        }
        System.out.println("]");
    }
}
