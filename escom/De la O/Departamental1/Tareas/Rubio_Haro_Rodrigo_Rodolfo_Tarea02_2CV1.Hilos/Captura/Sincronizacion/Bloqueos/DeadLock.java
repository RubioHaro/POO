package Sincronizacion.Bloqueos;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class DeadLock implements Runnable{

    private HiloTipoA hiloA;
    private HiloTipoB hiloB;
    private Thread hilo;
    
    public DeadLock() {
        hiloA = new HiloTipoA();
        hiloB = new HiloTipoB();

        Thread.currentThread().setName("Hilo Principal");
        hilo = new Thread(this, "Hilo hijo");
        hilo.start();
        hiloA.construir(hiloB); // este hilo se bloquea en a.
        System.out.println("Vuelve al hilo principal");
    }

    public void run() {
        hiloB.obstruir(hiloA); // este hilo se bloquea en b.
        System.out.println("Vuelve al otro hilo");
    }
}
