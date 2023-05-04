package me.whiteship.chapter01.item07.optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.*;

class ChannelTest {

    @Test
    void npe() {
        Channel channel = new Channel();
        Optional<MemberShip> optional = channel.defaultMemberShip();
        optional.ifPresent(MemberShip::hello);
    }

    @Test
    void test() throws InterruptedException {
        WeakHashMap<String, Object> map = new WeakHashMap<>();
//        String str = "abc";
        String str = new String("abc");
        map.put(str, new Object());

        System.out.println(map.size());

        str = null;
        System.gc();
        Thread.sleep(5000);

        System.out.println(map.size());

        WeakHashMap<Object, Object> map0 = new WeakHashMap<>();

        Object obj = new Object();
        map0.put(obj, new Object());

        System.out.println(map0.size());

        obj = null;
        System.gc();
        Thread.sleep(5000);

        System.out.println(map0.size());
    }

}