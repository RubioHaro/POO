package Marquee;

import javax.swing.JFrame;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class FrameMarquee extends JFrame {

    private PanelNombre nombre;

    public FrameMarquee() {
        nombre = new PanelNombre("Rodrigo", "Rodolfo", "Rubio", "Haro");
        nombre.iniciarThread();
        this.getContentPane().add(nombre);
        this.setSize(1800, 650);
        this.setVisible(true);
        this.setResizable(false);
    }
}
