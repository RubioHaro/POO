/**
 * Palindromo
 */
public class Palindromo {

    public static void main(String[] args) {
        Verificador verificador = new Verificador();
        Menu menu = new Menu();
        verificador.imprimirSiEsPalindromo(menu.DesplegarMenu());
    }
}