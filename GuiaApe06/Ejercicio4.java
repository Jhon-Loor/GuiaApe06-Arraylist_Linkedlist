 import java.util.ArrayList; // Librería para usar ArrayList
import java.util.Scanner;   // Librería para entrada de datos

public class Ejercicio4 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner sc = new Scanner(System.in);

        // Crear un ArrayList para almacenar nombres
        ArrayList<String> lista = new ArrayList<>();

        // Variables auxiliares
        int opcion, posicion;
        String nombre;

        // Ciclo principal del menú
        do {

            // Mostrar opciones
            System.out.println("\n1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            // Pedir opción
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            // Limpiar buffer
            sc.nextLine();

            // Evaluar opción seleccionada
            switch(opcion) {

                // Opción para agregar nombres
                case 1:

                    // Pedir nombre
                    System.out.print("Nombre: ");

                    // Leer nombre
                    nombre = sc.nextLine();

                    // Agregar nombre al ArrayList
                    lista.add(nombre);

                    break;

                // Opción para mostrar lista
                case 2:

                    // Recorrer y mostrar elementos
                    for(int i = 0; i < lista.size(); i++) {

                        // Mostrar posición y nombre
                        System.out.println(i + ": " + lista.get(i));
                    }

                    break;

                // Opción para modificar un elemento
                case 3:

                    // Pedir posición
                    System.out.print("Posicion: ");
                    posicion = sc.nextInt();

                    // Limpiar buffer
                    sc.nextLine();

                    // Pedir nuevo nombre
                    System.out.print("Nuevo nombre: ");
                    nombre = sc.nextLine();

                    // Verificar que la posición exista
                    if(posicion >= 0 && posicion < lista.size()) {

                        // Modificar elemento
                        lista.set(posicion, nombre);
                    }

                    break;

                // Opción para eliminar un elemento
                case 4:

                    // Pedir posición
                    System.out.print("Posicion: ");
                    posicion = sc.nextInt();

                    // Verificar que la posición exista
                    if(posicion >= 0 && posicion < lista.size()) {

                        // Eliminar elemento
                        lista.remove(posicion);
                    }

                    break;
            }

        // Repetir mientras no elija salir
        } while(opcion != 5);

        // Cerrar Scanner
        sc.close();
    }
}
 

