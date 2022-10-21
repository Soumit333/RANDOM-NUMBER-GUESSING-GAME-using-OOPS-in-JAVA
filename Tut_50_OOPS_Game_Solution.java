package Soumit;
import java.util.Random;
import java.util.Scanner;

class myGame {
    Scanner scan = new Scanner(System.in);
    int number;
    int count = 0;
    int input_number;
    int k = 5;
    int i;

    myGame() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void isCorrectNumber() {
        for (i = 0; i < k; i++) {
            System.out.println("Guess a number : ");
            count++;
            input_number = scan.nextInt();
            if (input_number == number) {
                System.out.println("Congratulation, you have guessed the correct number.");
                System.out.println("No of guesses " + count);
                break;
            } else if (input_number < number) {
                System.out.println("Too less, try again.......");
            } else {
                System.out.println("Too High, try again.......");
            }
        }
        if (i == k) {
            System.out.println("You completed all counts");
            System.out.println("Computer entered number is " + number);
        }
    }
}
public  class Tut_50_OOPS_Game_Solution {
    public static void main(String[] args) {
        System.out.println("Welcome to RANDOM-NUMBER-GUESSING-GAME....");
        System.out.println("So, let's play the game....");
        myGame game = new myGame();
        game.isCorrectNumber();

    }
}

