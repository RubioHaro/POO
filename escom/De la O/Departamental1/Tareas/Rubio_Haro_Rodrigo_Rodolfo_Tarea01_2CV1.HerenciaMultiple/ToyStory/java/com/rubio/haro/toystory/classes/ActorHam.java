package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class ActorHam implements Ham {

    private String papel;

    public ActorHam(boolean villano) {
        if (villano) {
            papel = "Ham";
        } else {
            papel = "Malvado Dr. Tocino";
        }
    }

    @Override
    public void manejar() {
        System.out.println(this.toString() + " maneja");
    }

    @Override
    public void guardarDinero() {
        System.out.println(this.toString() + " guarda dinero");
    }

    @Override
    public void robar() {
        System.out.println(this.toString() + " roba dinero");
    }

    @Override
    public void revolcar() {
        System.out.println(this.toString() + " se revuelca");
    }

    @Override
    public void traicionar(Heroe heroe) {
        System.out.println(this.toString() + " traiciona " + heroe);
    }

    @Override
    public String toString() {
        return "Dr Tocino";
    }

}
