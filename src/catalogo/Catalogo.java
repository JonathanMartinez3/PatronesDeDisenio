
/*24/11/2021
Faider Camilo Trujillo  Olaya 20192020136
Jonathan Sneyder Ardila Neira  20191007058
Jonathan Estiben Martinez Malaver 20192020010 

Modelos de Programacion I
Alejandro Paolo Daza Corredor
Universidad Distrital Francisco Jose De Caldas 
*/


package catalogo;

import java.util.Scanner;
import java.util.ArrayList;

public class Catalogo {

    public static void agregarProducto(String[] entrada, ArrayList<Producto> producto) {
        if (!entrada[1].equals("Serie")) { 
            Pelicula pelicula = new Pelicula(entrada[2], entrada[3], Integer.parseInt(entrada[4]), Double.parseDouble(entrada[5]), Integer.parseInt(entrada[6]));
            producto.add(pelicula);
         
        } else if (entrada[1].equals("Serie")) {
            Serie serie = new Serie(entrada[2], entrada[3], Integer.parseInt(entrada[4]), Double.parseDouble(entrada[5]), Integer.parseInt(entrada[6]));
            producto.add(serie);
        }

    }

    public static void listarProductos(ArrayList<Producto> catalogo) {
        System.out.println("***Catálogo MisiónTicFLIX***");
        for (Producto producto : catalogo) {
            System.out.println(producto);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        while (true) {
            String[] entrada = sc.nextLine().split("&");
            if (entrada[0].equals("3")) {
                break;
            }
            switch (entrada[0]) {
                case "1":
                    agregarProducto(entrada, productos);
                    break;
                case "2":
                    listarProductos(productos);
                    break;
            }
        }
    }
}

