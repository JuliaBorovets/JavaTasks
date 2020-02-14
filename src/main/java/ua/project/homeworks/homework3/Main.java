package ua.project.homeworks.homework3;

import ua.project.homeworks.homework3.controller.Controller;
import ua.project.homeworks.homework3.model.Model;
import ua.project.homeworks.homework3.view.View;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Controller controller =
                new Controller(new Model(), new View());
        // Run
        controller.processUser();
    }
}
