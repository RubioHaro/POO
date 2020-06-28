package flujos;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sdelaot
 */
public class FlujoObjectInputStream {

    /**
     * Nombre del archivo donde se leen los objectos
     */
    private final String archivo;
    /**
     * Flujo que lee los objetos sobre el archivo
     */
    private ObjectInputStream ois;
    /**
     * Flujo para abrir el archivo (si existe)
     */

    private FileInputStream fis;

    /**
     * Costruye el objeto de lectura de objetos
     *
     * @param archivo el nombre del archivo
     */
    public FlujoObjectInputStream(String archivo) {
        this.archivo = archivo;
        ois = null;
        fis = null;
    }

    /**
     * Abre un flujo anidaddo FileInputStream en ObjectInputStream
     */
    private void abrirFlujo() throws IOException {
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
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
        if (ois != null) {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(FlujoLinkedListInputStream.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Hace todo el trabajo
     *
     * @return devuelve listaDeObjetos los objetos que se leen desde el flujo
     * sobre un archivo
     */
    public Object[] leerObjetos() {
        Object[] listaDeObjetos = null;
        try {
            abrirFlujo();
            int contador = 0;
            Object obj = new Object();
            while (true) {
                //System.out.println( " SI " + obj );
                if (fis.available() != 0) {
                    obj = ois.readObject();
                    contador++;
                } else {
                    break;
                }
            }
            cerrarFlujo();
            abrirFlujo();
            listaDeObjetos = new Object[contador];
            contador = 0;
            while (true) {
                //System.out.println( " SI " + obj );
                if (fis.available() != 0) {
                    obj = ois.readObject();
                    listaDeObjetos[contador] = obj;
                    contador++;
                } else {
                    break;
                }
            }
        } catch (EOFException eof) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, eof);
            //System.out.println( "AQUI" );
        } catch (IOException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FlujoObjectInputStream.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarFlujo();
        }
        return listaDeObjetos;
    }
}
