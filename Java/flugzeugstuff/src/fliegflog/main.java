package fliegflog;

public class main {
    public static void main(String[] args) {

        Verkehrsflugzeug boeing = new Verkehrsflugzeug("Boeing", 900, "D-ABCD", 180);
        System.out.println("Hersteller: " + boeing.hersteller);
        System.out.println("MaxSpeed: " + boeing.getMaxSpeed());
        System.out.println("Passagiere: " + boeing.getAnzPassagiere());
        System.out.println("Looping möglich: " + boeing.getLooping());

        System.out.println("---");

        Doppeldecker fokker = new Doppeldecker("Fokker", 250, "D-EFGH", true);
        System.out.println("Hersteller: " + fokker.hersteller);
        System.out.println("MaxSpeed: " + fokker.getMaxSpeed());
        System.out.println("Looping möglich: " + fokker.getLooping());
    }
}