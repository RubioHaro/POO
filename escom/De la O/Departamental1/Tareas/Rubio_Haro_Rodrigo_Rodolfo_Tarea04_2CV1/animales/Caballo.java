package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Caballo extends Herbivoro {
    
    public Caballo() {
        this("desconocido");
    }
    
    public Caballo(String sexo) {
        this("Pasto", 650f, sexo);
    }
    
    public Caballo(String plantaFavorita, float peso, String sexo) {
        super("Caballo (Equus ferus caballus)", plantaFavorita, peso);
        this.setSexo(sexo);
    }
}
