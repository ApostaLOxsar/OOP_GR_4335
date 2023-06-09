package Services;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {

    private List<Teacher> teacher;

    public TeacherService() {
        this.teacher = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacher;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teach = new Teacher(firstName, secondName, age, "basic");
        teacher.add(teach);
    }

    public List<Teacher> getSortedByFIOTeachersList() {
        List<Teacher> newList = new ArrayList<Teacher>(teacher);
        newList.sort(new PersonComparator<Teacher>());
        return newList;
    }

    public List<Teacher> getSortedByAGETeachersList() {
        List<Teacher> newList = new ArrayList<Teacher>(teacher);
        Collections.sort(newList);
        return newList;
    }

}