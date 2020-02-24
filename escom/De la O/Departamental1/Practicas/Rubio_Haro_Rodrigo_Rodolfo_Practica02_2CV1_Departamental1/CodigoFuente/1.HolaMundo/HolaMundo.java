/*Rodrigo R. Rubio Haro*/

public class HolaMundo{
    public static void main(String args[]){
		Mensaje msg = new Mensaje();
		
		if(args.length >= 1){
			msg.recibirContenido(args[0]);
		}else{
			msg.recibirContenido("No ha escrito un mensaje");
		}

		msg.imprimirMensaje();
	}
}