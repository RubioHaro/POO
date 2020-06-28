package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Rinoceronte extends Herbivoro {

    public String temperamento;

    public Rinoceronte() {
        this("desconocido");
    }

    public Rinoceronte(String sexo) {
        this("Hierbas", 850f, sexo);
    }

    public Rinoceronte(String plantaFavorita, float peso, String sexo) {
        super("Rinoceronte (Rhinocerotidae)", plantaFavorita, peso);
        this.setSexo(sexo);
        this.temperamento = "Agresivo";
    }

    @Override
    public String toString() {
        return super.toString() + " Presentan Temperamento " + temperamento;
    }

}
