/*Rodrigo R. Rubio Haro*/

public class Datos {
    private int _entero;
    private float _float;
    private byte _byte;
    private char _char;
    private short _short;
    private long _long;
    private double _doble;
    private boolean _boolean;

    public Datos() {
        int n=10000;
        _char= 'c';
        _entero = (int) ((Math.random() * n) + 1);
        _float = (float) ((Math.random() * n) + 1);
        _byte = (byte) ((Math.random() * n) + 1);
        _short = (short) ((Math.random() * n) + 1);
        _long = (long) ((Math.random() * n) + 1);
        _doble =(double) ((Math.random() * n) + 1);
        _boolean = (boolean) (Math.random() < 0.5);
    }

    public void imprimirDatos(){
        System.out.println("dato entero: " + _entero);
        System.out.println("dato float: " + _float);
        System.out.println("dato byte: " + _byte);
        System.out.println("dato char: " + _char);
        System.out.println("dato short: " + _short);
        System.out.println("dato long: " + _long);
        System.out.println("dato double: " + _doble);
        System.out.println("dato bool: " + _boolean);
    }
}