
package Modelo;

/**
 *
 * @author USER
 */
public class Cliente {
     
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;

    public Cliente(long id, String nombre, String apellido, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return " | CLIENTE | " + "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Cedula: " + cedula + '|';
    }
    
    

    
}
