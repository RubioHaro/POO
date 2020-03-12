/**
 * Cuenta
 */
public class Cuenta {

    private int fondos;
    private String CLABE;

    public void establecerFondos(int fondos){
        this.fondos = fondos;
    }

    public void establecerCLABE(String CLABE){
        this.CLABE = CLABE;
    }

    @Override
    public String toString() {
        return "No Cuenta: " + CLABE ;
    }

}