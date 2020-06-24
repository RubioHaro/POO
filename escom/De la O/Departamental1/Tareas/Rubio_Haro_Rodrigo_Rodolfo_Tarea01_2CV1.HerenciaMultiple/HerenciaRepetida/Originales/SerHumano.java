/**
 *
 * @author Saul Torres de la O (sdelaot)
 * @author Rodrigo R. Rubio Haro (roy). Adaptaciones menores
 * @version 2.0
 */
public class SerHumano extends Object {
    private double altura;

    public SerHumano() {
        this(1.65);
    }

    public SerHumano(double altura) {
        super();
        System.out.println(super.toString());
        this.altura = altura;
        System.out.println(" Creando SerHumano");
    }

    public SerHumano(SerHumano alguien) {
        this(alguien.altura);
    }

    public void comer() {
        System.out.println(this + " Comiendo");
    }

    public void comer(String comida) {
        comer();
        System.out.println(comida);
    }

    public void destruir() {
        System.out.println(" Destruyendo SerHumano");
    }

    @Override
    public String toString() {
        return "SerHumano";
    }
}