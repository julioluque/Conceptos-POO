package PolimorfismoDinamico;

public class FacturaB extends Factura{
	
	@Override
	public double calcularTotal() {
		return this.getImporte();
	}
}
