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

    /**
     * обновление списка студентов
     */
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

    /**
     * цикличный метод run с основными функциями
     */
    public void run() {
        Commands com = Commands.NONE;
        getAllStudents();
        boolean getNewIteration = true;
        while (getNewIteration) {

            String command = view.getMessInputComand();

            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT -> {
                    getNewIteration = false;
                    view.getMessEndProgram();
                }
                case LIST -> {
                    getAllStudents();
                    view.printAllStudents(students);
                }
                case DELETE -> {
                    view.getMessNumberForDell();
                    model.delletStudent(getNumber());
                    getAllStudents();
                    view.printAllStudents(students);
                }
                case UPDATE ->
                    /*тут должен быть метод UPDATE)*/
                        view.getMesNotMet();
                case CREATE ->
                    /*тут должен быть метод CREATE*/
                        view.getMesNotMet();
                case READ ->
                    /*тут должен быть метод READ*/
                        view.getMesNotMet();
            }

        }
    }

    /**
     * @return целое число меньше размера списка студентов и больше -1
     * возвращает номер студента для удаление
     */
    private int getNumber() {
        Scanner iSc = new Scanner(System.in);
        int number = Integer.parseInt(iSc.nextLine());
        boolean flagDel = number < students.size() && number > -1;
        if (flagDel) {
            return number;
        } else {
            view.getMessErrDel();
            return -1;
        }
    }

}
