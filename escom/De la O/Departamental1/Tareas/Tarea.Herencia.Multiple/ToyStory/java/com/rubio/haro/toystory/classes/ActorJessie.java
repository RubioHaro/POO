package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

/**
 *
 * @author chavo
 */
public class ActorJessie implements Jessie {

    public ActorJessie() {
    }

    
    @Override
    public void cantar() {
        System.out.println("Jessie: Cuando alguien me amaba\n"
                + "me sentia tan feliz..\n"
                + "los momentos que pasamos\n"
                + "los recuerdo bien");
    }

    @Override
    public void cabalgar() {
        System.out.println("Jessie cabalga. Arreee");
    }

    @Override
    public void tenerMiedo() {
        System.out.println("Jessie tiene miedo de ser abandonada");
    }

    @Override
    public void jugar() {
        System.out.println("Jessie juega, le gusta jugar");
    }

    @Override
    public void salvar(Juguete jueguete) {
        System.out.println("Jessie salva a " + jueguete.toString());

    }

    @Override
    public void montar(TiroAlBlanco tiro) {
        System.out.println("Jessie monta a " + tiro.toString());
        tiro.correrComoElViento();

    }

    @Override
    public String toString() {
        return "Jessie, la ruda vaquerita";
    }
}
