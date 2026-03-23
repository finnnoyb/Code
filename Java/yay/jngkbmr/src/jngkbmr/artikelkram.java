package jngkbmr;

public class artikelkram {
	
	
    static class Artikel {
        protected int ArtNr;
        protected String Bezeichnung;
        protected String Language;  // Position in km (1D)
        protected String Beschreibung;  // Aktuelle Geschwindigkeit in km/h
        protected double VPreis;

	public static void main(String[] args) {
		
		Artikel[] artikel = new Artikel[3];
			artikel[0] = new Diashow(4711,"Diashow","JAVA","Erlaubt Diashow auf HTML",29.90);
			artikel[1] = new Bildbeschriftung(4712,"Bildbeschriftung","JAVA","Erlaubt Beschriftung von Bildern",99.50);
			artikel[2] = new 100Piktos(8726,"100Piktos","JAVA","100 Piktogramme für HTML seite",54.50);

		
	}

}
