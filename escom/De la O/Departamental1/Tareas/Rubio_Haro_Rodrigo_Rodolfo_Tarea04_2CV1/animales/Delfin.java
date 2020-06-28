package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Delfin extends Carnivoro {

    private String habilidades;

    public Delfin() {
        this("desconocido");
    }
    
    public Delfin(String sexo) {
        this(sexo, new Animal("Peces", "peces", 0), 85);
    }

    public Delfin(String sexo, Animal animalFavorito, float peso) {
        super(sexo, "Delfin (Delphinidae)", animalFavorito, peso);
        this.habilidades = "nadar";
    }

    @Override
    public String toString() {
        return super.toString() + " tiene la habilidad de " +habilidades;
    }
    
    
}
