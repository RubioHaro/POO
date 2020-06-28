package ejemplo;

import flujos.FlujoObjectInputStream;
import flujos.FlujoObjectOutputStream;

/**
 *
 * @author sdelaot
 */
public class ProbadorDeFlujoObject {

    public static void main(String[] args) {
        SerHumano[] nacimientos = {
            new SerHumano("masculino"),
            new SerHumano("femenino"),
            new SerHumano("femenino"),
            new SerHumano("femenino"),
            new SerHumano("masculino"),
            new SerHumano("femenino"),
            new SerHumano("masculino")
        };
        Persona[] reunion = {
            new Persona("femenino", "Rocio De La O", 15),
            new Persona("femenino", "Patricia Ramirez", 16),
            new Persona("masculino", "Carlos Romero", 16),
            new Persona("femenino", "Karla Mendez", 15),
            new Persona("masculino", "Gerardo Gonzalez", 16),
            new Persona("femenino", "Diana Perez", 15),
            new Persona("masculino", "Rodrigo Juarez", 15)
        };
        Estudiante[] dosCV1 = {
            new Estudiante("masculino", "Rodrigo Juarez", 19, "2019131415"),
            new Estudiante("femenino", "Alicia Jimenez", 18, "2019131416"),
            new Estudiante("masculino", "Diego Valverde", 20, "2019131417"),
            new Estudiante("femenino", "Juana Torres", 18, "2019131418"),
            new Estudiante("femenino", "Felicia Alvarado", 19, "2019131419"),
            new Estudiante("masculino", "Carlos mendiola", 20, "2019131420"),
            new Estudiante("femenino", "Jimena Galicia", 19, "2019131421")
        };
        String path = "F:\\Roy\\programming\\";
        String archivoN = path + "nacimientos.obj";
        String archivoR = path + "reunion.obj";
        String archivo2 = path + "dosCV1.obj";
        FlujoObjectOutputStream flujoSalida = new FlujoObjectOutputStream(archivoN);
        System.out.println("Nacimientos hacia el flujo\n " + archivoN);
        for (SerHumano humano : nacimientos) {
            System.out.println(humano);
        }
        flujoSalida.escribirObjetos(nacimientos);
        FlujoObjectInputStream flujoEntrada = new FlujoObjectInputStream(archivoN);
        System.out.println("Nacimientos desde el flujo\n " + archivoN);
        Object[] nacimientosRegistrados = flujoEntrada.leerObjetos();

        for (Object humano : nacimientosRegistrados) {
            System.out.println((SerHumano) humano);
        }

        flujoSalida = new FlujoObjectOutputStream(archivoR);
        System.out.println("Reunion de Personas hacia el flujo\n " + archivoR);
        for (Persona alguien : reunion) {
            System.out.println(alguien);
        }
        flujoSalida.escribirObjetos(reunion);
        flujoEntrada = new FlujoObjectInputStream(archivoR);
        System.out.println("Reunion de Personas desde el flujo\n " + archivoN);
        Object[] personasEnReunion = flujoEntrada.leerObjetos();
        for (Object alguien : personasEnReunion) {
            System.out.println((Persona) alguien);
        }
        flujoSalida = new FlujoObjectOutputStream(archivo2);
        System.out.println(
                "Estudiantes registrados hacia el flujo\n " + archivo2);
        for (Estudiante estudiante : dosCV1) {
            System.out.println(estudiante);
        }
        flujoSalida.escribirObjetos(dosCV1);
        flujoEntrada = new FlujoObjectInputStream(archivo2);
        System.out.println(
                "Estudiantes del grupo delde el flujo\n " + archivo2);
        Object[] delGrupo2CV1 = flujoEntrada.leerObjetos();
        for (Object estudiante : delGrupo2CV1) {
            System.out.println((Estudiante) estudiante);
        }
    }
}
