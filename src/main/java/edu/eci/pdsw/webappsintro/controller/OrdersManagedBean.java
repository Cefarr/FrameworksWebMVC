/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.webappsintro.controller;

import static com.oracle.jrockit.jfr.DataType.INTEGER;
import edu.eci.pdsw.examples.model.ItemOrden;
import edu.eci.pdsw.examples.model.Orden;
import edu.eci.pdsw.examples.services.ManejadorOrdenes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author hcadavid
 */
@ManagedBean(name = "OrdenEstado")
@SessionScoped
public class OrdersManagedBean {
    //@ManagedProperty("#{manOrdenes}")
    @Inject
    private ManejadorOrdenes manOrd;//=new ManejadorOrdenes();
    List<String> poss;
    List<Orden> Item;
    //private 
    //=new LinkedList<Integer>();
    
    public OrdersManagedBean(){
        Item=new ArrayList<Orden>();
        Orden o=null;
        manOrd=new ManejadorOrdenes();
        //manOrd.registrarOrden(o);
        //manOrd.registrarOrden(o);
        //manOrd.registrarOrden(o);
        //manOrd.registrarOrden(o);
        poss=new ArrayList<String>();
        poss=getId();
        Item=manOrd.getOrdenes();
        //poss.add("1");
        //poss.add("2");
        //poss.add("3");
        //poss.add("4");
        //poss.add("7");
        //poss.add("6");
        
    }
    public List<String> getPos(){
        return poss;
    
    }
    public void setOrden(){
        Orden i=null;
        poss.clear();
        manOrd.registrarOrden(i);
        poss=getId();
    
    }    
    public void setOrden(Orden i){
        manOrd.registrarOrden(i);
        poss.clear();
        poss=getId();
    
    }
    public List<Orden> getOrden(){
        return manOrd.getOrdenes();
    }
    public ItemOrden ConsultItem(){
        ItemOrden p=null;
        return p;
    
    }
    public int idOrder(Orden u){
        return manOrd.getNumOrder(u);
    }
    public List<String> getId(){

        List<Orden> pr=getOrden();
        Iterator ir=getOrden().iterator();
        Orden o;
        int contador=1;
        while(ir.hasNext()){
            o=(Orden)ir.next();
            int nump=(pr.indexOf(o))+contador;
            contador++;
            poss.add(String.valueOf(nump));
        }
        
        return poss;
        
    }
    
}
