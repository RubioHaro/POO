package polimorfismo.enlaceDinamico;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Persona extends SerHumano {

    private String nombre;
    private int edad;

    public Persona() {
        this("", "", 0);
    }

    public Persona(String genero, String nombre, int edad) {
        super(genero);
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(Persona alguien) {
        super(alguien);
        nombre = alguien.nombre;
        edad = alguien.edad;
    }

    public void respirar() {
        System.out.println("Respirando como Persona");

    }

    public void comer() {
        System.out.println("Comiento");
    }

    public void comer(String comida) {
        comer();
        System.out.println(comida);
    }

    public void comer(String comida, String donde) {
        comer(comida);
        System.out.println("En " + donde);
    }

    public void comer(String comida, String donde, String quien) {
        comer(comida, donde);
        System.out.println("Con" + quien);
    }

    public String toString() {
        return "Nombre:" + nombre + "\n" + "Edad:" + edad + "\n";
    }

    public String getNombre() {
        return nombre;
    }
}
