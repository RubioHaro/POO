/*Rodrigo R. Rubio Haro*/

// se corrigió clase por class
public class Desbordamiento {

	public static void main(String[] args) {
		Desbordamiento error = new Desbordamiento();
		error.imprimirError();
	}

	int positivo = (int) (500000000000000L + 5000000000000L);
	int negativo = (int) (-2 - 2000000000000L);

	// Se incluyo el metodo imprimirError en la clase ErrorDeDesbordamiento
	public void imprimirError() {

		// se corrigió la instrucción System.out.println (le faltaban los puntos y tenia
		// argumentos de mas)
		System.out.println("positivo contiene: " + positivo);
		System.out.println("negativo contiene: " + negativo);
	}
} // corchete inecesario borrado
