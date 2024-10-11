
import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
         System.out.print("Enter your number: ");
        String name = scanner.nextLine();
         int targetNumber = (int) (Math.random() * 100) + 1;
       
        System.out.println("Random number: " + targetNumber);
    }
}
