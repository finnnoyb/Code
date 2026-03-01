package fliegflog;

//Unterklasse Verkehrsflugzeug
public class Verkehrsflugzeug extends Flugzeug {
 private int anzPassagiere;

 public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int anzPassagiere) {
     super(hersteller, maxSpeed, 2); // ruft Konstruktor von Flugzeug auf
     this.immatNummer = immatNummer;
     this.anzPassagiere = anzPassagiere;
 }

 @Override
 public boolean getLooping() {
     return false; // Verkehrsflugzeuge können keine Loopings fliegen
 }

 public int getAnzPassagiere() {
     return anzPassagiere;
 }

 public void setAnzPassagiere(int anzPassagiere) {
     this.anzPassagiere = anzPassagiere;
 }
}