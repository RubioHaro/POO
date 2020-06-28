package animales;

import java.io.Serializable;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Animal extends Object implements Serializable {

    static final long serialVersionUID = 1L;
    private String sexo;
    private String especie;
    private String comidaFavorita;
    private float peso;

    public Animal() {
        this("desconocido", "desconocido", "desconocida", 0);
    }

    public Animal(String comidaFavorita) {
        this("desconocido", "desconocido", comidaFavorita, 0);
    }

    public Animal(String nombre, String comidaFavorita, float peso) {
        this("desconocido", nombre, comidaFavorita, peso);
    }

    public Animal(String sexo, int edad, String nombre) {
        this(sexo, nombre, "desconocida", 0);
    }

    public Animal(String sexo, String nombre, String comidaFavorita, float peso) {
        this.sexo = sexo;
        this.especie = nombre;
        this.comidaFavorita = comidaFavorita;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        if (peso != 0) {
            return peso + " kg";
        } else {
            return "desconocido";
        }
    }

    @Override
    public String toString() {
        return "Animal: " + especie + " Sexo:" + sexo + " Alimentacion:" + comidaFavorita + " peso: " + this.getPeso();
    }

    public void comer() {
        System.out.println("Animal comiendo ");
    }
}
