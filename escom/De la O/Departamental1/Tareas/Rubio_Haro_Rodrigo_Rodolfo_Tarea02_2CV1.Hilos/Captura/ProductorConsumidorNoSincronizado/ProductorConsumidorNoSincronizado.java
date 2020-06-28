package ProductorConsumidorNoSincronizado;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class ProductorConsumidorNoSincronizado {

    public static void main(String[] args) {
        Q q = new Q();
        new Productor(q);
        new Consumidor(q);
        System.out.println("Pulse Control C para finalizar.");
    }
}
