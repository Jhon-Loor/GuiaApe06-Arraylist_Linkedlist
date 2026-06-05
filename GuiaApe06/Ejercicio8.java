import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10]; // Se declara el tamanio del arreglo y este es fijo

        System.out.println("=== INGRESO DE DATOS EN EL ARREGLO ===");
        for (int i = 0; i < 10; i++) // No se puede ingresar mas datos de lo previamente declarado
        {
            System.out.println("Ingresar numero en la posicion [" + i + "]: "); // Los datos se ingresan mediante el indice 0-9
            arreglo[i] = sc.nextInt();
        }

        System.out.println("\n=== DATOS DEL ARREGLO ===");
        for (int i = 0; i < 10; i++) // Para retornar los datos se utiliza el indice
        {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);
        }

        ArrayList<Integer> enteros = new ArrayList<>(); // Solo declaramos el ArrayList, su tamanio es dinamico y el tipo de dato que almacena

        // La insercion de datos puede ser de varias maneras

        enteros.add(1); // Mediante insercion individual
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);

        enteros.add(5); // Con metodo al final del ArrayList

        System.out.println("\n=== DATOS INICIALES DEL ARRAYLIST ===");
        System.out.println("Tamanio actual del ArrayList: " + enteros.size());

        // Con iteracion for mediante un indice

        for (int i = 0; i < 2; i++) // Se agregan dos elementos mas al final de la lista
        {
            System.out.print("Ingresar nuevo elemento para el ArrayList: ");
            int entero = sc.nextInt();
            enteros.add(entero);
        }

        System.out.println("\n=== DATOS FINALES DEL ARRAYLIST ===");
        for (int i = 0; i < enteros.size(); i++)
        {
            System.out.println("enteros[" + i + "] = " + enteros.get(i));
        }

        sc.close();
    }
} 

