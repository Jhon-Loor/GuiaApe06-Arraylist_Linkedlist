#include <iostream>
#include <vector> // Con vectores se debe incluir la respectiva libreria
using namespace std;
  
int main() {
    
    int arreglo[10]; //Se declara el tamanio de arreglo y este fijo
  
    cout << "=== INGRESO DE DATOS EN EL ARREGLO ===" << endl;
    for (int i = 0; i < 10; i++) //No se puede ingresar mas datos de lo previamente declarados
    {
        cout << "Ingresar numero en la posicion [" << i << "]: " << endl; //Los datos se ingresan mediante el indice 0-10
        cin >> arreglo[i];
    }
    
    cout << "\n=== DATOS DEL ARREGLO ===" << endl; 
    for (int i = 0; i < 10; i++) //Para retornar los datos se utilizan el indice 
    { 
        cout << "arreglo[" << i << "] = " << arreglo[i] << endl; 
    } 
    
    vector<int> enteros; // Solo declaramos el vector(arraylist) su tamanio es dinamico y el tipo de dato que almacena 
  
    //La inserccion de datos puede ser de varias maneras 
  
    enteros = {1,2,3,4}; //mediante declaracion 
 
    enteros.push_back(5); //Con metodo al final del vector 
    
    cout << "\n=== DATOS INICIALES DEL VECTOR ===" << endl;
    cout << "Tamano actual del vector: " << enteros.size() << endl;

    int entero;

    for (int i = 0; i < 2; i++) //Se toma el indice del ultimo elemento y se agrega dos elementos mas 
    { 
        cout << "Ingresar nuevo elemento para el vector: ";
        cin >> entero;
        enteros.push_back(entero);
    } 
  
    cout << "\n=== DATOS FINALES DEL VECTOR ===" << endl; 
    for (int i = 0; i < enteros.size(); i++) 
    { 
        cout << "enteros[" << i << "] = " << enteros[i] << endl; 
    } 
  
    return 0; 
} 
