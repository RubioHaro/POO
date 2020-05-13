class DosDim {

    public static void main(String args[]) {
        // Se crea una matriz de enteros
        int dosD[][] = new int[4][];
        // Se inician los arreglos (de enteros) para cada una de las filas de la matriz
        dosD[0] = new int[1];
        dosD[1] = new int[2];
        dosD[2] = new int[3];
        dosD[3] = new int[4];

        int i, j, k = 0;
        // Se inician variables temporales para recorrer las liste (i,j) y se crea un
        // contador (k)
        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                // Recorriendo todos los elementos de la lista de va agregando en orden, un
                // valor k.
                // El valor va aumentando en una unidad (k++)
                dosD[i][j] = k;
                k++;
            }

        // imprime la lista
        for (i = 0; i < 4; i++) {

            for (j = 0; j < i + 1; j++)

                System.out.print(dosD[i][j] + " ");

            System.out.println();
        }
    }

}