
public class TrabajaYEstudia implements Trabajador, Alumno {

    private double salario;
    private String nombre;
    private String grado;

    public TrabajaYEstudia() {
        this.salario = Trabajador.SALARIO_BASE;
        this.nombre = "Jhon";
        this.grado = "Secundaria";
    }

    public TrabajaYEstudia(double salario, String nombre, String grado) {
        this.salario = salario;
        this.nombre = nombre;
        this.grado = grado;
    }

    @Override
    public void trabajar() {
        System.out.println(this + " Trabajando");
    }

    public void trabajar(int horasExtra) {
        trabajar();
        System.out.println(" Horas extra " + horasExtra);
    }

    @Override
    public double cobrar() {
        return salario;
    }

    @Override
    public void comer() {
        System.out.println(this + " Comiendo");
    }

    @Override
    public void estudiar() {
        System.out.println(this + " Estudiando");
    }

    @Override
    public void comer(String comida, String donde) {
        comer();
        System.out.println(comida);
    }

    @Override
    public void hablar(String blabla) {
        System.out.println(this + " " + blabla);
    }

    public void hablar(String blabla, Persona alguien) {
        hablar(blabla);
        System.out.println(" con " + alguien.getNombre());
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void destruir() {
        System.out.println("Destruyendo " + this);
        salario = 0;
        nombre = null;
        System.gc();
    }

    @Override
    public String toString() {
        return nombre + " (TrabajadorQueEstudia)";
    }

}
