package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    List<Student> group;
    private int idGroup;

    /**
     * @param group лист студентов
     * @param idGroup ид группы
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * @return лист студентов
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * @param group устанавливает лист студентов
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    /**
     * @return ид группы
     */
    public int getIdGroup() {
        return idGroup;
    }

    /**
     * @param idGroup устанавливает ид группы
     */
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * @return задание 2*
     */
    @Override
    public String toString() {
        StringBuilder tempName = new StringBuilder();
        for (Student st: group){
        tempName.append(st.firstName + "\n");
        }
        return "StudentGroup " +
                " idGroup = " + idGroup +
                " amount = " + group.size() +
                " Name: \n" + tempName.toString();
    }

    @Override
    public Iterator<Student> iterator() {

        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < group.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return group.get(counter++);
            }
        };

    }


    /**
     * @param o the object to be compared.
     * @return сортирует группы студентов по размеру группы после по ид
     * задание 3 и 1*
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getGroup().size() == o.getGroup().size()) {
            if (this.getIdGroup() == o.getIdGroup()) {
                return 0;
            }
            if (this.getIdGroup() < o.getIdGroup()) {
                return -1;
            }
            return 1;
        }
        if (this.getGroup().size() < o.getGroup().size()) {
            return -1;
        }
        return 1;
    }
}

