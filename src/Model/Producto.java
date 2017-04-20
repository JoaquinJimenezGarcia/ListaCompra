package Model;

/**
 * Created by joaquinjimenezgarcia on 11/4/17.
 * Clase de los productos
 */

public class Producto {
    private String nombre;
    private double precio;

    /**
     * Constructor por defecto que establecerá un producto estándard
     * con un precio de 0 euros
     */
    public Producto() {
        this.nombre = "Standard";
        this.precio = 0.00;
    }

    /**
     * Crea un objeto producto con el nombre y precio dados al inicializarlo
     * @param nombre nombre del producto
     * @param precio precio que obtendrá el producto
     */
    public Producto(String nombre, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")){
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            this.precio = 0.0;
        }else{
            this.precio = precio;
        }
    }

    /**
     * Devolverá el producto con su nombre y precio
     * @return producto completo
     */
    @Override
    public String toString() {
        return nombre + " (" + precio + " €)";
    }
}
