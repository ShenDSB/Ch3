import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        int guess, off;
        
        System.out.println("I'm thinking of a number between 1 and 100(including both). ");
        System.out.println("Can you guess what it is?");
        System.out.print("Type a number: ");
        guess = in.nextInt ();
        System.out.print("Your guess is: ");
        System.out.println(guess);
        System.out.print("The number I was thinking of is: ");
        System.out.println(number);
        off = guess - number;
        System.out.print("You were off by: ");
        System.out.println(off);
        
    }
}
