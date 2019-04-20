package herenciav2;

public class SubClase extends SuperClase{
	boolean SiNo;
	
	
	public boolean getSiNo() {
		return SiNo;
	}
	public void setSiNo(boolean SiNo) {
		SiNo = false;		// subclase va por falso
		super.setSiNo(SiNo);
		
		System.out.println("La variable de la superclase es " + super.SiNo);
		System.out.println("La variable de la subclase " + SiNo);
		
	}
}
