package me.whiteship.chapter01.item03.field.my;

import me.whiteship.chapter01.item03.field.my.reflection.SecondElvis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class ElvisReflectionTest {

    @Test
    @DisplayName("리플렉션으로 private 생성자 호출 시 새로운 객체 생성")
    void createNewInstanceSuccessByReflection() {
        FirstElvis e1 = null, e2 = null;

        try {
            Constructor<FirstElvis> defaultConstructor = FirstElvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true); //private 생성자 접근 허용
            e1 = defaultConstructor.newInstance();
            e2 = defaultConstructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        assertNotSame(e1, e2);
        assertNotSame(e1, FirstElvis.INSTANCE);
    }

    @Test
    @DisplayName("리플렉션으로 private 생성자 호출 불가")
    void createNewInstanceFailByReflection() {
        try {
            Constructor<SecondElvis> defaultConstructor = SecondElvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            defaultConstructor.newInstance();
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
