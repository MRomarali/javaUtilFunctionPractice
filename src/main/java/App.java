import model.Person;
import util.PersonGenerator;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    static List<Person> persons = PersonGenerator.getInstance().generate(1000);

    public static void main(String[] args) {
        Optional<Person> optionalPerson = persons.stream().findFirst();
        System.out.println(optionalPerson);
    }
    public static void min_max_and_count(){
        Optional<Person> oldest = persons.stream().max(Comparator.comparing(Person::getBirthDate));
        long count = persons.stream().count();
        if (oldest.isPresent()){
            System.out.println(oldest.get());
        }
        System.out.println(count);

    }
}
