/**
 * Chequera
 */
public class Chequera {

    private Cheque cheques[];
    private int chequesSinUsar;
    private int cantidadCheques;

    public Chequera() {
        cheques = new Cheque[50];
        chequesSinUsar = 50;
        cantidadCheques = 50;
    }

    public void establecerCheques(Cheque[] cheques){
        for (int i = 0; i < cheques.length; i++) {
            this.cheques[i] = cheques[i];
        }
    }

    public Cheque obtenerChequeNuevo() {
        if (chequesSinUsar > 0) {
            chequesSinUsar--;
            return cheques[cantidadCheques - chequesSinUsar];
        } else {
            return null;
        }

    }

}