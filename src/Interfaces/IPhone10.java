package Interfaces;

public class IPhone10 extends IPhone8{
	private String patronRostro;
	
	public String getPatronRostro() {return this.patronRostro;}
	public void setPatronRostro(String patronRostro) {this.patronRostro = patronRostro;}
	
	public IPhone10(Persona persona, String marca) {
		super(persona,marca);
	}
	
	@Override
	public boolean validar(Persona persona) {
		if (persona.getPatronRostro() != null) {
			return persona.getPatronRostro().equals(patronRostro);
		}
		return super.validar(persona);
	}
}