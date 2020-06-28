package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Conejo extends Herbivoro {

    public Conejo() {
        this("desconocido");
    }

    public Conejo(String sexo) {
        this("Alfalfa", 1.5f, sexo);
    }

    public Conejo(String plantaFavorita, float peso, String sexo) {
        super("Conejo (Oryctolagus cuniculus)", plantaFavorita, peso);
        this.setSexo(sexo);
    }
}
