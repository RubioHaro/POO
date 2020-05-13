import java.util.Date;

/**
 * Cuenta
 */
public class Cuenta {

    private String numeroCuenta;
    private Double saldo;
    private Double limiteCredito;
    private Double saldoInicial;
    private ListaArticulos articulos;
    private Date inicioDePeriodo;

    public Cuenta(Double saldoInicial, String numeroCuenta, Date inicioDePeriodo) {
        this.numeroCuenta = numeroCuenta;
        this.saldoInicial = saldoInicial;
        this.inicioDePeriodo = inicioDePeriodo;
        saldo = saldoInicial;
        limiteCredito = 30000D;
        articulos = new ListaArticulos();
    }

    public String obtenerNumeroCuenta() {
        return numeroCuenta;
    }

    public String cargarArticulo(Articulo articulo) {
        String msg;
        Double nuevoSaldo = this.saldo + articulo.obtenerPrecio();
        if (verificarLimite(articulo.obtenerPrecio())) {
            saldo = nuevoSaldo;
            articulos.agregarArticulo(articulo);
            msg = "Mov. cargado:" + articulo + " El nuevo saldo es:" + nuevoSaldo;
        } else {
            msg = "Se ha excedido el limite de credito, no se ha podido cargar:" + articulo + " Tu saldo es: "
                    + this.saldo + "montoACargar:" + nuevoSaldo;
        }
        return msg;
    }

    private boolean verificarLimite(Double montoACargar) {
        return (montoACargar <= (limiteCredito - saldo));
    }

    public void modificarLimiteDeCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void imprimirEstadoCuenta() {
        System.out.println("**************************************************");
        System.out.println("Datos del cliente:");
        /*
         * Nombre
         * Direccion
         * 
         * No. trajeta
         * RFC cliente
         * 
         * Informacion de la cuenta
         * Limite de credito
         * Credito disponible
         * Fecha de corte
         * Periodo
         * Dias del periodo
         * Contrato: Cuenta CLABE
         * 
         * Promedio de saldos diarios
         * promedio de saldos diarios vencidos
         * Tasa anual por saldos a favor
         * 
         * RESUMEN DE SALDOS Y MOVIMIENTOS
         * Saldo al corte anterior
         * Compras y disposisiones
         * Pagos
         * Otros Abonos
         * IVA
         * Saldo actual al corte
         * Saldo de pagos fijos
         * Saldo Total
         * 
         */
        System.out.println("ESTADO DE CUENTA: " + numeroCuenta);
        articulos.imprimir();
        System.out.println("Saldo Inicial: $" + saldoInicial + " pesos al " + inicioDePeriodo.toLocaleString());
        System.out.println("Saldo Actual: $" + saldo + " pesos al " + new Date().toLocaleString());
        System.out.println(
                "limite de credito: $" + limiteCredito + " pesos. Credito restante: $" + (limiteCredito - saldo));
        System.out.println("**************************************************");
    }
}