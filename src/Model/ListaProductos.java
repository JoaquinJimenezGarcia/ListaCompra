package Model;

import java.util.ArrayList;

/**
 * Created by joaquinjimenezgarcia on 20/4/17.
 */
public class ListaProductos {
    private ArrayList<Producto> productos;

    public ListaProductos() {
        productos = new ArrayList<>();
    }

    public void addProducto(Producto producto){
        if (producto != null){
            productos.add(producto);
        }
    }

    public void showProductos(){
        for (Producto producto: productos){
            System.out.println("Índice: " + productos.indexOf(producto) + " - " + producto);
        }
    }

    public int size(){
        return productos.size();
    }

    public void delete(int index){
        if (index < productos.size()) {
            productos.remove(index);
        }else {
            System.out.println("Por favor, inserte un índice válido");
        }
    }

    public void showImport(){
        double total = 0;

        showProductos();

        for (Producto p : productos) {
            total += p.getPrecio();
        }

        System.out.println("El precio total es: " + total + "€");
    }
}
