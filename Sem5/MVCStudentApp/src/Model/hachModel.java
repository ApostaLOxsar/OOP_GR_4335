package Model;

import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class hachModel implements iGetModel {

    private final HashMap<Long, Student> listStudent;

    public hachModel(HashMap<Long, Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<Student>(listStudent.values());
    }

    @Override
    public void delletStudent(int number) {
        if (number > -1) {
            System.out.println((long) number);
            System.out.println(listStudent.remove((long) number));
            //listStudent.remove((long) number);
        }
    }
}
