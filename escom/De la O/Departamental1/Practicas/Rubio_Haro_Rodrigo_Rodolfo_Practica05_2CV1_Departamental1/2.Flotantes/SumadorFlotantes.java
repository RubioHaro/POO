import java.io.*;

public class SumadorFlotantes {

    private float respuesta;

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
        Boolean activo = true;
        String cadena;

        System.out.println("Suma de Flotantes, ingresa enter vacio si quieres finalizar");

        respuesta = (float) 0.0;// , b;
        Float respuestaEnvoltorio;// , bf;

        while (activo) {
            cadena = pedirNumero();
            if (cadena.equals("") || cadena == null)
                activo = false;
            else {
                respuestaEnvoltorio = Float.valueOf(cadena);
                respuesta += respuestaEnvoltorio.floatValue();
            }
        }
    }

    public String pedirNumero() {
        System.out.print("Introduzca un flotante:");
        return leer();
    }

    public void imprimirRespuesta() {
        System.out.print("La suma de sus numeros es: " + respuesta);
    }
}