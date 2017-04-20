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
            System.out.println(producto);
        }
    }
}
