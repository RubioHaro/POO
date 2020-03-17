public class EmisorCheques {
    public static void main(String[] args) {
        Cheque cheque; 

        Banco citi = new Banco();
        Cliente Cliente = new Cliente();
        Cliente.establecerRFC("FSE920910CC6");
        Cliente.establecerNombre("FEMSA S.A.B. de C.V.");
        citi.registrarCliente(Cliente, 50000);

        cheque = Cliente.proporcionarCheque();
        GeneradorCheques generador = new GeneradorCheques();
        generador.generarCheque(cheque);
    }
}