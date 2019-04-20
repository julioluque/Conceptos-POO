package Interfaces;

public class Android extends Telefono implements Validar{
	private String patron;
	
	public Android(Persona persona, String marca) {
		super(persona,marca);
	}
	
	public String getPatron() {return this.patron;}
	public void setPatron(String patron) {this.patron = patron;}
	
	@Override
	public boolean validar(Persona persona){
		return persona.getPatron().equals(patron);
	}
}
