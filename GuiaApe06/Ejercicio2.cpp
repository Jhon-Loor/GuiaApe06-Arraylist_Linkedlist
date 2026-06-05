#include <iostream>   // Librería para entrada y salida de datos
#include <vector>     // Librería para usar vectores dinámicos

using namespace std;

int main() {

    // Crear un vector para almacenar notas decimales
    vector<double> notas;

    // Variable auxiliar para guardar cada nota ingresada
    double nota;

    // Ciclo para ingresar 6 notas
    for(int i = 0; i < 6; i++) {

        // Pedir una nota al usuario
        cout << "Ingrese nota: ";

        // Leer la nota
        cin >> nota;

        // Agregar la nota al vector
        notas.push_back(nota);
    }

    // Mostrar título
    cout << "\nNotas registradas:\n";

    // Ciclo para mostrar las notas guardadas
    for(int i = 0; i < notas.size(); i++) {

        // Mostrar cada nota
        cout << notas[i] << endl;
    }

    return 0;
}
