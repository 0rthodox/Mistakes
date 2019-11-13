package PersonPackage;

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


}
