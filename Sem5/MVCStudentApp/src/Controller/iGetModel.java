package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents();
    public List<Student> delletStudent(List<Student> students, int number);

}
