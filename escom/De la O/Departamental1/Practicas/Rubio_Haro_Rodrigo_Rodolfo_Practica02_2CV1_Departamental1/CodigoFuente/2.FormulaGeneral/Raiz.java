
public class Raiz {
    private double real;
    private double complejo;

    public void establecerRaizReal(double real) {
        this.real = real;
    }

    public void establecerRaizCompleja(double complejo, double real) {
        this.real = real;
        this.complejo = complejo;
    }

    public void imprimir() {
        System.out.print("x = " + real);
        if (this.complejo != 0) {
            System.out.println(" + " + complejo + "i");
        }
    }

}