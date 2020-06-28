package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Koala extends Herbivoro {

    public Koala() {
        this("desconocido");
    }

    public Koala(String sexo) {
        this("Hojas de Eucalipto", 8f, sexo);
    }

    public Koala(String plantaFavorita, float peso, String sexo) {
        super("Koala (Phascolarctos cinereus)", plantaFavorita, peso);
        this.setSexo(sexo);
    }
}
