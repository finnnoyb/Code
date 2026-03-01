package fliegflog;

//Abstrakte Basisklasse
public abstract class Flugzeug {
 protected String hersteller;
 protected int maxSpeed;
 protected String immatNummer;
 protected int anzahlFluegel;

 public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
     this.hersteller = hersteller;
     this.maxSpeed = maxSpeed;
     this.anzahlFluegel = anzahlFluegel;
 }

 public String getImmatNummer() {
     return immatNummer;
 }

 protected void setImmatNummer(String immatNummer) {
     this.immatNummer = immatNummer;
 }

 public int getMaxSpeed() {
     return maxSpeed;
 }

 public abstract boolean getLooping(); // abstrakte Methode
}