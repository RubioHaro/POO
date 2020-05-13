import java.io.*;
public class Verificador {

    public Verificador() {
    }

    public void imprimirSiEsPalindromo(int numero) {
        if (verificarSiEsPalindromo(numero+""))
            System.out.println(numero +" Es un palindromo");
        else
            System.out.println(numero +" NO es un palindromo");
    }

    public boolean verificarSiEsPalindromo(String texto) {
        int length = texto.length();

        for (int i = 0; i <= (length / 2); i++) {
            if (texto.charAt(i) != texto.charAt((length - 1) - i))
                return false;
        }
        return true;
    }
}