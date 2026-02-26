package uebung1;

public class Textausgabe_Parameter {

	{
        // Prüfen, ob zwei Übergabeparameter vorhanden sind
        if (args.length < 2) {
            System.out.println("Bitte geben Sie zwei Parameter an: <Name> <Veranstaltung>");
            return;
        }

        // Parameter auslesen
        String name = args[0];
        String veranstaltung = args[1];

        // Begrüßung 	ausgeben
        System.out.println("Herzlich willkommen, " + name + ", zur Veranstaltung \"" + veranstaltung + "\"!");
    }}
// Raff ich nicht 