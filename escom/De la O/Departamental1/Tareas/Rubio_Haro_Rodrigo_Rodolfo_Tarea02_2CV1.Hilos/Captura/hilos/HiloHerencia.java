package Hilos;

/**
 *
 * @author chavo
 */
public class HiloHerencia extends Thread {

    private int idDeHilo;
    private int contador;

    public HiloHerencia(int id) {
        super("Hilo heredado");
        idDeHilo = id;
    }

    @Override
    public void run() {
        try {
            for (contador = 5; contador >= 0; contador--) {
                System.out.println(idDeHilo + ") " + getName() + " : " + contador);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
