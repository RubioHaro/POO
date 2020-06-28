package ProductorConsumidorSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Cantidad {

    private int n;
    private boolean tomaValor = false;

    public synchronized int get() {
        if (!tomaValor)
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Captura la excepción InterruptedException");
        }
        System.out.println("Consume : " + n);
        tomaValor = false;
        notify();
        return n;
    }

    public synchronized void put(int n) {
        if (tomaValor)
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Captura la excepción InterruptedException");
        }
        this.n = n;
        tomaValor = true;
        System.out.println("Produce : " + n);
        notify();
    }
}
