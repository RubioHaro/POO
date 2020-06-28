package polimorfismo.enlaceDinamico;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class SerHumano extends Object {

    private String genero;

    public SerHumano() {
        this("femenino");
    }

    public SerHumano(String genero) {
        super();
        this.genero = genero;
    }

    public SerHumano(SerHumano humano) {
        this(humano.genero);
    }

    public void respirar() {
        System.out.println("Respirando como SerHumano");
    }

    @Override
    public String toString() {
        return "Genero: " + genero + "\n";
    }

}
