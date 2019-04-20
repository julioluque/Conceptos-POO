package PolimorfismoDinamico;

public class FacturaA extends Factura{
	
	@Override
	public double calcularTotal() {
		return this.getImporte()*1.21;
	}
}
