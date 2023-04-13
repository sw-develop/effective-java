package me.whiteship.chapter01.item03.functionalinterface.my;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import me.whiteship.chapter01.item03.methodreference.my.Person;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DefaultFunctions {

    public static void main(String[] args) {
        Function<Integer, String> intToString = Object::toString; //메서드의 input과 output 존재 (input 값의 타입 : Integer, output 값의 타입 : String)

        Supplier<Person> personSupplier = Person::new; //메서드의 output만 존재 (output 값의 타입 : Person)
        Function<LocalDate, Person> personFunction = Person::new; //메서드의 input과 output 존재

        Consumer<Integer> integerConsumer = System.out::println; //메서드의 input만 존재 (input 값의 타입 : Integer, output : void)

        Predicate<Person> personPredicate; //메서드의 input을 받아 무조건 boolean 반환 (input 값의 타입 : Person, output 값의 타입 : boolean)

    }
}
