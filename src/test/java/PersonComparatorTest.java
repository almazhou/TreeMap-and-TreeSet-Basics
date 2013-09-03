import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PersonComparatorTest {

    private TreeMap treeMap;

    @Before
    public void setUp() throws Exception {
        PersonComparator personComparator = new PersonComparator();
        final Person person1 = new Person("Lily", 20, 3, 8976);
        final Person person2 = new Person("Lily", 22, 2, 8976);
        final Person person3 = new Person("Lily", 29, 4, 8976);
        final Person person4 = new Person("Lily", 28, 1, 8976);
        treeMap = new TreeMap(personComparator) {{
            put(person1, "1");
            put(person2, "2");
            put(person3, "3");
            put(person4, "4");
        }};

    }

    @Test
    public void should_get_youngest_age() throws Exception {
        Map.Entry entry = treeMap.firstEntry();

        assertThat((String)entry.getValue(),is("1"));
    }
    @Test
    public void should_get_oldest_age() throws Exception {
        Map.Entry entry = treeMap.lastEntry();

        assertThat((String)entry.getValue(),is("3"));
    }

    @Test
    public void should_get_comparator_of_treeMap() throws Exception {
        Comparator comparator = treeMap.comparator();
        assertTrue(comparator.compare(new Person("Lily", 28, 1, 8976),new Person("Lily", 29, 4, 8976))<0);
    }
}
