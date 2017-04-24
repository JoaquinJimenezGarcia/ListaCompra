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
                    listaProductos.addProducto(leerProducto());
                    break;
                case 2:
                    if (listaProductos.size() > 0){
                        listaProductos.delete(leerIndice());
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
                        listaProductos.modify(leerIndice(), leerProducto());
                    }
                    break;
                case 6:
                    if (listaProductos.size() > 0){
                        listaProductos.changeQuantity(leerIndice(),leerCantidad());
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private int leerIndice(){
        Scanner input = new Scanner(System.in);
        int index;

        listaProductos.showProductos();

        System.out.println("Indice: ");
        index = input.nextInt();

        return index;
    }

    private int leerCantidad(){
        Scanner input = new Scanner (System.in);
        int cantidad;

        System.out.println("Cuántas unidades desea añadir? ");
        cantidad = input.nextInt();

        return cantidad;
    }

    private Producto leerProducto(){
        Scanner input = new Scanner(System.in);
        String nombre;
        double precio;
        int cantidad;
        Producto producto;

        do {
            System.out.println("Nombre del artículo: ");
            nombre = input.nextLine();
        }while (nombre.equals(""));

        System.out.println("Precio del artículo: ");
        precio = input.nextDouble();

        System.out.println("Inserte cantidad: ");
        cantidad = input.nextInt();

        producto = new Producto(nombre, precio, cantidad);

        return producto;
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
            System.out.println("* 6 - Modificar cantidad         *");
        }

        System.out.println("* 0 - Salir                      *");
        System.out.println("**********************************");
        System.out.println("Opción: ");
        option = input.nextInt();

        return option;
    }
}
