import java.util.ArrayList;
import java.util.List;

import Services.AverageAge;
import Services.TeacherService;
import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Person man = new Person("Денис", "Криницын", 35);
        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Teacher t1 = new Teacher(null, null, 0, null);
        Teacher t2 = new Teacher(null, null, 0, null);

        Person p1 = new Student("Сергей", "Иванов", 22, 101);
        Person p2 = new Teacher(null, null, 0, null);


//         PersonComparator<Student> compS = new PersonComparator<Student>();
//         compS.compare(s1, s2);
//         PersonComparator<Teacher> compT = new PersonComparator<Teacher>();
//         compT.compare(t1, t2);
//         PersonComparator<Person> compPerson = new PersonComparator<Person>();
//         compPerson.compare(p1,p2);

        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        listStud.add(pers1);

        StudentGroup group4335 = new StudentGroup(listStud, 4335);

         /*for(Student stud:group4335)
         {
             System.out.println(stud.toString());
         }

         System.out.println("===============================");
         Collections.sort(group4335.getGroup());

         for(Student stud:group4335)
         {
             System.out.println(stud.toString());
         }*/

//         Teacher teach1 = new Teacher("Иван", "Петров", 22, "first");
//         Teacher teach2 = new Teacher("Николай", "Петров", 23, "first");
//         Teacher teach3 = new Teacher("Василий", "Петров", 25, "first");
//         Teacher teach4 = new Teacher("Мария", "Петров", 21, "first");

        TeacherService teacherService = new TeacherService();
        teacherService.create("Иван", "Петров", 22);
        teacherService.create("Николай", "Петров", 23);
        teacherService.create("Василий", "Петров", 25);
        teacherService.create("Мария", "Петров", 21);

        for (Teacher teacher : teacherService.getAll()) {
            System.out.println(teacher);
        }

        System.out.println("=========================");

        for (Teacher teacher : teacherService.getSortedByFIOTeachersList()) {
            System.out.println(teacher);
        }

        System.out.println("=========================");

        for (Teacher teacher : teacherService.getSortedByAGETeachersList()) {
            System.out.println(teacher);
        }

        System.out.println("=========================");

         AverageAge<Student> groupAvAge4335 = new AverageAge<Student>(listStud);

         groupAvAge4335.AveregeAgeResult();


    }
}
