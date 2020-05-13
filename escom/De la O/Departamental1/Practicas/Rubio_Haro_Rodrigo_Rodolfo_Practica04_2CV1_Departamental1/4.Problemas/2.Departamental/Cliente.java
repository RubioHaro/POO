/**
 * Cliente
 */
public class Cliente {
    private Cuenta cuenta;
    private String nombre;

    public Cliente(Cuenta cuenta) {
        this.cuenta = cuenta;
        this.nombre = "John Snow";
    }

    public void establecerCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta obtenerCuenta() {
        return this.cuenta;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String regresarNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}