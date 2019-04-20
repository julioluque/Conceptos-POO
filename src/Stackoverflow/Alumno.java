package Stackoverflow;

public class Alumno extends Persona{
	private int matricula;
	
	public Alumno(String nombre, String apellido, int edad, int matricula) {
		super(nombre,apellido,edad);
		setMatricula(matricula);
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String obtenerInformacion() {
		return this.getNombre()+" - "+this.getApellido()+" - "+this.getEdad()+" - "+this.getMatricula();
	}
}
