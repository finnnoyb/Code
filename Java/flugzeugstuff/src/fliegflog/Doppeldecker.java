package fliegflog;

//Unterklasse Doppeldecker
public class Doppeldecker extends Flugzeug {
 private int LOOPINGSPEED;
 private boolean offenesCockpit;

 // Konstruktor mit offenesCockpit
 public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
     super(hersteller, maxSpeed, 4); // Doppeldecker hat 4 Flügel
     this.immatNummer = immatNummer;
     this.offenesCockpit = offenesCockpit;
     this.LOOPINGSPEED = 200; // Standardwert
 }

 // Konstruktor ohne offenesCockpit
 public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
     this(hersteller, maxSpeed, immatNummer, false); // delegiert an anderen Konstruktor
 }

 @Override
 public boolean getLooping() {
     return maxSpeed >= LOOPINGSPEED; // Looping möglich wenn schnell genug
 }
}