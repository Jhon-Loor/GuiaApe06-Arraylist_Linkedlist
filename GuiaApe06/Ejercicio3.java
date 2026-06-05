import java.util.ArrayList; // Librería para usar ArrayList
import java.util.Scanner;   // Librería para entrada de datos

public class Ejercicio3 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner sc = new Scanner(System.in);

        // Crear un ArrayList para guardar productos
        ArrayList<String> productos = new ArrayList<>();

        // Variables auxiliares
        String producto, buscar;

        // Ciclo para ingresar 5 productos
        for(int i = 0; i < 5; i++) {

            // Pedir nombre del producto
            System.out.print("Ingrese producto: ");

            // Leer el producto ingresado
            producto = sc.nextLine();

            // Agregar el producto al ArrayList
            productos.add(producto);
        }

        // Pedir producto a buscar
        System.out.print("Producto a buscar: ");

        // Leer el producto a buscar
        buscar = sc.nextLine();

        // Verificar si el producto existe en el ArrayList
        if(productos.contains(buscar)) {

            // Mostrar mensaje si se encuentra
            System.out.println("Producto encontrado");

        } else {

            // Mostrar mensaje si no se encuentra
            System.out.println("Producto no encontrado");
        }

        // Cerrar Scanner
        sc.close();
    }
}

