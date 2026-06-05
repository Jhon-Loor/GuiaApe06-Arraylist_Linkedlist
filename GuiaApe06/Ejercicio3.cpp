#include <iostream>   // Librería para entrada y salida de datos
#include <vector>     // Librería para usar vectores dinámicos

using namespace std;

int main() {

    // Crear un vector para almacenar productos
    vector<string> productos;

    // Variables auxiliares
    string producto, buscar;

    // Variable booleana para verificar si se encontró el producto
    bool encontrado = false;

    // Ciclo para ingresar 5 productos
    for(int i = 0; i < 5; i++) {

        // Pedir nombre del producto
        cout << "Ingrese producto: ";

        // Leer el producto completo
        getline(cin, producto);

        // Agregar el producto al vector
        productos.push_back(producto);
    }

    // Pedir el producto a buscar
    cout << "Producto a buscar: ";

    // Leer el nombre del producto a buscar
    getline(cin, buscar);

    // Recorrer el vector para buscar el producto
    for(int i = 0; i < productos.size(); i++) {

        // Comparar si el producto existe
        if(productos[i] == buscar) {

            // Cambiar el valor a verdadero si se encuentra
            encontrado = true;
        }
    }

    // Mostrar resultado de la búsqueda
    if(encontrado)

        // Mensaje si el producto existe
        cout << "Producto encontrado";

    else

        // Mensaje si no existe
        cout << "Producto no encontrado";

    return 0;
}
