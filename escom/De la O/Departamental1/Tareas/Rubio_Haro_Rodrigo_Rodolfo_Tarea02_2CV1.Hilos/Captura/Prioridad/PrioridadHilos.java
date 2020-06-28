package Prioridad;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class PrioridadHilos {

    public void probar() {
        System.out.println("Programa iniciado");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Hilo altaPrioridad = new Hilo(Thread.NORM_PRIORITY + 2);
        Hilo bajaPrioridad = new Hilo(Thread.NORM_PRIORITY - 2);
        bajaPrioridad.start();
        altaPrioridad.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupción del hilo principal.,,");
        }
        bajaPrioridad.stop();
        altaPrioridad.stop();
        // Espera hasta que terminen los hilos hijos
        try {
            altaPrioridad.t.join();
            bajaPrioridad.t.join();
        } catch (InterruptedException e) {
            System.out.println("Captura la excepción InterruptedException");
        }
        System.out.println(" Hilo con prioridad baja : " + bajaPrioridad.pulsado);
        System.out.println(" Hilo con prioridad alta : " + altaPrioridad.pulsado);
    }
}
