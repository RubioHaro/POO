import java.io.*;
import java.util.Scanner;

public class Menu {
    int numero;

    public Menu() {
        numero = 0;
    }

    public int DesplegarMenu() {
        System.out.print("Ingresa un palindromo:");
        return leer();
    }

    private int leer() {
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        sc.close();
        return numero;
    }
}