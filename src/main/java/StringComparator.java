import java.util.Comparator;


public class StringComparator implements Comparator {
    @Override
    public int compare(Object o, Object o2) {
        DefaultPerson person1 = (DefaultPerson) o;
        DefaultPerson person2 = (DefaultPerson) o2;
        return person1.getName().compareTo(person2.getName());
    }
}
