package morekindaklassen;

public class wettrennen {

    // Elternklasse
    static class Fahrzeug {
        protected String marke;
        protected int baujahr;
        protected double position;  // Position in km (1D)
        protected double geschwindigkeit;  // Aktuelle Geschwindigkeit in km/h

        public Fahrzeug(String marke, int baujahr) {
            this.marke = marke;
            this.baujahr = baujahr;
            this.position = 0.0;
            this.geschwindigkeit = 0.0;
        }

        public String beschreibung() {
            return "Fahrzeug: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Position=" + String.format("%.2f", position) + "km" +
                   ", Geschwindigkeit=" + geschwindigkeit + "km/h";
        }

        // Bewegt das Fahrzeug für die angegebene Anzahl von Minuten
        public void bewege(double minuten) {
            if (geschwindigkeit != 0) {
                double stunden = minuten / 60.0;
                double strecke = geschwindigkeit * stunden;
                position += strecke;
                System.out.println(marke + " bewegt sich " + String.format("%.2f", strecke) + 
                                   "km (neue Position: " + String.format("%.2f", position) + "km)");
            }
        }

        // Setzt die Geschwindigkeit, darf max. Geschwindigkeit nicht überschreiten
        public void setzeGeschwindigkeit(double neueGeschwindigkeit) {
            if (neueGeschwindigkeit < 0) {
                System.out.println("Fehler: Negative Geschwindigkeit nicht erlaubt!");
                return;
            }
            
            if (neueGeschwindigkeit > getMaxGeschwindigkeit()) {
                System.out.println("Warnung: Maximalgeschwindigkeit von " + getMaxGeschwindigkeit() + 
                                   "km/h überschritten! Setze auf Maximum.");
                geschwindigkeit = getMaxGeschwindigkeit();
            } else {
                geschwindigkeit = neueGeschwindigkeit;
                System.out.println(marke + ": Geschwindigkeit gesetzt auf " + geschwindigkeit + "km/h");
            }
        }

        // Maximalgeschwindigkeit für Basisklasse Fahrzeug ist 0
        public double getMaxGeschwindigkeit() {
            return 0.0;
        }

        // Anzahl der Räder für Basisklasse Fahrzeug ist 0
        public int getAnzahlRaeder() {
            return 0;
        }
    }

    // Fahrrad: 2 Räder, max 30 km/h
    static class Fahrrad extends Fahrzeug {
        public Fahrrad(String marke, int baujahr) {
            super(marke, baujahr);
        }

        @Override
        public double getMaxGeschwindigkeit() {
            return 30.0;
        }

        @Override
        public int getAnzahlRaeder() {
            return 2;
        }

        @Override
        public String beschreibung() {
            return "Fahrrad: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Räder=" + getAnzahlRaeder() +
                   ", Position=" + String.format("%.2f", position) + "km" +
                   ", Geschwindigkeit=" + geschwindigkeit + "km/h (max: " + getMaxGeschwindigkeit() + "km/h)";
        }
    }

    // Auto: 4 Räder, max 140 km/h
    static class Auto extends Fahrzeug {
        private int anzahlTueren;

        public Auto(String marke, int baujahr, int anzahlTueren) {
            super(marke, baujahr);
            this.anzahlTueren = anzahlTueren;
        }

        @Override
        public double getMaxGeschwindigkeit() {
            return 140.0;
        }

        @Override
        public int getAnzahlRaeder() {
            return 4;
        }

        @Override
        public String beschreibung() {
            return "Auto: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Türen=" + anzahlTueren + ", Räder=" + getAnzahlRaeder() +
                   ", Position=" + String.format("%.2f", position) + "km" +
                   ", Geschwindigkeit=" + geschwindigkeit + "km/h (max: " + getMaxGeschwindigkeit() + "km/h)";
        }
    }

    // Rennwagen: 4 Räder, 220 km/h
    static class Rennwagen extends Fahrzeug {
        public Rennwagen(String marke, int baujahr) {
            super(marke, baujahr);
        }

        @Override
        public double getMaxGeschwindigkeit() {
            return 220.0;
        }

        @Override
        public int getAnzahlRaeder() {
            return 4;
        }

        @Override
        public String beschreibung() {
            return "Rennwagen: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Räder=" + getAnzahlRaeder() +
                   ", Position=" + String.format("%.2f", position) + "km" +
                   ", Geschwindigkeit=" + geschwindigkeit + "km/h (max: " + getMaxGeschwindigkeit() + "km/h)";
        }
    }

    // Krankenwagen: 4 Räder, 80 km/h, mit Blaulicht
    static class Krankenwagen extends Fahrzeug {
        private boolean blaulicht;

        public Krankenwagen(String marke, int baujahr, boolean blaulicht) {
            super(marke, baujahr);
            this.blaulicht = blaulicht;
        }

        @Override
        public double getMaxGeschwindigkeit() {
            return 80.0;
        }

        @Override
        public int getAnzahlRaeder() {
            return 4;
        }

        public void setzeBlaulicht(boolean an) {
            blaulicht = an;
            System.out.println(marke + ": Blaulicht " + (an ? "eingeschaltet" : "ausgeschaltet"));
        }

        public boolean istBlaulichtAn() {
            return blaulicht;
        }

        @Override
        public String beschreibung() {
            return "Krankenwagen: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Räder=" + getAnzahlRaeder() +
                   ", Blaulicht=" + (blaulicht ? "an" : "aus") +
                   ", Position=" + String.format("%.2f", position) + "km" +
                   ", Geschwindigkeit=" + geschwindigkeit + "km/h (max: " + getMaxGeschwindigkeit() + "km/h)";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== WETTRENNEN SIMULATION ===\n");

        // Fahrzeuge erstellen
        Fahrzeug[] fahrzeuge = new Fahrzeug[5];
        fahrzeuge[0] = new Fahrrad("Drahtesel", 2020);
        fahrzeuge[1] = new Auto("Hyundai", 2018, 4);
        fahrzeuge[2] = new Auto("Toyota ", 2020, 4);
        fahrzeuge[3] = new Rennwagen("Toyota 86", 2022);
        fahrzeuge[4] = new Krankenwagen("Mercedes", 2019, false);

        // Ausgabe aller Beschreibungen
        System.out.println("--- Startaufstellung ---");
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.beschreibung());	
        }

        System.out.println("\n--- Geschwindigkeiten setzen ---");
        fahrzeuge[0].setzeGeschwindigkeit(30);  // Fahrrad
        fahrzeuge[1].setzeGeschwindigkeit(140); // Auto
        fahrzeuge[2].setzeGeschwindigkeit(160); // Auto (über Maximum!)
        fahrzeuge[3].setzeGeschwindigkeit(200); // Rennwagen
        fahrzeuge[4].setzeGeschwindigkeit(70);  // Krankenwagen

        // Blaulicht beim Krankenwagen einschalten
        if (fahrzeuge[4] instanceof Krankenwagen) {
            ((Krankenwagen) fahrzeuge[4]).setzeBlaulicht(true);
        }

        System.out.println("\n--- Wettrennen: 10 Minuten fahren ---");
        for (Fahrzeug f : fahrzeuge) {
            f.bewege(10);
        }

        System.out.println("\n--- Zwischenstand ---");
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.beschreibung());
        }

        System.out.println("\n--- Weitere 15 Minuten fahren ---");
        for (Fahrzeug f : fahrzeuge) {
            f.bewege(15);
        }

        System.out.println("\n--- ENDSTAND ---");
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.beschreibung());
        }

        // Sieger ermitteln
        System.out.println("\n--- SIEGER ---");
        Fahrzeug sieger = fahrzeuge[0];
        for (Fahrzeug f : fahrzeuge) {
            if (f.position > sieger.position) {
                sieger = f;
            }
        }
        System.out.println("Der Sieger ist: " + sieger.marke + " mit " + 
                           String.format("%.2f", sieger.position) + "km!");
    }
}