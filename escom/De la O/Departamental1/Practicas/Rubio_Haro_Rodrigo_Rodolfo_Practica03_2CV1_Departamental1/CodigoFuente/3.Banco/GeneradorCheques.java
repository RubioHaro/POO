
/**
 * GeneradorCheques
 */

import java.io.*;

public class GeneradorCheques {

    public void generarCheque(Cheque cheque) {
        String beneficiario = pedirBeneficiario();

        boolean condicion = false;
        do {
            int monto = pedirMonto();
            if (validarMonto(monto)) {
                cheque.establecerBeneficiario(beneficiario);
                cheque.establecerMonto(monto);
                cheque.imprimirCheque();
                System.out.println("Deseas generar otro cheque para el mismo beneficiario? (S/N)");
            } else {
                System.out.println("El monto debe de ser mayor a cero y menor a diez millones de pesos mexicanos");
            }
            String response = leer();
            if (response.equalsIgnoreCase("si") || response.equalsIgnoreCase("S"))
                condicion = true;
            else
                condicion = false;
        } while (condicion);

    }

    public boolean validarMonto(int monto) {
        return (monto > 0 && monto < 10000000L);
    }

    public String pedirBeneficiario() {
        System.out.println("Ingresa el nombre del beneficiario:");
        return leer();
    }

    // Metodo leernumero

    public int pedirMonto() {
        System.out.println("Ingresa el monto:");
        try {
            int i = Integer.parseInt(leer());
            return i;
        } catch (Exception e) {
            return 0;
        }

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

}