package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Morsa extends Carnivoro {

    public Morsa() {
        this("desconocido");
    }

    public Morsa(String sexo) {
        super(sexo, "Morsa (Odobenus rosmarus)", new Animal("Moluscos", "desconocida", 0), 180);
    }
}
