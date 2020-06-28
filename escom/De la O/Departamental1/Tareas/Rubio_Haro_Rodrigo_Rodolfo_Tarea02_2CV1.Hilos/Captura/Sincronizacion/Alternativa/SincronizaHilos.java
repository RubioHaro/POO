package Sincronizacion.Alternativa;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class SincronizaHilos {

    void probar() {
        GestorHilos destino = new GestorHilos();
        Hilo obl = new Hilo(destino, "Hola");
        Hilo ob2 = new Hilo(destino, "Mundo");
        Hilo ob3 = new Hilo(destino, "Sincronizado");
        
        //Espera hasta que terminen los hilos
        try {
            obl.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrumpido");
        }
    }
}
