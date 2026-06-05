import java.util.ArrayList; // Librería para usar ArrayList
import java.util.Scanner;   // Librería para entrada de datos

// Clase Producto
class Producto {

    // Atributos del producto
    String nombre;
    int cantidad;
    double precio;

    // Constructor para inicializar atributos
    public Producto(String nombre, int cantidad, double precio) {

        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Método para mostrar información del producto
    public void mostrar() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);
        System.out.println("-------------------");
    }
}

public class Ejercicio6{

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner sc = new Scanner(System.in);

        // Crear ArrayList para almacenar productos
        ArrayList<Producto> inventario = new ArrayList<>();

        // Variable para cantidad de productos
        int n;

        // Pedir cantidad de productos
        System.out.print("Cantidad de productos: ");
        n = sc.nextInt();

        // Limpiar buffer
        sc.nextLine();

        // Ciclo para registrar productos
        for(int i = 0; i < n; i++) {

            // Mostrar número del producto
            System.out.println("\nProducto " + (i + 1));

            // Pedir nombre del producto
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            // Pedir cantidad
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();

            // Pedir precio
            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            // Limpiar buffer
            sc.nextLine();

            // Agregar producto al ArrayList
            inventario.add(new Producto(nombre, cantidad, precio));
        }

        // Mostrar título
        System.out.println("\n===== INVENTARIO =====");

        // Recorrer y mostrar productos
        for(Producto p : inventario) {

            // Mostrar información del producto
            p.mostrar();
        }

        // Cerrar Scanner
        sc.close();
    }
}
