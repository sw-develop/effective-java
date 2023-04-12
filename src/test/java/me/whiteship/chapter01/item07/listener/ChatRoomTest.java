package me.whiteship.chapter01.item07.listener;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatRoomTest {

    @Test
    void charRoom() throws InterruptedException {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User();
        User user2 = new User();

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        chatRoom.sendMessage("hello");

        user1 = null;

        System.gc();

        Thread.sleep(5000L);

        List<WeakReference<User>> users = chatRoom.getUsers();
//        assertTrue(users.size() == 1);
    }

    void comparator() {
        List<Integer> list = new ArrayList<>();
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

    }

}