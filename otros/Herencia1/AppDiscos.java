package Herencia1;

public class AppDiscos {
	public static void main(String[] args) {
		ListaMultimedia lista = new ListaMultimedia(20);
		Disco disco;
		
		lista.add(new Disco("Hopes and Fears","Keane",Formato.mp3,45,Genero.pop));
		lista.add(new Disco("Jessico","Babasonicos",Formato.cdAudio,39,Genero.punk));
		lista.add(new Disco("Testosterona","Gustavo Cordera",Formato.wav,69,Genero.rock));
		
		System.out.println(lista.toString());
		disco = new Disco("El Vals del Obrero","Ska-p",null,0,null);
	}
}
