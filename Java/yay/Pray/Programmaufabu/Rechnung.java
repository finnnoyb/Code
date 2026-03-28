package Programmaufabu;

public class Rechnung {
	
	//ausgabe der ueberschrift
	static void ueberschrift() {
		System.out.println("\n Irgendeine Rechnung \n");
		
	}
	//dieses programm gibt das ergebnis von x+y aus
	public static void main(String[] args) {
		int x;
		int y;
		
		ueberschrift();
		
		x = 100+4*3/4;
		y = 12345;

		System.out.println(x+y);
		
	}

}
