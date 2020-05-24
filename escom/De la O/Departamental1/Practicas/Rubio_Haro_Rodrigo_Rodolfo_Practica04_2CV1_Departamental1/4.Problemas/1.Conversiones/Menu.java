import java.util.Scanner;

public class Menu {

    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_YELLOW = "\u001B[33m";

    public void imprimirMenu() {
        System.out.println(ANSI_GREEN);
        System.out.println("*******************************");
        System.out.println("CONVERSIONES DE TIPOS EN JAVA");
        System.out.println("*******************************");
        System.out.println(ANSI_RESET);
        System.out.println("Que tipo de conversiones quieres ver?");
        System.out.println("1, Conversiones Automaticas");
        System.out.println("2, Conversiones Explicitas");
        System.out.println(ANSI_YELLOW);
        System.out.print("Ingrese una opcion: ");

        pedirOpcion();

    }

    public void pedirOpcion() {
        Conversiones c = new Conversiones();
        int respuesta = leerOpcion();
        System.out.println(ANSI_RESET);
        switch (respuesta) {
            case 1:
                c.imprimirConversionesAutomaticas((byte) 58.6);
                break;
            case 2:
                c.imprimirConversionesExplicitas((double) 58.6);
                break;
            default:
                break;
        }
    }

    public int leerOpcion() {
        Scanner sc = new Scanner(System.in);
        int respuesta = sc.nextInt();
        sc.close();
        return respuesta;
    }
}