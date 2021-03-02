package gestion;

import java.io.Serializable;

/**
*
* @author Jesus
*/
public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    /**
     * 
     * @param nombre
     * @param apellidos
     * @param dni
     * @param edad
     */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    /**
     * 
     * @return devuelve nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre devuelve nombre que es el mismo nombre que el que hay
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return devuelve apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * 
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * 
     * @return devuelve dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * 
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * 
     * @return devuelve edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * 
     * @param devuelve edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * 
     * @param anyoactual
     * @return devuelve una resta
     */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    
    /**
     * return devuelve el nombre, apellidos , dni, edad.
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}