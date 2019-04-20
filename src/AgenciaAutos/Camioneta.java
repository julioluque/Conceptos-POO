package AgenciaAutos;

public class Camioneta extends Auto{
	private int capacidadCarga;
	private int cantidadEjes;
	private int cantidadRodados;
	
	public Camioneta(String marca, int anio, int numeroMotor, double precio, int capacidadCarga, int cantidadEjes, int cantidadRodados) {
		super(marca,anio,numeroMotor,precio);
		this.capacidadCarga = capacidadCarga;
		this.cantidadEjes = cantidadEjes;
		this.cantidadRodados = cantidadRodados;
	}
	
	public int getCapacidadCarga() {return this.capacidadCarga;}
	public void setCapacidadCarga(int capacidadCarga) {this.capacidadCarga = capacidadCarga;}
	
	public int getCantidadEjes() {return this.cantidadEjes;}
	public void setCantidadEjes(int cantidadEjes) {this.cantidadEjes = cantidadEjes;}
	
	public int getCantidadRodados() {return this.cantidadRodados;}
	public void setCantidadRodados(int cantidadRodados) {this.cantidadRodados = cantidadRodados;}

	
	public String fichaDelAuto() {
		return super.fichaDelAuto()+" - "+capacidadCarga+" - "+cantidadEjes+" - "+cantidadRodados;
	}
}
