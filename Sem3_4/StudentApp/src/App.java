import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Person;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 23, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        Student s7 = new Student("Денис", "Криницын", 35, 1);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s7);
        StudentGroup group4335 = new StudentGroup(listStud, 4335);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s4);
        listStud2.add(s5);
        listStud2.add(s6);
        StudentGroup group1111 = new StudentGroup(listStud2, 5111);

        List<StudentGroup> listStudGr = new ArrayList<StudentGroup>();
        listStudGr.add(group4335);
        listStudGr.add(group1111);

        StudentSteam steam1 = new StudentSteam(listStudGr, 1);


        for (StudentGroup gr : steam1){                                //вывод через итератор
            System.out.println("id = " + gr.getIdGroup());
            for (Student stud : gr){
                System.out.println(stud.toString());
            }
            System.out.println("===============================");
        }

        System.out.println("===============================");

        Collections.sort(steam1.getStSteam());                       //сортировка

        for (StudentGroup gr : steam1){                              //вывод через итератор
            System.out.println("id = " + gr.getIdGroup());
            for (Student stud : gr){
                System.out.println(stud.toString());
            }
            System.out.println("===============================");
        }

        System.out.println(group4335);                   //вывод через переопределенный тоСтринг
        System.out.println(group1111);                   //вывод через переопределенный тоСтринг
        System.out.println("===============================");
        System.out.println(steam1);                   //вывод через переопределенный тоСтринг
    }
}
