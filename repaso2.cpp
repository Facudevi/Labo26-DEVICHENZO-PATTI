#include <iostream>
#include <string>
#include <vector>
using namespace std;

struct Producto {
    string nombre;
    string codBarra;
    string marca;
    int precio;
    bool fechaVenc; 
};


int columnaMayor(Producto g[3][4]){
    int max = g[0][0].precio;
    int columna;
    
    for (int i=0; i<3; i++){
        for (int j=1; j<4; j++){
            if(g[i][j].precio > max){
                max = g[i][j].precio;
                columna = j+1;
            }
        }
    }

    return columna;
}


string buscarProducto(Producto g[3][4]){
    return g[1][2].nombre;
}


float promedio(Producto g[3][4]){
    float suma = 0;
    int cont=0;
    
    for (int i=0; i<3; i++){
        for (int j=0; j<4; j++){
            suma += g[i][j].precio;
            cont ++;
        }
    }

    float prom = suma / cont;
    return prom;
}


int vencimiento(Producto g[3][4]){
    int cont=0;

    for (int i=0; i<3; i++){
        for (int j=0; j<4; j++){
            if (g[i][j].fechaVenc != false){
                cont++;
            }
        }
    }

    return cont;
}


int main (void){
    Producto prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12;

    prod1.nombre = "Queso";
    prod1.codBarra = "1234-5678";
    prod1.marca = "Reggianato";
    prod1.precio = 20;
    prod1.fechaVenc = true;

    prod2.nombre = "Pizza";
    prod2.codBarra = "1223-4567";
    prod2.marca = "sibarita";
    prod2.precio = 70;
    prod2.fechaVenc = true;

    prod3.nombre = "Salsa de Tomate";
    prod3.codBarra = "1123-4567";
    prod3.marca = "salsitas";
    prod3.precio = 11;
    prod3.fechaVenc = true;

    prod4.nombre = "Milanesa";
    prod4.codBarra = "1233-4456";
    prod4.marca = "milagrosas";
    prod4.precio = 90;
    prod4.fechaVenc = false;

    prod5.nombre = "Mayonesa";
    prod5.codBarra = "2133-6654";
    prod5.marca = "hellman's";
    prod5.precio = 5;
    prod5.fechaVenc = false;

    prod6.nombre = "Arroz";
    prod6.codBarra = "3333-4444";
    prod6.marca = "gallo";
    prod6.precio = 30;
    prod6.fechaVenc = true;

    prod7.nombre = "Masa de Empanada";
    prod7.codBarra = "5555-5556";
    prod7.marca = "Pagliac";
    prod7.precio = 35;
    prod7.fechaVenc = false;

    prod8.nombre = "Agua";
    prod8.codBarra = "2334-7467";
    prod8.marca = "villavicencio";
    prod8.precio = 30;
    prod8.fechaVenc = false;

    prod9.nombre = "Manzanas";
    prod9.codBarra = "3465-7767";
    prod9.marca = "Manzanillas";
    prod9.precio = 15;
    prod9.fechaVenc = false;

    prod10.nombre = "Yogurt";
    prod10.codBarra = "1111-1113";
    prod10.marca = "La Serenisima";
    prod10.precio = 10;
    prod10.fechaVenc = true;

    prod11.nombre = "Carne de vaca";
    prod11.codBarra = "4444-6666";
    prod11.marca = "carnivoro";
    prod11.precio = 80;
    prod11.fechaVenc = true;

    prod12.nombre = "Papas";
    prod12.codBarra = "8983-0223";
    prod12.marca = "McKein";
    prod12.precio = 40;
    prod12.fechaVenc = true;

    Producto gondola[3][4] = {prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod10, prod11, prod12};

    cout << "Gondola para comprobar posiciones y precio: " << endl;
    for (int i=0; i<3; i++){
        for (int j=0; j<4; j++){
            cout << gondola[i][j].nombre << " -$" << gondola[i][j].precio << ", ";
        }
        cout << endl;
    }
    cout << "------------\n";

    cout << "Columna con el precio más alto: " << columnaMayor(gondola) << endl;
    cout << "Producto fila->2, columan->3: " << buscarProducto(gondola) << endl;
    cout << "Promedio de todos los productos: " << promedio(gondola) << endl;
    cout << "Cantidad de productos con fecha de vencimiento: " << vencimiento(gondola) << endl;


}