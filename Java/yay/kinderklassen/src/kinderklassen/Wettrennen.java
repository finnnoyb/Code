	package kinderklassen;
	
	
	public class Wettrennen {
	
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
	    static class Krakenwagen extends Fahrzeug {
	        private boolean beiwagen;
	
	        public Krakenwagen(String marke, int baujahr, boolean beiwagen) {
	            super(marke, baujahr);
	            this.beiwagen = beiwagen;
	        }
	
	        
	        public String beschreibung() {
	            return "Weewoo: Fahrzeug=" + marke + ", Baujahr=" + baujahr +
	                   ", Beiwagen=" + (beiwagen ? "ja" : "nein");
	        }
	    }
	
	    public static void main(String[] args) {
	
	        //hier kommt stuff her
	        Fahrzeug[] fahrzeuge = new Fahrzeug[4];
	        fahrzeuge[0] = new Auto("", 2018, 2);
	        fahrzeuge[1] = new Auto("Kawasaki", 2020, 4);
	        fahrzeuge[2] = new Auto("Toyota", 2013, 3	);
	        fahrzeuge[3] = new Krakenwagen("Krankenwagen", 2019, false);	
	
	        // Ausgabe aller Beschreibungen
	        for (Fahrzeug f : fahrzeuge) {
	            System.out.println(f.beschreibung());
	        }
	    }
	}
	
	
	
	
	//positon 1D < das hier wird giga cancer
	//geschw in km/h
	//method bewege
	//methode mit double parameter aufgerufen der anzahl der min angibt die sich das farzeug in der gesch vorwärts bewegt
	//methode änder position vom fahrzeug wenn es von 0 verschiedenen geschwindigkeit bewegt wird
	//Methode setzeGeschwindigkeit (dabei max geschwindigkeit nicht überschreiten eine korrekte ausführung sollte protokolliert werden)
	//Methode getMaxGeschwindigkeit (Für ein Objekt der Klasse Farzeug soll die Maximalgeschwindigkeit 0 sein)
	//anzahl der räder andgeben In der Klasse sollen diese ebenfalls 0 sein
	
	//Fahrrad 2 räder max geschw 30km/h
	//Auto 4 räder max geschw 140km/h
	//Rennwagen 4räder 220 km/h
	//Krakenwagen mit zusätzlichen blaulicht das ein oder ausgeschaltet sein kann boolean 4 räder 80 km/h