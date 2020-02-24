
public class Discriminante {

    Trinomio trinomio;
    double valor;

    public void iniciarDiscriminante(Trinomio trinomio){
        this.trinomio = trinomio;
    }

    public boolean discriminanteEsReal() {
        valor = (trinomio.mandarValorB() * trinomio.mandarValorB()) - (4 * trinomio.mandarValorA() * trinomio.mandarValorC());

        if (valor >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public double obtenerDiscriminante() {
        return  valor;
    }

}