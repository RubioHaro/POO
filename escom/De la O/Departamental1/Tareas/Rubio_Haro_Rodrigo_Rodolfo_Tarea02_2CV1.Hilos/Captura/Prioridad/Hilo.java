
package Prioridad;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Hilo implements Runnable {

    int pulsado = 0;
    Thread t;
    private boolean running = true;

    public Hilo(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        while (running) {
            pulsado++;
        }

    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}
