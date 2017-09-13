package edu.eci.pdsw.examples.model;

public class Plato implements ItemOrden{
    private int precio;
    private String nombre;
    
    
    public Plato(String nombre, int precio) {
        //super(nombre, precio);
        this.nombre=nombre;
        this.precio=precio;
    }
   
    @Override
    public void setPrecio(int precio) {
        this.precio = precio;

    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String getNombre() {
        return nombre;
        
    }

    @Override
    public int getPrecio() {
        return precio;
        
    }

}
