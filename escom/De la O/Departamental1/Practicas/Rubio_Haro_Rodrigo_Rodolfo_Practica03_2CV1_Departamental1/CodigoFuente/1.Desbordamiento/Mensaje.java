/*Rodrigo R. Rubio Haro*/

public class Mensaje {
	private String contenido;

	public void recibirContenido(String contenido) {
		this.contenido = contenido;
	}

	public void imprimir() {
		System.out.println(contenido);
	}
}