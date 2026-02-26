package Stundenplan;
import java.util.Arrays;
import java.util.Scanner;

public class stundenplaneintragen {

    public static void main(String[] args) {
        System.out.println("Stundenplan erstellung");
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Wochentag: ");
        	int wochentag = sc.nextInt();
        System.out.print("Stunden: ");
        	int hrs = sc.nextInt();
        sc.nextLine();
        	
            String[][] plan = new String[wochentag][hrs];
            for (int i = 0; i < wochentag; i++) {
                for (int j = 0; j < hrs; j++) {
                    System.out.print("Fach für Tag " + (i+1) + ", Stunde " + (j+1) + ": ");
                    plan[i][j] = sc.nextLine();
                }
            }

            
            System.out.println("\nDein Stundenplan:");
            for (int i = 0; i < wochentag; i++) {
                System.out.print("Tag " + (i+1) + ": ");
                for (int j = 0; j < hrs; j++) {
                    System.out.print(plan[i][j] + "\t");
                }
                System.out.println();
            }

            sc.close();
        }
    }
    