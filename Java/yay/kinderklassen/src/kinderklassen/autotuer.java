package kinderklassen;


public class autotuer {

    // eltern
    static class Fahrzeug {
        protected String marke;
        protected int baujahr;
// this 
        public Fahrzeug(String marke, int baujahr) {
            this.marke = marke;
            this.baujahr = baujahr;
        }

        public String beschreibung() {
            return "Fahrzeug: Marke=" + marke + ", Baujahr=" + baujahr;
        }
    }

    // kind auto
    //extends > übernehmen und erweitern der elternklasse
    static class Auto extends Fahrzeug {
        private int anzahlTueren;

        public Auto(String marke, int baujahr, int anzahlTueren) {
            super(marke, baujahr);
            this.anzahlTueren = anzahlTueren;
        }

        //overwriting hier bzw unten um string auszugeben der Auto/Bike beschreibt
        public String beschreibung() {
            return "Auto: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Türen=" + anzahlTueren;
        }
    }

    // kind bike
    static class Motorrad extends Fahrzeug {
        private boolean beiwagen;

        public Motorrad(String marke, int baujahr, boolean beiwagen) {
            super(marke, baujahr);
            this.beiwagen = beiwagen;
        }

        
        public String beschreibung() {
            return "Motorrad: Marke=" + marke + ", Baujahr=" + baujahr +
                   ", Beiwagen=" + (beiwagen ? "ja" : "nein");
        }
    }

    public static void main(String[] args) {

        //hier kommt stuff her
        Fahrzeug[] fahrzeuge = new Fahrzeug[4];
        fahrzeuge[0] = new Auto("Porsche", 2018, 2);
        fahrzeuge[1] = new Motorrad("Kawasaki", 2020, true);
        fahrzeuge[2] = new Auto("Toyota", 2013, 3	);
        fahrzeuge[3] = new Motorrad("Yamaha", 2019, false);	

        // Ausgabe aller Beschreibungen
        for (Fahrzeug f : fahrzeuge) {
            System.out.println(f.beschreibung());
        }
    }
}
