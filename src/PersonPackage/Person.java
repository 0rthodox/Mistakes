package PersonPackage;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        final int init = 19;
        return name.hashCode() * age + 2 * (name.hashCode()^2) * age^2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person otherPerson = (Person)obj;
        return (age == otherPerson.getAge() && Objects.equals(name, otherPerson.getName()));
    }
}
