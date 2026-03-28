package uebung2;


public class Main {

    // Elternklasse
    static class Fahrzeug {
        protected String marke;
        protected int baujahr;

        public Fahrzeug(String marke, int baujahr) {
            this.marke = marke;
            this.baujahr = baujahr;
        }

        public String beschreibung() {
            return "Fahrzeug: Marke=" + marke + ", Baujahr=" + baujahr;
        }
    }

    // Kinderklasse Auto
    static class Auto extends Fahrzeug {
        private int anzahlTueren;

        public Auto(String marke, int baujahr, int anzahlTueren) {
            super(marke, baujahr);
            this.anzahlTueren = anzahlTueren;
        }

        @Override
        public String beschreibung() {
            return "Auto: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Türen=" + anzahlTueren;
        }
    }

    // Kinderklasse Motorrad
    static class Motorrad extends Fahrzeug {
        private boolean beiwagen;

        public Motorrad(String marke, int baujahr, boolean beiwagen) {
            super(marke, baujahr);
            this.beiwagen = beiwagen;
        }

        @Override
        public String beschreibung() {
            return "Motorrad: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Beiwagen=" + (beiwagen ? "ja" : "nein");
        }
    }

    public static void main(String[] args) {

        // Array gemischt aus Auto und Motorrad
        Fahrzeug[] fahrzeuge = new Fahrzeug[4];
        fahrzeuge[0] = new Auto("BMW", 2018, 4);
        fahrzeuge[1] = new Motorrad("Harley-Davidson", 2020, true);
        fahrzeuge[2] = new Auto("VW", 2015, 2);
        fahrzeuge[3] = new Motorrad("Yamaha", 2019, false);

        // Ausgabe aller Beschreibungen
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.beschreibung());
        }
    }
}
