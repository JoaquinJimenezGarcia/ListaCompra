import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by joaquinjimenezgarcia on 13/4/17.
 */
public class Menu {
    public static ArrayList<Producto> lista = new ArrayList<>();

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
            } while (opcion < 1 && opcion > 4);

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
                    show();
                    break;
            }
        }else {
            do {
                System.out.println("Inserte opción: ");
                opcion = input.nextInt();
            } while (opcion != 1);

            switch (opcion) {
                case 1:
                    añadir();
                    break;
                default:
                    show();
                    break;
            }
        }
    }

    public static void añadir() {
        Scanner input = new Scanner(System.in);

        String nombre;
        double precio;

        System.out.println("Inserte nombre: ");
        nombre = input.nextLine();

        System.out.println("Inserte precio: ");
        precio = input.nextInt();

        Producto producto = new Producto(nombre, precio);

        lista.add(producto);

        show();
    }

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

    public static void mostrarProductos() {
        showList();
        show();
    }

    public static void consultarImporte() {
        double total = 0;

        for (Producto p : lista) {
            System.out.println(p.getPrecio());
            total += p.getPrecio();
        }

        System.out.println("El precio total es: " + total + "€");

        show();
    }

    public static void showList(){
        for (Object p : lista) {
            System.out.println(p);
        }
    }
}
