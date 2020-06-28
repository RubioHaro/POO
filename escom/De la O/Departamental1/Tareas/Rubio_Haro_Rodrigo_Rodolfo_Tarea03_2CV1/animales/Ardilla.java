package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Ardilla extends Omnivoro {

    public Ardilla() {
        this("desconocido");
    }

    public Ardilla(String sexo) {
        this(sexo, new Animal("Insectos", "plantas", 0), "nueces", 1.5f);
    }

    public Ardilla(String sexo, Animal animalFavorito, String plantaFavorita, float peso) {
        super(sexo, "Ardilla (Sciuridae)", animalFavorito, plantaFavorita, peso);
    }

}
