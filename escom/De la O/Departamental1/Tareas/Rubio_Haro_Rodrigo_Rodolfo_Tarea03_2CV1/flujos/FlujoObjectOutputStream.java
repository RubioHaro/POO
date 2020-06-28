package flujos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdelaot
 */
public class FlujoObjectOutputStream {

    /**
     * Nombre del archivo donde se almacenaran los objectos
     */
    private final String archivo;
    /**
     * Flujo que escribe los objetos sobre el archivo
     */
    private ObjectOutputStream oos;
    /**
     * Flujo para abrir el archivo (si existe) o crearlo en caso contrario
     */
    private FileOutputStream fos;

    /**
     * Costruye el objeto de escritura de objetos
     *
     * @param archivo el nombre del archivo
     */
    public FlujoObjectOutputStream(String archivo) {
        this.archivo = archivo;
        oos = null;
        fos = null;
    }

    /**
     * Abre un flujo anidaddo FileOutputStream en ObjectOutputStream
     */
    private void abrirFlujo() {
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Cierra el flujo aperturado
     */
    private void cerrarFlujo() {
        if (oos != null) {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(
                        FlujoObjectInputStream.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Hace todo el trabajo
     *
     * @param listaDeObjetos los objetos que se envian al flujo sobre un archivo
     */
    public void escribirObjetos(Object[] listaDeObjetos) {
        abrirFlujo();
        try {
            for (Object object : listaDeObjetos) {
                oos.writeObject(object);
            }
        } catch (IOException ex) {
            Logger.getLogger(
                    FlujoObjectInputStream.class.getName()).log(
                    Level.SEVERE, null, ex);
        } finally {
            cerrarFlujo();
        }
    }
    
}
