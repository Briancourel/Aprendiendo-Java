
package productoidra;


public class Producto {
   protected String nombre; //nombre del producto
   protected float  precio;
   protected long  codigoDeBarra;
   protected String marca;
   
   
    public Producto()
    {
    }
   public String getNombre()
    {
    return this.nombre;
    }
    public void setNombre (String newName)
    {
    this.nombre = newName;//this variable autoreferencial...para que el programa pueda saber mas facil con quien esta trabajando.
    }
    
    public float getPrecio()
    {
    return this.precio;
    }
    public void setPrecio(float newPrecio)
    {
    this.precio = newPrecio;
    }
    public long getCodigoBarras()
    {
    return this.codigoDeBarra;
    }
    public void setCodigoBarras(long newCB)
    {
    this.codigoDeBarra = newCB;
    }
    public String getMarca()
    {
     return this.marca;
    }
    public void setMarca(String newMarca)
    {
    this.marca = newMarca;
    }
    
    public Producto (String nombre, float precio, long codigoDeBarra, String marca)
    {
    this.nombre = nombre;
    this.precio = precio;
    this.codigoDeBarra = codigoDeBarra;
    this.marca = marca;
            
    }
    
    public void mostrarProducto() //Mala practica para mostrar productos.
    {
    System.out.println("nombre:" + this.nombre);
    System.out.println("precio:" + this.precio);
    System.out.println("codigo de barras" + this.codigoDeBarra);
    System.out.println("marca: " + this.marca);
    }

   @Override
    public String toString()
    {
        String salida = " Producto {";
        salida += "nombre:" + this.nombre+", ";
        salida += "precio:" + this.precio + ", ";
        salida += "codigo de barras:" + this.codigoDeBarra + ", ";
        salida += "marca:" + this.marca + ", ";
        
        return salida;
    }
    
   @Override
    public boolean equals (Object o) //Utilizando equals
    {
        if (this == o)
        { 
            return true;
        }
        if (o == null)
        {
        return false;
        }
        if (this.getClass() != o.getClass())
        {
        return false;
        }
        Producto otroProducto = (Producto) o; //utilizacion de "casteo"
        
        if (otroProducto.precio != this.precio)
        {
         return false;
        } 
        if (otroProducto.codigoDeBarra != this.codigoDeBarra)
        {
        return false;
        }
        if (otroProducto.nombre.equals(this.nombre) != true) //comparacion de cadena de String
        {
        return false;
        }
        if (otroProducto.marca.equals(this.marca) != true )
        {
        return false ;
        }
    return true;
    }
}
