package me.whiteship.chapter01.item03.methodreference;

import me.whiteship.chapter01.item03.methodreference.my.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    void staticMethodReference() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(2022, 1, 1)));
        people.add(new Person(LocalDate.of(2023, 1, 1)));

        people.sort(Person::compareByAge);
    }
}
