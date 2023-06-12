package Services;

import StudentDomen.Person;

import java.util.ArrayList;
import java.util.List;

public class AverageAge<T extends Person> {
    private List<T> list = new ArrayList<T>();
    private int age;
    private double AverageAge;

    /**
     * @param list список группы
     */
    public AverageAge(List<T> list){
        this.list = list;
        AvAge();
    }

    /**
     * расчет среднего возраста
     */
    private void AvAge(){
        for (T i : list){
           age += i.getAge();
        }
        AverageAge = (double) age / list.size();
    }

    /**
     * Вывод среднего возраста
     */
    public void AveregeAgeResult(){
        System.out.printf("Средний возраст =  %.2f",  AverageAge);
    }
}
