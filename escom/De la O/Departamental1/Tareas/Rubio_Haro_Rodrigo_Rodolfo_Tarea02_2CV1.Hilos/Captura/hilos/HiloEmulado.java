/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

/**
 *
 * @author chavo
 */
public class HiloEmulado implements Runnable {

    private int idDeHilo;
    private Thread hiloEmulado;
    private int contador;

    public HiloEmulado(int id) {
        hiloEmulado = new Thread(this, "Hilo Emulado");
        idDeHilo = id;
    }

    public void start() {
        hiloEmulado.start();
    }

    @Override
    public void run() {
        try {
            for (contador = 5; contador >= 0; contador--) {
                System.out.println(idDeHilo + ") "
                        + hiloEmulado.getName() + " : " + contador);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
