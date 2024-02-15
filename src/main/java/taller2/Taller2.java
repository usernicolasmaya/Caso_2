package taller2;

import Mundo.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolas Maya y Santiago Luna
 */
public class Taller2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner lector = new Scanner(System.in);
        
        ArrayList<Producto> misProductos=new ArrayList<>();

        boolean activo=true;
        
        do {
            System.out.println("========= menu de opciones ==========");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Ordenar inventario de forma ascendente");
            System.out.println("4. Elimnar un producto");
            System.out.println("5. Terminar programa");
            System.out.println("Seleccione una opcion");
            System.out.println("=====================================");
        
            int opcion = lector.nextInt();
            
            switch(opcion){
                
            case 1:
                System.out.println("Ingrese el id del producto");
                int id_Producto=lector.nextInt();
                
                lector.nextLine();
                System.out.println("Nombre: ");
                String nombre=lector.nextLine();
                
                System.out.println("Precio");
                int precio=lector.nextInt();
                
                System.out.println("cantidad:");
                int cantidad=lector.nextInt();
                
                //crea del objeto y llenar la informacion
                Producto nuevoProducto = new Producto (id_Producto, nombre, precio, cantidad);
                
                //almacena el objeto en la contenedora
                misProductos.add(nuevoProducto);
                System.out.println("la tarea fue guardada a satisfaccion");
                
                break;
                
            case 2:
                System.out.println("====== Mostrar Inventario =====");
                for (Producto t: misProductos){
                System.out.println("id: " +t.getId_Producto());
                System.out.println("nombre: " +t.getNombre());
                System.out.println("precio: " +t.getPrecio());
                System.out.println("cantidad: " +t.getCantidad());
                System.out.println("===============================");
                }

            break;
            
            case 3:
                int n=misProductos.size();
                    for(int i=0; i<n-1; i++) {
                        for(int j=0; j<n-i-1; j++) {
                            if(misProductos.get(j).getCantidad() < misProductos.get(j+1).getCantidad()) {
                                //Reorganizar las tareas en orden descendente
                                Producto temp=misProductos.get(j);
                                misProductos.set(j, misProductos.get(j+1));
                                misProductos.set(j+1, temp);
                            }
                        }
                    }

            break;
            
            case 4:
            System.out.println("Ingresa el id del producto a eliminar");
                int id = lector.nextInt();
                for (Producto p: misProductos){
                if (p.getId_Producto()==id)
                    misProductos.remove(p);
            }
                System.out.println("El producto con la id " + id + " ha sido eliminado");
                System.out.println("=================================================");
                break;
                
            case 5:
                activo = false;
                System.out.println("Abandonaste el programa");
            
            break;
                
                default:
                    System.out.println("opcion no valida");
            
        }
        }while(activo);
    }
}
