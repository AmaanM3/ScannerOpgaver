import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");

        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object   	 
    Scanner sc = new Scanner(System.in);

    System.out.println("Write your guess: ");

        // use hasNextDouble to check if input is numeric, 
        // if so...
    if (sc.hasNextInt()) {
        int guess = sc.nextInt();

	    // Read user input
        // Compare it with the random number
        if (guess == rnd_number) {
        System.out.println("Congrats, you guessed the correct number which is: " + rnd_number);

            // Help the user by revealing wether the guess was lower or higher than the target number
        } else if (guess < rnd_number) {
            System.out.println("Wrong, number is too low, try again");
            makeAGuess(); // recursion
        } else {
            System.out.println("Wrong, number is too high, try again");
            makeAGuess(); // recursion
            }
        }
        // if input was not numeric show an error message and call this method recursively
       else {
            // If input was not numeric
            System.out.println("Input is invalid, enter a number next time");
            sc.next();                                                      // fjerner forkert input
            makeAGuess();                                                   // kalder sig selv igen dvs recursion     
        }
    }
}
