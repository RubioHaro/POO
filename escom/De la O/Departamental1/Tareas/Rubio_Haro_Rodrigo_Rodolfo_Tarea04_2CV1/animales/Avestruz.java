package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Avestruz extends Omnivoro {

    public Avestruz() {
        this("desconocido", new Animal("Insectos", "desconocido", 0), "desconocida", 0);
    }

    public Avestruz(String sexo, Animal animalFavorito, String plantaFavorita, float peso) {
        super(sexo, "Avestruz (Struthio camelus)", animalFavorito, plantaFavorita, peso);
    }
}
