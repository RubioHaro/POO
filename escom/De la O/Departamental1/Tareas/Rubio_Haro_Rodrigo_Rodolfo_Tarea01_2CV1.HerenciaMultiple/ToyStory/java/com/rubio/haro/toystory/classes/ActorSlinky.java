package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class ActorSlinky implements Slinky {

    public ActorSlinky() {
    }

    @Override
    public void animar() {
        System.out.println("Slinky anima a los demas");
    }

    @Override
    public void estirar() {
        System.out.println("Slinky se estira");
    }

    @Override
    public void ladrar() {
        System.out.println("Slinky: Woof Woof");
    }

    @Override
    public void jugar() {
        System.out.println("Slinky juega");

    }

}
