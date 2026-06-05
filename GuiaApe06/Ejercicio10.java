import java.util.LinkedList; // Librería para usar LinkedList
import java.util.Scanner;    // Librería para entrada de datos

// Clase Cliente
class Cliente {

    // Atributos privados
    private int turno;
    private String nombre;

    // Constructor de la clase
    public Cliente(int turno, String nombre) {

        this.turno = turno;
        this.nombre = nombre;
    }

    // Método para obtener el turno
    public int getTurno() {

        return turno;
    }

    // Método para obtener el nombre
    public String getNombre() {

        return nombre;
    }
}

// Clase para manejar la fila de atención
class FilaAtencion {

    // LinkedList para almacenar clientes
    private LinkedList<Cliente> fila;

    // Variable para controlar turnos
    private int siguienteTurno;

    // Constructor de la clase
    public FilaAtencion() {

        fila = new LinkedList<>();
        siguienteTurno = 1;
    }

    // Método para agregar clientes
    public void agregarCliente(String nombre) {

        // Crear nuevo cliente
        Cliente cliente = new Cliente(siguienteTurno, nombre);

        // Agregar cliente al final de la fila
        fila.addLast(cliente);

        // Mostrar turno asignado
        System.out.println("Cliente agregado con turno #" + siguienteTurno);

        // Incrementar siguiente turno
        siguienteTurno++;
    }

    // Método para atender clientes
    public void atenderCliente() {

        // Verificar si la fila está vacía
        if (fila.isEmpty()) {

            System.out.println("No hay clientes para atender.");
            return;
        }

        // Obtener primer cliente
        Cliente cliente = fila.getFirst();

        // Mostrar cliente atendido
        System.out.println("Atendiendo a "
                + cliente.getNombre()
                + " con turno #"
                + cliente.getTurno());

        // Eliminar cliente atendido
        fila.removeFirst();
    }

    // Método para mostrar la fila
    public void mostrarFila() {

        // Verificar si la fila está vacía
        if (fila.isEmpty()) {

            System.out.println("No hay clientes en espera.");
            return;
        }

        // Mostrar título
        System.out.println("\nFila de atencion:");

        // Recorrer y mostrar clientes
        for (Cliente cliente : fila) {

            System.out.println("Turno #"
                    + cliente.getTurno()
                    + " - "
                    + cliente.getNombre());
        }
    }
}

// Clase principal
public class Ejercicio10 {

    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Crear objeto de la fila de atención
        FilaAtencion fila = new FilaAtencion();

        // Variable para el menú
        int opcion;

        // Ciclo principal
        do {

            // Mostrar menú
            System.out.println("\n===== FILA DE ATENCION =====");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar fila");
            System.out.println("4. Salir");

            // Pedir opción
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            // Limpiar buffer
            sc.nextLine();

            // Evaluar opción seleccionada
            switch (opcion) {

                // Agregar cliente
                case 1:

                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();

                    fila.agregarCliente(nombre);

                    break;

                // Atender cliente
                case 2:

                    fila.atenderCliente();

                    break;

                // Mostrar fila
                case 3:

                    fila.mostrarFila();

                    break;

                // Salir del programa
                case 4:

                    System.out.println("Saliendo...");
                    break;

                // Opción inválida
                default:

                    System.out.println("Opcion invalida.");
            }

        // Repetir hasta elegir salir
        } while (opcion != 4);

        // Cerrar Scanner
        sc.close();
    }
}  

