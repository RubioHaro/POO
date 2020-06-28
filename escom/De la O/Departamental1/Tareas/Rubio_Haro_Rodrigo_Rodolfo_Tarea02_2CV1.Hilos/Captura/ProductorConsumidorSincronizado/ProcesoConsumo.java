package ProductorConsumidorSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class ProcesoConsumo {

    Cantidad q;

    void iniciar() {
        q = new Cantidad();
        new Productor(q);
        new Consumidor(q);
        System.out.println("Pulse Control C para finalizar.");
    }
}
