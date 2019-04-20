package Interfaces;

public class Principal {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Alfredo");
		p1.setPatron("abcd");
		
		Persona p2 = new Persona();
		p2.setNombre("Cecilia");
		p2.setCodigo(1234);
		
		Android movil1 = new Android(p1,"Pop2");
		movil1.setPatron("abcd");
		
		IPhone8 movil2 = new IPhone8(p2,"Apple");
		movil2.setCodigo(1234);
		
		System.out.println(p1.getNombre()+" contraseña "+p1.getPatron()+": "+movil1.validar(p1));
		System.out.println(p2.getNombre()+" contraseña "+p2.getCodigo()+": "+movil2.validar(p2));
		
	}

}
