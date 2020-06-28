package Sincronizacion.Alternativa;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Hilo implements Runnable {

    private String mensaje;
    private GestorHilos destino;
    Thread t;

    public Hilo(GestorHilos dest, String s) {
        destino = dest;
        mensaje = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        synchronized (destino) {
            destino.llamando(mensaje);
        }
    }
}
