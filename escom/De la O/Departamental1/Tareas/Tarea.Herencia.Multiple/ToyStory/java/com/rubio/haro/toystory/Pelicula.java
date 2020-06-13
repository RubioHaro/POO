package com.rubio.haro.toystory;

import com.rubio.haro.toystory.classes.ActorBuzzLigthYear;
import com.rubio.haro.toystory.classes.ActorHam;
import com.rubio.haro.toystory.classes.ActorJessie;
import com.rubio.haro.toystory.classes.ActorLotso;
import com.rubio.haro.toystory.classes.ActorSlinky;
import com.rubio.haro.toystory.classes.ActorSrCaraDePapa;
import com.rubio.haro.toystory.classes.ActorWoody;
import com.rubio.haro.toystory.classes.ActorZurg;
import com.rubio.haro.toystory.classes.actorTiroAlBlanco;
import com.rubio.haro.toystory.interfaces.Heroe;
import com.rubio.haro.toystory.interfaces.Juguete;
import com.rubio.haro.toystory.interfaces.TiroAlBlanco;

/**
 *
 * @author chavo
 */
public class Pelicula {

    public Pelicula() {

    }

    public void reproducirIntro() {
        System.out.println("*********************************************");
        System.out.println("Toy Story. Roy's version");
        System.out.println("Disney Pixar. Todos los derechos Reservados");
        System.out.println("*********************************************");
    }

    public void reproducirPelicula() {
        reproducirIntro();
        ActorWoody woody = new ActorWoody();

        boolean isVillano = true;
        ActorHam drTocino = new ActorHam(isVillano);

        ActorSrCaraDePapa papa = new ActorSrCaraDePapa();
        papa.enojar();

        drTocino.traicionar(woody);
        drTocino.robar();
        woody.cuidar(drTocino);

        System.out.println("Era el cumpleaños de Andy, su mama le preparo una fiesta con sus Amigos. Hay un nuevo regalo");

        ActorBuzzLigthYear buzz = new ActorBuzzLigthYear();
        buzz.protegerGalaxia();
        woody.sentirCelos();

        ActorSlinky slinky = new ActorSlinky();
        slinky.animar();
        slinky.ladrar();

        buzz.volar();
        woody.apoyar((Juguete) buzz);
        buzz.caerConEstilo();

        System.out.println("Una vez " + woody + " acepto a " + buzz + " emprendieron muchas aventuras. Conocen nuevos amigos");

        actorTiroAlBlanco tiro = new actorTiroAlBlanco();
        ActorJessie jessie = new ActorJessie();
        jessie.cantar();
        jessie.montar(tiro);
        jessie.tenerMiedo();
        woody.salvar(jessie);

        woody.apoyar((Juguete) jessie);

        ActorZurg zurg = new ActorZurg();
        zurg.lanzarPelota();
        buzz.lanzarPelota();

        ActorLotso lotso = new ActorLotso();
        lotso.regalar();
        lotso.oler();
        lotso.traicionar(buzz);
        lotso.defraudar();

        papa.estarSaludable();
        papa.germinar();

        woody.salvar(jessie);
        woody.salvar((Juguete) buzz);
        woody.apoyar((Heroe) jessie);
        woody.salvar(papa);
    }
}
