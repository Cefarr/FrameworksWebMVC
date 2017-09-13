package edu.eci.pdsw.examples.services;

import java.util.LinkedList;
import java.util.List;

import edu.eci.pdsw.examples.beans.impl.CalculadorBasicoCuentas;
import edu.eci.pdsw.examples.model.ExcepcionManejadorOrdenes;
import edu.eci.pdsw.examples.model.Orden;
import edu.eci.pdsw.examples.model.Plato;
import javax.ejb.Singleton;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

//@Singleton
@ManagedBean(name = "manOrdenes")
@ApplicationScoped
public class ManejadorOrdenes {

        @Inject
	CalculadorBasicoCuentas calc;//=new CalculadorBasicoCuentas();
	
	List<Orden> ordenes;

        int numOrder;
        
	public ManejadorOrdenes(){

		ordenes=new LinkedList<>();

	}                      
        public int getNumOrder(Orden o){
            return ordenes.indexOf(o);
        
        }
        public List<Orden> getOrdenes() {
            return ordenes;
        }
	
	public void registrarOrden(Orden o){
		ordenes.add(o);
	}
        
	public Orden consultarOrden(int n) throws ExcepcionManejadorOrdenes{
		if (n>=ordenes.size()) throw new ExcepcionManejadorOrdenes("Orden inexistente:");
		return ordenes.get(n);
	}
	
	public int calcularTotalOrden(int n) throws ExcepcionManejadorOrdenes{
		if (n>=ordenes.size()) throw new ExcepcionManejadorOrdenes("Orden inexistente:");
		return calc.calcularCosto(ordenes.get(n));		
	}
	
        
}
