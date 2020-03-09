/**
 * Articulo
 */
public class Articulo {
    private String nombre;
    private String codigo;
    private Double precio;

    public Articulo(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public void establecerPrecio(Double precio) {
        this.precio = precio;
    }

    public Double obtenerPrecio() {
        return this.precio;
    }    

    @Override
    public String toString() {
        return "Articulo: " + nombre + ", codigo:" + codigo + ", precio: " + precio;
    }

}