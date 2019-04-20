package PolimorfismoDinamico;
 
abstract class Factura {
	private String id;
	private double importe;
	abstract public double calcularTotal();
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public double getImporte() {
		return this.importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
}
