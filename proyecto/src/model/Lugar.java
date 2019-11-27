package model;

public class Lugar {
	
	
	
	private String nombre;
	private boolean visitado;
	private int origen;
	private int llegada;
	
	
	public Lugar(String nombre, int origen, int llegada) {
		
		this.nombre=nombre;
		this.llegada=llegada;
		this.origen=origen;
		visitado=false;
		
	}public Lugar() {
		
		this.nombre=null;
		this.llegada=0;
		this.origen=0;
		visitado=false;
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isVisitado() {
		return visitado;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
	public int getOrigen() {
		return origen;
	}
	public void setOrigen(int origen) {
		this.origen = origen;
	}
	public int getLlegada() {
		return llegada;
	}
	public void setLlegada(int llegada) {
		this.llegada = llegada;
	}
	
	
	
	
	

}
