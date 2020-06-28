package ejemplo;

import java.util.Objects;

/**
 * @author sdelaot
 * @author Rubio Haro Rodrigo R.
 */
public class Estudiante extends Persona {

    private String boleta;

    public Estudiante() {
        this("femenino", "Dolores Rios", 18, "201802635432");
    }

    public Estudiante(String genero, String nombre, int edad, String boleta) {
        super(genero, nombre, edad);
        this.boleta = boleta;
    }

    public Estudiante(Estudiante estudiante) {
        super(estudiante);
        boleta = estudiante.boleta;
    }

    public void respirar(String estado, String como) {
        respirar(estado);
        System.out.println(como);
    }

    public void comer(String comida) {
        comer();
        System.out.println(comida);
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof Estudiante)) {
            return false;
        }
        Estudiante estudiante = (Estudiante) objeto;
        return super.equals(estudiante) && boleta.equals(estudiante.boleta);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.boleta);
        return hash;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante \n Boleta: " + boleta + "\n";
    }
}
