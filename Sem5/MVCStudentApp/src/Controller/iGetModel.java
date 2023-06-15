package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;

/**
 * интерфейс модели
 */
public interface iGetModel {
    public List<Student> getAllStudents();
    public void delletStudent(int number);

}
