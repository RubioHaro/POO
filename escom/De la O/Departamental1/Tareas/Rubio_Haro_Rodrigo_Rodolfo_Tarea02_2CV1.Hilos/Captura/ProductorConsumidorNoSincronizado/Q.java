package ProductorConsumidorNoSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Q {

    private int n;

    public synchronized int get() {
        System.out.println("Consume : " + n);
        return n;
    }

    public synchronized void put(int n) {
        this.n = n;
        System.out.println("Produce : " + n);
    }
}
