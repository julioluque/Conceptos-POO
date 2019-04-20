package AgenciaAutos;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	public static void main(String[]args) {

		Scanner carga = new Scanner(System.in);
		Auto idMovil[] = new Auto[4];
		
		System.out.println("CARGUE DATOS DEL AUTO COMPACTO");
		System.out.print("Marca del vehiculo: "); String dato1 = carga.next();
		System.out.print("Año de fabricacion: "); int dato2 = carga.nextInt();
		System.out.print("Numero de motor: "); int dato3 = carga.nextInt();
		System.out.print("Precio de lanzamiento: "); double dato4 = carga.nextDouble();
		System.out.print("Cantidad de pasajeros: "); int dato5 = carga.nextInt();
		
		idMovil[1] = new Compacto(dato1,dato2,dato3,dato4);
		((Compacto)idMovil[1]).setCantidadPasajeros(dato5);
		System.out.println(idMovil[1].fichaDelAuto());
		
		
		System.out.println("\nCARGUE DATOS DEL AUTO DE LUJO");
		System.out.print("Marca del vehiculo: "); String dato01 = carga.next();
		System.out.print("Año de fabricacion: "); int dato02 = carga.nextInt();
		System.out.print("Numero de motor: "); int dato03 = carga.nextInt();
		System.out.print("Precio lanzamiento: "); double dato04 = carga.nextDouble();
		System.out.print("Cantidad de pasajeros: "); int dato05 = carga.nextInt();
		
		idMovil[0] = new DeLujo(dato01, dato02, dato03, dato04);
		((DeLujo)idMovil[0]).setCantidadPasajeros(dato05);
		System.out.println(idMovil[0].fichaDelAuto());
				
		System.out.println("CARGUE DATOS DEL VAGON"+"\n");
		System.out.print("Marca del vehiculo: "); String dato06 = carga.next();
		System.out.print("Año de fabricacion: "); int dato07 = carga.nextInt();
		System.out.print("Numero de motor: "); int dato08 = carga.nextInt();
		System.out.print("Precio de lanzamiento: "); double dato09 = carga.nextDouble();
		System.out.print("Cantidad de pasajeros: "); int dato10 = carga.nextInt();
		
		idMovil[2] = new Vagon(dato06,dato07,dato08,dato09);
		((Vagon)idMovil[2]).setCantidadPasajeros(dato10);
		System.out.println(idMovil[2].fichaDelAuto());
		
		System.out.println("CARGUE DATOS DE LA CAMIONETA"+"\n");
		System.out.print("Marca del vehiculo: "); String dato11 = carga.next();
		System.out.print("Año de fabricacion: "); int dato12 = carga.nextInt();
		System.out.print("Numero de motor: "); int dato13 = carga.nextInt();
		System.out.print("Precio de lazamiento: "); double dato14 = carga.nextDouble();
		System.out.print("Capacidad de carga en Kgs: "); int dato15 = carga.nextInt();
		System.out.print("Cantidad de ejes: "); int dato16 = carga.nextInt();
		System.out.print("Cantidad de rodados: "); int dato17 = carga.nextInt();
		
		idMovil[3] = new Camioneta(dato11,dato12,dato13,dato14,dato15,dato16,dato17);
		System.out.println(idMovil[3].fichaDelAuto());
		
		
		
		
		
	}
}
