#include <iostream>
#include <list>
using namespace std;

class Turno {
private:
    int numero;

public:
    Turno(int n = 0) {
        numero = n;
    }

    void setTurno(int n) {
        numero = n;
    }

    int getTurno() const {
        return numero;
    }
};

// Agregar un turno
void agregarTurno(list<Turno>& turnos, int& siguienteNumero) {
    Turno nuevo(siguienteNumero);
    turnos.push_back(nuevo);
    cout << "Se agrego el turno #" << siguienteNumero << endl;
    siguienteNumero++;
}

// Mostrar turnos
void mostrarTurnos(const list<Turno>& turnos) {
    if (turnos.empty()) {
        cout << "No hay turnos en espera.\n";
        return;
    }

    cout << "\nTurnos en espera:\n";
    for (const Turno& t : turnos) {
        cout << "Turno #" << t.getTurno() << endl;
    }
}

// Atiende al primer turno
void atenderTurno(list<Turno>& turnos) {
    if (turnos.empty()) {
        cout << "No hay turnos para atender.\n";
        return;
    }

    cout << "Atendiendo turno #" << turnos.front().getTurno() << endl;
    turnos.pop_front();
}

// Quitar un turno
void cancelarTurno(list<Turno>& turnos, int numeroBuscado) {
    for (auto it = turnos.begin(); it != turnos.end(); ++it) {
        if (it->getTurno() == numeroBuscado) {
            turnos.erase(it);
            cout << "Se cancelo el turno #" << numeroBuscado << endl;
            return;
        }
    }

    cout << "El turno #" << numeroBuscado << " no existe.\n";
}

int main() {
    list<Turno> turnos;
    int siguienteNumero = 1;
    int opcion, numeroCancelar;

    do {
        cout << "\n===== SISTEMA DE TURNOS =====\n";
        cout << "1. Agregar turno\n";
        cout << "2. Atender turno\n";
        cout << "3. Mostrar turnos\n";
        cout << "4. Cancelar turno\n";
        cout << "5. Salir\n";
        cout << "Seleccione una opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                agregarTurno(turnos, siguienteNumero);
                break;
            case 2:
                atenderTurno(turnos);
                break;
            case 3:
                mostrarTurnos(turnos);
                break;
            case 4:
                cout << "Ingrese el numero del turno a cancelar: ";
                cin >> numeroCancelar;
                cancelarTurno(turnos, numeroCancelar);
                break;
            case 5:
                cout << "Saliendo del sistema...\n";
                break;
            default:
                cout << "Opcion invalida.\n";
        }

    } while (opcion != 5);

    return 0;
} 
