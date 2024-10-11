
import java.util.Scanner;
import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
          int targetNumber = (int) (Math.random() * 100) + 1;
       
        System.out.println("Random number: " + targetNumber);
    }
}
