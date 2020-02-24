public class FormulaGeneral {
    Raiz raiz1, raiz2;

    Discriminante dis;

    public void iniciarFormula(Trinomio trinomio) {
        raiz1 = new Raiz();
        raiz2 = new Raiz();

        dis = new Discriminante();
        dis.iniciarDiscriminante(trinomio);

        double divisor = trinomio.mandarValorA() * 2;

        if (dis.discriminanteEsReal()) {
            raiz1.establecerRaizReal(((-trinomio.mandarValorB()) +  Math.sqrt(dis.obtenerDiscriminante())) / divisor);
            raiz2.establecerRaizReal(((-trinomio.mandarValorB()) -  Math.sqrt(dis.obtenerDiscriminante())) / divisor);
        } else {
            raiz1.establecerRaizCompleja( Math.sqrt((-1) * dis.obtenerDiscriminante()) / divisor , -trinomio.mandarValorB() / divisor  );
            raiz2.establecerRaizCompleja(  -1 * Math.sqrt((-1) * dis.obtenerDiscriminante()) / divisor , -trinomio.mandarValorB() / divisor );
        }
    }

    public void mostrarResultados() {
        raiz1.imprimir();
        raiz2.imprimir();
    }

}