package AgenciaAutosCorregido;

public class Camion extends Vehiculo{
	private int ejes;
	private int ruedas;
	private double toneladas;
	
	public Camion(String marca, int anio, String chasis, double precio, int ejes, int ruedas, double toneladas) {
		super(marca,anio,chasis,precio);
		this.ejes = ejes;
		this.ruedas = ruedas;
		this.toneladas = toneladas;
	}
	
	public int getEjes() {return this.ejes;}
	public void setEjes(int ejes) {this.ejes = ejes;}
	
	public int getRuedas() {return this.ruedas;}
	public void setRuedas(int ruedas) {this.ruedas = ruedas;}
	
	public double getToneladas() {return this.toneladas;}
	public void setToneladas(double toneladas) {this.toneladas = toneladas;}
	
	public String toString() { 
		return super.toString();
	}
}
