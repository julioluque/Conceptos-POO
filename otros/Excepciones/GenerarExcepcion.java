package Excepciones;

public class GenerarExcepcion {
	
	public static void main(String []args) {
		
		try {
			
			System.out.println("Mensaje mostrado en pantalla!");
			Exception e = new Exception ("Este es un objeto excepcion!");
			throw e;
			
		}catch (Exception ex) {

			System.out.println("Excepcion capturada con mensaje"+ex.getMessage());
		}
		
		System.out.println("Programa terminado!");
		
	}
}
