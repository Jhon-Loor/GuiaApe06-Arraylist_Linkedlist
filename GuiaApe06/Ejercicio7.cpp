#include <iostream>   // Librería para entrada y salida de datos
#include <vector>     // Librería para usar vectores dinámicos

using namespace std;

int main() {

    // Crear un arreglo fijo con 3 nombres
    string arreglo[3] = {"Juan", "Pedro", "Maria"};

    // Mostrar título
    cout << "ARREGLO" << endl;

    // Recorrer y mostrar el arreglo
    for(int i = 0; i < 3; i++) {

        // Mostrar cada elemento del arreglo
        cout << arreglo[i] << endl;
    }

    // Crear un vector dinámico
    vector<string> lista;

    // Agregar elementos al vector
    lista.push_back("Juan");
    lista.push_back("Pedro");
    lista.push_back("Maria");
    lista.push_back("Carlos");

    // Mostrar título
    cout << "\nVECTOR" << endl;

    // Recorrer y mostrar el vector
    for(string nombre : lista) {

        // Mostrar cada nombre
        cout << nombre << endl;
    }

    return 0;
}
