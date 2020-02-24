package ua.project.homeworks.homework2.game;

import java.util.ArrayList;
import java.util.Objects;

public class Model {
    public int a = 0;
    public int b = 100;
    public final int RANDOM_NUMBER;
    public ArrayList<Integer> previousNumbers;
    public int attempts;

    public Model() {
        this.RANDOM_NUMBER = (int) (Math.random() * 100) + 1;
        this.previousNumbers = new ArrayList<>();
        this.attempts = 0;
    }

    public boolean containsNumber(int number) {
        return this.previousNumbers.contains(number);
    }

    public boolean isGreater(int number) {
        return RANDOM_NUMBER > number;
    }

    public boolean isEqual(int number) {
        return RANDOM_NUMBER == number;
    }

    public int game(int number) {
        if (isEqual(number)) {
            attempts++;
            previousNumbers.add(number);
            return 0;
        } else if (!containsNumber(number)) {
            if (isGreater(number)) {
                a = number;
                previousNumbers.add(number);
                attempts++;
                return 2;
            } else if (!isGreater(number)) {
                b = number;
                previousNumbers.add(number);
                attempts++;
                return 1;
            }
        }
        attempts++;

        return -1;
    }


    public ArrayList<Integer> getPreviousNumbers() {
        return previousNumbers;
    }
}

