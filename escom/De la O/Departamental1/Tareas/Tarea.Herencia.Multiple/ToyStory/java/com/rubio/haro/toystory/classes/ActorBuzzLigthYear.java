package com.rubio.haro.toystory.classes;

import com.rubio.haro.toystory.interfaces.*;

public class ActorBuzzLigthYear implements BuzzLigthYear, Heroe, GuardianEspacial, Zurg {

    public ActorBuzzLigthYear() {
    }
    
    @Override
    public void volar() {
        System.out.println("Buzz: Se que puedo volaaaar. Buzz se estrella en el piso");
    }

    @Override
    public void caerConEstilo() {
        System.out.println("Buzz cae con estilo");
    }

    @Override
    public void salvar(Juguete jueguete) {
        System.out.println("Buzz proteje a un juguete: " + jueguete);

    }

    @Override
    public void protegerGalaxia() {
        System.out.println("Buzz proteje la Galaxia");
    }

    @Override
    public void lanzarPelota() {
        System.out.println("Buzz lanza pelota");

    }

    @Override
    public String toString() {
        return "Buzz Light Year, Guardian Estelar";
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
