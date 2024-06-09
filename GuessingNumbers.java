import java.util.Random;
import java.util.*;
public class GuessingNumbers {
    public static void main(String[] args) {
        //defining the range
        int first = 1;
        int last = 100;

        Random random = new Random();
        int randomNumber = first + random.nextInt(last-first +1);//random number generated

        Scanner sc = new Scanner(System.in);
        int guess = -1;

        System.out.println("Welcome to the number guessing game! ");
        System.out.println("Guess a number between "+first+" and "+last+": ");

        while (guess!=randomNumber){
            guess = sc.nextInt();

            if (guess<randomNumber){
                System.out.println("Too low! Try again.");
            } else if (guess>randomNumber) {
                System.out.println("Too high! Try again.");
            }else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }
    }
}
