
package Modelo;

import Controlador.ControladorTurno;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Turno {
 
    private long id;
    private int numeroCaja;
    private Date fechaAtencion;
    private Cliente cliente;

    public Turno(long id, int numeroCaja, Date fechaAtencion) {
        this.id = id;
        this.numeroCaja = numeroCaja;
        this.fechaAtencion = fechaAtencion;
    }

    public Turno(long id, Date fechaAtencion, Cliente cliente) {
        this.id = id;
        this.fechaAtencion = fechaAtencion;
        this.cliente = cliente;
    }

    public Turno(long id, int numeroCaja, Date fechaAtencion, Cliente cliente) {
        this.id = id;
        this.numeroCaja = numeroCaja;
        this.fechaAtencion = fechaAtencion;
        this.cliente = cliente;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "| Turno |" + "# Turno: " + id + ", Fecha Atencion: " + fechaAtencion + ", " + cliente + '|';
    }

    
    
}
