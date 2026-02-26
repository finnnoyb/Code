package gahbless;
import java.util.Scanner;

public class gah {
    public static void main(String[] args) {
    int alter = 0;
    int alter2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hallo, wie heißt du?");
        String name= sc.nextLine();

        System.out.println("welches jahr,is es " + name + "?");
        int jahr= sc.nextInt();

   System.out.println("in welchem jahr bist du gespawnt?");
        int geburtsjahr= sc.nextInt();
        
        
        

    System.out.println("hattest du schon geburtstag? " + '\n' + "y 0 n 1:");
        Integer input= sc.nextInt();

            if(input == 0){
                    alter = jahr - geburtsjahr;
                    System.out.println(name + ", du bist " + alter + " Jahre alt!");
            }
                else{
                    alter2 = jahr - geburtsjahr -1;
                    System.out.println(name + ", du bist " + alter2 + " Jahre alt!");
                }
            }

        }