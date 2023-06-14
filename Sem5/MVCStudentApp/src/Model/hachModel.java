package Model;

import Controller.iGetModel;

import java.util.HashMap;
import java.util.List;


public class hachModel implements iGetModel {


    private HashMap<Long,Student> listStudent;

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public List<Student> delletStudent(List<Student> students, int number) {
        return null;
    }
}
