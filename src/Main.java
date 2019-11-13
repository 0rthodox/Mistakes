import PersonPackage.Person;
import PersonPackage.PersonUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person Denis = new Person(19, "Denis");
        List<Person> persons = PersonUtils.createPersons();
        persons.add(Denis);
        persons.add(new Person(0, "Nikita"));
        persons.add(new Person("Anton"));
        System.out.println(PersonUtils.findMaxAge(persons));
        System.out.println("Works");
        List<String> poem = FileUtils.readAll("text.txt");
        for (String line : poem) {
            System.out.println(line);
        }
    }
}
