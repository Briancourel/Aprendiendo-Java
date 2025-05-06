
package productoidra;


public class ProductoConVencimiento extends Producto {
    
    protected int fechaVencimiento;
    
    
    public ProductoConVencimiento (String nombre )
    {
    super.nombre = nombre;
    }
    
    public ProductoConVencimiento(String nombre, float precio,long codigoDeBarra, String marca )
    {
    super(nombre, precio,codigoDeBarra,marca);
    this.fechaVencimiento = fechaVencimiento;
    
    }
    public int getFechaVencimento()
    {
    return this.fechaVencimiento;
    }
    public void setFechaVencimento(int fecha)
    {
    this.fechaVencimiento = fecha;
    }
    
    @Override
     public void mostrarProducto()
    {
        super.mostrarProducto(); // se ejecuta lo primero y luego lo nuevo
    System.out.println("fecha de vencimiento:" + this.fechaVencimiento);
    
    
    }

}
