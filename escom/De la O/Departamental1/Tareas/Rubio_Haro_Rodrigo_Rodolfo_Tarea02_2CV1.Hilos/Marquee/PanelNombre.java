package Marquee;

import java.awt.Font;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class PanelNombre extends JPanel implements Runnable {

    private final Thread lampareado = new Thread(this, "Lampareado");

    private final JLabelMarquee nombreLabel;
    private final JLabelMarquee segundoNLabel;
    private final JLabelMarquee ApellidoPLabel;
    private final JLabelMarquee ApellidoMLabel;

    private final short LONGITUD_PALABRA = 350;
    private final short LIMITE_COLISION = LONGITUD_PALABRA - 10;
    private final short ALTURA_PALABRA = 100;
    private final int COORDENADA_Y = 250;
    private final int VELOCIDAD = 50;
    private Sector sector;

    public PanelNombre(String nombre, String segundoNombre, String apellidoM, String apellidoP) {
        Font fuente = new Font("Arial", Font.BOLD, 90);

        nombreLabel = new JLabelMarquee(nombre);
        nombreLabel.setFont(fuente);

        segundoNLabel = new JLabelMarquee(segundoNombre);
        segundoNLabel.setFont(fuente);

        ApellidoPLabel = new JLabelMarquee(apellidoM);
        ApellidoPLabel.setFont(fuente);

        ApellidoMLabel = new JLabelMarquee(apellidoP);
        ApellidoMLabel.setFont(fuente);

        iniciarUbiacionesJLabels(450);
        this.add(nombreLabel);
        this.add(segundoNLabel);
        this.add(ApellidoPLabel);
        this.add(ApellidoMLabel);
        this.setLayout(null);
    }

    private void iniciarUbiacionesJLabels(int longitud_sector) {
        sector = new Sector(longitud_sector, LONGITUD_PALABRA);
        //simulamos 4 objetos Sector reiniciando sus parametros limites con el metodo setLimites

        sector.setLimites(0, longitud_sector - LONGITUD_PALABRA);//S1
        int result = sector.setValorAleatorio();//V1
        nombreLabel.setBounds(result, COORDENADA_Y, LONGITUD_PALABRA, ALTURA_PALABRA);

        sector.setLimites(result);//S2
        result = sector.setValorAleatorio();//V2
        segundoNLabel.setBounds(result, COORDENADA_Y, LONGITUD_PALABRA, ALTURA_PALABRA);

        sector.setLimites(result);//S3
        result = sector.setValorAleatorio();//V3
        ApellidoPLabel.setBounds(result, COORDENADA_Y, LONGITUD_PALABRA, ALTURA_PALABRA);

        sector.setLimites(result);//S4
        result = sector.setValorAleatorio();//V4
        ApellidoMLabel.setBounds(result, COORDENADA_Y, LONGITUD_PALABRA, ALTURA_PALABRA);

    }

    public void iniciarThread() {
        lampareado.start();
    }

    private void updateLabels() {
        nombreLabel.setDireccion(MoverJlabel(nombreLabel, LIMITE_COLISION, 0 - LONGITUD_PALABRA, segundoNLabel.getLocation().x));
        segundoNLabel.setDireccion(MoverJlabel(segundoNLabel, LIMITE_COLISION, nombreLabel.getLocation().x, ApellidoPLabel.getLocation().x));
        ApellidoPLabel.setDireccion(MoverJlabel(ApellidoPLabel, LIMITE_COLISION, segundoNLabel.getLocation().x, ApellidoMLabel.getLocation().x));
        ApellidoMLabel.setDireccion(MoverJlabel(ApellidoMLabel, LIMITE_COLISION, ApellidoPLabel.getLocation().x, 1300 + LONGITUD_PALABRA));
    }

    private boolean MoverJlabel(JLabelMarquee jlabel, int colision, int posicionAnterior, int posicionSiguiente) {
        Point location = jlabel.getLocation();

        int difAnterior = location.x - posicionAnterior;
        int difSiguiente = posicionSiguiente - location.x;

        if (jlabel.getDireccion()) {
            jlabel.setLocation(location.x + 3, location.y);
            if (difSiguiente <= colision) {
                jlabel.setDireccion(false);
            }
        } else {
            jlabel.setLocation(location.x - 3, location.y);
            if (difAnterior <= colision) {
                jlabel.setDireccion(true);
            }
        }
        this.add(jlabel);
        System.out.println("Marquee.Nombre.update():  label: " + location);
        return jlabel.getDireccion();
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.updateLabels();
                Thread.sleep(VELOCIDAD);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
