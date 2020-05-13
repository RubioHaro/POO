/*Rodrigo R. Rubio Haro*/

public class Datos {
    private int _entero;
    private float _float;
    private byte _byte;
    private char _char;
    private short _short;
    private long _long;
    private double _doble;

    public Datos() {
        _char = (char) 128;
        _entero = (int) 2147483648L;
        _float = (float) (1.79769313486231570E+308 + 1);
        _byte = (byte) 256;
        _short = (short) 32768;
        _long = (long) 9223372036854775808D;
        _doble = (double) 1.79769313486231570E+308 + 1;
    }

    public void imprimirDatos() {
        System.out.println("dato entero: " + _entero);
        System.out.println("dato float: " + _float);
        System.out.println("dato byte: " + _byte);
        System.out.println("dato char: " + _char);
        System.out.println("dato short: " + _short);
        System.out.println("dato long: " + _long);
        System.out.println("dato double: " + _doble);
    }
}