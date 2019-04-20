package Interfaces;

public abstract class Telefono implements Activar{
	private Persona persona;
	private String marca;
	
	public Persona getPersona() {return this.persona;}
	public void setPersona(Persona persona) {this.persona = persona;}
	
	public String getMarca() {return this.marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public Telefono(Persona persona, String marca) {
		super();
		this.persona = persona;
		this.marca = marca;
	}
	
	@Override 
	public void on() {
		System.out.println("telefono encendido");
	}
	@Override 
	public void off() {
		System.out.println("Telefono apagado");
	}
}
