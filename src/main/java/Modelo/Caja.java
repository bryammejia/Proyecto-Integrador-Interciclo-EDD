
package Modelo;

/**
 *
 * @author USER
 */
public class Caja {
    
    private int numeroCaja;
    private String nombreCajero;

    public Caja(int numeroCaja, String nombreCajero) {
        this.numeroCaja = numeroCaja;
        this.nombreCajero = nombreCajero;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
    }

    @Override
    public String toString() {
        return "Caja{" + "numeroCaja=" + numeroCaja + ", nombreCajero=" + nombreCajero + '}';
    }
    
    
}
