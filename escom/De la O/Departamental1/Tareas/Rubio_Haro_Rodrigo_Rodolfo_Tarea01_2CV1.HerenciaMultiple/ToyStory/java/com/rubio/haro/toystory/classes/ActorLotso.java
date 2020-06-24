package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class ActorLotso implements Lotso {

    public ActorLotso() {
    }

    
    @Override
    public void defraudar() {
        System.out.println("lotso, llenó de rencor, defrauda en el peor momento");
    }

    @Override
    public void regalar() {
        System.out.println("lotso es regalado :cc");
    }

    @Override
    public void comer() {
        System.out.println("lotso come, es un oso");
    }

    @Override
    public void oler() {
        System.out.println("lotso huele a frutas");
    }

    @Override
    public void traicionar(Heroe heroe) {
        System.out.println("lotso, llenó de rencor, traiciona a " + heroe);

    }
}
