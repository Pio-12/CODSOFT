import java.util.Scanner;

public class guesscrtno {
    public static void main(String[] args) {
        
        int targetNumber = (int) (Math.random() * 100)+1;
        Scanner scanner = new Scanner(System.in); 
        int userGuess = 0;
        int attempts = 0;
        while (userGuess != targetNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == targetNumber) {
                System.out.println("Correct! You guessed the right number in " + attempts + " attempts.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
        }
       
    }
}
