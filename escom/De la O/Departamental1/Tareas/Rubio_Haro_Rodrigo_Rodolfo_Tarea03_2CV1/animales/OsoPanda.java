package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class OsoPanda extends Herbivoro {
    
    public OsoPanda() {
        this("desconocido");
    }
    
    public OsoPanda(String sexo) {
        this("bambu", 97.5f, sexo);
    }
    
    public OsoPanda(String plantaFavorita, float peso, String sexo) {
        super("Panda (Ailuropoda melanoleuca)", plantaFavorita, peso);
        this.setSexo(sexo);
    }
    
}
