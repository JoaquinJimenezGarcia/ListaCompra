package Controller;

import Model.ListaProductos;
import Model.Producto;

import java.util.Scanner;

/**
 * Created by joaquinjimenezgarcia on 20/4/17.
 */
public class ShoppingListApp {
    ListaProductos listaProductos;

    public ShoppingListApp(){
        listaProductos = new ListaProductos();
    }

    public void run(){
        int option;

        while ((option = showMenu()) != 0){
            switch (option) {
                case 1:
                    leerProducto();
                    break;
                case 2:

                    break;
                case 3:
                    listaProductos.showProductos();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }

    private void leerProducto(){
        Scanner input = new Scanner(System.in);
        String nombre;
        double precio;
        Producto producto;

        do {
            System.out.println("Nombre del artículo: ");
            nombre = input.nextLine();
        }while (nombre.equals(""));

        System.out.println("Precio del artículo: ");
        precio = input.nextDouble();

        producto = new Producto(nombre, precio);

        listaProductos.addProducto(producto);
    }

    private int showMenu(){
        Scanner input = new Scanner(System.in);
        int option;

        System.out.println("**********************************");
        System.out.println("* 1 - Añadir producto            *");
        System.out.println("* 2 - Eliminar producto          *");
        System.out.println("* 3 - Mostrar lista de productos *");
        System.out.println("* 4 - Consultar importe total    *");
        System.out.println("* 0 - Salir                      *");
        System.out.println("**********************************");
        System.out.println("Opción: ");
        option = input.nextInt();

        return option;
    }
}
