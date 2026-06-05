import java.util.ArrayList; // Librería para usar ArrayList
import java.util.Scanner;   // Librería para entrada de datos

public class Ejercicio5{

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner sc = new Scanner(System.in);

        // ArrayList para guardar nombres
        ArrayList<String> nombres = new ArrayList<>();

        // ArrayList para guardar notas
        ArrayList<Double> notas = new ArrayList<>();

        // Variables auxiliares
        int cantidad;
        String nombre;
        double nota;

        // Pedir cantidad de estudiantes
        System.out.print("Cantidad de estudiantes: ");
        cantidad = sc.nextInt();

        // Limpiar buffer
        sc.nextLine();

        // Ciclo para registrar estudiantes
        for(int i = 0; i < cantidad; i++) {

            // Pedir nombre del estudiante
            System.out.print("Nombre: ");

            // Leer nombre
            nombre = sc.nextLine();

            // Pedir nota
            System.out.print("Nota: ");

            // Leer nota
            nota = sc.nextDouble();

            // Limpiar buffer
            sc.nextLine();

            // Guardar nombre en el ArrayList
            nombres.add(nombre);

            // Guardar nota en el ArrayList
            notas.add(nota);
        }

        // Mostrar título
        System.out.println("\nREGISTROS");

        // Recorrer y mostrar registros
        for(int i = 0; i < nombres.size(); i++) {

            // Mostrar nombre y nota
            System.out.println(nombres.get(i) + " - " + notas.get(i));
        }

        // Cerrar Scanner
        sc.close();
    }
}
