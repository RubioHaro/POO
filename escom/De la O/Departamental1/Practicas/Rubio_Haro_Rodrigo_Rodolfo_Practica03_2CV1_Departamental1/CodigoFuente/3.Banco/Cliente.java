
public class Cliente {
    private Cuenta cuentaCheques;
    private String nombre;
    private String RFC;

    public void establecerCuentaCheques(Cuenta cuentaCheques){
        this.cuentaCheques = cuentaCheques;
    }

    public Cuenta proporcionarCuente(){
        return cuentaCheques;
    }

    public Cheque proporcionarCheque(){
        return cuentaCheques.obtenerCheque();
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

    @Override
    public String toString() {
        return this.nombre + ", RFC: " + this.RFC +  ", " + cuentaCheques + "";
    }
}