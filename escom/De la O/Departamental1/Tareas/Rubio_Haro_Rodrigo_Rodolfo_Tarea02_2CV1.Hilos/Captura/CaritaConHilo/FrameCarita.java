package CaritaConHilo;

import javax.swing.JFrame;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class FrameCarita extends JFrame {

    private CaraAmarilla carita;

    public FrameCarita() {
        carita = new CaraAmarilla();
        carita.inicia();
        this.getContentPane().add(carita);
        this.setSize(400, 310);
        this.setVisible(true);
    }
}
