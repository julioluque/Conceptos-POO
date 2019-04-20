package Herencia1;

public class MainLista {
	public static void main (String [] args) {
		ListaMultimedia lista = new ListaMultimedia(10);
		Pelicula pelicula;
		int posicion;
		lista.add(new Pelicula("Million dollar baby","Clint East Wood", Formato.avi, 137,"Clint EastWood","Hillary Swank"));
		lista.add(new Pelicula("Mar Adentro","Alejandro Amenabar",Formato.dvd,125,"Javier Bardem","Belen Rueda"));
		lista.add(new Pelicula("El Aviadro","Martin Scorsese",Formato.dvd,168,"Leonardo DiCaprio","null"));
		lista.add(new Pelicula("Shreck","",Formato.dvd,184,null,"Eddie Murphi"));
		
		System.out.println(lista.toString());
				
	}
}
