package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;


public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {

            String command = view.getMessInputComand();

            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    view.getMessEndProgram();
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                case DELETE:
                    view.getMessNumberForDell();
                    model.delletStudent(students, getNumber());
                    view.printAllStudents(students);
                    break;
                case UPDATE:
                    update();
                    view.printAllStudents(students);
                    break;
                case CREATE:
                    /*тут должен быть метод креат*/
                    view.printAllStudents(students);
                    break;
                case READ:
                    /*тут должен быть метод реад*/
                    view.printAllStudents(students);
                    break;
            }

        }
    }

    private int getNumber() {
        Scanner iSc = new Scanner(System.in);
        int number = Integer.parseInt(iSc.nextLine());
        boolean flagDel = number < students.size();
        if (flagDel) {
            return number;
        } else {
            view.getMessErrDel();
            return -1;
        }
    }

}
