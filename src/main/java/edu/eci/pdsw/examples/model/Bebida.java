/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.examples.model;

/**
 *
 * @author hcadavid
 */
public class Bebida implements ItemOrden{
    
    private int calorias;
    private int precio;
    private String nombre;

    public int getCalorias() {
        return calorias;
    }
    public Bebida(String nombre, int precio, int calorias) {
        this.precio=precio;
        this.nombre=nombre;
        this.calorias = calorias;
    }

    @Override
    public void setPrecio(int precio) {
                this.precio = precio;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;    
    
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
