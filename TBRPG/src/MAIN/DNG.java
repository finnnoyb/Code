package MAIN;

import java.util.Scanner;

public class DNG {

    // 2D array für die Karte
    static char[][] world = {
        {'P', '.', '.', 'E'},
        {'.', '.', '.', '.'},
        {'.', 'E', '.', '.'},
        {'.', '.', '.', 'T'}
    };

    // Spielerposition
    static int playerX = 0;
    static int playerY = 0;

    public static void main(String[] args) {
        // Mein ASCII Art :3
        System.out.println(" 			");
        System.out.println(" 	supi toller name :3		");
        System.out.println(" __________________________ ");
        System.out.println("|<><><>    |    |    <><><>|");
        System.out.println("|<>        |    |        <>|");
        System.out.println("|           >.>            |");
        System.out.println("|          |    |          |");
        System.out.println("|          |    |          |");
        System.out.println("|__________|    |__________|");
        System.out.println("|__________      __________|");
        System.out.println("|---(((---'|    |'---)))---|");
        System.out.println("|          |    |          |");
        System.out.println("|          |    |          |");
        System.out.println(":          |    |          :");
        System.out.println(" <>         o^o         <> ");
        System.out.println("  <>       |    |      <> ");
        System.out.println("   <>      |    |     <> ");
        System.out.println("    `<>    |    |   <>'");
        System.out.println("      `<>  |    |  <>'");
        System.out.println("        `<>|    |<>'");
        System.out.println("          `-.  .-`");
        System.out.println("            '--'");

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("GLHF :3");
        printWorld();

        while (running) {
            System.out.println("WASD Steureung, Q = :'3): ");
            System.out.println("P bist du, E is böse , T is cool): ");
            String input = sc.nextLine();

            switch (input) {
                case "w": move(-1, 0); break; //up
                case "s": move(1, 0); break; //down
                case "d": move(0, 1); break;//left 
                case "a": move(0, -1); break; //right b a start >.>
                case "q": running = false; break; //sadgi
                case "fluff": System.out.println("u :3"); break;//hehe
                default: System.out.println("MEEEP!");
            }

            printWorld();
        }

        sc.close();
        System.out.println("Sadgi :'3");
    }

    // Bewegung
    public static void move(int dx, int dy) {
        int newX = playerX + dx;
        int newY = playerY + dy;

        if (newX >= 0 && newX < world.length && newY >= 0 && newY < world[0].length) {
            world[playerX][playerY] = '.';
            playerX = newX;
            playerY = newY;

            if (world[playerX][playerY] == 'E') {
                System.out.println("U sense an evil presence!");
                attack("supi toller name 2");
            } else if (world[playerX][playerY] == 'T') {
                System.out.println("U have recieved loot");
            }

            world[playerX][playerY] = 'P';
        } else {
            System.out.println("go away or u fall into the void >.>'");
        }
    }



    public static void attack(String weapon) {
        System.out.println("attacking w " + weapon);
    }

    // Welt Drucken
    public static void printWorld() {
        for (int i = 0; i < world.length; i++) {
            for (int j = 0; j < world[i].length; j++) {
                System.out.print(world[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// will noch ende machen
// will noch name finden
// will 100% noch den loot useful machen
// add hit points
// add enm class
// add loot randomizer
// add loot seltenheit
// add inventory
// add weapon choosing 
// add ranged meaning add 2nd map after evil presence 
// expand map size >
// add walls >
// add floors <
// add HP so u can fail
// mb add diagonal movement
// add ascii art for enm, inventory and weapons