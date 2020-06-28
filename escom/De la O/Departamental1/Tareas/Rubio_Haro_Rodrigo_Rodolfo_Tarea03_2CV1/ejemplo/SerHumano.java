package ejemplo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author sdelaot
 * @author Rubio Haro Rodrigo R.
 */
public class SerHumano extends Object implements Serializable {

    static final long serialVersionUID = 1L;
    private String genero;

    public SerHumano() {
        this("masculino");
    }

    public SerHumano(String genero) {
        super();
        this.genero = genero;
    }

    public SerHumano(SerHumano humano) {
        this(humano.genero);
    }

    public void respirar() {
        System.out.println("Respirando");
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto == null) {
            return false;
        }
        if (!(objeto instanceof SerHumano)) {
            return false;
        }
        SerHumano humano = (SerHumano) objeto;
        return genero.equals(humano.genero);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.genero);
        return hash;
    }

    @Override
    public String toString() {
        return "SerHumano\n Genero: " + genero + "\n";
    }
}
