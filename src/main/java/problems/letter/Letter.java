package problems.letter;

import java.util.Random;
import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        //generates a letter in lower case
        char choosedLetter = chooseLetter();

        char enteredLetter = 0;
        int numberOfEnteredLetter = 0;
        int attempts = 0;
        System.out.println("Computer has chosen letter. You have to guess it. Your suggestions?");

        while (enteredLetter != choosedLetter) {
            attempts++;
            System.out.println("Enter a letter");
            enteredLetter = Character.toLowerCase(getEnteredLetter());
            numberOfEnteredLetter = enteredLetter;
            //check for bounds
            if (isLatinLetter(numberOfEnteredLetter)) {
                if (isCorrect(enteredLetter, choosedLetter)) {
                    System.out.println("You win! The letter was " + Character.toUpperCase(choosedLetter)
                            + "! The number of attempts: " + attempts);
                } else if (isLower(numberOfEnteredLetter, choosedLetter)) {
                    System.out.println("Too low! Try again!");
                } else if (isHigher(numberOfEnteredLetter, choosedLetter)) {
                    System.out.println("Too high! Try again!");
                }
            } else {
                System.out.println("Review the rules!");
            }
        }
    }

    private static char chooseLetter() {
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }

    private static char getEnteredLetter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static boolean isLatinLetter(int numberOfEnteredLetter) {
        return ((numberOfEnteredLetter > 64 && numberOfEnteredLetter < 91)
                || (numberOfEnteredLetter > 96 && numberOfEnteredLetter < 123));
    }

    public static boolean isHigher(int numberOfEnteredLetter, int numberOfChoosedLetter) {
        return (numberOfEnteredLetter > numberOfChoosedLetter);
    }

    public static boolean isLower(int numberOfEnteredLetter, int numberOfChoosedLetter) {
        return (numberOfEnteredLetter < numberOfChoosedLetter);
    }

    public static boolean isCorrect(char enteredLetter, char choosedLetter) {
        return (enteredLetter == choosedLetter);
    }
}
