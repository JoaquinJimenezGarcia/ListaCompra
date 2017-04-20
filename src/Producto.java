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
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devolverá el producto con su nombre y precio
     * @return producto completo
     */
    @Override
    public String toString() {
        return "Producto = " + nombre +
                ", PVP = " + precio + " €";
    }
}
