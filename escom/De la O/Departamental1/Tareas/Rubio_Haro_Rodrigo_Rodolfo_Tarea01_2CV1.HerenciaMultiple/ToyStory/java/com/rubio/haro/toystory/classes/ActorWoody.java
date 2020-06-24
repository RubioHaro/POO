package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class ActorWoody implements Woody {

    public ActorWoody() {
    }

    
    @Override
    public void cuidar(Heroe heroe) {
        System.out.println("Woody cuida a " + heroe.toString());

    }

    @Override
    public void cuidar(Villano villano) {
        System.out.println("Woody cuida a " + villano.toString() + ", aunque sea un villano");

    }

    @Override
    public void salvar(Juguete jueguete) {
        System.out.println("Woody salva " + jueguete.toString());

    }

    @Override
    public void montar(TiroAlBlanco tiro) {
        System.out.println("Woody monta a " + tiro.toString());
    }

    @Override
    public void apoyar(Juguete jugete) {
        System.out.println("Woody apoya " + jugete.toString());
    }

    @Override
    public void apoyar(Heroe heroe) {
        System.out.println("Woody apoya a " + heroe);
    }

    public void sentirCelos() {
        System.out.println("Woody siente celos");
    }

    @Override
    public String toString() {
        return "Woody, el amigo fiel";
    }

}
