/*Rodrigo R. Rubio Haro*/
public class Desbordamiento {

	public static void main(String[] args) {

		Numero positivo = new Numero();
		Numero negativo = new Numero();

		positivo.establecerNumero(2147483648L+2147483648L);
		// 505000000000000   ÷   2147483647 = 235,158.9501999127

		negativo.establecerNumero(-2147483648);
		// 505000000000000   ÷   2147483647 = 235,158.9501999127

		Mensaje mensaje1 = new Mensaje();
		Mensaje mensaje2 = new Mensaje();

		 mensaje1.recibirContenido("positivo: "+ positivo);
		 mensaje2.recibirContenido("negativo: "+ negativo);

		mensaje1.imprimir();
		mensaje2.imprimir();
	}
} 