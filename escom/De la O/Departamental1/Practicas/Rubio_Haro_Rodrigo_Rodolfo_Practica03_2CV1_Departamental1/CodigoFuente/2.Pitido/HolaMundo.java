// Se agrego el public a la clase prueba2 y a esta se le cambio el nombre a HolaMundo
public class HolaMundo {
    // Se corrigio string por String
    public static void main(String args[]) {
        Mensaje mensaje = new Mensaje();
        Pitido pitido = new Pitido();
        mensaje.recibirContenido(pitido + "Hola Mundo, en todos los planetas");
		mensaje.imprimirMensaje();
    }
}
