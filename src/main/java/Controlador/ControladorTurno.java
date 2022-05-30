package Controlador;

import Modelo.Cliente;
import Modelo.Turno;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ControladorTurno {

    private List<Turno> turnoList;
    private List<Cliente> clienteList;
    
    public ControladorTurno(){
        
        turnoList = new ArrayList();
        
    }
    
    public int numeroAleatorio(){
        int numAleatorio = 0;
        numAleatorio = (int) (Math.random() *6);
        return numAleatorio;
    }
    
    public String tiempoEspera(){
        String tiempoE = "";
        Random numero = new Random();
        for (int i = 0; i < 2; i++) {
            tiempoE += numero.nextInt(10);

        }
        
        return tiempoE;
    }
    
    public String tiempoAtencion(){
        String tiempoA = "";
        Random numero = new Random();
        for (int i = 0; i < 2; i++) {
            tiempoA += numero.nextInt(10);

        }
        return tiempoA;
    }
    
    public long generarId(){
        if(turnoList.size()>0)
            return turnoList.get(turnoList.size() -1).getId()+1;
        return 1;
    }
    
    public boolean crear(Date fechaAtencion, Cliente cliente){
        Turno turno = new Turno(generarId(),fechaAtencion, cliente);
        return turnoList.add(turno);
    }
    
    public Turno buscar(long id){
        for (Turno turno : turnoList){
            if(turno.getId() == id)
                return turno;
        }
        return null;
    }
    
    public boolean actualizar(long id, Date fechaAtencion, Cliente cliente){
        Turno turnoActualizar = buscar(id);
        if(turnoActualizar != null){
            int index = turnoList.indexOf(turnoActualizar);
            turnoActualizar.setFechaAtencion(fechaAtencion);
            turnoActualizar.setCliente(cliente);
            turnoList.set(index, turnoActualizar);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(long id){
        Turno turno = buscar(id);
        if(turno != null)
            return turnoList.remove(turno);
        return false;
    }
    
    public List<Turno> getTurnoList(){
        return turnoList;
    }
    
    public void setTurnoList(List<Turno> turnoList){
        this.turnoList = turnoList;
    }

}
