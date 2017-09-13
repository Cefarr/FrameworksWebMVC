/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.webappsintro.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 import java.util.Random;
import javax.faces.bean.ApplicationScoped;


/**
 *
 * @author 2098325
 */

@ManagedBean(name = "beanEstadoAdivinanza")
@SessionScoped
//@ApplicationScoped
public class Juego {
    private int numpersona=0;
    private int numeroAdivinar;
    private int intentosRealizados=0;
    private int premioAcumulado=100000;
    private String estado ="No ha ganado";
    private Random rand = new Random();
       
    
    public Juego(){
        numeroAdivinar=rand.nextInt(6);
    }
    
    public int getNumAdiv(){
        
        return numpersona;
    }
    public void setNumAdiv(int num){
        if(num==numeroAdivinar){
            setEstado("GANASTE");  
        }else{
            intentosRealizados+=1;
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
        if(premioAcumulado<=0){
            reiniciar();
        }
        return premioAcumulado;
    }
    public void setPremio(int premioAcumulado ){
        this.premioAcumulado=premioAcumulado;
    
    }
    public String getEstado(){
        return estado;
        
    }
    private void setEstado(String cambio){
        estado=cambio;
    }
    public void reiniciar(){
        intentosRealizados=0;
        premioAcumulado=100000;
        numeroAdivinar=rand.nextInt(6);
        setEstado("No ha ganado");
    }
}
