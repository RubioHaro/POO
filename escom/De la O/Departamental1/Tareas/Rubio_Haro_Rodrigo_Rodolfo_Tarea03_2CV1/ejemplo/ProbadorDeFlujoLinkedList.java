package ejemplo;

import java.util.LinkedList;
import java.util.List;
import flujos.FlujoLinkedListInputStream;
import flujos.FlujoLinkedListOutputStream;

/**
 *
 * @author sdelaot
 */
public class ProbadorDeFlujoLinkedList {

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
        String archivoN = path + "nacimientoslist.obj";
        String archivoR = path + "reunionlist.obj";
        String archivo2 = path + "dosCV1list.obj";
        
        
        FlujoLinkedListOutputStream flujoSalida = new FlujoLinkedListOutputStream(archivoN);
        System.out.println("Nacimientos hacia el flujo\n " + archivoN);
        LinkedList<Object> humanos = new LinkedList<>();
        for (SerHumano humano : nacimientos) {
            System.out.println(humano);
            humanos.add(humano);
        }
        flujoSalida.escribirObjetos(humanos);
        FlujoLinkedListInputStream flujoEntrada = new FlujoLinkedListInputStream(archivoN);
        System.out.println("Nacimientos desde el flujo\n " + archivoN);
        List<Object> nacimientosRegistrados = flujoEntrada.leerObjetos();
        for (Object humano : nacimientosRegistrados) {
            System.out.println((SerHumano) humano);
        }
        flujoSalida = new FlujoLinkedListOutputStream(archivoR);
        System.out.println("Personas hacia el flujo\n " + archivoR);
        LinkedList<Object> personas = new LinkedList<>();
        for (Persona persona : reunion) {
            System.out.println(persona);
            personas.add(persona);
        }
        flujoSalida.escribirObjetos(personas);
        flujoEntrada = new FlujoLinkedListInputStream(archivoR);
        System.out.println("Personas desde el flujo\n " + archivoR);
        List<Object> personasReunion = flujoEntrada.leerObjetos();
        for (Object persona : personasReunion) {
            System.out.println((Persona) persona);
        }

        flujoSalida = new FlujoLinkedListOutputStream(archivo2);
        System.out.println("Estudiantes hacia el flujo\n " + archivo2);
        LinkedList<Object> estudiantes = new LinkedList<>();
        for (Estudiante estudiante : dosCV1) {
            System.out.println(estudiante);
            estudiantes.add(estudiante);
        }

        flujoSalida.escribirObjetos(estudiantes);
        flujoEntrada = new FlujoLinkedListInputStream(archivo2);

        System.out.println(
                "Estudiantes desde el flujo\n " + archivo2);
        List<Object> estudiantesRegistrados = flujoEntrada.leerObjetos();
        for (Object estudiante : estudiantesRegistrados) {
            System.out.println((Estudiante) estudiante);
        }
    }
}
