package Schleifen;

public class Schleife2 {

	public static void main(String[] args) {

		System.out.println("auf krampf verschuchen zuraffen");
		//ziel ist 1-1000
		//durch 7 teilbar hinzufürgen
		//durch 8 und nich durch 9 teilbar ausm kopf
		//code verstehen
		//vllt noch einen dazu mit 17 und 35
		System.out.println("Durch 7 :");
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");

		}	}
        System.out.println("\nDruch 8 nich 9");
        for (int i = 1; i <= 1000; i ++) {
        	if (i % 8 == 00 && i % 9 != 0) {
        		System.out.print(i + " ");
        	}}
        System.out.println("\nDurch 17 nich 35");
        for (int i = 1; i <= 1000; i++){
        if (i % 17 == 0 && i % 35 != 0) {
        	System.out.print(i + " ");
        }
}
}
}
