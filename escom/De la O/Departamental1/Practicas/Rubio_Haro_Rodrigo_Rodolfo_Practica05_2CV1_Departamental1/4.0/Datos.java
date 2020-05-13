/*Rodrigo R. Rubio Haro*/

public class Datos {
    private Integer _entero;
    private Float _float;
    private Byte _byte;
    private Character _char;
    private Short _short;
    private Long _long;
    private Double _doble;
    private Boolean _boolean;

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
        System.out.println("dato Integer: " + _entero);
        System.out.println("dato Float: " + _float);
        System.out.println("dato Byte: " + _byte);
        System.out.println("dato Character: " + _char);
        System.out.println("dato Short: " + _short);
        System.out.println("dato Long: " + _long);
        System.out.println("dato Double: " + _doble);
        System.out.println("dato Boolean: " + _boolean);
    }
}