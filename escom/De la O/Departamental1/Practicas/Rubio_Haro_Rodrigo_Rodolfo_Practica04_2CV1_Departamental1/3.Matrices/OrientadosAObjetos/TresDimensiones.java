public class TresDimensiones {
    public static void main(String[] args) {
        double m[][][] = new double[3][4][5];

        int i, j, k;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++)
                for (k = 0; k < 5; k++)
                    m[i][j][k] = i * j * k;

        MatrizTridimensional matriz = new MatrizTridimensional(m);
        matriz.imprimir();
    }
}