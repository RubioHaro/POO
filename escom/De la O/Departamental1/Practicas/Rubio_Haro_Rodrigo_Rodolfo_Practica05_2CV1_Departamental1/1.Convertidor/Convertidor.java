public class Convertidor {

    private String cadena;

    public void establecerCadena(String cadena) {
        this.cadena = cadena;
    }

    public void imprimirConversionChars() {
        // se declara un tipo char
        char c;
        // el for recorre la longitud del atributo cadena e imprime uno por uno sus
        // caracteres en forma de enteros
        for (int n = 0; n < cadena.length(); n++) {
            c = cadena.charAt(n);
            int i = Character.digit(c, 10);
            System.out.println("El numero entero es : " + i);
        }
    }

    public void imprimirConversionFloats() {
        // Se convierte la cadena en tipo float con el metodo valueOf de la clase Float
        Float fo = Float.valueOf(cadena);
        // Se imprime fo de tipo Float
        System.out.println("El objeto Flotante es : " + fo);

        // Se convierte objeto fo de tipo Floar en tipo float con el metodo floatValue
        // de la clase Float
        float f = fo.floatValue();
        // Se imprime f de tipo float
        System.out.println("El numero flotante es : " + f);
    }

    public void imprimirConversionDoubles() {
        // Se convierte la cadena en tipo Double con el metodo valueOf de la clase
        // Double
        Double D = Double.valueOf(cadena);
        // Se imprime D de tipo Double
        System.out.println("El objeto Double es : " + D);

        // Se convierte objeto D de tipo Double en tipo double con el metodo doubleValue
        // de la clase Double
        double d = D.doubleValue();
        // Se imprime d de tipo double
        System.out.println("El numero double es : " + d);
    }

    Convertidor() {
    }
}