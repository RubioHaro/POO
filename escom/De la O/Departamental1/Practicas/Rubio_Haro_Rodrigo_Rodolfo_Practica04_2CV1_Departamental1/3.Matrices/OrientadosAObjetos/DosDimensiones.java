public class DosDimensiones {

    public static void main(String args[]) {

        // Se crea una matriz de enteros
        double m[][] = new double[4][];
        // Se inician los arreglos (de enteros) para cada una de las filas de la matriz
        m[0] = new double[1];
        m[1] = new double[2];
        m[2] = new double[3];
        m[3] = new double[4];

        int i, j, k = 0;
        // Se inician variables temporales para recorrer las liste (i,j) y se crea un
        // contador (k)
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                // Recorriendo todos los elementos de la lista de va agregando en orden, un
                // valor k.
                // El valor va aumentando en una unidad (k++)
                m[i][j] = k;
                k++;
            }

        Matriz matriz = new Matriz(m);
        matriz.imprimir();

    }
}