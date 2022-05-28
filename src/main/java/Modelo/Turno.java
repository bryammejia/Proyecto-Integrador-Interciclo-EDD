
package Modelo;

/**
 *
 * @author USER
 */
public class Turno {
    
    private Cliente id;

    public Turno(Cliente id) {
        this.id = id;
    }

    public Cliente getId() {
        return id;
    }

    public void setId(Cliente id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Turno{" + "id=" + id + '}';
    }
    
    
    
}
