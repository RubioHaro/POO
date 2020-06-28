package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Cerdo extends Omnivoro {

    public Cerdo() {
        this("desconocido", new Animal("Peces", "plantas", 0), "", 0);
    }

    public Cerdo(String sexo, String plantaFavorita, float peso) {
        super(sexo, "Cerdo (Sus scrofa domestica)", new Animal("Vaca", "heno", 150), plantaFavorita, peso);
    }

    public Cerdo(String sexo, Animal animalFavorito, String plantaFavorita, float peso) {
        super(sexo, "Cerdo (Sus scrofa domestica)", animalFavorito, plantaFavorita, peso);
    }
}
