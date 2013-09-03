import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TreeSetTest {

    private TreeSet treeSet;

    @Before
    public void setUp() throws Exception {
        treeSet = new TreeSet(){{
            add("1");
            add("7");
            add("3");
            add("5");
            add("9");
        }};

    }

    @Test
    public void should_get_lowest_higher_element() throws Exception {
        String ceiling = (String) treeSet.ceiling("2");

        assertThat(ceiling,is("3"));
    }

    @Test
    public void should_get_greatest_lower_element() throws Exception {
        String floor = (String) treeSet.floor("6");

        assertThat(floor,is("5"));
    }

    @Test
    public void should_not_change_key_when_change_the_element() throws Exception {
        TreeSet<Person> persons = new TreeSet<Person>();
        Person lily = new Person("lily", 20, 1, 300);
        persons.add(lily);
        Person zhou = new Person("zhou", 21, 2, 300);
        persons.add(zhou);
        Person lili = new Person("lili", 22, 4, 300);
        persons.add(lili);


        lili.setWorkYear(0);
        //最大元素仍然为lili
        assertThat(persons.last().getAge(),is(22));
        assertThat(persons.last().getWorkYear(),is(0));
        //新加入元素仍然按照原来的key值进行排序；
        persons.add(new Person("huhu",25,3,200));

        assertThat(persons.last().getAge(),is(22));
    }

    @Test
    public void should_add_not_object_to_set() throws Exception {
        TreeSet<Person> persons = new TreeSet<Person>();

        Person lili = new Person("lili", 22, 4, 300);
        Person other = new Person("zhou", 34, 4, 30);

        persons.add(lili);
        lili.setWorkYear(5);
        //新加入元素与set中的元素相等，因此没有加入set中
        boolean add = persons.add(other);
        assertThat(add,is(false));
    }
}
