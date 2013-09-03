import java.util.Comparator;

public class PersonComparator implements Comparator {

    @Override
    public int compare(Object o, Object o2) {
        Person person1 = (Person) o;
        Person person2 = (Person) o2;
        if(person1.getAge()>person2.getAge())return 1;
        if(person1.getAge()<person2.getAge())return -1;
        return 0;
    }
}
