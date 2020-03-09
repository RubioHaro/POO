/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Articulo articulo, Cliente cliente, Double precio
        Tienda tienda = new Tienda();
        Cliente c = tienda.registrarCliente();

        tienda.venderArticulo(tienda.obtenerArticulo(0), c);
        tienda.venderArticulo(tienda.obtenerArticulo(1), c);
        tienda.venderArticulo(tienda.obtenerArticulo(2), c);
        tienda.venderArticulo(tienda.obtenerArticulo(2), c);
        tienda.venderArticulo(tienda.obtenerArticulo(2), c);
        tienda.venderArticulo(tienda.obtenerArticulo(0), c);

        c.obtenerCuenta().imprimirEstadoCuenta();
    }

}