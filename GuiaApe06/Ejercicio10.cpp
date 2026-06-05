#include <iostream>   // Librería para entrada y salida de datos
#include <list>       // Librería para usar listas
#include <string>     // Librería para usar cadenas de texto

using namespace std;

// Clase Cliente
class Cliente {

private:

    // Atributos privados
    int turno;
    string nombre;

public:

    // Constructor de la clase
    Cliente(int t = 0, string n = "") {

        turno = t;
        nombre = n;
    }

    // Método para obtener el turno
    int getTurno() const {

        return turno;
    }

    // Método para obtener el nombre
    string getNombre() const {

        return nombre;
    }
};

// Función para agregar clientes a la fila
void agregarCliente(list<Cliente>& fila, int& siguienteTurno) {

    // Variable para guardar nombre
    string nombre;

    // Pedir nombre del cliente
    cout << "Ingrese el nombre del cliente: ";
    cin >> nombre;

    // Agregar cliente a la lista
    fila.push_back(Cliente(siguienteTurno, nombre));

    // Mostrar turno asignado
    cout << "Cliente agregado con turno #" << siguienteTurno << endl;

    // Incrementar siguiente turno
    siguienteTurno++;
}

// Función para mostrar la fila
void mostrarFila(const list<Cliente>& fila) {

    // Verificar si la fila está vacía
    if (fila.empty()) {

        cout << "No hay clientes en espera.\n";
        return;
    }

    // Mostrar título
    cout << "\nFila de atencion:\n";

    // Recorrer y mostrar clientes
    for (const Cliente& c : fila) {

        cout << "Turno #" << c.getTurno()
             << " - " << c.getNombre() << endl;
    }
}

// Función para atender clientes
void atenderCliente(list<Cliente>& fila) {

    // Verificar si la fila está vacía
    if (fila.empty()) {

        cout << "No hay clientes para atender.\n";
        return;
    }

    // Mostrar cliente atendido
    cout << "Atendiendo a "
         << fila.front().getNombre()
         << " con turno #"
         << fila.front().getTurno() << endl;

    // Eliminar cliente atendido
    fila.pop_front();
}

int main() {

    // Crear lista de clientes
    list<Cliente> fila;

    // Variable para controlar turnos
    int siguienteTurno = 1;

    // Variable para opción del menú
    int opcion;

    // Ciclo principal del programa
    do {

        // Mostrar menú
        cout << "\n===== FILA DE ATENCION =====\n";
        cout << "1. Agregar cliente\n";
        cout << "2. Atender cliente\n";
        cout << "3. Mostrar fila\n";
        cout << "4. Salir\n";

        // Pedir opción
        cout << "Seleccione una opcion: ";
        cin >> opcion;

        // Evaluar opción seleccionada
        switch (opcion) {

            // Agregar cliente
            case 1:

                agregarCliente(fila, siguienteTurno);
                break;

            // Atender cliente
            case 2:

                atenderCliente(fila);
                break;

            // Mostrar fila
            case 3:

                mostrarFila(fila);
                break;

            // Salir del programa
            case 4:

                cout << "Saliendo...\n";
                break;

            // Opción inválida
            default:

                cout << "Opcion invalida.\n";
        }

    // Repetir hasta elegir salir
    } while (opcion != 4);

    return 0;
}
