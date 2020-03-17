/**
 * Cuenta
 */
public class Cuenta {

    private int fondos;
    private Chequera chequera;
    private String CLABE;

    public void establecerFondos(int fondos) {
        this.fondos = fondos;
    }

    public void establecerChequera(Chequera chequera) {
        this.chequera = chequera;
    }

    public Cheque obtenerCheque(){
        return chequera.obtenerChequeNuevo();
    }

    public void establecerCLABE(String CLABE) {
        this.CLABE = CLABE;
    }

    @Override
    public String toString() {
        return "No Cuenta: " + CLABE;
    }

}