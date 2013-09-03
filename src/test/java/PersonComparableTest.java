import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class PersonComparableTest {


    private TreeMap personMap;

    @Before
    public void setUp() throws Exception {
       final Person person1 = new Person("Lily",20,3,8976);
       final Person person2 = new Person("Lily",20,2,8976);
       final Person person3 = new Person("Lily",20,4,8976);
       final Person person4 = new Person("Lily",20,1,8976);
        personMap = new TreeMap(){{
            put(person1,"1");
            put(person2,"2");
            put(person3,"3");
            put(person4,"4");
        }};
    }

    @Test
    public void should_get_person_with_youngest_working_year() throws Exception {
        Map.Entry entry = personMap.firstEntry();
        assertThat((String)entry.getValue(),is("4"));
    }
    @Test
    public void should_get_person_with_oldest_working_year() throws Exception {
        Map.Entry entry = personMap.lastEntry();
        assertThat((String)entry.getValue(),is("3"));
    }

    @Test
    public void should_get_null_even_if_object_is_comparable() throws Exception {
        Comparator comparator = personMap.comparator();

        assertThat(comparator,nullValue());
    }


}
