package me.whiteship.chapter01.item03.methodreference.my;

import java.time.LocalDate;

public class Person {

    LocalDate birthday;

    public Person() {

    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }
}
