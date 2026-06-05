#include <iostream>
using namespace std;

int main() {

    // Crear un arreglo de 5 estudiantes
    string estudiantes[5];

    // Ciclo para ingresar nombres
    for(int i = 0; i < 5; i++) {

        // Pedir nombre del estudiante
        cout << "Ingrese nombre del estudiante: ";

        // Guardar nombre en el arreglo
        cin >> estudiantes[i];
    }

    // Mostrar título
    cout << "\nLista de estudiantes:\n";

    // Ciclo para mostrar estudiantes
    for(int i = 0; i < 5; i++) {

        // Mostrar cada nombre
        cout << estudiantes[i] << endl;
    }

    return 0;
}
