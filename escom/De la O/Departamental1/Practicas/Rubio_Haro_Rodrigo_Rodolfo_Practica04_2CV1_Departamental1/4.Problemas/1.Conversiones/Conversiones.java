public class Conversiones {

    private byte _byte;
    private short _short;
    private int _int;
    private long _long;
    private float _float;
    private double _double;

    private final String ANSI_BLUE = "\u001B[34m";
    private final String ANSI_RESET = "\u001B[0m";

    public void imprimirConversionesAutomaticas(byte numero) {
        System.out.println(ANSI_BLUE);
        System.out.println("Conversiones Automaticas");
        System.out.println("******************* Generales *******************");
        System.out.println("byte -> short -> int-> long -> float -> double");
        System.out.println(ANSI_RESET);

        _byte = numero;
        System.out.println("original byte:" + _byte);

        _short = _byte;
        System.out.println("byte to short:" + _short);

        _int = _short;
        System.out.println("short to int:" + _int);

        _long = _int;
        System.out.println("int to long:" + _long);

        _float = _long;
        System.out.println("lonh to float:" + _float);

        _double = _float;
        System.out.println("float to double:" + _double);

        System.out.println(ANSI_BLUE);
        System.out.println("Ademas podemos realizar las conversiones intermedias:");
        System.out.println("******************* byte *******************");
        System.out.println(ANSI_RESET);

        _byte++;
        System.out.println("new byte:" + _byte);

        _int = _byte;
        System.out.println("byte to int:" + _int);

        _long = _byte;
        System.out.println("byte to long:" + _long);

        _float = _byte;
        System.out.println("byte to float:" + _float);

        _double = _byte;
        System.out.println("byte to double:" + _double);

        System.out.println(ANSI_BLUE);
        System.out.println("******************* short *******************");
        System.out.println(ANSI_RESET);

        _short += 2;
        System.out.println("new short:" + _short);
        _long = _short;
        System.out.println("short to long:" + _long);

        _float = _short;
        System.out.println("short to float:" + _float);

        _double = _short;
        System.out.println("short to double:" + _double);

        System.out.println(ANSI_BLUE);
        System.out.println("******************* int *******************");
        System.out.println(ANSI_RESET);

        _int++;
        System.out.println("new int:" + _int);

        _float = _int;
        System.out.println("int to float:" + _float);

        _double = _int;
        System.out.println("int to double:" + _double);

        System.out.println(ANSI_BLUE);
        System.out.println("******************* long *******************");
        System.out.println(ANSI_RESET);

        _long++;
        System.out.println("new long:" + _long);
        _double = _long;
        System.out.println("long to double:" + _double);

    }

    public void imprimirConversionesExplicitas(double numero) {
        System.out.println(ANSI_BLUE);
        System.out.println("Conversiones Explicitas");
        System.out.println("******************* Generales *******************");
        System.out.println("double -> float -> long-> int -> short -> byte");
        System.out.println("En estas conversiones podemos tener problemas de desbordamiento");
        System.out.println("******************* Generales *******************");
        System.out.println(ANSI_RESET);
        _double = numero;
        System.out.println("original double:" + _double);

        _float = (float) _double;
        System.out.println("double -> float:" + _float);

        _long = (long) _float;
        System.out.println("float -> long:" + _long);

        _int = (int) _long;
        System.out.println("long -> int:" + _int);

        _short = (short) _int;
        System.out.println("int -> short:" + _short);

        _byte = (byte) _short;
        System.out.println("short -> byte:" + _byte);

        System.out.println(ANSI_BLUE);
        System.out.println("Ademas podemos realizar las conversiones intermedias:");
        System.out.println("******************* double *******************");
        System.out.println(ANSI_RESET);

        _double++;
        System.out.println("new double:" + _double);

        _long = (long) _double;
        System.out.println("double -> long:" + _long);

        _int = (int) _double;
        System.out.println("double -> int:" + _int);

        _short = (short) _double;
        System.out.println("double -> short:" + _short);

        _byte = (byte) _double;
        System.out.println("double -> byte:" + _byte);

        System.out.println(ANSI_BLUE);
        System.out.println("******************* float *******************");
        System.out.println(ANSI_RESET);

        _float += 2;
        System.out.println("new float:" + _float);

        _int = (int) _float;
        System.out.println("float -> int:" + _int);

        _short = (short) _float;
        System.out.println("float -> short:" + _short);

        _byte = (byte) _float;
        System.out.println("float -> byte:" + _byte);

        System.out.println(ANSI_BLUE);
        System.out.println("******************* long *******************");
        System.out.println(ANSI_RESET);
        _long++;
        System.out.println("new long:" + _long);

        _short = (short) _long;
        System.out.println("long -> short:" + _short);

        _byte = (byte) _long;
        System.out.println("long -> byte:" + _byte);
        
        System.out.println(ANSI_BLUE);
        System.out.println("******************* int *******************");
        System.out.println(ANSI_RESET);
        _int++;
        System.out.println("new long:" + _int);
        _byte = (byte) _int;
        System.out.println("int -> byte:" + _byte);

    }

}