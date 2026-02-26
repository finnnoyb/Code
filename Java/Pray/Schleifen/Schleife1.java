package Schleifen;
public class Schleife1 {

    public static void main(String[] args) {
        System.out.println("Durch 3 teilbare Zahlen:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nDurch 4 teilbar, aber nicht durch 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nPrimzahlen:");
        for (int i = 1; i <= 100; i++) {
            if (istPrimzahl(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean istPrimzahl(int zahl) {
        if (zahl < 2) return false;
        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) return false;
        }
        return true;
    }
}
