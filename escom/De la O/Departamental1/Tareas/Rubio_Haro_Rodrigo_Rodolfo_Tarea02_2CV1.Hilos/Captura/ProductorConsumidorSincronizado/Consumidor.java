package ProductorConsumidorSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Consumidor implements Runnable {

    private Cantidad q;

    public Consumidor(Cantidad q) {
        this.q = q;
        new Thread(this, "Consumidor").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.get();
            i++;
            if (i == 10) {
                break;
            }
        }

    }
}
