//	https://es.stackoverflow.com/questions/138569/polimorfismo-y-herencia-en-java/138598#138598
package Stackoverflow;
import java.util.ArrayList;

public class Laboratorio1 {
	public static void main(String[]args) {
		ArrayList<Persona> personas = new ArrayList();
		
		Persona al1 = new Alumno("luis","gonzalez",15,112);
		Persona al2 = new Alumno("juan","martinez",17,114);
		Persona al3 = new Alumno("pedro","suarez",16,113);
		Persona al4 = new Alumno("pablo","perez",15,111);
		Persona maestro = new Maestro("GERONIMO","GUMERCINDO",48,999);
		Persona suplente = new Maestro("ROMULO","ZENON",39,1039);
		
		personas.add(al1);
		personas.add(al2);
		personas.add(al3);
		personas.add(al4);
		personas.add(maestro);
		personas.add(suplente);
		
		for (Persona persona:personas) {
			System.out.println(persona.obtenerInformacion());
		}
	}
}
