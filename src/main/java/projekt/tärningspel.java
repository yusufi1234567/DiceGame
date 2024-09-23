package projekt;


import java.util.Random;
import java.util.Scanner;


public class tärningspel {

    public static void main(String[] args) {

        System.out.println(" ********* VÄLKOMMEN TILL TÄRNINGSPELET ********* ");
        System.out.println(" ******* SPELREGLER ******* ");
        System.out.println(" Kasta tärning två gånger var och vinnaren är den med högst resultat ");


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" ANVÄNDARE 1 NAMN: ");
        String player1 = scanner.nextLine();
        System.out.println(" ANVÄNDARE 2 NAMN: ");
        String player2 = scanner.nextLine();


        System.out.println(player1 + " Tryck ENTER när du vill kasta ");
        String enter = scanner.nextLine();
        int roll1 = random.nextInt(6) + 1; // Ger ett tal mellan 1 och 6
        System.out.println(" Du kastade  " + roll1);


        System.out.println("Tryck ENTER för ditt andra kast ");
        String enter2 = scanner.nextLine();
        int roll2 = random.nextInt(6) + 1; // Ger ett tal mellan 1 och 6
        System.out.println(" Du kastade " + roll2);

        int result1 = roll1 + roll2;
        System.out.println( player1 + " Du fick " + result1 + " sammanlagt ");

        System.out.println(player2 + " Tryck ENTER när du vill kasta ");
        String enter3 = scanner.nextLine();

        int roll3 = random.nextInt(6) + 1;
        System.out.println(" Du kastade " + roll3);

        System.out.println("Tryck ENTER för ditt andra kast ");
        String enter4 = scanner.nextLine();

        int roll4 = random.nextInt(6) + 1;
        System.out.println(" Du kastade " + roll4);
        int result2 = roll3 + roll4;


        System.out.println( player2 + " Du fick " + result2 + " sammanlagt ");
        System.out.println("------------------------------------");

        if (result1 > result2){
            System.out.println(" *** Grattis *** " + player1 + " du är vinnaren!! ");
        }
        else if (result2 > result1){
            System.out.println(" *** Grattis *** " + player2 + " du är vinnaren!! ");
        }
        else System.out.println(" *** Matchen blev oavgjort! *** ");






        
    }
}

