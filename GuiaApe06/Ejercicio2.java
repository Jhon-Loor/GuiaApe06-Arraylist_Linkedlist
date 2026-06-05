import java.util.ArrayList; // Librería para usar ArrayList
import java.util.Scanner;   // Librería para entrada de datos

public class Ejercicio2 {

    public static void main(String[] args) {

        // Crear objeto Scanner para leer datos
        Scanner sc = new Scanner(System.in);

        // Crear un ArrayList para guardar notas decimales
        ArrayList<Double> notas = new ArrayList<>();

        // Variable auxiliar para almacenar cada nota
        double nota;

        // Ciclo para ingresar 6 notas
        for(int i = 0; i < 6; i++) {

            // Pedir una nota al usuario
            System.out.print("Ingrese nota: ");

            // Leer la nota ingresada
            nota = sc.nextDouble();

            // Agregar la nota al ArrayList
            notas.add(nota);
        }

        // Mostrar título
        System.out.println("\nNotas registradas:");

        // Recorrer el ArrayList y mostrar las notas
        for(Double n : notas) {

            // Mostrar cada nota
            System.out.println(n);
        }

        // Cerrar Scanner
        sc.close();
    }
}
