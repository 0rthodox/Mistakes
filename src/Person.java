import java.util.ArrayList;
import java.util.List;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        setAge(age);
        setName(name);
    }

    public Person (String name) {
        this(0, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) {
            throw new IllegalArgumentException("Age can not be less than 0");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        this.name = name;
    }

    public static List<Person> createPersons() {
        return new ArrayList<Person>();
    }

    public static int findMaxAge(List<Person> persons) {
        if(persons.isEmpty())
            throw new IllegalArgumentException("At person.findMaxAge: given list is empty");
        int maxAge = 0;
        for (Person currentPerson : persons) {
            if(maxAge < currentPerson.getAge())
                maxAge = currentPerson.getAge();
        }
        return maxAge;
    }
}
