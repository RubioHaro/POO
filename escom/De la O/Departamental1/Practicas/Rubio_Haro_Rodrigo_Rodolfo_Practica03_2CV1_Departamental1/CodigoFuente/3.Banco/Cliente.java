/**
 * Cliente
 */
public class Cliente {
    private String nombre;

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public String regresarNombre(){
        return this.nombre;
    }
}