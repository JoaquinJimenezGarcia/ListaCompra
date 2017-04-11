import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList <Producto> lista = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner input = new Scanner(System.in);

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
        }while (opcion <1 && opcion > 4 );

        switch (opcion){
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
                menu();
                break;
        }
    }

    public static void añadir(){
        Scanner input = new Scanner(System.in);

        String nombre;
        double precio;

        System.out.println("Inserte nombre: ");
        nombre = input.nextLine();

        System.out.println("Inserte precio: ");
        precio = input.nextInt();

        Producto producto = new Producto(nombre, precio);

        lista.add(producto);

        menu();
    }

    public static void eliminar(){

    }

    public static void mostrarProductos(){
        for (Object p: lista) {
            System.out.println(p);
        }
    }

    public static void consultarImporte(){

    }
}
