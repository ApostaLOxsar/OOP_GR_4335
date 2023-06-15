package Controller;

import java.util.List;

import Model.Student;

public interface iGetView {
    void printAllStudents(List<Student> students);

    void getMessNumberForDell();

    void getMessErrDel();

    String getMessInputComand();
    void getMessEndProgram();
    void getMesNotMet();
}
