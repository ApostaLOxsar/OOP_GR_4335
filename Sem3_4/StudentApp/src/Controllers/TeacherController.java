package Controllers;

import Services.StudentService;
import Services.TeacherService;

public class TeacherController implements iPersonController{

    private final TeacherService dataService =  new TeacherService();


    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName,age);
    }
}
