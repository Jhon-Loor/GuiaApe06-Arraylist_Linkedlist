import java.util.LinkedList; import java.util.Scanner; 
  
class Turno {     private int numero; 
  
    public Turno(int numero) {         this.numero = numero; 
    } 
  
    public void setTurno(int numero) {         this.numero = numero; 
    } 
  
    public int getTurno() {         return numero; 
    } 
} 
  
public class Ejercicio9 { 
  
    public static void agregarTurno(LinkedList<Turno> turnos, int[] siguienteNumero) {         turnos.addLast(new Turno(siguienteNumero[0])); 
        System.out.println("Se agreog el turno #" + siguienteNumero[0]);         siguienteNumero[0]++; 
    } 
  
    public static void mostrarTurnos(LinkedList<Turno> turnos) {         if (turnos.isEmpty()) { 
            System.out.println("No hay turnos en espera.");             return; 
        } 
  
        System.out.println("\nTurnos en espera:");         for (Turno t : turnos) { 
            System.out.println("Turno #" + t.getTurno()); 
        } 
    } 
  
    public static void atenderTurno(LinkedList<Turno> turnos) {         if (turnos.isEmpty()) { 
            System.out.println("No hay turnos para atender.");             return; 
        } 
  
        System.out.println("Atendiendo turno #" + turnos.getFirst().getTurno());         turnos.removeFirst(); 
    } 
  
    public static void cancelarTurno(LinkedList<Turno> turnos, int numeroBuscado) { 
        for (int i = 0; i < turnos.size(); i++) {             if (turnos.get(i).getTurno() == numeroBuscado) {                 turnos.remove(i); 
                System.out.println("Turno #" + numeroBuscado + " cancelado.");                 return; 
            } 
        } 
  
        System.out.println("Turno no encontrado."); 
    } 
  
    public static void main(String[] args) { 
        LinkedList<Turno> turnos = new LinkedList<>(); 
        Scanner sc = new Scanner(System.in); 
  
        int[] siguienteNumero = {1};         int opcion;         int numeroCancelar; 
  
        do { 
            System.out.println("\n-SISTEMA DE TURNOS -"); 
            System.out.println("1. Agregar turno"); 
            System.out.println("2. Atender turno"); 
            System.out.println("3. Mostrar turnos"); 
            System.out.println("4. Cancelar turno"); 
            System.out.println("5. Salir"); 
            System.out.print("Seleccione una opción: ");             opcion = sc.nextInt(); 
  
            switch (opcion) {                 case 1: 
                    agregarTurno(turnos, siguienteNumero);                     break; 
  
                case 2: 
                    atenderTurno(turnos);                     break; 
  
                case 3: 
                    mostrarTurnos(turnos);                     break; 
  
                case 4: 
                    System.out.print("Ingrese el nmero del turno a cancelar: ");                     numeroCancelar = sc.nextInt();                     cancelarTurno(turnos, numeroCancelar);                     break; 
  
                case 5: 
 
                    System.out.println("Saliendo del sistema...");                     break; 
  
                default: 
                    System.out.println("Opcio invalida"); 
            } 
  
        } while (opcion != 5); 
  
        sc.close(); 
    } 
}   

