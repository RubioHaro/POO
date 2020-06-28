package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Gaviota extends Omnivoro {

    private String habilidades;

    public Gaviota() {
        this("desconocido");
    }

    public Gaviota(String sexo) {
        this(sexo, new Animal("Peces", "plantas", 0), "", 1.3F);
    }

    public Gaviota(String sexo, Animal animalFavorito, String plantaFavorita, float peso) {
        super(sexo, "Gaviota (Laridae)", animalFavorito, plantaFavorita, peso);
        this.habilidades = "volar";
    }

    @Override
    public String toString() {
        return super.toString() + " Este animal puede: " + habilidades;
    }

}
