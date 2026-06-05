import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Crear arreglo de 5 estudiantes
        String estudiantes[] = new String[5];

        try (Scanner leer = new Scanner(System.in)) {
            // Ciclo para ingresar nombres
            for(int i = 0; i < 5; i++) {

                // Pedir nombre del estudiante
                System.out.println("Ingrese nombre del estudiante:");

                // Guardar nombre en el arreglo
                estudiantes[i] = leer.nextLine();
            }

            // Mostrar título
            System.out.println("Lista de estudiantes:");

            // Ciclo para mostrar estudiantes
            for(int i = 0; i < 5; i++) {

                // Mostrar cada estudiante
                System.out.println(estudiantes[i]);
            }
        }
    }
}
