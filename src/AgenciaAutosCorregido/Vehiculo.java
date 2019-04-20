package AgenciaAutosCorregido;

public abstract class Vehiculo {
	private String  marca;
	private int anio;
	private String chasis;
	private double precio;
	
	public Vehiculo(String marca, int anio, String chasis, double precio) {
		super();
		this.marca = marca;
		this.anio = anio;
		this.chasis = chasis;
		this.precio = precio;
	}
	
	public String getMarca() {return this.marca;}
	public void setMarca(String marca) {this.marca = marca;}
	
	public int getAnio() {return this.anio;}
	public void setAnio(int anio) {this.anio = anio;}
	
	public String getChasis() {return this.chasis;}
	public void setChasis(String chasis) {this.chasis = chasis;}
	
	public double getPrecio() {return this.precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	
	public String toString() {
		return marca+"-"+anio+"-"+chasis+"-"+precio;
	}

}
	
