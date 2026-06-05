#include <iostream>   // Librería para entrada y salida de datos
#include <vector>     // Librería para usar vectores dinámicos

using namespace std;

int main() {

    // Vector para guardar nombres
    vector<string> nombres;

    // Vector para guardar notas
    vector<double> notas;

    // Variables auxiliares
    int cantidad;
    string nombre;
    double nota;

    // Pedir cantidad de estudiantes
    cout << "Cantidad de estudiantes: ";
    cin >> cantidad;

    // Limpiar buffer
    cin.ignore();

    // Ciclo para registrar estudiantes
    for(int i = 0; i < cantidad; i++) {

        // Pedir nombre del estudiante
        cout << "Nombre: ";

        // Leer nombre completo
        getline(cin, nombre);

        // Pedir nota del estudiante
        cout << "Nota: ";

        // Leer nota
        cin >> nota;

        // Limpiar buffer
        cin.ignore();

        // Guardar nombre en el vector
        nombres.push_back(nombre);

        // Guardar nota en el vector
        notas.push_back(nota);
    }

    // Mostrar título
    cout << "\nREGISTROS\n";

    // Recorrer y mostrar registros
    for(int i = 0; i < nombres.size(); i++) {

        // Mostrar nombre y nota
        cout << nombres[i] << " - " << notas[i] << endl;
    }

    return 0;
}
