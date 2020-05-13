public class Operacion {

    private String operador;
    private Double operando;

    public Operacion() {
    }

    public Operacion(String operador) {
        this.operador = operador;
    }

    public Operacion(String operador, Double operando) {
        this.operador = operador;
        this.operando = operando;
    }

    @Override
    public String toString() {
        if (operador.length() == 1)
            return "x " + operador + "= " + operando;
        else if (operador.length() == 2) {
            if (operador.equals("^2") || operador.equals("^3"))
                return "x = x" + operador;
            else
                return "x = x " + operador + " " + operando;
        } else
            return "Error en la operacion: Operador desconocido.";
    }

    /**
     * @return the operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * @return the operando
     */
    public Double getOperando() {
        return operando;
    }

}