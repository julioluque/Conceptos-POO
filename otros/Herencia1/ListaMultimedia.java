package Herencia1;

public class ListaMultimedia {    // se agrega una lista para guardar la musica
	private Multimedia[] lista;
	private int contador;
	
	public ListaMultimedia(int capacidad) {  // constructor 
		lista = new Multimedia[capacidad];
		contador = 0;
	}
	
	public int size() { return contador; } //si no esta llena se almacena en la celda
	
	private boolean llena() { return contador == lista.length;} // indica si la lista esta llena
	
	//si no esta llena se almacena el objeto en la celda indicada por el contador y se incrementa este.
	public boolean add(Multimedia m) {  
		if (llena()) { return false;}
		else {
			lista[contador] = m;
			contador++;
			return true;
		}
	}
	
	public Multimedia get(int posicion) {
		if (posicion == contador) {
			throw new IndexOutOfBoundsException();
		}
		return lista[posicion];
	}
	
	public String toString () {
		String s = " ";
		for (int i=0; i<contador; i++) {
			s += lista[i].toString() + "\n";
		}
		return s;
	}
}
