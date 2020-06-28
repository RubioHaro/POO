package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Hombre extends Omnivoro {

    private String habilidades;

    public Hombre() {
        super();
        this.habilidades = "pensar";
    }

    public Hombre(String habilidades, String sexo, Animal animalFavorito, String plantaFavorita, float peso) {
        super(sexo, "Hombre (Homo sapiens)", animalFavorito, plantaFavorita, peso);
        this.habilidades = "pensar," + habilidades;
    }

}
