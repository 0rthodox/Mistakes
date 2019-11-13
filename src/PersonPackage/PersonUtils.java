package PersonPackage;

import java.util.ArrayList;
import java.util.List;

public class PersonUtils {
    public static List<Person> createPersons() {
        return new ArrayList<Person>();
    }

    public static int findMaxAge(List<Person> persons) {
        if(persons == null || persons.isEmpty())
            throw new IllegalArgumentException("At person.findMaxAge: given list is invalid");
        int maxAge = 0;
        for (Person currentPerson : persons) {
            if(maxAge < currentPerson.getAge())
                maxAge = currentPerson.getAge();
        }
        return maxAge;
    }
}
