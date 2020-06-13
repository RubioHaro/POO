public class Persona extends SerHumano {
    private String nombre;

    public Persona() {
        this(1.60, "Raul");
    }

    public Persona(double altura, String nombre) {
        super(altura);
        this.nombre = nombre;
        System.out.println(" Creando Persona");
    }

    public Persona(Persona p) {
        super(p);
        this.nombre = p.nombre;
    }

    public void comer(String comida, String donde) {
        super.comer(comida);
        System.out.println(" en " + donde);
    }

    public void hablar(String blabla) {
        System.out.println(this + " " + blabla);
    }

    @Override
    public void destruir() {
        super.destruir();
        nombre = null;
        System.gc();
        System.out.println(" Destruyendo Persona");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona";
    }
}