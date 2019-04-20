package AgenciaAutos;

public class Compacto extends Auto implements Pasajeros{
	private int pasajeros;
	
	public Compacto(String marca, int anio, int numeroMotor, double precio) {
		super(marca,anio,numeroMotor,precio);
	}

	public String fichaDelAuto() {
		return super.fichaDelAuto()+" - "+pasajeros;
	}
	
	public int getCantidadPasajeros() { return this.pasajeros;}
	public void setCantidadPasajeros(int pasajeros) { this.pasajeros = pasajeros;}
}
