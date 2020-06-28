package animales;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class ProbadorEnlaceAnimales {

    public static void enlazarDinamicamente(Animal animal) {
        animal.comer();
        System.out.println(animal);
    }

    public static void main(String[] args) {
        Leon nala = new Leon("hembra");
        Cocodrilo coco = new Cocodrilo("macho");
        Hombre juan = new Hombre("recolectar, fabricar, hablar", "hembra", new Avestruz(), "Bayas y Setas", 60);
        Avestruz eva = new Avestruz("macho", new Animal("Insecto", "desconocida", 0), "gramíneas ", 150);
        OsoPanda pampam = new OsoPanda("hembra");
        Koala ilaa = new Koala("hembra");

        enlazarDinamicamente(nala);
        enlazarDinamicamente(coco);
        enlazarDinamicamente(juan);
        enlazarDinamicamente(eva);
        enlazarDinamicamente(pampam);
        enlazarDinamicamente(ilaa);

    }

}
