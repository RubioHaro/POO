
public class Cliente {
    private Cuenta cuentaCheques;
    private Chequera chequera;
    private String nombre;
    private String RFC;
    private int id;

    public void establecerCuentaCheques(Cuenta cuentaCheques){
        this.cuentaCheques = cuentaCheques;
    }

    public Cheque proporcionarCheque(){
        return chequera.obtenerChequeNuevo();
    }

    public void establecerChequera(Chequera chequera){
        this.chequera = chequera;
    }

    public void establecerRFC(String RFC){
        this.RFC = RFC;
    }

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public String regresarNombre(){
        return nombre;
    }

    public void establecerId(int id){
        this.id = id;
    }

    public int obtenerId(){
        return id;
    }

    @Override
    public String toString() {
        return this.nombre + ", RFC: " + this.RFC +  ", " + cuentaCheques + "";
    }


}