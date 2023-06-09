package StudentDomen;

public class Teacher extends Person implements Comparable<Teacher> {
    private String acadDegree;

    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
    }

    public Teacher getTeacher() {
        return this;
    }

    @Override
    public int compareTo(Teacher o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
