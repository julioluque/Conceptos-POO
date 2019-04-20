package Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AdivinaNumero {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroAdivinar = (int)(Math.random()*10); //debe ser entre 1 y 500, se incrementa en 1
		int numero = 0;
		int intentos = 0;
		
		do {
			boolean leido;
			do {
				System.out.println("Intenta con menores a 10: ");
				try {
					intentos++;
					numero = teclado.nextInt();
					System.out.println("el numero cargado es:"+numero);
					leido = true;
				} catch (InputMismatchException ex){
					System.out.println("No se introdujo numero!");
					teclado.next(); // Se lee el elemento no reconocido para eliminarlo
					leido = false;
				} 
			}while (leido == false);
			if (numero > numeroAdivinar) {
				System.out.println("EL numero es menor, segui intenando!");
			}
			if (numero < numeroAdivinar) {
				System.out.println("El numero es mayor, segui intentando!");
			}
		}while (numero != numeroAdivinar);
		
		System.out.println("ACERTASTE!, el numero correcto es"+numeroAdivinar);
		System.out.println("intentaste "+intentos+" veces");
		
	}
	
}
