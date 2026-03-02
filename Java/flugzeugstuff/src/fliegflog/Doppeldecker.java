package fliegflog;

//uk dd 
public class Doppeldecker extends Flugzeug {
 private int LOOPINGSPEED;
 private boolean offenesCockpit;

 // Konstruktor w offenesCockpit
 public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
     super(hersteller, maxSpeed, 4); // Doppeldecker hat 4 Flügel
     this.immatNummer = immatNummer;	
     this.offenesCockpit = offenesCockpit;
     this.LOOPINGSPEED = 200; // Standardwert
 }

 // Konstruktor w o offenesCockpit
 public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
     this(hersteller, maxSpeed, immatNummer, false); // delegiert an anderen Konstruktor
 }

 @Override
 public boolean getLooping() {
     return maxSpeed >= LOOPINGSPEED; // Looping möglich wenn schnell genug
 }
}