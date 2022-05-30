package Principal;

import Vista.VistaCliente;
import Vista.VistaTurno;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Principal {

    public static void main(String[] args) throws ParseException {

        VistaCliente vistaCliente = new VistaCliente();
        VistaTurno vistaTurno = new VistaTurno(vistaCliente.getControladorCliente());
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("BANCO DEL AHORRO");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Turno");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    vistaCliente.menu();
                    break;
                case 2:
                    vistaTurno.menu();
                    break;
            }
        } while (opcion < 3);
    }
}
