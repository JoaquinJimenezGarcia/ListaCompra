import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joaquinjimenezgarcia on 13/4/17.
 */
public class Menu {
    public static ArrayList<Producto> lista = new ArrayList<>();

    /**
     * Muestra el menú de inicio y te da a elegir unas opciones
     * dependiendo de si tienes o no elementos en la lista
     */
    public static void show(){
        Scanner input = new Scanner(System.in);

        int opcion;

        System.out.println("*****************************");
        System.out.println("1 - Añadir nuevo producto");
        if (lista.size() > 0) {
            System.out.println("2 - Eliminar producto");
            System.out.println("3 - Mostrar lista productos");
            System.out.println("4 - Consultar importe total");
        }
        System.out.println("0 - Pagar");
        System.out.println("*****************************");

        if (lista.size() > 0) {
            do {
                System.out.println("Inserte opción: ");
                opcion = input.nextInt();
            } while (opcion < 1 && opcion > 4 && opcion != 0);

            switch (opcion) {
                case 1:
                    añadir();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    consultarImporte();
                    break;
                default:
                    break;
            }
        }else {
            do {
                System.out.println("Inserte opción: ");
                opcion = input.nextInt();
            } while (opcion != 1 && opcion != 0);

            switch (opcion) {
                case 1:
                    añadir();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Añade productos a la lista
     */
    public static void añadir() {
        Scanner input = new Scanner(System.in);

        String nombre;
        double precio;

        System.out.println("Inserte nombre: ");
        nombre = input.nextLine();

        System.out.println("Inserte precio: ");
        precio = input.nextDouble();

        Producto producto = new Producto(nombre, precio);

        lista.add(producto);

        show();
    }

    /**
     * Elimina productos de la lista
     */
    public static void eliminar() {
        Scanner input = new Scanner(System.in);
        int index;

        showList();

        System.out.println("Indice a borrar: ");
        index = input.nextInt();

        if (index < lista.size()) {
            lista.remove(index);
        }else {
            System.out.println("Por favor, inserte un índice válido");
        }

        show();
    }

    /**
     * Muestra la lista de prodcutos
     */
    public static void mostrarProductos() {
        showList();
        show();
    }

    /**
     * Consulta el importe total de la lista
     */
    public static void consultarImporte() {
        double total = 0;

        for (Producto p : lista) {
            System.out.println(p.getPrecio());
            total += p.getPrecio();
        }

        System.out.println("El precio total es: " + total + "€");

        show();
    }

    /**
     * Muestra los elementos del Array List
     */
    public static void showList(){
        for (Producto p : lista) {
            System.out.println(lista.indexOf(p) + " - " + p);
        }
    }
}
