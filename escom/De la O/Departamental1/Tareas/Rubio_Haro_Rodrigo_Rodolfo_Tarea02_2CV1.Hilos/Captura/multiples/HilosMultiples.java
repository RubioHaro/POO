package multiples;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HilosMultiples {

    public void probarHilosMultiples() {
        new OtroNuevoHilo("Uno"); // comienzan los hilos
        new OtroNuevoHilo("Dos");
        new OtroNuevoHilo("Tres");
        try { //espera un tiempo para que terminen los otros hilos
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupción del hilo principal.");
        }
        System.out.println("Sale del hilo principal.");
    }
}
