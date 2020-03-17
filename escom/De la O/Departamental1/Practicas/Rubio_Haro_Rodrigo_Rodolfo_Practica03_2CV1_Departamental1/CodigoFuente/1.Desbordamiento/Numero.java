/**
 * Numejo
 */
public class Numero {
    public long numero;
    public int desbordamiento;

    public void establecerNumero(long numero) {
        this.numero = numero;
        this.desbordamiento = (int) numero;
    }

    private int CalcularCiclos() {
        if (numero > 0)
            return (int) (numero / 2147483647);
        else
            return (int) (-1 * numero / 2147483647);
    }
    
    @Override
    public String toString() {
        long diferencia = desbordamiento + 2147483647;
        if (numero > 0) {
            diferencia = desbordamiento - 2147483647;
        } else {
            diferencia = desbordamiento + 2147483647;
        }
        if (desbordamiento == 0) {
            diferencia = desbordamiento;
            return "Numero original: " + numero +  ", Ciclos: " + CalcularCiclos() + ", numero desbordado: " + desbordamiento;
        }
        return "Numero original: " + numero +", Diferencia: " + diferencia + ", Ciclos: " + CalcularCiclos() + ", numero desbordado: " + desbordamiento;
    }
}