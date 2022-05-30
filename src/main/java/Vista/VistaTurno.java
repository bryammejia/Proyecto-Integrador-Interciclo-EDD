package Vista;

import Controlador.ControladorCliente;
import Controlador.ControladorTurno;
import Modelo.Cliente;
import Modelo.Turno;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaTurno {

    private ControladorTurno controladorTurno;
    private ControladorCliente controladorCliente;
    public Scanner teclado;

    public VistaTurno(ControladorCliente controladorCliente) {
        controladorTurno = new ControladorTurno();
        this.controladorCliente = controladorCliente;
        teclado = new Scanner(System.in);

    }

    public Cliente seleccionarCliente() {
        System.out.println("Ingrese la cedula: ");
        String cedula = teclado.next();
        return controladorCliente.buscar(cedula);
    }

    public void menu() {
        System.out.println("GENERA TU TURNO");
        int opcion = 0;
        do {
            System.out.println("1. Crear");
            System.out.println("2. Buscar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    crear();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    actualizar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    listar();
                    break;
            }
        } while (opcion < 6);
    }

    public void crear() {
        try {
            System.out.println("Ingrese los siguientes datos: ");
            System.out.println("Ingrese la fecha de Atencion(dd/MM/yyyy): ");
            String fecha = teclado.next();
            Date fechaAtencion = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            Cliente cliente = seleccionarCliente();
            System.out.println("Resultado: " + controladorTurno.crear(fechaAtencion, cliente));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void actualizar() {
        try {
            System.out.println("Ingrese los nuevos datos: ");
            System.out.println("ID: ");
            long id = teclado.nextLong();
            System.out.println("Nueva fecha de atencion: ");
            String fecha = teclado.next();
            Date fechaAtencion = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);

        } catch (ParseException ex) {
            Logger.getLogger(VistaTurno.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void buscar() {
        System.out.println("Ingrese el id: ");
        long id = teclado.nextLong();
        System.out.println("Reslutado: " + controladorTurno.buscar(id));

    }

    public void eliminar() {
        System.out.println("Ingrese el Id: ");
        long id = teclado.nextLong();
        System.out.println("Resultado: " + controladorTurno.eliminar(id));
    }

    public void listar() {
        for (Turno turno : controladorTurno.getTurnoList()) {
            System.out.println("# Caja: "+controladorTurno.numeroAleatorio());
            System.out.println(turno);
            System.out.println("Tiempo de Atencion: "+controladorTurno.tiempoAtencion()+" min.");
            System.out.println("Tiempo de Espera: "+controladorTurno.tiempoEspera()+" min.");
        }
    }

    public ControladorTurno getControladorTurno() {
        return controladorTurno;
    }

    public void setControladorTurno(ControladorTurno controladorTurno) {
        this.controladorTurno = controladorTurno;
    }
}
