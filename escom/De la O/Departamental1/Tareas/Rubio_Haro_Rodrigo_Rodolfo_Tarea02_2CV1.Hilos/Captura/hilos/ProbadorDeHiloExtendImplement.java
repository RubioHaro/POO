/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hilos;

import Hilos.HiloEmulado;
import Hilos.HiloHerencia;

/**
 *
 * @author chavo
 */
public class ProbadorDeHiloExtendImplement {

    public static void main(String[] args) {
        HiloEmulado me1 = new HiloEmulado(1);
        HiloEmulado me2 = new HiloEmulado(2);
        HiloEmulado me3 = new HiloEmulado(3);
        HiloHerencia mh1 = new HiloHerencia(1);
        HiloHerencia mh2 = new HiloHerencia(2);
        HiloHerencia mh3 = new HiloHerencia(3);
        Thread principal = Thread.currentThread();

        System.out.println(principal.getName());
        principal.setName("Hilo principal");
        System.out.println(principal.getName());
        me1.start();

        me2.start();
        me3.start();
        mh1.start();
        mh2.start();
        mh3.start();

        try {
            for (int contador = 5; contador >= 0; contador--) {
                System.out.println(principal.getName() + " : " + contador);
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
