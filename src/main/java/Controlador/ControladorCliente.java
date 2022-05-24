
package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class ControladorCliente {

    private List<Cliente> ClienteList;
    
    public ControladorCliente(){
        ClienteList = new ArrayList<>();
        
    }
    
    public boolean crear(int cedula, String nombre, String apellido){
        Cliente cliente = new Cliente(cedula, nombre, apellido);
        return ClienteList.add(cliente);
    }
    
    public Cliente buscar(int cedula){
        for(Cliente cliente : ClienteList){
            if (cliente.getCedula() == cedula)
                return cliente;
        }
        return null;
    }
    
    public boolean eliminar(int cedula){
        Cliente cliente = buscar(cedula);
        if ( cliente != null)
            return ClienteList.remove(cliente);
        return false;
    }
    
    public void setClienteList(List<Cliente> clienteList){
        this.ClienteList = clienteList;
    }
}
