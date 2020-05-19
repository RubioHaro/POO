/**
 * Palindromo
 */
public class InterfazPalindromo {

    public static void main(String[] args) {
        Verificador verificador = new Verificador();
        Menu menu = new Menu();
        int palindromo = menu.DesplegarMenu();
        verificador.imprimirSiEsPalindromo(palindromo);
    }
}