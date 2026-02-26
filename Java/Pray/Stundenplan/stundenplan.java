package Stundenplan;
import java.util.Arrays;

public class stundenplan {

    public static void main(String[] args) {
        System.out.println("Gerade Woche");
        String Zahl[][] = new String [5][5]; // erste [Zeile] zweite [Spalte]
            Zahl [0][0] = "Mo ";
            Zahl [0][1] = "Di ";
            Zahl [0][2] = "Mi ";
            Zahl [0][3] = "Do ";
            Zahl [0][4] = "Fr ";

            Zahl[1][0] = "LF5";
            Zahl[1][1] = "LF9";
            Zahl[1][2] = " - ";
            Zahl[1][3] = "LF5";
            Zahl[1][4] = " - ";

            Zahl[2][0] = "LF5";
            Zahl[2][1] = "LF4";
            Zahl[2][2] = "LF9";
            Zahl[2][3] = "LF3";
            Zahl[2][4] = "NN ";

            Zahl[3][0] = "LF3";
            Zahl[3][1] = "LF4";
            Zahl[3][2] = "LF6";
            Zahl[3][3] = "Eng";
            Zahl[3][4] = "Deu";

            Zahl[4][0] = " - ";
            Zahl[4][1] = "Mat";
            Zahl[4][2] = "LF6";
            Zahl[4][3] = " - "; 
            Zahl[4][4] = " - ";

            for (int i=0; i < Zahl.length ; i++) {
                System.out.println(Arrays.toString(Zahl[i]));
            }}}
