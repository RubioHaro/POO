package animales;

import java.util.LinkedList;
import java.util.List;
import flujos.FlujoLinkedListInputStream;
import flujos.FlujoLinkedListOutputStream;
/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class ProbadorDeFlujoLinkedList {

    public static void main(String[] args) {
        Animal[] nacimientos = {
            new Animal("macho"),
            new Animal("hembra"),
            new Animal("hembra"),
            new Animal("hembra"),
            new Animal("macho"),
            new Animal("hembra"),
            new Animal("macho")
        };

        Herbivoro[] areaHervivoros = {
            new OsoPanda("macho"),
            new OsoPanda("hembra"),
            new Caballo("macho"),
            new Caballo("hembra"),
            new Conejo("macho"),
            new Conejo("hembra"),
            new Koala("macho"),
            new Koala("hembra"),
            new Rinoceronte("macho"),
            new Rinoceronte("hembra")

        };

        Carnivoro[] areaCarnivoros = {
            new Leon("macho"),
            new Leon("hembra"),
            new Cocodrilo("macho"),
            new Cocodrilo("hembra"),
            new Hiena("macho"),
            new Hiena("hembra"),
            new Delfin("macho"),
            new Delfin("hembra"),
            new Morsa("macho"),
            new Morsa("hembra")
        };

        Omnivoro[] areaOmnivoros = {
            new Hombre("correr, saltar, hablar", "macho", new Cerdo(), "Frutas y Verduras", 75),
            new Hombre("recolectar, fabricar, hablar", "hembra", new Avestruz(), "Bayas y Setas", 60),
            new Avestruz("macho", new Animal("Insecto", "desconocida", 0), "gramíneas ", 150),
            new Avestruz("hembra", new Animal("Insecto", "desconocida", 0), "gramíneas ", 125),
            new Cerdo("macho", new Cerdo(), "maiz", 90),
            new Cerdo("macho", "cebada", 90),
            new Ardilla("macho"),
            new Ardilla("hembra"),
            new Gaviota("macho"),
            new Gaviota("hembra")
        };

        String path = "F:\\Roy\\programming\\";
        String archivoNacimientos = path + "nacimientos.obj";
        String archivoCarnivoros = path + "carnivoros.obj";
        String archivoHerbivoros = path + "herbivoros.obj";
        String archivoOmnivoro = path + "omnivoros.obj";

        FlujoLinkedListOutputStream flujoSalida = new FlujoLinkedListOutputStream(archivoNacimientos);
        System.out.println("Nacimientos hacia el flujo\n " + archivoNacimientos);
        LinkedList<Object> animales = new LinkedList<>();
        for (Animal animal : nacimientos) {
            System.out.println(animal);
            animales.add(animal);
        }
        flujoSalida.escribirObjetos(animales);
        FlujoLinkedListInputStream flujoEntrada = new FlujoLinkedListInputStream(archivoNacimientos);
        System.out.println("Nacimientos desde el flujo\n " + archivoNacimientos);
        List<Object> nacimientosRegistrados = flujoEntrada.leerObjetos();
        for (Object animal : nacimientosRegistrados) {
            System.out.println((Animal) animal);
        }

        flujoSalida = new FlujoLinkedListOutputStream(archivoCarnivoros);
        System.out.println("Carnivoros hacia el flujo\n " + archivoCarnivoros);
        LinkedList<Object> carnivoros = new LinkedList<>();
        for (Carnivoro carnivoro : areaCarnivoros) {
            System.out.println(carnivoro);
            carnivoros.add(carnivoro);
        }
        flujoSalida.escribirObjetos(carnivoros);
        flujoEntrada = new FlujoLinkedListInputStream(archivoCarnivoros);
        System.out.println("Carnivoros desde el flujo\n " + archivoCarnivoros);
        List<Object> registroCarnivoros = flujoEntrada.leerObjetos();
        for (Object carnivoro : registroCarnivoros) {
            System.out.println((Carnivoro) carnivoro);
        }

        flujoSalida = new FlujoLinkedListOutputStream(archivoHerbivoros);
        System.out.println("Herbivoros hacia el flujo\n " + archivoHerbivoros);
        LinkedList<Object> herbivoros = new LinkedList<>();
        for (Herbivoro herbivoro : areaHervivoros) {
            System.out.println(herbivoro);
            herbivoros.add(herbivoro);
        }

        flujoSalida.escribirObjetos(herbivoros);
        flujoEntrada = new FlujoLinkedListInputStream(archivoHerbivoros);

        System.out.println("Herbivoros desde el flujo\n " + archivoHerbivoros);
        List<Object> registroHerbivoros = flujoEntrada.leerObjetos();
        for (Object herbivoro : registroHerbivoros) {
            System.out.println((Herbivoro) herbivoro);
        }
        
        flujoSalida = new FlujoLinkedListOutputStream(archivoOmnivoro);
        System.out.println("Omnivoros hacia el flujo\n " + archivoOmnivoro);
        LinkedList<Object> omnivoros = new LinkedList<>();
        for (Omnivoro omnivoro : areaOmnivoros) {
            System.out.println(omnivoro);
            omnivoros.add(omnivoro);
        }

        flujoSalida.escribirObjetos(omnivoros);
        flujoEntrada = new FlujoLinkedListInputStream(archivoOmnivoro);

        System.out.println("Omnivoros desde el flujo\n " + archivoOmnivoro);
        List<Object> registroOmnivoros = flujoEntrada.leerObjetos();
        for (Object omnivoro : registroOmnivoros) {
            System.out.println((Omnivoro) omnivoro);
        }
    }
}
