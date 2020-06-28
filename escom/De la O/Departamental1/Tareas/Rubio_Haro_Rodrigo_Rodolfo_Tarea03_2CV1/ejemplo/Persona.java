package ejemplo;

/**
 *
 * @author sdelaot
 * @author Rubio Haro Rodrigo R.
 */
public class Persona extends SerHumano {

    private String nombre;
    private int edad;

    public Persona() {
        this("femenino", "Juan Perez", 18);
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

    public void respirar(String estado) {
        respirar();
        switch (estado) {
            case "agitado":
                System.out.println("Mi corazon late muy rapido");
                break;
            case "tranquilo":
                System.out.println("Mi corazon late a buen ritmo");
                break;
        }
    }

    public void comer() {
        System.out.println("Comiendo");
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof Persona)) {
            return false;
        }
        Persona alguien = (Persona) objeto;
        return super.equals(alguien) && nombre.equals(alguien.nombre)
                && edad == alguien.edad;
    }

    @Override
    public String toString() {
        return super.toString() + "Persona \n Nombre: " + nombre + "\n" + " Edad: " + edad + "\n";
    }
}
