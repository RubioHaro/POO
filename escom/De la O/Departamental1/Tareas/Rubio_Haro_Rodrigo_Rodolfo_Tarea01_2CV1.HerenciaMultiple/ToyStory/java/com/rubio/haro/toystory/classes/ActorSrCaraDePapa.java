package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

/**
 * SrCaraDePapa
 */
public class ActorSrCaraDePapa implements SrCaraDePapa {

    public ActorSrCaraDePapa() {
    }

    @Override
    public void enojar() {
        System.out.println(this.toString() + " se enoja");
    }

    @Override
    public void germinar() {
    }

    @Override
    public void proveer() {
    }

    @Override
    public void cuidar() {
    }

    @Override
    public void jugar() {
    }

    @Override
    public void romper() {
    }

    @Override
    public void estarSaludable() {
    }

    @Override
    public String toString() {
        return "Sr Cara de Papa"; 
    }

    
}
