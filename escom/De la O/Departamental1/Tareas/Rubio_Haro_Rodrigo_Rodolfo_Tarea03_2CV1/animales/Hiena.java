package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Hiena extends Carnivoro {

    private String risa;

    public Hiena() {
        this("desconocido");
    }

    public Hiena(String sexo) {
        super("Hiena (Hyaenidae)", new Cerdo(), 45);
        risa = " Presenta Risa Escandalosa";
        this.setSexo(sexo);
    }

    @Override
    public String toString() {
        return super.toString() + risa;
    }

}
