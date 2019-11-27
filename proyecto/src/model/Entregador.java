package model;



import graph.AdjacencyListGraph;

public class Entregador {
	
	public static final String AUTO	="Auto";
	public static final String MOTO	="Moto";
	private String nombre;
	private String transporte;
	private AdjacencyListGraph<Lugar>  lugares;
	
	
	public Entregador(String nombre, String transporte, AdjacencyListGraph<Lugar>  lugares) {
		
		this.nombre=nombre;
		this.transporte=transporte;
		this.lugares=lugares;
		
		
	}
	
	public Entregador(String nombre, String transporte) {
		
		this.nombre=nombre;
		this.transporte=transporte;
		this.lugares=new AdjacencyListGraph<Lugar>();;
		
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public AdjacencyListGraph<Lugar>  getLugares() {
		return lugares;
	}
	public void setLugares(AdjacencyListGraph<Lugar>  lugares) {
		this.lugares = lugares;
	}
	
	
	
	public void añadirlugar() {
		
		
	
	}
	
	
	
	
	
	

}
