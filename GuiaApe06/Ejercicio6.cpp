#include <iostream>   // Librería para entrada y salida de datos
#include <vector>     // Librería para usar vectores dinámicos

using namespace std;

// Clase Producto
class Producto {

public:

    // Atributos del producto
    string nombre;
    int cantidad;
    float precio;

    // Constructor para inicializar atributos
    Producto(string n, int c, float p) {

        nombre = n;
        cantidad = c;
        precio = p;
    }

    // Método para mostrar información del producto
    void mostrar() {

        cout << "Nombre: " << nombre << endl;
        cout << "Cantidad: " << cantidad << endl;
        cout << "Precio: $" << precio << endl;
        cout << "-------------------" << endl;
    }
};

int main() {

    // Vector para almacenar productos
    vector<Producto> inventario;

    // Variable para cantidad de productos
    int n;

    // Pedir cantidad de productos
    cout << "Cantidad de productos: ";
    cin >> n;

    // Ciclo para registrar productos
    for(int i = 0; i < n; i++) {

        // Variables auxiliares
        string nombre;
        int cantidad;
        float precio;

        // Mostrar número de producto
        cout << "\nProducto " << i + 1 << endl;

        // Limpiar buffer
        cin.ignore();

        // Pedir nombre del producto
        cout << "Nombre: ";

        // Leer nombre completo
        getline(cin, nombre);

        // Pedir cantidad
        cout << "Cantidad: ";
        cin >> cantidad;

        // Pedir precio
        cout << "Precio: ";
        cin >> precio;

        // Agregar producto al vector
        inventario.push_back(Producto(nombre, cantidad, precio));
    }

    // Mostrar título
    cout << "\n===== INVENTARIO =====" << endl;

    // Recorrer vector y mostrar productos
    for(auto p : inventario) {

        // Mostrar datos del producto
        p.mostrar();
    }

    return 0;
}
