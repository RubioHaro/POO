/**
 * ListaArticulos
 */
public class ListaArticulos {

    private Articulo lista[];
    private int posicion;
    private int limite = 50;

    public ListaArticulos() {
        lista = new Articulo[limite];
        posicion = 0;
    }

    public ListaArticulos(int limite) {
        lista = new Articulo[limite];
        posicion = 0;
    }

    public void agregarArticulo(Articulo articulo) {
        if (!estaLLena()) {
            lista[posicion] = articulo;
            posicion++;
        }
    }

    public Articulo obtenerArticulo(int posicion) {
        if (!estaVacia()) {
            return lista[posicion];
        } else {
            return null;
        }
    }

    public boolean estaVacia() {
        return posicion == 0;
    }

    public boolean estaLLena() {
        return posicion == limite;
    }

    public void imprimir() {
        if (!estaVacia()) {
            int tam = posicion;
            for (int i = 0; i < tam; i++) {
                System.out.println(lista[i].toString());
            }
        }
    }
}