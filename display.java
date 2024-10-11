import java.util.Scanner;

public class display{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;
         int score = 0;

        do {
            int targetNumber = (int) (Math.random() * 100) + 1;
            System.out.print("Enter the maximum number of attempts you want: ");
            int maxAttempts = scanner.nextInt();
            
            int userGuess = 0;
            int attempts = 0;
           
            while (userGuess != targetNumber && attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100: ");
                userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == targetNumber) {
                    System.out.println("Correct! You guessed the right number in " + attempts + " attempts.");
                    break;  
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
                if (attempts == maxAttempts) {
                    System.out.println("Sorry! You've used all " + maxAttempts + " attempts. The correct number was " + targetNumber + ".");
                          
                }
            }
            int Score = Math.max(100 - (attempts * 10), 0);  

            System.out.println("Your score for this round: " + Score);
    

            System.out.print("Do you want to play again? (yes or no): ");
            playAgain = scanner.next();  

        } while (playAgain.equalsIgnoreCase("yes")); 
      
        System.out.println("Thanks for playing! Goodbye.");
      
        scanner.close();
    }
}
