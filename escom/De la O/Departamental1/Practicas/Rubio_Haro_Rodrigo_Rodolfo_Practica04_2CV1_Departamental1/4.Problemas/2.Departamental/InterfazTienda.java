
import java.util.concurrent.TimeUnit;

public class InterfazTienda {

    public static void main(String[] args) {
        // Articulo articulo, Cliente cliente, Double precio
        Tienda tiendaDepartamental = new Tienda();
        Cliente c = tiendaDepartamental.registrarCliente("Jhon Snow");

        try {

            tiendaDepartamental.venderArticulo(tiendaDepartamental.obtenerArticuloEnVenta(0), c);
            Thread.sleep(1000);
            tiendaDepartamental.venderArticulo(tiendaDepartamental.obtenerArticuloEnVenta(1), c);
            Thread.sleep(1000);
            tiendaDepartamental.venderArticulo(tiendaDepartamental.obtenerArticuloEnVenta(2), c);
            Thread.sleep(1000);
            tiendaDepartamental.venderArticulo(tiendaDepartamental.obtenerArticuloEnVenta(2), c);
            Thread.sleep(1000);
            tiendaDepartamental.venderArticulo(tiendaDepartamental.obtenerArticuloEnVenta(2), c);
            Thread.sleep(1000);
            tiendaDepartamental.venderArticulo(tiendaDepartamental.obtenerArticuloEnVenta(0), c);
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        c.obtenerCuenta().imprimirEstadoCuenta();
    }

}