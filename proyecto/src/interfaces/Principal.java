package interfaces;

import java.util.ArrayList;

import model.Entregador;
import model.Lugar;

public class Principal {
	
	private Entregador entregador;
	
	
	
	public Principal() {
		entregador= new Entregador("", Entregador.AUTO);
	}
	
	 public boolean añadirLugar(String nombre, int llegada, int origen) {
		 boolean si= false;
		 
		 
		 return si;
		 
		 
	 }
	 
	 public boolean seVisito(Lugar m) {
		 boolean si= false;
		 if(m.isVisitado()) {
			 si=true;
		 }
		 
		 return si;
		 
		 
	 }
	 

	
}
