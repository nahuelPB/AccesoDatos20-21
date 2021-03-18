package modelo;
// Generated 18-mar-2021 19:21:19 by Hibernate Tools 3.6.0



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private int codigo;
     private Fabricante fabricante;
     private String nombre;
     private double precio;

    public Producto() {
    }

    public Producto(int codigo, Fabricante fabricante, String nombre, double precio) {
       this.codigo = codigo;
       this.fabricante = fabricante;
       this.nombre = nombre;
       this.precio = precio;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Fabricante getFabricante() {
        return this.fabricante;
    }
    
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }




}


