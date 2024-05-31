import java.util.Random;
import java.util.Scanner;

public class newgame {
    public static void main(String[] args) {
        game g = new game();
        g.startgame();
    }
}

class game {

    game() {
        Random rd = new Random();
        x = rd.nextInt(10);
        System.out.println("x s generated between 0 to 10");
    }

    private int x;
    private int guess;

    int counter = 0;

    void userInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the x  : ");
        guess = sc.nextInt();

        
    }

    
    void startgame() {

        
        while (guess != x) {

            userInput();

            counter++;

            if (guess < x) {
                System.out.println("your guess is Less than x.");
            } else if (guess > x) {
                System.out.println("your guess is greater than x.");
            }

            else {
                System.out.println("\nYour guess is correct.");
                System.out.println("\nyou guesssed the right number in " + counter + " trial.");
            }

        }
    }

    // void countguess(){

    // }
    // }
}