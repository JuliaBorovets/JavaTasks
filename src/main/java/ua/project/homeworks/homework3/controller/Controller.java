package ua.project.homeworks.homework3.controller;

import ua.project.homeworks.homework3.model.Model;
import ua.project.homeworks.homework3.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteBook inputNoteNoteBook = new InputNoteBook(view, sc);
        inputNoteNoteBook.inputNote();
    }
}
