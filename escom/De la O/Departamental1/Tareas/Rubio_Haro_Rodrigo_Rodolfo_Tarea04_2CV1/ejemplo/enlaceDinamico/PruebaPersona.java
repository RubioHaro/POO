package polimorfismo.enlaceDinamico;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class PruebaPersona {

    public static void enlazarDinamicamente(SerHumano humano) {
        humano.respirar();
        System.out.println(humano);
    }

    public static void main(String[] args) {
        SerHumano unHumano = new SerHumano("femenino");
        Persona pedro = new Persona("masculino", "Pedro Flores", 45);
        Estudiante luisa = new Estudiante("femenino", "Luisa Garcia", 18, "2018636700");
        enlazarDinamicamente(unHumano); // se ejecuta SerHumano.respirar() y SerHumano.toString();
        enlazarDinamicamente(pedro); // Se ejecuta Persona.respirar() y Persona.toString()
        enlazarDinamicamente(luisa); // Se ejecuta Estudiante.respirar() y Estudiante.toString()
    }
}
