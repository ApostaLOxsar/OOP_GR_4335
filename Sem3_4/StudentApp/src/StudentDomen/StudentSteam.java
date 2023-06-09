package StudentDomen;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>{
    public static int idTemp;
    private final int id;
    private List<StudentGroup> stSteam;
    private int numberGroup;

    /**
     * @param stSteam лист с группами
     * @param numberGroup номер группы
     * уникальный ид присваивается автоматически начиная с 0
     */
    public StudentSteam(List<StudentGroup> stSteam, int numberGroup){
        //Collections.sort(stSteam);
        this.stSteam = stSteam;
        this.numberGroup = numberGroup;
        id = idTemp++;
    }


    /**
     * @return лист с группами
     */
    public List<StudentGroup> getStSteam() {
        return stSteam;
    }

    /**
     * @param stSteam устанавливает лист с группами
     */
    public void setStSteam(List<StudentGroup> stSteam) {
        this.stSteam = stSteam;
    }

    /**
     * @return номер группы
     */
    public int getNumberGroup() {
        return numberGroup;
    }

    /**
     * @param numberGroup устанавливает номер группы
     */
    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    /**
     * @return возвращает ид группы, изменить его не возможно, присваивается автоматически
     */
    public int getId() {
        return id;
    }

    /**
     * @return задание 2*
     */
    @Override
    public String toString() {
        StringBuilder tempGr = new StringBuilder();
        for (StudentGroup st: stSteam){
            tempGr.append(st.toString() + "\n");
        }

        return "numberSteam = " + id + "\tamound = " + stSteam.size() + "\tnumberGroup = " + numberGroup + "\n" + tempGr;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>()
        {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter<stSteam.size();
            }

            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                return stSteam.get(counter++);
            }
        };
    }
}
