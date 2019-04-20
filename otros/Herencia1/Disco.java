package Herencia1;

public enum Genero {rock,pop,soul,funky,flamenco,clasica,blues,tecno,opera,punk,jazz,hiphop};

public class Disco extends Multimedia{
	private Genero genero;
	
	public Disco (String titulo, String autor, Formato formato, double duracion, Genero g) {
		super (titulo, autor, formato, duracion);
		this.genero = g;
	}
	
	public Genero getGenero () {return genero;}
	public void setGenero (Genero genero) {this.genero = genero;}
	
	public String toString() {
		return super.toString()+"\nGenero: "+genero;
	}
}
