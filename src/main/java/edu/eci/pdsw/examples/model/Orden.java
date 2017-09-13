package edu.eci.pdsw.examples.model;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

public class Orden {
    
	private List<ItemOrden> itemsOrden;
	public Orden() {
		itemsOrden=new LinkedList<>();
	}
	/**
        public void agregarItemOrden(){
                ItemOrden p=null;
		itemsOrden.add(p);            
        
        }+*/
 
        
	public void agregarItemOrden(ItemOrden p){
 
               
		itemsOrden.add(p);
	}
	
	public List<ItemOrden> getItemsOrden(){
		return itemsOrden;
	}
	
        @Override
	public String toString(){
		return itemsOrden.toString();
	}
	
}
