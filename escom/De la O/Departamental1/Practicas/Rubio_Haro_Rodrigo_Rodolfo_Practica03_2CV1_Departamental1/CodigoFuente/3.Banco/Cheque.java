import java.util.Date;

/*Utiliza los principios de Abstraccion y Modularidad para el siguiente ejemplo!
El siguiente programa corresponde a una Aplicación, sin embargo tiene errores. Compila el programa y localiza los errores. Al igual que en los anteriores corrige la indexación. 
*/
//ordenar

public class Cheque {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    private Cliente cliente;
    private int monto;
    private String cantidad;
    //fecha Emision
    private Date date;
    //FOLIO, RFC, CLABE


    //private int n;
    //private String num;
    
    public void establecerCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void establecerMonto(int monto){
        this.monto = monto;
        escribirCantidad();
    }

    public int regresarMonto(){
        return this.monto;
    }

    public void escribirCantidad(){
        Identificador identificador = new Identificador();
        this.cantidad = identificador.obtenerNumero(this.monto);
    }
    
    public void imprimirCheque(){
        date = new Date();
        System.out.println(ANSI_GREEN +  "*******************************************************************************************************" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Banco Patito de Mexico S.A de C.V. \t\t\t\t"+ANSI_RESET + "Fecha: " + date.toString() +ANSI_RESET);
        System.out.println("Beneficiario: " + ANSI_YELLOW +cliente.regresarNombre() + ANSI_RESET );
        System.out.println("Cantidad: $" + ANSI_GREEN + this.regresarMonto() + ANSI_RESET  + ", " + this.cantidad + " pesos mexicanos (mxn)");
        System.out.println("Firma:_________________");
        System.out.println(ANSI_GREEN +  "*******************************************************************************************************" + ANSI_RESET);
    }
}
