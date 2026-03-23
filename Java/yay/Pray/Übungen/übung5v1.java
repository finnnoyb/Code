package Übungen;

import java.util.Scanner;

public class übung5v1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eine Ganzzahl pls: ");
        int zahl = scanner.nextInt();

        // Berechnung mit der quadrat-Methode
        int ergebnis = quadrat(zahl);

        System.out.println("Quadratwert von " + zahl + " ist " + ergebnis);
        scanner.close();
    }

    // Methode zur Berechnung des Quadrats
    public static int quadrat(int n) {
        return n * n;
    }
}
