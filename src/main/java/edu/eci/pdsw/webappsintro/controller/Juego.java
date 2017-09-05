/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webappsintro.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author 2098325
 */

@ManagedBean(name = "Juego")
@SessionScoped
public class Juego {
    private int numeroAdivinar=2;
    private int intentosRealizados=0;
    private int premioAcumulado=1;
    private String estado ="No ha ganado";
    
    public int getNumAdiv(){
        return numeroAdivinar;
    }
    public void setNumAdiv(int numeroAdivinar){
        this.numeroAdivinar=numeroAdivinar;
    }
    public int getIntentos(){
        return intentosRealizados;
    }
    public void setIntentos(int intentosRealizados){
        this.intentosRealizados=intentosRealizados;
    }
    public int getPremio(){
        return premioAcumulado;
    }
    public void setPremio(int premioAcumulado ){
        this.premioAcumulado=premioAcumulado;
    
    }
    public String getEstado(){
        return estado;
        
    }
    public void setEstado(String estado){
        this.estado=estado;
    }
    
    
    
    
    
    public void reiniciar(){
        premioAcumulado=1;
        numeroAdivinar=2;

    }
    
    
    
}
