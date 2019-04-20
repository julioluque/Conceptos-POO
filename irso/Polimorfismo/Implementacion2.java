package Polimorfismo;

public class Implementacion2 extends Inter{
	int a = 10;
	int b = 20;
	
	void metodo1() {
		a = a + a;
		System.out.println("metodo 1 en implementacion 2 - "+a);
	}
	void metodo2() {
		b = b + a;
		System.out.println("metodo 2 en implementacion 2 - "+b);
	}
}
