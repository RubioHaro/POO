
package AliveAndJoin;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Hilo implements Runnable {

    private String nombre; // nombre del hilo
    Thread t;

    Hilo(String suNombre) {
        nombre = suNombre;
        t = new Thread(this, nombre);
        System.out.println(" Nuevo hilo : " + t);
        t.start(); // Comienza la ejecucion del hilo
    }

    // Este es el punto de entrada del hilo.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.print(nombre + " : " + i + " ");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Interrupción del hilo " + nombre);
        }
        System.out.println();
        System.out.println(" Sale del hilo : " + nombre);
    }
}
