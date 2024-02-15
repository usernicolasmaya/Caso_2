package Mundo;

/**
 *
 * @author Nicolas Maya - Santiago Luna
 */
public class Producto {
    
    //Atributos
    private int id_Producto;
    private String nombre;
    private int precio;
    private int cantidad;
    
    //Métodos
    public Producto() {
    }

    public Producto(int id_Producto, String nombre, int precio, int cantidad) {
        this.id_Producto = id_Producto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}