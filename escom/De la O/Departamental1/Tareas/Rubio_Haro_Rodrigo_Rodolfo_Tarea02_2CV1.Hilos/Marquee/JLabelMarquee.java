package Marquee;

import javax.swing.JLabel;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class JLabelMarquee extends JLabel {

    private boolean direccion;

    public JLabelMarquee() {
        super();
    }

    public JLabelMarquee(String text) {
        super(text);
    }

    public JLabelMarquee(boolean direccion) {
        super();
        this.direccion = direccion;
    }

    public void setDireccion(boolean direccion) {
        this.direccion = direccion;
    }

    public boolean getDireccion() {
        return direccion;
    }

}
