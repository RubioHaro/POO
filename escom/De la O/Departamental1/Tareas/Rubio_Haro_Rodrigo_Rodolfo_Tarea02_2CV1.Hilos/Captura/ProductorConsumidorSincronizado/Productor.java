package ProductorConsumidorSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Productor implements Runnable {

    private final Cantidad q;

    public Productor(Cantidad q) {
        this.q = q;
        new Thread(this, "Productor").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i);
            i++;
            if (i == 10) {
                break;
            }
        }
    }
}
