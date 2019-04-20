package AgenciaAutosCorregido;
import java.util.Scanner;

public class Ejecutable {
	public static void main(String []args) {
		String marca;
		int anio;
		String chasis;
		double precio;
		int pasajeros;
		int ejes;
		int ruedas;
		double toneladas;
		
		Vehiculo idMovil[] = new Vehiculo[4];
		Scanner carga = new Scanner(System.in);
		
		System.out.println("SEDAN:");
		System.out.print("Ingrese marca: "); marca = carga.next();
		System.out.print("Ingrese año: "); anio = carga.nextInt();
		System.out.print("ingrese Chasis: "); chasis = carga.next();
		System.out.print("Ingrese precio: "); precio = carga.nextDouble();
		System.out.print("Ingrese Pasajeros: "); pasajeros = carga.nextInt();
		idMovil[0] = new Sedan(marca,anio,chasis,precio,pasajeros);
		
		
		System.out.println("Pickup:");
		System.out.print("Ingrese marca: "); marca = carga.next();
		System.out.print("Ingrese año: "); anio = carga.nextInt();
		System.out.print("ingrese Chasis: "); chasis = carga.next();
		System.out.print("Ingrese precio: "); precio = carga.nextDouble();
		System.out.print("Ingrese Pasajeros: "); pasajeros = carga.nextInt();
		idMovil[1] = new Pickup(marca,anio,chasis,precio,pasajeros);
		
		
		System.out.println("Smart:");
		System.out.print("Ingrese marca: "); marca = carga.next();
		System.out.print("Ingrese año: "); anio = carga.nextInt();
		System.out.print("ingrese Chasis: "); chasis = carga.next();
		System.out.print("Ingrese precio: "); precio = carga.nextDouble();
		System.out.print("Ingrese Pasajeros: "); pasajeros = carga.nextInt();
		idMovil[2] = new Smart(marca,anio,chasis,precio,pasajeros);
		
		
		
		System.out.println("CAMION");
		System.out.print("Ingrese marca: "); marca = carga.next();
		System.out.print("Ingrese año: "); anio = carga.nextInt();
		System.out.print("ingrese Chasis: "); chasis = carga.next();
		System.out.print("Ingrese precio: "); precio = carga.nextDouble();
		System.out.print("Ingrese ejes: "); ejes = carga.nextInt();
		System.out.print("Ingrese Ruedas: "); ruedas = carga.nextInt();
		System.out.print("Ingrese toneladas: "); toneladas = carga.nextDouble();
		idMovil[3] = new Camion(marca,anio,chasis,precio,ejes,ruedas,toneladas);
		
		System.out.println("FICHA TECNICA");
		System.out.println(idMovil[0].toString());
		System.out.println(idMovil[1].toString());
		System.out.println(idMovil[2].toString());
		System.out.println(idMovil[3].toString());
		
	}
}
