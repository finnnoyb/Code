
public class Kreisumfang {

		//ausgabe der überschrift
		static void ueberschrift() {
			System.out.println("\n KREISUMFANG \n");
		}

		//berechnung des umfangs
		static double umfang(double r) {
			return r * 2.0 * 3.14159;	
		}
		static double fläche(double f) {
			return (Math.PI)*Math.pow(f,2);
	
		}

	public static void main(String[] args) {
		double r;
		double u;
		double f;
		
		ueberschrift();
		
		System.out.println("r | Kreisumfang ");
		for (r=1; r<=9 ; r++) {
			u = umfang(r);
			f = fläche(r);
			System.out.print(" ");
			System.out.print("radius "+r);
			System.out.print(" | ");
			System.out.println("umfang "+u);
			System.out.print("fläche "+Math.ceil(f)+" | ");
		}

	}

}
//HA zu dem radius der umfang die fläche