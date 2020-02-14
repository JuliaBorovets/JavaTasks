package ua.project.homeworks.homework2.game;

import java.util.ArrayList;

public class View {
    public static final String GREETING = " Hi! You are in the game \"Guess the number\" " ;
    public static final String INPUT_NUMBER = "Input number: ";
    public static final String WRONG_BORDERS = "Wrong borders! ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String NUMBER_SMALLER = "The number is less than";
    public static final String NUMBER_BIGGER = "The number is greater than";
    public static final String NUMBER_IS_ALREADY = "You have already entered this number!";
    public static final String RANGE_OF_THE_NUMBER = "\n" + "Range of the number: ";
    public static final String PREVIOUS_NUMBERS = "Your previous numbers: ";
    public static final String NUMBER_OF_ATTEMPTS = "Number of attempts:  ";
    public static final String END_OF_THE_GAME = "Congratulations!  You guessed the number! This is ";


    public void printMessage(String message) {
        System.out.println("\n" + message);
    }

    public void printMessage(String message, int number) {
        System.out.print("\n" + message  + " " + number);
    }

    public void printMessage(String message, int lowerLimit, int upperLimit) {
        System.out.print(message + " " + lowerLimit + " - " + upperLimit );
    }

    public void printMessage(String message, ArrayList<Integer> attempts) {
        System.out.print("\n" + message);
        for (int i: attempts) {
            System.out.print(" " + i + "," );
        }
    }
}
