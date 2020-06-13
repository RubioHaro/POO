package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class ActorZurg implements Zurg{

    public ActorZurg() {
    }

    
    @Override
    public void lanzarPelota() {
        System.out.println("zurg juega pelota");
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}