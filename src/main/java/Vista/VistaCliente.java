
package Vista;

import Controlador.ControladorCliente;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class VistaCliente {
    
    private ControladorCliente controladorCliente;
    private Scanner teclado;
    
    public VistaCliente(ControladorCliente controladorCliente){
        
        this.controladorCliente = controladorCliente;
        teclado = new Scanner(System.in);
    }
    
    public void menu() throws ParseException{
        System.err.println("CREAR CLIENTE");
        int opcion = 0;
        do{
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    break;
            }
        }while(opcion < 6);
    }
    
    
}
