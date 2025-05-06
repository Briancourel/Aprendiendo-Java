
package productoidra;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
      //  List<Producto> listaProducto = new ArrayList<>();
        
       
       /* Producto p1 = new Producto (); // Instanciamos el Producto
        p1.setNombre  ("Coca Cola 1.5L"); // Asignamos un valor al nombre
        p1.setPrecio  (2999.99f);
        p1.setMarca  ("Coca Cola");
        p1.setCodigoBarras (651651321653489654L);
        
        System.out.println("Datos del producto");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: " + p1.getPrecio());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Codigo de barras: " + p1.getCodigoBarras());
        
        System.out.println("Ingrese el nombre del producto: ");
        p1.setNombre ( scn.nextLine());
        System.out.println("Ingrese el precio: ");
        p1.setPrecio ( scn.nextFloat());
        System.out.println("Ingrese el codigo de barras: ");
        p1.setCodigoBarras (scn.nextLong());
        System.out.println("Ingrese la marca: ");
        
        scn.nextLine();
        
        p1.setMarca ( scn.nextLine());
       
        */
         ProductoConVencimiento p2 = new ProductoConVencimiento ("");
         System.out.println("Ingrese el nombre del producto: ");
        p2.setNombre ( scn.nextLine());
        System.out.println("Ingrese el precio: ");
        p2.setPrecio ( scn.nextFloat());
        System.out.println("Ingrese el codigo de barras: ");
        p2.setCodigoBarras (scn.nextLong());
        System.out.println("Ingrese la marca: ");
        
        scn.nextLine();
        
        p2.setMarca ( scn.nextLine());
        System.out.println("Ingrese la fecha de vencimiento");
        p2.fechaVencimiento = scn.nextInt();
        System.out.println(p2);
        
        
    
        System.out.println(" Producto agregado correctamente");
   
      
      
    }
    
}
