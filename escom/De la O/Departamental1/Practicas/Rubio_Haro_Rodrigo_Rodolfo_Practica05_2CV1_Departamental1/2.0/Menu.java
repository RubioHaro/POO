import java.io.*;

public class Menu {

    public String leer() {
        String s = "";
        DataInputStream sd = new DataInputStream(System.in);
        System.out.flush();
        try {
            s = sd.readLine();
        } catch (IOException e) {
            System.out.println("ERROR: Se introdujo el dato");
            System.out.println(e);
        }
        return s;
    }

    public void sumarFlotantes() {
        String cadena;
        Boolean activo = true;
        float a = (float) 0.0;// , b;
        Float af;// , bf;
        while (activo) {
            System.out.print("Introduzca un flotante:");
            cadena = leer();
            if (cadena.equals("") || cadena == null) {
                activo = false;
            } else {
                af = Float.valueOf(cadena);
                a += af.floatValue();
            }
        }
        System.out.print("La suma de sus numeros es: " + a);
    }
}