
public class EmisorCheques {
    public static void main(String[] args) {
        Banco citi = new Banco();
        Cliente femsa = new Cliente();
        femsa.establecerRFC("FSE920910CC6");
        femsa.establecerNombre("FEMSA S.A.B. de C.V.");
        citi.registrarCliente(femsa, 50000);
        GeneradorCheques generador = new GeneradorCheques();
        generador.generarCheque(femsa.proporcionarCheque());
    }
}