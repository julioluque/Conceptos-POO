package Interfaces;

public class Persona {
	private String nombre;
	private int codigo;
	private String patron;
	private String huella;
	private String patronRostro;
	
	public String getNombre() {return this.nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public int getCodigo() {return this.codigo;}
	public void setCodigo(int codigo) { this.codigo = codigo;}
	
	public String getPatron() {return this.patron;}
	public void setPatron(String patron) {this.patron = patron;}
	
	public String getHuella() {return this.huella;}
	public void setHuella(String huella) { this.huella = huella;}
	
	public String getPatronRostro() {return this.patronRostro;}
	public void setPatronRostro(String patronRostro) {this.patronRostro = patronRostro;}
	
}
