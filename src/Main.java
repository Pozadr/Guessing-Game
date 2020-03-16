import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i = 0;
        int randomNumber;
        int guessedNumber = 0;
        int maximumForLottery = 0;

        System.out.println("---------- Guessing game! ----------"
                + "\nFrom how many numbers do you want to guess?");
        maximumForLottery = getIntFromUser();

        // Random function
        Random rnd = new Random();
        randomNumber = rnd.nextInt(maximumForLottery) + 1;

        do {
            System.out.println("Type number: ");
            guessedNumber = getIntFromUser();
            i += checkUserNumber(guessedNumber, maximumForLottery, randomNumber);
        }while(guessedNumber != randomNumber);

        System.out.println("Congratulations! You won after " + i + " chances.");

    }

    public static int getIntFromUser(){
        Scanner keyboard = new Scanner(System.in);
        int number = 0;

        while (true) {
            if (keyboard.hasNextInt()) {
                number += keyboard.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Integer values "
                        + "only please.");
                keyboard.next();// consume one invalid token from user input
            }
        }
        return number;
    }

    public static int checkUserNumber(int number, int max, int randomNumber){
        if(number > max){
            System.out.println("Your number is too big. Try again!");
            return 0;
        }
        else if (number < 1){
            System.out.println("Your number below 1. Try again!");
            return 0;
        }
        else if(number > randomNumber) {
            System.out.println("Random number is lower.");
            return 1;
        }
        else if(number < randomNumber){
            System.out.println("Random number is higher.");
            return 1;
        }
        // number == randomNumber
        else{
            return 1;
        }
    }


}
