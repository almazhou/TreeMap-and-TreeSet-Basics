
public class Person implements Comparable{
    private final String name;
    private final int workingYear;
    private final int age;
    private final int id;
    private int workYear;

    public Person(String name, int age, int workingYear, int id) {
        this.name = name;
        this.age = age;
        this.workingYear = workingYear;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Person otherPerson = (Person) o;
        if(this.workingYear<otherPerson.workingYear)return -1;

        if(this.workingYear>otherPerson.workingYear) return 1;

        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setWorkYear(int workYear) {
        this.workYear = workYear;
    }

    public int getWorkYear() {
        return workYear;
    }

    public String getName() {
        return name;
    }
}
