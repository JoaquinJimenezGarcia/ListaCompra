import org.omg.PortableServer.POA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner input = new Scanner(System.in);
        ArrayList <Producto> lista = new ArrayList<>();
        int opcion;

        System.out.println("*****************************");
        System.out.println("1 - Añadir nuevo producto");
        System.out.println("2 - Eliminar producto");
        System.out.println("3 - Mostrar lista productos");
        System.out.println("4 - Consultar importe total");
        System.out.println("0 - Pagar");
        System.out.println("*****************************");

        do {
            System.out.println("Inserte opción: ");
            opcion = input.nextInt();
        }while (opcion >= 1 || opcion <= 4 );

        switch (opcion){
            case 1:
                añadir(lista);
                break;
            case 2:
                eliminar(lista);
                break;
            case 3:
                mostrarProductos(lista);
                break;
            case 4:
                consultarImporte(lista);
                break;
            default:
                menu();
                break;
        }
    }

    public static void añadir(ArrayList productos){
        Scanner input = new Scanner(System.in);

        String nombre;
        double precio;

        System.out.println("Inserte nombre: ");
        nombre = input.nextLine();

        System.out.println("Inserte precio: ");
        precio = input.nextInt();

        Producto producto = new Producto(nombre, precio);

        productos.add(producto);


    }

    public static void eliminar(ArrayList productos){

    }

    public static void mostrarProductos(ArrayList productos){

    }

    public static void consultarImporte(ArrayList productos){

    }
}
