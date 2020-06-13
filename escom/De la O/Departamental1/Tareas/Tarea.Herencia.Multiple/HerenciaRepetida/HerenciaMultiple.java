
/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HerenciaMultiple {

    public void probarHerencia() {
        System.out.println("Salario base " + Trabajador.SALARIO_BASE + " euros");
        TrabajaYEstudia eyt = new TrabajaYEstudia();
        eyt.comer();
        eyt.trabajar();
        eyt.estudiar();
        System.out.println(eyt + " cobrando " + eyt.cobrar() + " euros");
        eyt.destruir();
        System.gc();
    }
}
