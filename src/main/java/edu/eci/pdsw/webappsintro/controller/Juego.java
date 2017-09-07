/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webappsintro.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 import java.util.Random;


/**
 *
 * @author 2098325
 */

@ManagedBean(name = "beanEstadoAdivinanza")
@SessionScoped
public class Juego {
    private int numpersona=0;
    private int numeroAdivinar;
    private int intentosRealizados=0;
    private int premioAcumulado=100000;
    private String estado ="No ha ganado";
    private Random rand = new Random();
       
    
    public Juego(){
        numeroAdivinar=rand.nextInt(11);
    }
    
    public int getNumAdiv(){
        
        return numpersona;
    }
    public void setNumAdiv(int num){
        if(num==numeroAdivinar){
            setEstado();  
        }else{
            premioAcumulado-=10000;
        }
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
    private void setEstado(){
        estado="GANASTE";
    }
    public void reiniciar(){
        premioAcumulado=100000;
        numeroAdivinar=0;

    }
    
    
    
}
