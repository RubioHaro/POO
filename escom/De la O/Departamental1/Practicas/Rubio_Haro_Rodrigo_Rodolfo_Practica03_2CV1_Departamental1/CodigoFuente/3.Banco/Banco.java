
public class Banco {
    private String nombre;
    private Cliente clientes[];
    private int cantidadClientes;

    public Banco() {
        clientes = new Cliente[100];
        cantidadClientes = 0;
    }

    public Cliente registrarCliente(Cliente cliente, int fondos) {
        clientes[cantidadClientes] = cliente;
        cliente.establecerCuentaCheques(generarCuentaCheques(cliente, fondos));
        cantidadClientes++;
        return cliente;
    }

    private Cuenta generarCuentaCheques(Cliente cliente, int fondos) {
        Cuenta cuentaCheques = new Cuenta();
        cuentaCheques.establecerFondos(fondos);
        cuentaCheques.establecerCLABE(GenerarCLABE());
        cuentaCheques.establecerChequera(generarChequera(cliente));
        return cuentaCheques;
    }

    public Chequera generarChequera(Cliente titular){
        Chequera chequera = new Chequera();
        Cheque chequeGenerado = new Cheque();
        Cheque cheques[] = new Cheque[50]; 
        int cantidad = 50;
        for (int i = 0; i < cantidad; i++) {
            chequeGenerado.establecerCliente(titular);
            chequeGenerado.establecerFechaEmision();
            chequeGenerado.establecerFolio(591 + "-0896-" + i);
            cheques[i] = chequeGenerado;
        }
        chequera.establecerCheques(cheques);
        return chequera;
    }

    private String GenerarCLABE() {
        return "550125238550125238";
    }

}