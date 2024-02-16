package taller2;

import Mundo.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Maya - Santiago Luna
 */
    public class Taller2 {
        
         private ArrayList<Producto> misProductos;
         private Scanner lector;

    public Taller2() {
        misProductos = new ArrayList<>();
        lector = new Scanner(System.in);
    }

     public void mostrarMenu() {
        boolean activo = true;

        do {
            System.out.println("========= Menu de opciones ==========");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Ordenar inventario de forma descendente");
            System.out.println("4. Elimnar un producto");
            System.out.println("5. Terminar programa");
            System.out.println("Seleccione una opcion");
            System.out.println("=====================================");
        
            int opcion = lector.nextInt();
            
             switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarInventario();
                    break;
                case 3:
                    ordenAscendente();
                    break;
                    
                case 4:
                    
                    eliminarProducto();
                    
                break;
                
                case 5:
                    activo = false;
                    System.out.println("Programa terminado");
                    
                 break;   
                    
                default:
                    System.out.println("Opción no válida, inténtelo nuevamente");
            }
        } while (activo);
    }
                
             public void agregarProducto() {
                 
                System.out.println("Ingrese el id del producto:");
                int id_Producto=lector.nextInt();
                
                lector.nextLine();
                System.out.println("Nombre: ");
                String nombre=lector.nextLine();
                
                System.out.println("Precio: ");
                int precio=lector.nextInt();
                
                System.out.println("cantidad: ");
                int cantidad=lector.nextInt();
                
                //crea del objeto y llenar la informacion
                Producto nuevoProducto = new Producto (id_Producto, nombre, precio, cantidad);
                
                //almacena el objeto en la contenedora
                misProductos.add(nuevoProducto);
                System.out.println("El producto fue agregado satisfactoriamente ");
                
             }
                
             public void mostrarInventario() {
                System.out.println("====== Mostrar Inventario =====");
                for (Producto t: misProductos){
                System.out.println("Id: " +t.getId_Producto());
                System.out.println("Nombre: " +t.getNombre());
                System.out.println("Precio: " +t.getPrecio());
                System.out.println("Cantidad: " +t.getCantidad());
                System.out.println("===============================");
                }

             }
            
          public void ordenAscendente() {
                
               int n = misProductos.size();
               for (int i = 0; i < n; i++) {
                 for (int j = 0; j < n - i - 1; j++) {
                    if (misProductos.get(j).getCantidad()> misProductos.get(j + 1).getCantidad()) {
                        Producto temp = misProductos.get(j);
                        misProductos.set(j, misProductos.get(j + 1));
                        misProductos.set(j + 1, temp);
            }
                 }
               }
              
                System.out.println("=====Productos ordenados (Menor a Mayor)=====");               
               
                for (Producto k: misProductos){
                System.out.println("Id: " +k.getId_Producto());
                System.out.println("Nombre: " +k.getNombre());
                System.out.println("Precio: " +k.getPrecio());
                System.out.println("Cantidad: " +k.getCantidad());
                System.out.println("===============================");
                }
}
    
             public void eliminarProducto() {
                
                System.out.println("===============================");
                
                System.out.println("Ingresa el id del producto a eliminar");
                 int id=lector.nextInt();
                    for(Producto p: misProductos){
                        if(p.getId_Producto()==id){
                            misProductos.remove(p);
                            
                            System.out.println("===============================");
                            
                            System.out.println("El producto con id "+id+" ha sido eliminado correctamente");
                          
                        }
                    }
                    
}
        public static void main(String[] args) {
        Taller2 organizador = new Taller2();
        organizador.mostrarMenu();
        }
    }
