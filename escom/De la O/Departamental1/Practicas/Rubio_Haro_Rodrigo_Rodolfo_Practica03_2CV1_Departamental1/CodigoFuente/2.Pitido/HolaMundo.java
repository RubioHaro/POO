// Se agrego el public a la clase prueba2 y a esta se le cambio el nombre a Prueba2
public class HolaMundo {
    // Se corrigio string por String
    public static void main(String args[]) {
        Mensaje msg = new Mensaje();
        Pitido pitido = new Pitido();
        msg.recibirContenido(""+ pitido + pitido + pitido + "Hola Mundo Nuevamente, en todos los planetas");
    }
}
