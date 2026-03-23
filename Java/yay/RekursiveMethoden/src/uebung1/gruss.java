package uebung1;

public class gruss {
	void gruss(String name) {
	    System.out.println("Hallo " + name);
	    gruss(name); // rekursiver Aufruf mit Parameter
	}

}
