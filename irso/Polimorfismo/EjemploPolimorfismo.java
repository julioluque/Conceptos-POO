package Polimorfismo;

public class EjemploPolimorfismo {
	public static void main (String []args) {
		Inter objetoA = new Implementacion1();
		objetoA.metodo1();
		objetoA.metodo2();
		
		System.out.println();
		
		Inter objetoB = new Implementacion2();
		objetoB.metodo1();
		objetoB.metodo2();
	}
}
