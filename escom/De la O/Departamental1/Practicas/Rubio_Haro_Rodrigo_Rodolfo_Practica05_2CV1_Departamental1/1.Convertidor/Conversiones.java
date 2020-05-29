public class Conversiones {

    public static void main(String args[]) {
        Convertidor convertidor = new Convertidor();
        convertidor.establecerCadena("1234");
        convertidor.imprimirConversionChars();
        convertidor.establecerCadena("1.358");
        convertidor.imprimirConversionFloats();
        convertidor.establecerCadena("102.3654");
        convertidor.imprimirConversionDoubles();
    }
}