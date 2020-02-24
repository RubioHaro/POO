
public class Trinomio {
    private double a;
    private double b;
    private double c; 
    
    public void establecerValores(double[] cofactores){
        this.a = cofactores[0];
        this.b = cofactores[1];
        this.c = cofactores[2];
    }

    public double mandarValorA(){
        return a;
    }

    public double mandarValorB(){
        return b;
    }

    public double mandarValorC(){
        return c;
    }

    public void imprimir(){
        System.out.println( a + "x² + " + b + "x + " + c + " = 0");
    }
}