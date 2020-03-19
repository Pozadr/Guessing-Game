import java.util.Random;
import java.util.Scanner;

public class Game {
    private int gameLoopCounter = 0;
    private int randomNumber;
    private int guessedNumber = 0;
    private int maximumForLottery = 0;


    public void runGame(){
        System.out.println("---------- Guessing game! ----------"
                + "\nFrom how many numbers do you want to guess?");
        maximumForLottery = getIntFromUser();

        // Random function
        Random rnd = new Random();
        randomNumber = rnd.nextInt(maximumForLottery) + 1;

        do {
        System.out.println("Type number: ");
        guessedNumber = getIntFromUser();
        gameLoopCounter += checkUserNumber();
        } while(guessedNumber != randomNumber);

        System.out.println("Congratulations! You won after " + gameLoopCounter + " chances.");
    }

    private int getIntFromUser(){
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

    private int checkUserNumber(){
        if(this.guessedNumber > this.maximumForLottery){
            System.out.println("Your number is too big. Try again!");
            return 0;
        }
        else if (this.guessedNumber < 1){
            System.out.println("Your number below 1. Try again!");
            return 0;
        }
        else if(this.guessedNumber > randomNumber) {
            System.out.println("Random number is lower.");
            return 1;
        }
        else if(this.guessedNumber < randomNumber){
            System.out.println("Random number is higher.");
            return 1;
        }
        // number == randomNumber
        else{
            return 1;
        }
    }
}
