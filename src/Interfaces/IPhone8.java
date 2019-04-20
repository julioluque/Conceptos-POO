package Interfaces;

public class IPhone8 extends Telefono implements Validar{
	private int codigo;
	private String huella;
	
	public int getCodigo() {return this.codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}

	public String getHuella() {return this.huella;}
	public void setHuella(String huella) {this.huella = huella;}

	public IPhone8(Persona persona, String marca) {
		super(persona,marca);
	}

	@Override
	public boolean validar(Persona persona) {
		if (persona.getHuella() != null) {
			return persona.getHuella().equals(huella);
		}
		if (persona.getCodigo() != 0) {
			return persona.getCodigo() == codigo;
		}
		return false;
	}
}