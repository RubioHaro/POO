/**
 * Rubio Haro Rodrigo R.
 */
public class Calculadora {
    Trinomio trinomio;

    public void resolverPorFormulaGeneral(double[] cofactores){
        trinomio = new Trinomio();
        trinomio.establecerValores(cofactores);
        trinomio.imprimir();

        FormulaGeneral fg = new FormulaGeneral();
        fg.iniciarFormula(trinomio);
        fg.mostrarResultados();
    }
}
