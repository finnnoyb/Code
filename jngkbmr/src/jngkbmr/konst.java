package jngkbmr;

public class konst {

    // konstante Attribute
    final String marke;
    final String modell;
    final int baujahr;
    final double preis;

    // Konstruktor mit allen Parametern
    public konst(String marke, String modell, int baujahr, double preis) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.preis = preis;
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
        System.out.println("Preis: " + preis + " €");
    }

    public static void main(String[] args) {
        konst a = new konst("VW", "Golf", 2019, 18000);
        a.anzeigen();
    }
}
