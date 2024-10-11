import java.util.Scanner;

public class feedback{
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        
        int userGuess = 1;
        int attempts = 1;

            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();

     if (userGuess == targetNumber) {
                System.out.println("Correct! You guessed the right number in " + attempts + " attempts.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Too low! Try again.");
            }
        }
    }



