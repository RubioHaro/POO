package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Herbivoro extends Animal {

    public String plantaFavorita;

    public Herbivoro() {
        this("desconocido","plantas", 0);
    }

    public Herbivoro(String nombre, String plantaFavorita, float peso) {
        super(nombre, plantaFavorita, peso); 
    }

}
