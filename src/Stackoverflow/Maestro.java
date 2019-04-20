package Stackoverflow;

public class Maestro extends Persona{
	private int clave;

	public Maestro (String nombre, String apellido, int edad, int clave) {
		super(nombre,apellido,edad);
		setClave(clave);
	}
	
	public int getClave() {
		return this.clave;
	}
	public void setClave(int clave) {
		this.clave = clave; 
	}
	
	public String obtenerInformacion() {
		return this.getNombre()+" - "+this.getApellido()+" - "+this.getEdad()+" - "+this.getClave();
	}
}
