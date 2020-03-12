import java.util.Date;

/*Utiliza los principios de Abstraccion y Modularidad para el siguiente ejemplo!
El siguiente programa corresponde a una Aplicación, sin embargo tiene errores. Compila el programa y localiza los errores. Al igual que en los anteriores corrige la indexación. 
*/
//ordenar

public class Cheque {

    // COLORES ANSI
    private final String ANSI_BLUE = "\u001B[34m";
    private final String ANSI_GREEN = "\u001B[32m";
    private final String ANSI_YELLOW = "\u001B[33m";
    private final String ANSI_RESET = "\u001B[0m";

    private Cliente titular;
    private int monto;
    private String cantidad;
    private Date fechaEmision;
    private String beneficiario;
    private String folio;

    public void establecerFolio(String folio){
        this.folio = folio;
    }

    public void establecerFechaEmision() {
        fechaEmision = new Date();
    }

    public void establecerBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void establecerCliente(Cliente titular) {
        this.titular = titular;
    }

    public void establecerMonto(int monto) {
        this.monto = monto;
        escribirCantidad();
    }

    public void escribirCantidad() {
        Identificador identificador = new Identificador();
        this.cantidad = identificador.obtenerNumero(this.monto);
    }

    public void imprimirCheque() {
        System.out.println(ANSI_GREEN
                + "*******************************************************************************************************"
                + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Banco Patito de Mexico S.A de C.V. \t\t\t\t" + ANSI_RESET + "Fecha: "
                + fechaEmision.toString() + ANSI_RESET);
        System.out.println("Titular: " + titular.toString());
        System.out.println("Beneficiario: " + ANSI_YELLOW + this.beneficiario + ANSI_RESET);
        System.out.println("Cantidad: $" + ANSI_GREEN + this.monto + ANSI_RESET + ", " + this.cantidad
                + " pesos mexicanos (mxn)");
        System.out.println("Firma:_________________\t\t\t\t Folio:" + this.folio);
        System.out.println(ANSI_GREEN
                + "*******************************************************************************************************"
                + ANSI_RESET);
    }
}
