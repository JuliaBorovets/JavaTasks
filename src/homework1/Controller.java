package homework1;

import java.util.Scanner;

public class Controller {

    public static final String FIRST = "Hello";
    public static final String SECOND = "Java!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setFirstValue(inputValueWithScanner(sc, FIRST));
        model.setSecondValue(inputValueWithScanner(sc, SECOND));

        view.printMessage(model.getFirstValue(), model.getSecondValue());
    }

    public String inputValueWithScanner(Scanner sc, String value) {
        view.printMessage(View.INPUT_VALUE + value);
        while (!sc.next().equals(value)) {
            view.printMessage(View.WRONG_INPUT_DATA);
        }
        return value;
    }
}