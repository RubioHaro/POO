package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Carnivoro extends Animal {

    public Animal comidaFavorita;

    public Carnivoro() {
        this("desconocido", null, 0);
    }

    public Carnivoro(String nombre, Animal comidaFavorita, float peso) {
        this("desconocido", nombre, comidaFavorita, peso);
    }

    public Carnivoro(String sexo, String nombre, Animal comidaFavorita, float peso) {
        super(sexo, nombre, comidaFavorita.getEspecie(), peso);
    }

}
