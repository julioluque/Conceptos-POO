package AgenciaAutos;

public class Auto {
	private String marca;
	private int anio;
	private int numeroMotor;
	private double precio;
	
	public Auto(String marca, int anio, int numeroMotor, double precio) {
		this.marca = marca;
		this.anio = anio;
		this.numeroMotor = numeroMotor;
		this.precio = precio;
	}
	
	public String getMarca() { return this.marca;}
	public void setMarca(String marca) { this.marca = marca;}
	
	public int getAnio() {return this.anio;}
	public void setAnio(int anio) {this.anio = anio;}
	
	public int getNumeroMotor() {return this.numeroMotor;}
	public void setNuemroMOtor() {this.numeroMotor = numeroMotor;}
	
	public double getPrecio() {return this.precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	
	public String fichaDelAuto() {
		return marca+" - "+anio+" - "+numeroMotor+" - "+precio;
	}
}
