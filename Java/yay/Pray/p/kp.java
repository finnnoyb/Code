package p;

import java.util.Random;
import java.util.Scanner;

public class kp{

    public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            // Generiere zwei zufällige Zahlen zwischen -99 und 99
            int a = random.nextInt(199); 
            if (a > 99) a -= 198;       // Korrigiere, damit Bereich -99 bis 99 abgedeckt ist
            int b = random.nextInt(199);
            if (b > 99) b -= 198;

            System.out.println("Addiere die beiden Zahlen:");
            System.out.print(a + " + " + b + " = ? \n");

            // Lies Benutzereingabe ein
            int t;
            while (!scanner.hasNextInt()) {
                scanner.next(); // Verwerfe nicht-ganzzahlige Eingaben
                System.out.println("Bitte eine Zahl eingeben!");
                System.out.print(a + " + " + b + " = ?\n ");
            }
            t = scanner.nextInt();

            // Berechne die korrekte Summe
            int rs = a + b;

            // Überprüfe die Eingabe des Benutzers
            if (t == rs) {
                System.out.println("y");
            } else {
                System.out.println("nö ist " + rs);
            }

            scanner.close();
        }
    }
