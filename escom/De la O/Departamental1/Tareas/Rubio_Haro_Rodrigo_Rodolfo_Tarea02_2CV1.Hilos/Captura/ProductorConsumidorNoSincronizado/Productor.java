package ProductorConsumidorNoSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Productor implements Runnable {

    private final Q q;

    public Productor(Q q) {
        this.q = q;
        new Thread(this, "Productor").start();
    }

    @Override
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
