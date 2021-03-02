package gestion;

import java.io.Serializable;

/**
*
* @author Jesus
*/
public class Mascota extends Animales implements Serializable{

	private String nombre;
    private Persona duenyo;
/**
 * 
 * @param ID
 * @param nombre
 * @param edad
 * @param raza
 * @param duenyo
 */
    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }
/**
 * 
 * @return te da nombre 
 */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @return te da nombre que es igual que el mismo nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return te da duenyo
     */
    public Persona getDuenyo() {
        return duenyo;
    }

    /**
     * 
     * @return te da el resultado que es igual que el mismo duenyo
     */
    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }
/**
 * return te da el nombre edad raza duenyo
 */
    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Due�o: " + duenyo.toString());
    }
}