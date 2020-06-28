package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Omnivoro extends Animal {

    public String plantaFavorita;
    public Animal animalFavorito;

    public Omnivoro() {
        super("animales-plantas");
    }

    public Omnivoro(String sexo, String nombre, Animal animalFavorito, String plantaFavorita, float peso) {
        super(sexo, nombre, animalFavorito.getEspecie() + " y " + plantaFavorita, peso);
        this.plantaFavorita = plantaFavorita;
        this.animalFavorito = animalFavorito;
    }

    @Override
    public void comer() {
        System.out.println("Omnivoro comiendo");
    }

}
