package AgenciaAutosCorregido;

public class Auto extends Vehiculo{
	private int pasajeros;
	
	public Auto(String marca, int anio, String chasis, double precio, int pasajeros) {
		super(marca,anio,chasis,precio);
		this.setPasajeros(pasajeros);
	}
	
	public int getPasajeros() {return this.pasajeros;}
	public void setPasajeros(int pasajeros) {this.pasajeros = pasajeros;}
	
	public String toString() {
		return super.toString()+"-"+pasajeros;
	}
}