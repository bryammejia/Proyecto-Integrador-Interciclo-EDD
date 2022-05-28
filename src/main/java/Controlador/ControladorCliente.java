package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class ControladorCliente {

    private List<Cliente> clienteList;

    public ControladorCliente() {
        clienteList = new ArrayList();

    }

    public long generarId() {
        if (clienteList.size()>0) 
            return clienteList.get(clienteList.size() - 1).getId() + 1;
        
        return 1;
    }

    public boolean crear(String nombre, String apellido, String cedula) {
        Cliente cliente = new Cliente(generarId(), nombre, apellido, cedula);
        return clienteList.add(cliente);
    }
    
    public Cliente buscar(long id){
        for(Cliente cliente : clienteList){
            if(cliente.getId() == id)
                return cliente;
        }
        return null;
    }
    
    public Cliente buscar(String cedula){
        for (Cliente cliente : clienteList) {
            if(cliente.getCedula().equals(cedula))
                return cliente;
        }
        return null;
    }
    
    public boolean actualizar(long id, String nombre, String apellido, String cedula){
        Cliente cliente = buscar(id);
        if(cliente != null){
            int posicion = clienteList.indexOf(cliente);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setCedula(cedula);
            clienteList.set(posicion, cliente);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(long id){
        Cliente cliente = buscar(id);
        if(cliente != null)
            return clienteList.remove(cliente);
        return false;
    }
    
    public List<Cliente> getClienteList(){
        return clienteList;
    }
    
    public void setClienteList(List<Cliente> clienteList){
        this.clienteList = clienteList;
    }
           
}
