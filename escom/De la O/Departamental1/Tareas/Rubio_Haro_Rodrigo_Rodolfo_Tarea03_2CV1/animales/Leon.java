package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Leon extends Carnivoro {

    private String melena;

    public Leon(String sexo) {
        super(sexo, "Leon (Panthera leo)", new Avestruz(), 180);
        this.setMelena();
    }

    public void setMelena() {
        if (this.getSexo().equals("macho")) {
            this.melena = " Tiene melena";
        } else {
            this.melena = " No tiene melena";
        }
    }

    @Override
    public String toString() {
        return super.toString() + melena;
    }
}
