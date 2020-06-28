package AliveAndJoin;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HilosJoin {

    public void probar() {
        Hilo hilo1 = new Hilo("Uno");
        Hilo hilo2 = new Hilo("Dos");
        Hilo hilo3 = new Hilo("Tres");
        System.out.println("El hilo Uno esta vivo : " + hilo1.t.isAlive());
        System.out.println("El hilo Dos esta vivo : " + hilo2.t.isAlive());
        System.out.println("El hilo Tres esta vivo : " + hilo3.t.isAlive());
        // espera hasta que terminen los otros hilos
        try {
            System.out.println("Espera la finalizacion de los otros hilos.,,");
            hilo1.t.join();
            hilo2.t.join();
            hilo3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo principal.");
        }
        System.out.println("El hilo Uno esta vivo : " + hilo1.t.isAlive());
        System.out.println("El hilo Dos esta vivo : " + hilo2.t.isAlive());
        System.out.println("El hilo Tres esta vivo : " + hilo3.t.isAlive());
        System.out.println("Sale del hilo principal.");
    }
}
