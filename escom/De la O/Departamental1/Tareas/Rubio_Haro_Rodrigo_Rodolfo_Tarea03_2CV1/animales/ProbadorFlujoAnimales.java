package animales;

import flujos.FlujoObjectInputStream;
import flujos.FlujoObjectOutputStream;
import ejemplo.SerHumano;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class ProbadorFlujoAnimales {

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
        String archivoHervivoros = path + "herbivoros.obj";
        String archivoOmnivoro = path + "omnivoros.obj";

        FlujoObjectOutputStream flujoSalida = new FlujoObjectOutputStream(archivoNacimientos);

        System.out.println(
                "Nacimientos hacia el flujo\n " + archivoNacimientos);
        for (Animal animal : nacimientos) {
            System.out.println(animal);
        }

        flujoSalida.escribirObjetos(nacimientos);

        FlujoObjectInputStream flujoEntrada = new FlujoObjectInputStream(archivoNacimientos);

        System.out.println(
                "Nacimientos desde el flujo\n " + archivoNacimientos);
        Object[] nacimientosRegistrados = flujoEntrada.leerObjetos();

        for (Object animal : nacimientosRegistrados) {
            System.out.println((Animal) animal);
        }

        flujoSalida = new FlujoObjectOutputStream(archivoCarnivoros);

        System.out.println(
                "Registro de Carnivoros hacia el flujo\n " + archivoCarnivoros);
        for (Carnivoro carnivoro : areaCarnivoros) {
            System.out.println(carnivoro);
        }

        flujoSalida.escribirObjetos(areaCarnivoros);
        flujoEntrada = new FlujoObjectInputStream(archivoCarnivoros);

        System.out.println(
                "Registro de Carnivoros desde el flujo\n " + archivoCarnivoros);
        Object[] carnivorosRegistrados = flujoEntrada.leerObjetos();

        for (Object carnivoro : carnivorosRegistrados) {
            System.out.println((Carnivoro) carnivoro);
        }

        flujoSalida = new FlujoObjectOutputStream(archivoHervivoros);

        System.out.println(
                "Registro de Herbivoros registrados hacia el flujo\n " + archivoHervivoros);
        for (Herbivoro herbivoro : areaHervivoros) {
            System.out.println(herbivoro);
        }

        flujoSalida.escribirObjetos(areaHervivoros);
        flujoEntrada = new FlujoObjectInputStream(archivoHervivoros);

        System.out.println(
                "Registro de Herbivoros desde el flujo\n " + archivoHervivoros);
        Object[] herbivorosRegistrados = flujoEntrada.leerObjetos();
        for (Object estudiante : herbivorosRegistrados) {
            System.out.println((Herbivoro) estudiante);
        }

        // *********************************************
        flujoSalida = new FlujoObjectOutputStream(archivoOmnivoro);

        System.out.println(
                "Registro de Omnivoros hacia el flujo\n " + archivoOmnivoro);
        for (Omnivoro omnivoro : areaOmnivoros) {
            System.out.println(omnivoro);
        }

        flujoSalida.escribirObjetos(areaOmnivoros);
        flujoEntrada = new FlujoObjectInputStream(archivoOmnivoro);

        System.out.println(
                "Registro de Omnivoros desde el flujo\n " + archivoOmnivoro);
        Object[] omnivorosRegistrados = flujoEntrada.leerObjetos();

        for (Object omnivoro : omnivorosRegistrados) {
            System.out.println((Omnivoro) omnivoro);
        }

    }
}
