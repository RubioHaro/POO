public class Matriz {

    private double[][] valores;

    public Matriz() {
    }

    public Matriz(double[][] valores) {
        this.valores = valores;
    }

    public void imprimir() {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++)
                System.out.print(valores[i][j] + " ");
            System.out.println();
        }
    }
}