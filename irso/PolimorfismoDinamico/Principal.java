package PolimorfismoDinamico;

public class Principal {
	public static void main (String[] args) {
		FacturaA A = new FacturaA();
		FacturaB B = new FacturaB();
	
		A.setId("A0010001");
		A.setImporte(1000);
		
		B.setId("B0010001");
		B.setImporte(1000);
		
		System.out.println("Total Factura A\t"+A.calcularTotal());
		System.out.println("Total Factura B\t"+B.calcularTotal());
	}
}