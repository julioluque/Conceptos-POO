package Herencia1;

public enum Formato{wav,mp3,midi,avi,cdAudio,dvd};

public class Multimedia { // definimos los parametros
	private String titulo;
	private String autor;
	private Formato formato;
	private double duracion;
	
	//Inicia el constructor con parametros definidos
	public Multimedia(String titulo, String autor, Formato formato, double duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}
	
	public String getTitulo() { return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
	public String getAutor() { return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	
	public Formato getFormato() {return formato;}
	public void setFormato (Formato formato) {this.formato = formato;}
	
	public double getDuracion () {return duracion;}
	public void setDuracion (double duracion) {this.duracion = duracion;}
	
	public String toString () {
		return "\nTitulo: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+"\nDuracion: "+duracion;
	}
	
	public boolean equals (Multimedia m) {
		return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
	}
}
