import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.*;
import Model.*;
import View.*;

public class App {
    public static void main(String[] args) throws Exception {
       List<Student> students = new ArrayList<Student>();
       students.add(new Student("Сергей", "Иванов", 21, 101));
       students.add(new Student("Иван", "Петров", 22, 121));
       students.add(new Student("Игорь", "Иванов", 23, 301));
       students.add(new Student("Даша", "Цветкова", 25, 171));
       students.add(new Student("Лена-", "Незабудкина", 23, 104));
       students.add(new Student("Андрей", "Сидоров", 22, 111));


       HashMap<Long, Student> hachListStudent = new HashMap<Long, Student>();
       hachListStudent.put(0L, new Student("Елизавета", "Иванова", 21, 101));
       hachListStudent.put(1L, new Student("Сергей", "Незабудкин", 21, 101));
       hachListStudent.put(2L, new Student("Елена", "Незабудкина", 21, 101));
       hachListStudent.put(3L, new Student("Сергей", "Цветков", 21, 101));
       hachListStudent.put(4L, new Student("Василий", "Иванов", 21, 101));
       hachListStudent.put(5L, new Student("Вечеслав", "Сидоров", 21, 101));
       hachListStudent.put(6L, new Student("Дмитрий", "Иванов", 21, 101));


       iGetModel fModel = new FileModel("StudentsDB.txt");//модель с данными из файла
       //fModel.saveAllStudentToFile(students);
       iGetModel model = new Model(students);//модель с данными  из листа
       iGetModel hachModel = new hachModel(hachListStudent);//модель с данными из хэшмэпа

       iGetView view = getLang();//создание интерфейса с нужным языком

       Controller controller = new Controller(view, hachModel);//контроллер с нужной моделью и языком(интерфейсом)
       controller.run();
    }

   /**
    * метод запрашивает ввод языка и возвращает код языка
    * @return код языка
    * приватный метод
    */
   private static String lang() {
      System.out.println("Введите язык RUSSIAN\ninput language ENGLISH");
      Scanner in = new Scanner(System.in);
      return in.nextLine();
   }

   /**
    * @return возвращает интерфейс с нужным языком если он доступен
    */
   public static iGetView getLang(){
      Language lan = Language.valueOf(lang().toUpperCase());
      iGetView view = switch (lan) {
         case ENGLISH, EN, ENG -> new ViewEng();
         case RUSSIAN, RU, RUS -> new View();
      };
      return view;
   }

}
