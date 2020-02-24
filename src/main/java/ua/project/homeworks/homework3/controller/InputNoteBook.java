package ua.project.homeworks.homework3.controller;

import ua.project.homeworks.homework3.view.View;

import java.util.Scanner;

import static ua.project.homeworks.homework3.controller.RegexContainer.*;
import static ua.project.homeworks.homework3.view.TextConstant.FIRST_NAME;
import static ua.project.homeworks.homework3.view.TextConstant.LOGIN_DATA;

public class InputNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, str);
        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }
}
