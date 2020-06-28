package Marquee;

import java.util.Random;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Sector {

    private int longitudSector;
    private int longitudPalabra;
    private int limiteInferior;
    private int limiteSuperior;
    private int valorAleatorio;

    public Sector(int longitudSector, int longitudPalabra) {
        this.longitudSector = longitudSector;
        this.longitudPalabra = longitudPalabra;
        this.limiteInferior = 0;
        this.limiteSuperior = 0;
    }

    public void setLimites(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public void setLimites(int valorAnterior) {
        this.limiteInferior = valorAnterior + longitudPalabra;
        this.limiteSuperior += longitudSector;

    }

    public int setValorAleatorio() {
        Random r = new Random();
        this.valorAleatorio = r.nextInt(this.limiteSuperior - this.limiteInferior) + this.limiteInferior;
        this.toString();
        return valorAleatorio;
    }

    public int getValorAleatorio() {
        return valorAleatorio;
    }

    @Override
    public String toString() {
        return "Limite: inferior = " + limiteInferior + "px,  superior:" + limiteSuperior + "px" + "Valor real (generado) : " + valorAleatorio;
    }
}
