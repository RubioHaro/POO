import java.io.*;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public int DesplegarMenu() {
        System.out.print("Ingresa un palindromo:");
        return leer();
    }

    public int leer() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        numero = sc.nextInt();
        sc.close();
        return numero;
    }
}