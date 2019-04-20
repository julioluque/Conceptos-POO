package Sobre;

public class Servo {
	public static void main(String []args) {
		int operacion1;
		float operacion2;
		
		Calculadora sumador = new Calculadora();
		operacion1 = sumador.suma(2, 3);
		operacion2 = sumador.suma(0.2F, 12.5F);
		
		System.out.println("suma de enteros 2+3= "+operacion1);
		System.out.println("suma de decimales 0.2 + 12.5= "+operacion2);
	}
}
