package Vista;

import Controlador.ControladorCliente;
import Modelo.Cliente;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class VistaCliente {

    ControladorCliente controladorCliente;
    Scanner teclado;

    public VistaCliente() {

        teclado = new Scanner(System.in);
        controladorCliente = new ControladorCliente();
        
    }

    public void menu() {
        System.out.println("CREAR CLIENTE");
        int opcion = 0;
        do {
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Actualizar");
            System.out.println("4. Listar");
            System.out.println("5. Eliminar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:crear();
                    break;
                case 2:buscar();
                    break;
                case 3:actualizar();
                    break;
                case 4:listar();
                    break;
                case 5:eliminar();
                    break;

            }
        } while (opcion < 6);
    }

    public void crear() {
        System.out.println("Ingrese los datos del Cliente");
        System.out.println("Nombre: ");
        String nombre = teclado.next();
        System.out.println("Apellido: ");
        String apellido = teclado.next();
        System.out.println("Cedula: ");
        String cedula = teclado.next();
        System.out.println("Resultado: " + controladorCliente.crear(nombre, apellido, cedula));
    }

    public void actualizar() {
        System.out.println("Ingrese los nuevos datos del Cliente: ");
        System.out.println("Nuevo Id: ");
        long id = teclado.nextLong();
        System.out.println("Nuevo Nombre: ");
        String nombre = teclado.next();
        System.out.println("Nuevo Apellido: ");
        String apellido = teclado.next();
        System.out.println("Nueva Cedula: ");
        String cedula = teclado.next();
        System.out.println("Resultado: " + controladorCliente.actualizar(id, nombre, apellido, cedula));
    }

    public void buscar() {
        System.out.println("Ingrese la cedula del Cliente: ");
        String cedula = teclado.next();
        System.out.println(controladorCliente.buscar(cedula));

    }

    public void eliminar() {
        System.out.println("Ingrese el Id del Cliente: ");
        long id = teclado.nextLong();
        System.out.println("Resultado: " + controladorCliente.eliminar(id));
    }

    public void listar() {
        for (Cliente cliente : controladorCliente.getClienteList()) {
            System.out.println(cliente);
        }
    }

    public ControladorCliente getControladorCliente() {
        return controladorCliente;
    }

    public void setControladorCliente(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }
}
