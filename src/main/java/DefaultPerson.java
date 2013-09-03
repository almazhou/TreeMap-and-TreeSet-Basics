
public class DefaultPerson {
    private final String name;
    private final int age;
    private final int workYear;
    private final int id;

    public DefaultPerson(String name, int age, int workYear, int id) {
        this.name = name;
        this.age = age;
        this.workYear = workYear;
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
