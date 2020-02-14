package ua.project.homeworks.homework1;

public class View {

    public static final String INPUT_VALUE = "Input ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String firstValue, String secondValue) {
        System.out.println(firstValue + " " + secondValue);
    }

}
