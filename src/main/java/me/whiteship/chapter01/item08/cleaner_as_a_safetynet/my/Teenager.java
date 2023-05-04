package me.whiteship.chapter01.item08.cleaner_as_a_safetynet.my;

/*
방 청소가 보장되지 않는 안 좋은 클라이언트 코드 예시
 */
public class Teenager {

    public static void main(String[] args) {
        new Room(99);
        System.out.println("안녕하세요");
        System.gc();
    }
}
