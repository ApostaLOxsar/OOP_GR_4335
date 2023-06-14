package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView {

    public void printAllStudents(List<Student> students)
    {
        int count = 0;
        System.out.println("-----Вывод списка студентов-----");
        for(Student stud: students)
        {
            System.out.printf("№ = %d\t %s+\n",count++, stud);
        }
        System.out.println("-----Конец списка-----");
    }

    @Override
    public void getMessNumberForDell() {
        System.out.println("Введите номер студента для удаление: ");
    }

    @Override
    public void getMessErrDel() {
        System.out.println("Удаление не удалось");
    }

    @Override
    public String getMessInputComand() {
        System.out.println("Введите команду");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    @Override
    public void getMessEndProgram() {
        System.out.println("Выход из программы");
    }


}
