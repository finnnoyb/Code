package sprit;
import java.util.Scanner;

public class mathe{
    public static void main(String[] args) {
        // Scanner-Objekt für Eingaben von der Konsole
        Scanner scanner = new Scanner(System.in);

        // Eingabe der ersten Zahl
        System.out.print("Erste Zahl eingeben: ");
        double zahl1 = scanner.nextDouble();

        // Eingabe des Operators
        System.out.print("Operator (+, -, *, /) eingeben: ");
        char operator = scanner.next().charAt(0);

        // Eingabe der zweiten Zahl
        System.out.print("Zweite Zahl eingeben: ");
        double zahl2 = scanner.nextDouble();

        // Variable für das Ergebnis
        double ergebnis;

        // Switch-Statement zur Verarbeitung der Operationen
        switch (operator) {
            case '+':
                ergebnis = zahl1 + zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                System.out.println("Ergebnis: " + ergebnis);
                break;
            case '/':
                // Prüfung auf Division durch Null
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                    System.out.println("Ergebnis: " + ergebnis);
                } else {
                    System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
                }
                break;
            default:
                // Fehlerfall bei ungültigem Operator
                System.out.println("Ungültiger Operator: " + operator);
        }

        // Scanner schließen
        scanner.close();
    }
}