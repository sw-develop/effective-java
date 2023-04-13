package me.whiteship.chapter01.item03.enumtype.my;

import me.whiteship.chapter01.item03.field.my.serialization.ThirdElvis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class EnumElvisSerializationTest {

    @Test
    @DisplayName("역직렬화 시 새로운 인스턴스 생성 X")
    void createNewInstanceFailByDeserialization() {
        //직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //역직렬화
        Elvis readObject1 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("Elvis.obj"))) {
            readObject1 = (Elvis) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Elvis readObject2 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("Elvis.obj"))) {
            readObject2 = (Elvis) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("기존: " + Elvis.INSTANCE);
        System.out.println("역직렬화한 객체1: " + readObject1);
        System.out.println("역직렬화한 객체2: " + readObject2);

        assertNotNull(readObject1); assertNotNull(readObject2);
        assertSame(readObject1, Elvis.INSTANCE);
        assertSame(readObject2, Elvis.INSTANCE);
        assertSame(readObject1, readObject2);
    }
}
