import java.util.ArrayList; // Librería para usar ArrayList

public class Ejercicio7 {

    public static void main(String[] args) {

        // =========================
        // ARREGLO
        // =========================

        // Crear un arreglo fijo con 3 nombres
        String[] arreglo = {"Juan", "Pedro", "Maria"};

        // Mostrar título
        System.out.println("ARREGLO");

        // Recorrer y mostrar el arreglo
        for(String nombre : arreglo) {

            // Mostrar cada nombre
            System.out.println(nombre);
        }

        // =========================
        // ARRAYLIST
        // =========================

        // Crear un ArrayList dinámico
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos al ArrayList
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Maria");
        lista.add("Carlos");

        // Mostrar título
        System.out.println("\nARRAYLIST");

        // Recorrer y mostrar el ArrayList
        for(String nombre : lista) {

            // Mostrar cada nombre
            System.out.println(nombre);
        }
    }
}

