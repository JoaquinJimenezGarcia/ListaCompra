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
                    if (listaProductos.size() > 0){
                        leerIndice();
                    }
                    break;
                case 3:
                    listaProductos.showProductos();
                    break;
                case 4:
                    listaProductos.showImport();
                    break;
                case 5:
                    if (listaProductos.size() > 0){

                    }
                    break;
                default:
                    break;
            }
        }
    }

    public void leerIndice(){
        Scanner input = new Scanner(System.in);
        int index;

        listaProductos.showProductos();

        System.out.println("Indice a borrar: ");
        index = input.nextInt();

        listaProductos.delete(index);
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

        if (listaProductos.size() > 0) {
            System.out.println("* 2 - Eliminar producto          *");
            System.out.println("* 3 - Mostrar lista de productos *");
            System.out.println("* 4 - Consultar importe total    *");
            System.out.println("* 5 - Modificar producto         *");
        }

        System.out.println("* 0 - Salir                      *");
        System.out.println("**********************************");
        System.out.println("Opción: ");
        option = input.nextInt();

        return option;
    }
}
