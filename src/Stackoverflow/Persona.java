package Stackoverflow;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);		
	}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){ 
		this.nombre = nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	
	public int getEdad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public String obtenerInformacion() {
		String bot = nombre+apellido;
		return bot;
	}
}
