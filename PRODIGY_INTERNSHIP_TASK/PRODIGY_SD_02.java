import java.util.Random;
import java.util.Scanner;

public class PRODIGY_SD_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        int attempts = 0;
        int userGuess;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println(
                "I have selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }

        } while (userGuess != randomNumber);

        scanner.close();
    }
}
