package polimorfismo.enlaceDinamico;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Estudiante extends Persona {

    private String boleta;

    public Estudiante() {
        this("", "", 0, "");
    }

    public Estudiante(String genero, String nombre, int edad, String boleta) {
        super(genero, nombre, edad);
        this.boleta = boleta;
    }

    public Estudiante(Estudiante estudiante) {
        super(estudiante);
        boleta = estudiante.boleta;
    }

    public void respirar() {
        System.out.println("Respirando como Estudiante");
    }

    public String toString() {
        return super.toString() + "Boleta:" + boleta + "\n";
    }
}
