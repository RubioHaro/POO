
/**
 * Banco
 */
import java.io.*;

public class Banco {

    public void generarCheque() {
        Cliente cliente = new Cliente();
        cliente.establecerNombre("Rodrigo");
        Cheque cheque = new Cheque();

        cheque.establecerCliente(pedirBeneficiario());

        boolean condicion = true;

        while (condicion) {
            int monto = pedirMonto();

            if (montoValido(monto)) {
                cheque.establecerMonto(monto);
                cheque.imprimirCheque();
                System.out.println("Cheque generado gracias por usar Banco Patito de Mexico S.A. de C.V.");
                System.out.println("Deseas generar otro cheque para el mismo beneficiario? (S/N)");
            } else {
                System.out.println("El monto debe de ser mayor a cero y menor a diez millones de pesos mexicanos");
                System.out.println("Deseas corregir el metodo? (S/N)");
            }

            if (leer().equalsIgnoreCase("N") || leer().equalsIgnoreCase("no"))
                condicion = false;
        }
        // cheque.establecerMonto(5301);

    }

    public boolean montoValido(int monto) {
        return (monto > 0 && monto < 10000000L);
    }

    public void generarCheque(int monto) {
        Cliente cliente = new Cliente();
        cliente.establecerNombre("Rodrigo");
        Cheque cheque = new Cheque();

        cheque.establecerCliente(pedirBeneficiario());
        cheque.establecerMonto(monto);
        // cheque.establecerMonto(5301);
        cheque.imprimirCheque();
    }

    public Cliente pedirBeneficiario() {
        Cliente cliente = new Cliente();
        System.out.println("Ingresa el nombre del beneficiario:");
        //cliente.establecerNombre("Roy");
        cliente.establecerNombre(leer());
        return cliente;
    }

    // Metodo leernumero

    public int pedirMonto() {
        System.out.println("Ingresa el monto:");
        return Integer.parseInt(leer());
    }

    public String leer() {
        String s = "";
        final DataInputStream sd = new DataInputStream(System.in);
        System.out.flush();
        try {
            s = sd.readLine();
        } catch (final IOException e) {
            System.out.println("ERROR: Se introdujo el dato");
            System.out.println(e);
        }
        return s;
    }

    // programa principal public static void main (String args[]) { String
    // nombre="";
    /*
     * public static void main(String args[]) {
     * System.out.println("Dame tu nombre: "); //nombre = leer();
     * System.out.println("Dame la cantidad: "); //num = leer(); //leernumero();
     * System.out.
     * println("Banco Patito de Mexico \t\t\t\t\t\tFecha:_________________");
     * //System.out.println("Nombre: " + nombre);
     * System.out.println("Firma:_________________"); }
     */

}