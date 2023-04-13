package me.whiteship.chapter01.item03.field.my;

import me.whiteship.chapter01.item03.field.my.serialization.ThirdElvis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class ElvisSerializationTest {

    @Test
    @DisplayName("역직렬화 시 새로운 인스턴스 생성")
    void createNewInstanceSuccessByDeserialization() {
        //직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(FirstElvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //역직렬화
        FirstElvis readObject1 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            readObject1 = (FirstElvis) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        FirstElvis readObject2 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            readObject2 = (FirstElvis) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("기존: " + FirstElvis.INSTANCE);
        System.out.println("역직렬화한 객체1: " + readObject1);
        System.out.println("역직렬화한 객체2: " + readObject2);

        assertNotNull(readObject1); assertNotNull(readObject2);
        assertNotSame(readObject1, FirstElvis.INSTANCE);
        assertNotSame(readObject2, FirstElvis.INSTANCE);
        assertNotSame(readObject1, readObject2);
    }

    @Test
    @DisplayName("역직렬화 시 새로운 인스턴스 생성 X")
    void createNewInstanceFailByDeserialization() {
        //직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("thirdElvis.obj"))) {
            out.writeObject(ThirdElvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //역직렬화
        ThirdElvis readObject1 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("thirdElvis.obj"))) {
            readObject1 = (ThirdElvis) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        ThirdElvis readObject2 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("thirdElvis.obj"))) {
            readObject2 = (ThirdElvis) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("기존: " + ThirdElvis.INSTANCE);
        System.out.println("역직렬화한 객체1: " + readObject1);
        System.out.println("역직렬화한 객체2: " + readObject2);

        assertNotNull(readObject1); assertNotNull(readObject2);
        assertSame(readObject1, ThirdElvis.INSTANCE);
        assertSame(readObject2, ThirdElvis.INSTANCE);
        assertSame(readObject1, readObject2);
    }
}
