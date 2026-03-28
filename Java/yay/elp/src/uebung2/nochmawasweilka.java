package uebung2;

public class nochmawasweilka {

    void herunterzaehler(int n) {
        if (n < 3999) return; // Abbruchbedingung
        System.out.println(n);
        herunterzaehler(n - 1);
    }
}
