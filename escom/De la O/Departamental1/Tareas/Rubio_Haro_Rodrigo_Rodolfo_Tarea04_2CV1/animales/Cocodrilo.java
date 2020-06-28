package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Cocodrilo extends Carnivoro {

    public Cocodrilo() {
        this("desconocido");
    }

    public Cocodrilo(String sexo) {
        super("Cocodrilo (Crocodylidae)", new Gaviota(), 500);
        this.setSexo(sexo);
    }
}
