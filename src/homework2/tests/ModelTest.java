package homework2.tests;

import homework2.game.Controller;
import homework2.game.Model;
import homework2.game.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class ModelTest {
    Model model;
    View view;
    Controller controller;
    Scanner sc;


    @Before
    public void startProgram() {
        model = new Model();
        view = new View();
        controller = new Controller(model, view);
        sc = new Scanner(System.in);
        model.attempts = 0;
    }


    @Test
    public void isAlreadyTest() {
        model.game(20);
        int second = model.game(20);
        Assert.assertEquals(2, model.attempts);
        Assert.assertEquals(1, model.previousNumbers.size());
        Assert.assertEquals(-1, second);
    }


    @Test
    public void containsTest() {
        model.game(10);
        Assert.assertTrue(model.containsNumber(10));
        Assert.assertFalse(model.containsNumber(20));
    }

    @Test
    public void lowerLimitTest() {
        int number = 9;
        model.game(number);

        if (model.RANDOM_NUMBER > number) {
            Assert.assertEquals(number, model.a);
        } else if (model.RANDOM_NUMBER == number) {
            Assert.assertEquals(1, model.attempts);
        } else {
            Assert.assertEquals(0, model.a);
        }

    }

    @Test
    public void upperLimitTest() {
        int number = 90;
        model.game(number);

        if (model.RANDOM_NUMBER < number) {
            Assert.assertEquals(number, model.b);
        } else if (model.RANDOM_NUMBER == number) {
            Assert.assertEquals(1, model.attempts);
        } else {
            Assert.assertEquals(100, model.b);
        }
    }

    @Test
    public void isEqualTest() {
        int number = 50;
        int numberGame = model.game(number);
        if (model.RANDOM_NUMBER > number) {
            Assert.assertEquals(2, numberGame);
        } else if (model.RANDOM_NUMBER < number) {
            Assert.assertEquals(1, numberGame);
        } else {
            Assert.assertEquals(0, numberGame);
        }

    }

}