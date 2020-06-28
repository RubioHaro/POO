/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

/**
 *
 * @author chavo
 */
public class OtroNuevoHilo implements Runnable {

    String nombre;// nombre del hilo
    Thread t;

    OtroNuevoHilo(String suNombre) {
        nombre = suNombre;
        t = new Thread(this, nombre);
        System.out.println("Nuevo hilo : " + t);
        t.start(); // comienza el hilo
    }
    //Este es el punto de entrada del hilo.

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(nombre + " : " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo " + nombre);
        }
        System.out.println("Sale del hilo : " + nombre);
    }
}
