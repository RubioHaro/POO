public class MatrizTridimensional {

    private double[][][] valores;

    public MatrizTridimensional() {
    }

    public MatrizTridimensional(double[][][] valores) {
        this.valores = valores;
    }

    public void imprimir() {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                for (int k = 0; k < valores[i][j].length; k++)
                    System.out.print(valores[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}