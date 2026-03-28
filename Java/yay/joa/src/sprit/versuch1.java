package sprit;


import java.util.Scanner;

public class versuch1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // überschrift
        System.out.println("spritmathe rechner");
        
        // eingabe
        System.out.print("spritpreis in €/L: ");
        double spritpreis = scanner.nextDouble();
        
        System.out.print("verbrauch des autos pro 100 km in L: ");
        double verbrauch = scanner.nextDouble();
        
        System.out.print("strecke in km: ");
        double kilometer = scanner.nextDouble();
        
        // mathe
        double verbrauchgesamt = (kilometer / 100) * verbrauch;
        double kosten = verbrauchgesamt * spritpreis;
        
        // wertzu
        System.out.printf("\nDie Fahrt kostet %.2f Euro%n", kosten);
        System.out.println("yibbi");
        
        scanner.close();
    }
}
