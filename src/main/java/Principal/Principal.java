
package Principal;

import Vista.VistaCliente;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        
        VistaCliente vistaCliente = new VistaCliente();
        vistaCliente.menu();
        
       /* Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("BANCO DEL AHORRO");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Turno");
            System.out.println("3. Informacion Cajas");
            System.out.println("4. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: break;
                case 2: break;
                case 3: break;
            }
        }while(opcion < 4);*/
    }
}
