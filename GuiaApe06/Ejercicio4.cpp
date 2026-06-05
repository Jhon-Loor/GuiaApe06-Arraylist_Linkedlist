#include <iostream>   // Librería para entrada y salida de datos
#include <vector>     // Librería para usar vectores dinámicos

using namespace std;

int main() {

    // Crear un vector para almacenar nombres
    vector<string> lista;

    // Variables auxiliares
    int opcion, posicion;
    string nombre;

    // Ciclo del menú
    do {

        // Mostrar opciones del menú
        cout << "\n1. Agregar";
        cout << "\n2. Mostrar";
        cout << "\n3. Modificar";
        cout << "\n4. Eliminar";
        cout << "\n5. Salir";

        // Pedir opción al usuario
        cout << "\nOpcion: ";
        cin >> opcion;

        // Limpiar buffer
        cin.ignore();

        // Evaluar opción seleccionada
        switch(opcion) {

            // Opción para agregar nombres
            case 1:

                // Pedir nombre
                cout << "Nombre: ";

                // Leer nombre completo
                getline(cin, nombre);

                // Agregar nombre al vector
                lista.push_back(nombre);

                break;

            // Opción para mostrar lista
            case 2:

                // Recorrer y mostrar elementos
                for(int i = 0; i < lista.size(); i++) {

                    // Mostrar posición y nombre
                    cout << i << ": " << lista[i] << endl;
                }

                break;

            // Opción para modificar un elemento
            case 3:

                // Pedir posición
                cout << "Posicion: ";
                cin >> posicion;

                // Limpiar buffer
                cin.ignore();

                // Pedir nuevo nombre
                cout << "Nuevo nombre: ";
                getline(cin, nombre);

                // Verificar que la posición exista
                if(posicion >= 0 && posicion < lista.size())

                    // Modificar nombre
                    lista[posicion] = nombre;

                break;

            // Opción para eliminar un elemento
            case 4:

                // Pedir posición
                cout << "Posicion: ";
                cin >> posicion;

                // Verificar que la posición exista
                if(posicion >= 0 && posicion < lista.size())

                    // Eliminar elemento del vector
                    lista.erase(lista.begin() + posicion);

                break;
        }

    // Repetir mientras la opción sea diferente de 5
    } while(opcion != 5);

    return 0;
}
