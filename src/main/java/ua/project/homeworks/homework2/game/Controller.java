package ua.project.homeworks.homework2.game;
import java.util.Scanner;

public class Controller {
    public static Scanner sc;
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        sc = new Scanner(System.in);
        view.printMessage(View.GREETING);
        process();
    }

    public int inputValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_NUMBER);

        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    public void process() {
        boolean play = true;
        int num;
        while (play) {
            num = inputValueWithScanner(sc);
            if (num < model.a || num > model.b) {
                view.printMessage(View.WRONG_BORDERS);
                model.attempts++;
                printMessage();
            } else {
                int res = model.game(num);
                switch (res) {
                    case 0:
                        view.printMessage(View.END_OF_THE_GAME, model.RANDOM_NUMBER);
                        view.printMessage(View.NUMBER_OF_ATTEMPTS, model.attempts);
                        play = false;
                        break;
                    case 2:
                        view.printMessage(View.NUMBER_BIGGER, num);
                        printMessage();
                        break;
                    case 1:
                        view.printMessage(View.NUMBER_SMALLER, num);
                        printMessage();
                        break;
                    case -1:
                        view.printMessage(View.NUMBER_IS_ALREADY);
                        printMessage();
                        break;
                }
            }
        }

    }

    private void printMessage() {
        view.printMessage(View.PREVIOUS_NUMBERS, model.getPreviousNumbers());
        view.printMessage(View.RANGE_OF_THE_NUMBER, model.a, model.b);
    }

}

