package me.whiteship.chapter01.item03.staticfactory.my;

import org.junit.jupiter.api.Test;

public class GenericSingletonFactoryTest {

    @Test
    void testGenericSingletonFactoryMethod() {
        MetaElvis<String> e1 = MetaElvis.getInstance();
        MetaElvis<Integer> e2 = MetaElvis.getInstance();

        e1.say("hello");
        e2.say(100);

        System.out.println(e1);
        System.out.println(e2);
    }
}
