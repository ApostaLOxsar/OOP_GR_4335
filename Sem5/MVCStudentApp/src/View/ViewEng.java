package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

/**
 * реализация английского интерфейса
 */
public class ViewEng implements iGetView {

    /**
     * @param students лист студентов
     */
    public void printAllStudents(List<Student> students) {
        int count = 0;
        System.out.println("-----Output list student-----");
        for (Student stud : students) {
            System.out.printf("№ = %d\t %s+\n", count++, stud);
        }
        System.out.println("-----end list-----");
    }

    /**
     * далее текст английского интерфейса
     */
    @Override
    public void getMessNumberForDell() {
        System.out.println("Enter student number to delete: ");
    }

    @Override
    public void getMessErrDel() {
        System.out.println("Deletion failed");
    }

    @Override
    public String getMessInputComand() {
        System.out.println("input command");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public void getMessEndProgram() {
        System.out.println("End program");
    }

    @Override
    public void getMesNotMet() {
        System.out.println("this method is under development");
    }
}
