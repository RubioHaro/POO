package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class actorTiroAlBlanco implements TiroAlBlanco {

    public actorTiroAlBlanco() {
    }

    
    @Override
    public void correrComoElViento() {
        System.out.println(this.toString() + " corre como el viento");
    }

    @Override
    public void relinchar() {
        System.out.println(this.toString() + " relincha");
    }

    @Override
    public void jugar() {
    }

    @Override
    public String toString() {
        return "Tiro al Blanco";
    }

}
