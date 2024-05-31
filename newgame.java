import java.util.Random;
import java.util.Scanner;

public class newgame {
    public static void main(String[] args) {
        game g = new game();
        g.startgame();
        // System.out.println();
    }
}


class game{
    private int x;
    private int guess;

    void userInput(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the x between 0 to 10");
        guess=sc.nextInt();

        Random rd = new Random();
        x=rd.nextInt(1);
    }

    // Random rd = new Random();
    // x=rd.nextInt();
    // System.out.print(x);

    void startgame(){

        game g1 = new game();
        g1.userInput();
        
        
        // Random rd = new Random();
        // x=rd.nextInt(1);
        // System.out.print(x);

        while(guess == x){
            if(guess < x){
                System.out.println("your guess is Less than x.");
            }
            else if(guess > x){
                System.out.println("your guess is greater than x.");
                }
            }
            // else {
            //     System.out.println("Your guess is correct.");
            // }
        }

    //     void countguess(){

    //     }
    // }
}