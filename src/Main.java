import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i = 0;
        int randomNumber;
        int guessedNumber;

        Random rnd = new Random();
        randomNumber = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess number from 1 to 10!");
        do {
            i++;
            System.out.println("Type number: ");
            guessedNumber = scanner.nextInt();  // has to be int from user
            if(guessedNumber > randomNumber) {
                System.out.println("Random number is lower.");
            }
            if(guessedNumber < randomNumber) {
                System.out.println("Random number is higher.");
            }
        }while(guessedNumber != randomNumber);

        System.out.println("Congratulations! You won after " + i + " chances.");

    }
}
